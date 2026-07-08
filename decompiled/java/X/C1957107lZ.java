package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1957107lZ {
    public static Map<String, ? extends Object> LIZIZ;
    public static final C1957107lZ LIZ = new C1957107lZ();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(323));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(322));

    public static String LIZ(String str) {
        boolean z;
        Object c098200Yq;
        Object obj;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String strLIZIZ = LIZIZ(str);
        String str2 = (String) ((ConcurrentHashMap) LIZLLL.getValue()).get(strLIZIZ);
        if (str2 != null) {
            return str2;
        }
        try {
            LIZ.getClass();
            C1533510q0b c1533510q0bLIZJ = LIZJ(strLIZIZ);
            if (c1533510q0bLIZJ == null || (c098200Yq = c1533510q0bLIZJ.LIZIZ) == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                thM5exceptionOrNullimpl.getMessage();
            }
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL.getValue();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = null;
        } else {
            obj = c098200Yq;
        }
        if (obj == null) {
            obj = "";
        }
        concurrentHashMap.put(strLIZIZ, obj);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public static String LIZIZ(String str) {
        boolean z;
        Object c098200Yq;
        String message;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        String str2 = (String) ((ConcurrentHashMap) LIZJ.getValue()).get(str);
        if (str2 != null) {
            return str2;
        }
        try {
            c098200Yq = C1942307jB.LIZIZ(UriProtector.parse(str), "url");
            if (c098200Yq == null) {
                c098200Yq = str;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getGeckoUrlFromSchema, catch exception=");
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                message = thM5exceptionOrNullimpl.getMessage();
            } else {
                message = null;
            }
            sbLIZ.append(message);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 == null) {
            str3 = str;
        }
        ((ConcurrentHashMap) LIZJ.getValue()).put(str, str3);
        return str3;
    }

    public static C1533510q0b LIZJ(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String strLIZIZ = "tiktok/fe/live";
            if ("tiktok/fe/live".length() > 0) {
                Integer numValueOf = Integer.valueOf(a0.LJJIZ(str, '?', 0, false, 6));
                if (numValueOf.intValue() != -1) {
                    str = str.substring(0, numValueOf.intValue());
                }
                Integer numValueOf2 = Integer.valueOf(a0.LJJIZ(str, '#', 0, false, 6));
                if (numValueOf2.intValue() != -1) {
                    str = str.substring(0, numValueOf2.intValue());
                }
                if (!a0.LJJIJIIJIL("tiktok/fe/live", '/')) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tiktok/fe/live");
                    sbLIZ.append('/');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                Integer numValueOf3 = Integer.valueOf(a0.LJJJ(str, strLIZIZ, 0, false, 6));
                if (numValueOf3.intValue() != -1) {
                    String strSubstring = str.substring(numValueOf3.intValue() + strLIZIZ.length());
                    Integer numValueOf4 = Integer.valueOf(a0.LJJIZ(strSubstring, '/', 0, false, 6));
                    if (numValueOf4.intValue() != -1) {
                        int iIntValue = numValueOf4.intValue();
                        String strSubstring2 = strSubstring.substring(0, iIntValue);
                        String strSubstring3 = strSubstring.substring(iIntValue + 1);
                        if ((!a0.LJJJIL(strSubstring2)) && (!a0.LJJJIL(strSubstring3))) {
                            return new C1533510q0b("", strSubstring2, strSubstring3);
                        }
                    }
                }
            }
        }
        return null;
    }
}
