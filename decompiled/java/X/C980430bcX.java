package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980430bcX {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;

    public C980430bcX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C980430bcX)) {
            return false;
        }
        C980430bcX c980430bcX = (C980430bcX) obj;
        return this.LIZ == c980430bcX.LIZ && this.LIZIZ == c980430bcX.LIZIZ && this.LIZJ == c980430bcX.LIZJ && this.LIZLLL == c980430bcX.LIZLLL && Intrinsics.LJFF(this.LJ, c980430bcX.LJ) && this.LJFF == c980430bcX.LJFF;
    }

    public C980430bcX(int i) {
        this(0, true, false, false, false, C13BV.INSTANCE);
    }

    public C980430bcX(int i, boolean z, boolean z2, boolean z3, boolean z4, List list) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = list;
        this.LJFF = z4;
    }

    public static C980430bcX LIZ(C980430bcX c980430bcX, int i, boolean z, boolean z2, boolean z3, List list, boolean z4, int i2) {
        boolean z5 = z4;
        List list2 = list;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c980430bcX.LIZ;
        }
        if ((i2 & 2) != 0) {
            z8 = c980430bcX.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z7 = c980430bcX.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z6 = c980430bcX.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            list2 = c980430bcX.LJ;
        }
        if ((i2 & 32) != 0) {
            z5 = c980430bcX.LJFF;
        }
        c980430bcX.getClass();
        return new C980430bcX(i3, z8, z7, z6, z5, list2);
    }
}
