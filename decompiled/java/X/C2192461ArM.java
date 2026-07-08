package X;

/* JADX INFO: renamed from: X.1ArM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192461ArM {
    public final String LIZ;
    public C2192461ArM LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        for (C2192461ArM c2192461ArM = this.LIZIZ; c2192461ArM != null; c2192461ArM = c2192461ArM.LIZIZ) {
            sb.append("/");
            sb.append(c2192461ArM.LIZ);
        }
        return sb.toString();
    }

    public C2192461ArM(String str) {
        this.LIZ = str;
    }
}
