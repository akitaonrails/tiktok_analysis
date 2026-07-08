package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385490F9n {
    public final String LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385490F9n)) {
            return false;
        }
        C385490F9n c385490F9n = (C385490F9n) obj;
        return Intrinsics.LJFF(this.LIZ, c385490F9n.LIZ) && this.LIZIZ == c385490F9n.LIZIZ && Intrinsics.LJFF(this.LIZJ, c385490F9n.LIZJ) && this.LIZLLL == c385490F9n.LIZLLL && this.LJ == c385490F9n.LJ && this.LJFF == c385490F9n.LJFF && Intrinsics.LJFF(this.LJI, c385490F9n.LJI);
    }

    public static C385490F9n LIZ(C385490F9n c385490F9n, int i, boolean z, int i2) {
        String str;
        Integer num;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        int i3 = i;
        String str2 = null;
        if ((i2 & 1) != 0) {
            str = c385490F9n.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c385490F9n.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            num = c385490F9n.LIZJ;
        } else {
            num = null;
        }
        if ((i2 & 8) != 0) {
            z2 = c385490F9n.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            z4 = c385490F9n.LJ;
        }
        if ((i2 & 32) != 0) {
            z3 = c385490F9n.LJFF;
        } else {
            z3 = false;
        }
        if ((i2 & 64) != 0) {
            str2 = c385490F9n.LJI;
        }
        return new C385490F9n(str, i3, num, z2, z4, z3, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C385490F9n(String str, int i, boolean z, String str2, int i2) {
        Integer numValueOf;
        boolean z2;
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            numValueOf = Integer.valueOf(R.attr.ee);
        } else {
            numValueOf = null;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(str, i, numValueOf, z2, false, (i2 & 32) != 0 ? false : z3, (i2 & 64) == 0 ? str2 : null);
    }

    public C385490F9n(String str, int i, Integer num, boolean z, boolean z2, boolean z3, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = str2;
    }
}
