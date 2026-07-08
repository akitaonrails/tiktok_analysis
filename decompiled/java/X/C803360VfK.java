package X;

/* JADX INFO: renamed from: X.0VfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C803360VfK {
    public final String LIZ;
    public int LIZIZ;

    public C803360VfK(String str) {
        this.LIZ = str;
    }

    public final String LIZ(String str, String str2) {
        int i = this.LIZIZ;
        if (str != null) {
            int iIndexOf = this.LIZ.indexOf(str, i);
            if (iIndexOf < 0) {
                return null;
            }
            this.LIZIZ = iIndexOf + str.length();
        }
        int iIndexOf2 = this.LIZ.indexOf(str2, this.LIZIZ);
        if (iIndexOf2 < 0) {
            this.LIZIZ = i;
            return null;
        }
        String strSubstring = this.LIZ.substring(this.LIZIZ, iIndexOf2);
        this.LIZIZ = iIndexOf2 + str2.length();
        return strSubstring;
    }
}
