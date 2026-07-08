package X;

/* JADX INFO: renamed from: X.0egU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098200egU {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final Integer LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectNotifyInfo(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", component=");
        sbLIZ.append(1);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", containerId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", consumeMethod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1098200egU(String str, int i, int i2, long j, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = num;
    }
}
