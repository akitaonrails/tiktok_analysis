package X;

/* JADX INFO: renamed from: X.0EGD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EGD {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C0EGD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EGD)) {
            return false;
        }
        C0EGD c0egd = (C0EGD) obj;
        return this.LIZ == c0egd.LIZ && this.LIZIZ == c0egd.LIZIZ && this.LIZJ == c0egd.LIZJ && this.LIZLLL == c0egd.LIZLLL && this.LJ == c0egd.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GestureExclusionInputs(bottomPanelShowing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerVisible=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", floatingOverlayActive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textEditPanelShowing=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", aigcPanelShowing=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EGD(int i) {
        this(false, false, false, false, false);
    }

    public C0EGD(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
    }

    public static C0EGD LIZ(C0EGD c0egd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = c0egd.LIZ;
        }
        if ((i & 2) != 0) {
            z9 = c0egd.LIZIZ;
        }
        if ((i & 4) != 0) {
            z8 = c0egd.LIZJ;
        }
        if ((i & 8) != 0) {
            z7 = c0egd.LIZLLL;
        }
        if ((i & 16) != 0) {
            z6 = c0egd.LJ;
        }
        c0egd.getClass();
        return new C0EGD(z10, z9, z8, z7, z6);
    }
}
