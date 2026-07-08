package X;

/* JADX INFO: renamed from: X.1BcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2208541BcC {
    public final C2208451Bc3 LIZ;

    public void LIZJ() {
        final C2208451Bc3 c2208451Bc3 = this.LIZ;
        c2208451Bc3.LIZLLL(new AbstractC2208541BcC(c2208451Bc3) { // from class: X.1BcK
            public final String toString() {
                return "Invalid";
            }

            @Override // X.AbstractC2208541BcC
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

    public AbstractC2208541BcC(C2208451Bc3 c2208451Bc3) {
        this.LIZ = c2208451Bc3;
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

    public void LIZLLL(C2208561BcE c2208561BcE) {
        LJI("complete on not running or fast result");
    }

    public void LJFF(C2208471Bc5 c2208471Bc5) {
        LJI("fastResult on not running");
    }
}
