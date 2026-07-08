package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ami, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948300ami {
    public final List<C948400ams> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C948300ami() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C948300ami)) {
            return false;
        }
        C948300ami c948300ami = (C948300ami) obj;
        return Intrinsics.LJFF(this.LIZ, c948300ami.LIZ) && this.LIZIZ == c948300ami.LIZIZ && this.LIZJ == c948300ami.LIZJ && this.LIZLLL == c948300ami.LIZLLL && this.LJ == c948300ami.LJ && this.LJFF == c948300ami.LJFF;
    }

    public /* synthetic */ C948300ami(int i) {
        this(new ArrayList(), false, -1, false, false, -1);
    }

    public C948300ami(List list, boolean z, int i, boolean z2, boolean z3, int i2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
        this.LJFF = z3;
    }

    public static C948300ami LIZ(C948300ami c948300ami, List list, int i, boolean z, int i2, boolean z2, boolean z3, int i3) {
        boolean z4 = z3;
        boolean z5 = z2;
        int i4 = i2;
        boolean z6 = z;
        int i5 = i;
        List list2 = list;
        if ((i3 & 1) != 0) {
            list2 = c948300ami.LIZ;
        }
        if ((i3 & 2) != 0) {
            i5 = c948300ami.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z6 = c948300ami.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c948300ami.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            z5 = c948300ami.LJ;
        }
        if ((i3 & 32) != 0) {
            z4 = c948300ami.LJFF;
        }
        c948300ami.getClass();
        return new C948300ami(list2, z6, i5, z5, z4, i4);
    }
}
