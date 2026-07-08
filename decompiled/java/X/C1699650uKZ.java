package X;

/* JADX INFO: renamed from: X.0uKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699650uKZ {
    public String LIZ = "";
    public String LIZIZ = "";

    public final String LIZ() {
        if (this.LIZIZ.length() < 4) {
            return this.LIZIZ;
        }
        String strSubstring = this.LIZIZ.substring(0, 2);
        String strSubstring2 = this.LIZIZ.substring(2, 4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strSubstring2);
        sbLIZ.append('/');
        sbLIZ.append(strSubstring);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
