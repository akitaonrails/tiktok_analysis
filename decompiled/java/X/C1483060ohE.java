package X;

/* JADX INFO: renamed from: X.0ohE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483060ohE implements InterfaceC1023860cka {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownProgressEvent{key='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", totalBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", downloadedBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1483060ohE(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
