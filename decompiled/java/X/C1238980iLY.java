package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238980iLY {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1238980iLY)) {
            return false;
        }
        C1238980iLY c1238980iLY = (C1238980iLY) obj;
        return this.LIZ == c1238980iLY.LIZ && this.LIZIZ == c1238980iLY.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1238980iLY.LIZJ) && this.LIZLLL == c1238980iLY.LIZLLL && Intrinsics.LJFF(this.LJ, c1238980iLY.LJ) && this.LJFF == c1238980iLY.LJFF;
    }

    public C1238980iLY(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = z3;
        this.LJ = str2;
        this.LJFF = z4;
    }

    public static C1238980iLY LIZ(C1238980iLY c1238980iLY, boolean z, String str, boolean z2, String str2, boolean z3, int i) {
        boolean z4;
        boolean z5 = z3;
        String str3 = str2;
        boolean z6 = z2;
        String str4 = str;
        boolean z7 = z;
        if ((i & 1) != 0) {
            z7 = c1238980iLY.LIZ;
        }
        if ((i & 2) != 0) {
            z4 = c1238980iLY.LIZIZ;
        } else {
            z4 = false;
        }
        if ((i & 4) != 0) {
            str4 = c1238980iLY.LIZJ;
        }
        if ((i & 8) != 0) {
            z6 = c1238980iLY.LIZLLL;
        }
        if ((i & 16) != 0) {
            str3 = c1238980iLY.LJ;
        }
        if ((i & 32) != 0) {
            z5 = c1238980iLY.LJFF;
        }
        c1238980iLY.getClass();
        return new C1238980iLY(str4, z7, z4, z6, str3, z5);
    }
}
