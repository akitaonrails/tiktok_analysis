package X;

/* JADX INFO: renamed from: X.0OVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620650OVz {
    public final C0OWM LIZ;
    public final C0OWM LIZIZ;
    public final C0OSF LIZJ;
    public final C0OSF LIZLLL;
    public final EnumC620000OTm LJ;
    public final EnumC620000OTm LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateChange(panelFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelTo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageTo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", occupancyFrom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", occupancyTo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        C0OSF c0osf = this.LIZJ;
        C0OSF c0osf2 = C0OSF.FULL_SCREEN;
        return c0osf != c0osf2 && this.LIZLLL == c0osf2;
    }

    public final boolean LIZIZ() {
        return this.LJ == EnumC620000OTm.INPUT && this.LJFF == EnumC620000OTm.VOICE;
    }

    public final boolean LIZJ() {
        C0OSF c0osf = this.LIZJ;
        C0OSF c0osf2 = C0OSF.FULL_SCREEN;
        return c0osf == c0osf2 && this.LIZLLL != c0osf2;
    }

    public final boolean LIZLLL() {
        return this.LJ == EnumC620000OTm.VOICE && this.LJFF == EnumC620000OTm.INPUT;
    }

    public final boolean LJ() {
        C0OWM c0owm = this.LIZ;
        C0OWM c0owm2 = C0OWM.HIDE;
        return c0owm == c0owm2 && this.LIZIZ != c0owm2;
    }

    public C620650OVz(C0OWM c0owm, C0OWM c0owm2, C0OSF c0osf, C0OSF c0osf2, EnumC620000OTm enumC620000OTm, EnumC620000OTm enumC620000OTm2) {
        this.LIZ = c0owm;
        this.LIZIZ = c0owm2;
        this.LIZJ = c0osf;
        this.LIZLLL = c0osf2;
        this.LJ = enumC620000OTm;
        this.LJFF = enumC620000OTm2;
    }
}
