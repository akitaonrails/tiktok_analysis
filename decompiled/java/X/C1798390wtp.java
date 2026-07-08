package X;

/* JADX INFO: renamed from: X.0wtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798390wtp {
    public final String LIZ;
    public final C092F LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkConfig(baseUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rootPath=");
        sbLIZ.append("/tiktok");
        sbLIZ.append(", networkApi=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1798390wtp(String str, C092E c092e) {
        this.LIZ = str;
        this.LIZIZ = c092e;
    }
}
