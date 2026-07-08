package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Emc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374720Emc {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C374720Emc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C374720Emc)) {
            return false;
        }
        C374720Emc c374720Emc = (C374720Emc) obj;
        return this.LIZ == c374720Emc.LIZ && this.LIZIZ == c374720Emc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c374720Emc.LIZJ) && Float.compare(this.LIZLLL, c374720Emc.LIZLLL) == 0 && Float.compare(this.LJ, c374720Emc.LJ) == 0 && this.LJFF == c374720Emc.LJFF && this.LJI == c374720Emc.LJI && this.LJII == c374720Emc.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChromaKeyState(panelVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", intensity=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shadow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", seekersEnabled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", resetEnabled=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showErrorView=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return ((((((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public /* synthetic */ C374720Emc(int i) {
        this(false, false, null, 0.2f, 0.0f, false, false, false);
    }

    public C374720Emc(boolean z, boolean z2, String str, float f, float f2, boolean z3, boolean z4, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
    }

    public static C374720Emc LIZ(C374720Emc c374720Emc, boolean z, boolean z2, float f, float f2, boolean z3, boolean z4, boolean z5, int i) {
        String str;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        float f3 = f2;
        float f4 = f;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = c374720Emc.LIZ;
        }
        if ((i & 2) != 0) {
            z9 = c374720Emc.LIZIZ;
        }
        if ((i & 4) != 0) {
            str = c374720Emc.LIZJ;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            f4 = c374720Emc.LIZLLL;
        }
        if ((i & 16) != 0) {
            f3 = c374720Emc.LJ;
        }
        if ((i & 32) != 0) {
            z8 = c374720Emc.LJFF;
        }
        if ((i & 64) != 0) {
            z7 = c374720Emc.LJI;
        }
        if ((i & 128) != 0) {
            z6 = c374720Emc.LJII;
        }
        c374720Emc.getClass();
        return new C374720Emc(z10, z9, str, f4, f3, z8, z7, z6);
    }
}
