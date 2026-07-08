package X;

/* JADX INFO: renamed from: X.1Bc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2208511Bc9 {
    public final C2208461Bc4 LIZ;

    public void LIZJ() {
        final C2208461Bc4 c2208461Bc4 = this.LIZ;
        c2208461Bc4.LIZLLL(new AbstractC2208511Bc9(c2208461Bc4) { // from class: X.1BcJ
            public final String toString() {
                return "Invalid";
            }

            @Override // X.AbstractC2208511Bc9
            public final void LJII() {
                this.LIZ.LJ();
            }
        });
    }

    public void LJ() {
        LJI("failed on not running");
    }

    public void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowsRecordLayoutState:");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" has not implement method:");
        sbLIZ.append("cancel");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public String LIZIZ() {
        return toString();
    }

    public void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowsRecordLayoutState:");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" has not implement method:");
        sbLIZ.append("start");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC2208511Bc9(C2208461Bc4 c2208461Bc4) {
        this.LIZ = c2208461Bc4;
    }

    public static void LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BDUploadSpeedProbe : ");
        sbLIZ.append(str);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BDUploadSpeedProbe : ");
        sbLIZ2.append(str);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public void LIZLLL(C2208551BcD c2208551BcD) {
        LJI("complete on not running or fast result");
    }

    public void LJFF(C2208491Bc7 c2208491Bc7) {
        LJI("fastResult on not running");
    }
}
