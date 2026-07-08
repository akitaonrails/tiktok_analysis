package X;

/* JADX INFO: renamed from: X.13Ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20018913Ul {
    public final String LIZ;
    public int LIZIZ = 1;
    public long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeSizeItem{eventName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20018913Ul(String str, long j) {
        this.LIZ = str;
        this.LIZJ = j;
    }
}
