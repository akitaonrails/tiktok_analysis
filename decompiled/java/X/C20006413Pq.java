package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20006413Pq {
    public static boolean LIZ;
    public static final Map<String, String> LIZIZ = new LinkedHashMap();

    public static String LIZ(ModelInfo modelInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(modelInfo.getName());
        sbLIZ.append("_v");
        sbLIZ.append(modelInfo.getVersion());
        sbLIZ.append("_size");
        sbLIZ.append(modelInfo.getType());
        sbLIZ.append("_md5");
        sbLIZ.append(modelInfo.getMD5());
        sbLIZ.append(".model");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        String strSubstring = null;
        if (!a0.LJJIIZI(str, "md5", false)) {
            return null;
        }
        try {
            strSubstring = str.substring(a0.LJJJ(str, "md5", 0, false, 6) + 3, a0.LJJJJI(str, "_model", 0, 6));
            return strSubstring;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strSubstring;
        }
    }

    public static String LIZJ(String str) {
        int iLJJJJI = a0.LJJJJI(str, "/", 0, 6);
        int iLIZ = C0XJP.LIZ(str, "_v[0-9]");
        int i = iLJJJJI + 1;
        if (!C504670Jqj.LIZIZ(str) && i >= 0 && iLIZ >= 0 && i < iLIZ && i < str.length() && iLIZ <= str.length()) {
            return str.substring(i, iLIZ);
        }
        int iLIZ2 = C0XJP.LIZ(str, "\\.model|_model|\\.dat");
        if (iLIZ2 > 0 && iLIZ2 > iLJJJJI) {
            return str.substring(i, iLIZ2);
        }
        return str.substring(i, str.length());
    }

    public static String LIZLLL(String str) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LIZ) {
            Map<String, String> map = LIZIZ;
            String str2 = (String) ((LinkedHashMap) map).get(str);
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[ModelNameCache][YES][");
                sbLIZ.append(str);
                sbLIZ.append("][");
                sbLIZ.append(str2);
                sbLIZ.append("][");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ.append("][");
                sbLIZ.append(map.size());
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("JKL", strLIZIZ);
                return str2;
            }
            String strLIZJ = LIZJ(str);
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ModelNameCache][NO][");
            sbLIZ2.append(str);
            sbLIZ2.append("][");
            sbLIZ2.append(strLIZJ);
            sbLIZ2.append("][");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ2.append(']');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss2.getClass();
            C13SS.LIZ("JKL", strLIZIZ2);
            map.put(str, strLIZJ);
            return strLIZJ;
        }
        return LIZJ(str);
    }

    public static int LJ(String str) {
        int iLIZ;
        if (!a0.LJJIIZI(str, "size", false)) {
            return 0;
        }
        int iLJJJJI = a0.LJJJJI(str, "size", 0, 6);
        if (a0.LJJIIZI(str, "md5", false)) {
            iLIZ = C0XJP.LIZ(str, "_md5");
        } else {
            iLIZ = C0XJP.LIZ(str, "\\.model|_model|\\.dat");
        }
        int i = -1;
        if (iLJJJJI >= iLIZ) {
            return -1;
        }
        try {
            i = CastIntegerProtector.parseInt(str.substring(iLJJJJI + 4, iLIZ));
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static String LJFF(String str) {
        a0.LJJJJI(str, "/", 0, 6);
        int iLJJJJI = a0.LJJJJI(str, "_v", 0, 6);
        int iLIZ = C0XJP.LIZ(str, "\\.model|_model|\\.dat");
        if (iLJJJJI > 0) {
            return str.substring(iLJJJJI + 2, iLIZ);
        }
        return "1.0";
    }
}
