package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0yBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847720yBO {
    public static final ArrayList<Integer> LIZLLL = C1697810uHb.LJ(2, 3, 4, 5, 6, 7);
    public final String[] LIZ;
    public int LIZIZ;
    public final StringBuilder LIZJ;

    public final String LIZ() {
        String string;
        String[] strArr = this.LIZ;
        String strLIZIZ = "";
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[_dkey:");
            StringBuilder sb = this.LIZJ;
            if (sb != null && (string = sb.toString()) != null) {
                strLIZIZ = string;
            }
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        strArr[0] = strLIZIZ;
        String[] strArr2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[F:");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(']');
        strArr2[1] = C2188811AlT.LIZIZ(sbLIZ2);
        return C13LQ.LJJJ(this.LIZ, "", null, null, null, 62);
    }

    public C1847720yBO() {
        String[] strArr = new String[8];
        int i = 0;
        do {
            strArr[i] = "";
            i++;
        } while (i < 8);
        this.LIZ = strArr;
        if (C1847960yBm.LJIIIIZZ) {
            this.LIZJ = new StringBuilder();
        }
    }

    public final void LIZIZ(String str) {
        StringBuilder sb = this.LIZJ;
        if (sb != null) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(str);
        }
    }

    public final void LIZLLL(String str) {
        if (str != null && str.length() != 0) {
            LIZJ(5, str);
            LIZIZ("event");
        }
    }

    public final void LJFF(String str) {
        if (str != null && str.length() != 0) {
            LIZJ(4, str);
            LIZIZ("pgstep");
        }
    }

    public final void LJI(String str) {
        if (str != null && str.length() != 0) {
            LIZJ(7, str);
            LIZIZ("scm");
        }
    }

    public final void LJII(String str) {
        if (str != null && str.length() != 0) {
            LIZJ(2, str);
            LIZIZ("sessid");
        }
    }

    public final void LJIIIIZZ(String str) {
        if (str != null && str.length() != 0) {
            LIZJ(6, str);
            LIZIZ("spm");
        }
    }

    public final void LJIIIZ(String str) {
        if (str != null && str.length() != 0) {
            LIZJ(3, str);
            LIZIZ("type");
        }
    }

    public final void LIZJ(int i, String str) {
        this.LIZIZ |= 1 << (i - 2);
        String[] strArr = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append(']');
        strArr[i] = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ(int i, String str) {
        this.LIZIZ = (1 << (i - 1)) | this.LIZIZ;
        StringBuilder sb = this.LIZJ;
        if (sb != null) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(str);
        }
    }
}
