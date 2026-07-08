package X;

/* JADX INFO: renamed from: X.1DPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255501DPw {
    public final String LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(':');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        switch (this.LIZIZ) {
            case 900:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(this.LIZJ);
                return C2188811AlT.LIZIZ(sbLIZ2);
            case 901:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ3);
            case 902:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(LIZ(this.LIZJ));
                return C2188811AlT.LIZIZ(sbLIZ4);
            case 903:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append(this.LJ);
                return C2188811AlT.LIZIZ(sbLIZ5);
            case 904:
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ);
                sbLIZ6.append(Boolean.valueOf(this.LJFF));
                return C2188811AlT.LIZIZ(sbLIZ6);
            case 905:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ);
                sbLIZ7.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ7);
            default:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(strLIZIZ);
                sbLIZ8.append("????");
                return C2188811AlT.LIZIZ(sbLIZ8);
        }
    }

    public C2255501DPw(C2255501DPw c2255501DPw) {
        this.LIZJ = Integer.MIN_VALUE;
        this.LIZLLL = Float.NaN;
        this.LIZ = c2255501DPw.LIZ;
        this.LIZIZ = c2255501DPw.LIZIZ;
        this.LIZJ = c2255501DPw.LIZJ;
        this.LIZLLL = c2255501DPw.LIZLLL;
        this.LJ = c2255501DPw.LJ;
        this.LJFF = c2255501DPw.LJFF;
    }

    public static String LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("00000000");
        sbLIZ.append(Integer.toHexString(i));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("#");
        sbLIZ2.append(strLIZIZ.substring(strLIZIZ.length() - 8));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C2255501DPw(float f, String str) {
        this.LIZJ = Integer.MIN_VALUE;
        this.LIZ = str;
        this.LIZIZ = 901;
        this.LIZLLL = f;
    }

    public C2255501DPw(String str, int i) {
        this.LIZLLL = Float.NaN;
        this.LIZ = str;
        this.LIZIZ = 902;
        this.LIZJ = i;
    }
}
