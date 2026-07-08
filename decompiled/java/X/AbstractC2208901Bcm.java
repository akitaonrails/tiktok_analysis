package X;

/* JADX INFO: renamed from: X.1Bcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2208901Bcm {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public String LIZ() {
        return this.LIZIZ;
    }

    public String LIZIZ() {
        return this.LIZ;
    }

    public AbstractC2208901Bcm(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_stuck_progress");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_stuck_duration");
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_stuck_nodes");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append("_stuck_net");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ4);
    }
}
