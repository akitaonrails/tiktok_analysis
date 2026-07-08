package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xlp.c;

/* JADX INFO: renamed from: X.0XLO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLO {
    public String LIZ;
    public String LIZLLL;
    public String LJII;
    public String LJIIIIZZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LJ = -1;
    public final C0TBH LJFF = new C0TBH();
    public final C0XLM LJI = new C0XLM();

    private final String LIZIZ$redex$base() {
        StringBuilder sb = new StringBuilder();
        sb.append(LIZ());
        sb.append("://");
        if (!this.LIZIZ.isEmpty() || !this.LIZJ.isEmpty()) {
            sb.append(this.LIZIZ.isEmpty() ? "" : C0XLR.LIZIZ(this.LIZIZ, false, " \"':;<=>@[]^`{}|/\\?#", true));
            String strLIZIZ = this.LIZJ.isEmpty() ? "" : C0XLR.LIZIZ(this.LIZJ, false, " \"':;<=>@[]^`{}|/\\?#", true);
            if (!strLIZIZ.isEmpty()) {
                sb.append(':');
                sb.append(strLIZIZ);
            }
            sb.append('@');
        }
        if (this.LIZLLL.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.LIZLLL);
            sb.append(']');
        } else {
            sb.append(this.LIZLLL);
        }
        int iLIZLLL = this.LJ;
        if (iLIZLLL == -1) {
            iLIZLLL = C0XLQ.LIZLLL(LIZ());
        }
        if (iLIZLLL != C0XLQ.LIZLLL(LIZ())) {
            sb.append(':');
            sb.append(iLIZLLL);
        }
        C0TBH c0tbh = this.LJFF;
        int size = ((ArrayList) c0tbh.LIZ).size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            String str = (String) ListProtector.get(c0tbh.LIZ, i);
            sb.append(C0XLR.LIZ(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, true));
        }
        C0XLM c0xlm = this.LJI;
        c0xlm.getClass();
        sb.append('?');
        for (Map.Entry entry : ((LinkedHashMap) c0xlm.LIZ).entrySet()) {
            String str2 = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            String strLIZIZ2 = C0XLR.LIZIZ(str2, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true);
            for (String str3 : list) {
                sb.append(strLIZIZ2);
                if (str3 != null) {
                    sb.append('=');
                    sb.append(C0XLR.LIZIZ(str3, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true));
                }
                sb.append('&');
            }
        }
        sb.setLength(sb.length() - 1);
        if (this.LJII != null) {
            sb.append('#');
            sb.append(C0XLR.LIZIZ(this.LJII, false, "", false));
        }
        return sb.toString();
    }

    private final String LIZIZ$redex$opt() {
        StringBuilder sb = new StringBuilder();
        sb.append(LIZ());
        sb.append("://");
        if (!this.LIZIZ.isEmpty() || !this.LIZJ.isEmpty()) {
            sb.append(this.LIZIZ.isEmpty() ? "" : C0XLR.LIZIZ(this.LIZIZ, false, " \"':;<=>@[]^`{}|/\\?#", true));
            String strLIZIZ = this.LIZJ.isEmpty() ? "" : C0XLR.LIZIZ(this.LIZJ, false, " \"':;<=>@[]^`{}|/\\?#", true);
            if (!strLIZIZ.isEmpty()) {
                sb.append(':');
                sb.append(strLIZIZ);
            }
            sb.append('@');
        }
        if (this.LIZLLL.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.LIZLLL);
            sb.append(']');
        } else {
            sb.append(this.LIZLLL);
        }
        int iLIZLLL = this.LJ;
        if (iLIZLLL == -1) {
            iLIZLLL = C0XLQ.LIZLLL(LIZ());
        }
        if (iLIZLLL != C0XLQ.LIZLLL(LIZ())) {
            sb.append(':');
            sb.append(iLIZLLL);
        }
        C0TBH c0tbh = this.LJFF;
        int size = ((ArrayList) c0tbh.LIZ).size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            String str = (String) ListProtector.get(c0tbh.LIZ, i);
            sb.append(C0XLR.LIZ(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, true));
        }
        C0XLM c0xlm = this.LJI;
        c0xlm.getClass();
        sb.append('?');
        for (Map.Entry entry : ((LinkedHashMap) c0xlm.LIZ).entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            String strLIZIZ2 = C0XLR.LIZIZ(str2, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true);
            int i2 = 0;
            int size2 = list.size();
            while (i2 < size2) {
                Object obj = list.get(i2);
                i2++;
                String str3 = (String) obj;
                sb.append(strLIZIZ2);
                if (str3 != null) {
                    sb.append('=');
                    sb.append(C0XLR.LIZIZ(str3, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true));
                }
                sb.append('&');
            }
        }
        sb.setLength(sb.length() - 1);
        if (this.LJII != null) {
            sb.append('#');
            sb.append(C0XLR.LIZIZ(this.LJII, false, "", false));
        }
        return sb.toString();
    }

    public final String LIZ() {
        return "http".equals(this.LIZ) ? "http" : "https";
    }

    public final String LIZIZ() {
        return !ReDexExperimentOpt.getAbTest() ? LIZIZ$redex$base() : LIZIZ$redex$opt();
    }

    public final String toString() {
        return LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0308 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0XLO LIZJ(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLO.LIZJ(java.lang.String):X.0XLO");
    }

    public final void LIZLLL(String str) {
        if (str != null) {
            String strLIZJ = c.LIZJ(C0XLR.LIZJ(0, str.length(), str, false));
            if (strLIZJ != null) {
                this.LIZLLL = strLIZJ;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unexpected host: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("host == null");
    }
}
