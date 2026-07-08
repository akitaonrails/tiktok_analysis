package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433880Gzq {
    public final C419910GdJ LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C384050F3z LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C433880Gzq)) {
            return false;
        }
        C433880Gzq c433880Gzq = (C433880Gzq) obj;
        return Intrinsics.LJFF(this.LIZ, c433880Gzq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c433880Gzq.LIZIZ) && this.LIZJ == c433880Gzq.LIZJ && this.LIZLLL == c433880Gzq.LIZLLL && this.LJ == c433880Gzq.LJ && Intrinsics.LJFF(this.LJFF, c433880Gzq.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        C384050F3z c384050F3z = this.LJFF;
        return iHashCode + (c384050F3z == null ? 0 : c384050F3z.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScalingInputBtnUiState(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", show=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tuxShape=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C433880Gzq(C419910GdJ c419910GdJ, String str) {
        this(c419910GdJ, str, true, true, true, null);
    }

    public C433880Gzq(C419910GdJ c419910GdJ, String str, boolean z, boolean z2, boolean z3, C384050F3z c384050F3z) {
        this.LIZ = c419910GdJ;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = c384050F3z;
    }

    public static C433880Gzq LIZ(C433880Gzq c433880Gzq, C419910GdJ c419910GdJ, boolean z, boolean z2, boolean z3, int i) {
        String str;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        C419910GdJ c419910GdJ2 = c419910GdJ;
        if ((i & 1) != 0) {
            c419910GdJ2 = c433880Gzq.LIZ;
        }
        C384050F3z c384050F3z = null;
        if ((i & 2) != 0) {
            str = c433880Gzq.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            z6 = c433880Gzq.LIZJ;
        }
        if ((i & 8) != 0) {
            z5 = c433880Gzq.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c433880Gzq.LJ;
        }
        if ((i & 32) != 0) {
            c384050F3z = c433880Gzq.LJFF;
        }
        c433880Gzq.getClass();
        return new C433880Gzq(c419910GdJ2, str, z6, z5, z4, c384050F3z);
    }
}
