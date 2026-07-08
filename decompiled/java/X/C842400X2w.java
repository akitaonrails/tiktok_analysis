package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0X2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C842400X2w {
    public final String LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    public final void LIZLLL() {
        while (this.LIZJ < this.LIZ.length() && " \t".indexOf(this.LIZ.charAt(this.LIZJ)) != -1) {
            this.LIZJ++;
        }
    }

    public final boolean LIZJ() {
        LIZLLL();
        if (this.LIZJ >= this.LIZ.length() || this.LIZ.charAt(this.LIZJ) != '=') {
            return false;
        }
        this.LIZJ++;
        return true;
    }

    public C842400X2w(String str) {
        this.LIZ = str;
        this.LIZIZ = str.toLowerCase(Locale.US);
    }

    public final int LIZ(String str) {
        for (int i = this.LIZJ; i < this.LIZ.length(); i++) {
            if (str.indexOf(this.LIZ.charAt(i)) != -1) {
                return i;
            }
        }
        return this.LIZ.length();
    }

    public final String LIZIZ(boolean z) {
        String str;
        String strSubstring;
        LIZLLL();
        int iLIZ = LIZ(",;= \t");
        if (z) {
            str = this.LIZIZ;
        } else {
            str = this.LIZ;
        }
        int i = this.LIZJ;
        if (i < iLIZ) {
            strSubstring = str.substring(i, iLIZ);
        } else {
            strSubstring = null;
        }
        this.LIZJ = iLIZ;
        return strSubstring;
    }
}
