package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709660uai {
    public static String LIZIZ(String str) {
        String strLIZLLL;
        String strLIZLLL2;
        String strLIZLLL3;
        if (str == null) {
            return null;
        }
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"--"}, 0, 6);
            String[] strArr = new String[6];
            String str2 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            strArr[0] = str2;
            String str4 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (str4 == null) {
                str4 = "";
            }
            strArr[1] = str4;
            String str5 = (String) C13LP.LJJJLZIJ(2, listLJJLIIIJILLIZJL);
            if (str5 == null || (strLIZLLL = C1722120uuo.LIZLLL(str5)) == null) {
                strLIZLLL = "";
            }
            strArr[2] = strLIZLLL;
            String str6 = (String) C13LP.LJJJLZIJ(3, listLJJLIIIJILLIZJL);
            if (str6 == null || (strLIZLLL2 = C1722120uuo.LIZLLL(str6)) == null) {
                strLIZLLL2 = "";
            }
            strArr[3] = strLIZLLL2;
            String str7 = (String) C13LP.LJJJLZIJ(4, listLJJLIIIJILLIZJL);
            if (str7 == null || (strLIZLLL3 = C1722120uuo.LIZLLL(str7)) == null) {
                strLIZLLL3 = "";
            }
            strArr[4] = strLIZLLL3;
            String str8 = (String) C13LP.LJJJLZIJ(5, listLJJLIIIJILLIZJL);
            if (str8 != null) {
                str3 = str8;
            }
            strArr[5] = str3;
            return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "--", null, null, 0, null, null, 62);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String[] strArr = new String[7];
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        if (str3 == null) {
            str3 = "";
        }
        strArr[2] = str3;
        if (str4 == null) {
            str4 = "";
        }
        strArr[3] = str4;
        if (str5 == null) {
            str5 = "";
        }
        strArr[4] = str5;
        if (str6 == null) {
            str6 = "";
        }
        strArr[5] = str6;
        if (str7 == null) {
            str7 = "";
        }
        strArr[6] = str7;
        return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "--", null, null, 0, null, null, 62);
    }
}
