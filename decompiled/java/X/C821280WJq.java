package X;

/* JADX INFO: renamed from: X.0WJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821280WJq {
    public final C002O LIZ;
    public final C0XE1 LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConnectEvent{mType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", connectionState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mChannelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C821280WJq(C0XE1 c0xe1, C002O c002o, int i, int i2) {
        this.LIZIZ = c0xe1;
        this.LIZ = c002o;
        this.LIZLLL = i;
        this.LIZJ = i2;
    }
}
