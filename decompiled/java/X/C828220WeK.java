package X;

import android.util.Base64;
import android.webkit.WebResourceResponse;
import com.bytedance.hybrid.spark.security.web_js.setting.InlineInjectOptSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS28S0010000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828220WeK {
    public static MessageDigest LIZ;
    public static Function0<String> LIZIZ;

    public static Pair LIZLLL(WebResourceResponse webResourceResponse) {
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        if (webResourceResponse.getResponseHeaders() != null && !webResourceResponse.getResponseHeaders().isEmpty()) {
            String str = webResourceResponse.getResponseHeaders().get("Content-Security-Policy");
            if (str == null) {
                str = webResourceResponse.getResponseHeaders().get("content-security-policy");
            }
            boolean z = false;
            if (str != null && str.length() != 0) {
                if (a0.LJJIIZI(str, "script-src", false) || a0.LJJIIZI(str, "script-src-elem", false) || a0.LJJIIZI(str, "default-src", false)) {
                    z = true;
                }
                return new Pair(Boolean.TRUE, Boolean.valueOf(z));
            }
            return pair;
        }
        return pair;
    }

    public static boolean LJ(WebResourceResponse webResourceResponse) {
        Object obj;
        Object next;
        Object next2;
        String str = webResourceResponse.getResponseHeaders().get("Content-Security-Policy");
        if (str == null) {
            str = webResourceResponse.getResponseHeaders().get("content-security-policy");
        }
        if (str == null || str.length() == 0) {
            return true;
        }
        if (!a0.LJJIIZI(str, ",", false) && !a0.LJJIIZI(str, ";", false)) {
            return false;
        }
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";", ":", ","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listLJJLIIIJILLIZJL) {
                if (!a0.LJJJIL((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                obj = null;
                if (it3.hasNext()) {
                    next = it3.next();
                    if (u.LJJIIJZLJL((String) next, "script-src-elem", false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str2 = (String) next;
            Iterator it4 = arrayList2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (u.LJJIIJZLJL((String) next2, "script-src", false)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            String str3 = (String) next2;
            Iterator it5 = arrayList2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next3 = it5.next();
                if (u.LJJIIJZLJL((String) next3, "default-src", false)) {
                    obj = next3;
                    break;
                }
            }
            String str4 = (String) obj;
            if (str2 != null) {
                if (a0.LJJIIZI(str2, "'unsafe-inline'", false)) {
                    return true;
                }
            } else if (str3 != null) {
                if (a0.LJJIIZI(str3, "'unsafe-inline'", false)) {
                    return true;
                }
            } else if (str4 != null && a0.LJJIIZI(str4, "'unsafe-inline'", false)) {
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static boolean LIZJ(WebResourceResponse webResourceResponse, Set set) {
        String str = webResourceResponse.getResponseHeaders().get("Content-Security-Policy");
        if (str == null && (str = webResourceResponse.getResponseHeaders().get("content-security-policy")) == null) {
            return true;
        }
        try {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6), " ,", null, null, 0, null, new AwS592S0100000_13(set, (Set<String>) 84), 30);
            if (webResourceResponse.getResponseHeaders().get("Content-Security-Policy") != null) {
                webResourceResponse.getResponseHeaders().put("Content-Security-Policy", strLJJLIIIJ);
                return true;
            }
            if (webResourceResponse.getResponseHeaders().get("content-security-policy") == null) {
                return true;
            }
            webResourceResponse.getResponseHeaders().put("content-security-policy", strLJJLIIIJ);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static String LIZ(String str, Set set, boolean z) {
        List<String> listSplit = new Regex("\\s+").split(str, 0);
        boolean z2 = listSplit instanceof Collection;
        if (!z2 || !listSplit.isEmpty()) {
            Iterator<String> it2 = listSplit.iterator();
            while (it2.hasNext()) {
                if (u.LJIJI(it2.next(), "'unsafe-inline'", true)) {
                    return str;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            String str2 = (String) obj;
            if (z) {
                if (!z2 || !listSplit.isEmpty()) {
                    for (String str3 : listSplit) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\'');
                        sbLIZ.append(str2);
                        sbLIZ.append('\'');
                        if (u.LJIJI(str3, C2188811AlT.LIZIZ(sbLIZ), true)) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            } else {
                if (!z2 || !listSplit.isEmpty()) {
                    Iterator<String> it3 = listSplit.iterator();
                    while (it3.hasNext()) {
                        if (u.LJIJI(it3.next(), str2, true)) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(' ');
            sbLIZ2.append(C13LP.LJJLIIIJ(arrayList, " ", null, null, 0, null, new AwS28S0010000_13(z, 0), 30));
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public static boolean LIZIZ(WebResourceResponse webResourceResponse, List list, Set set) {
        Object c098200Yq;
        byte[] bArrDigest;
        if (list != null && !list.isEmpty()) {
            String str = webResourceResponse.getResponseHeaders().get("Content-Security-Policy");
            if (str == null && (str = webResourceResponse.getResponseHeaders().get("content-security-policy")) == null) {
                return true;
            }
            ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            String strLIZIZ = null;
            while (it2.hasNext()) {
                try {
                    byte[] bytes = ((String) it2.next()).getBytes(Charsets.UTF_8);
                    if (LIZ == null) {
                        LIZ = MessageDigest.getInstance("SHA-256");
                    }
                    MessageDigest messageDigest = LIZ;
                    if (messageDigest != null && (bArrDigest = messageDigest.digest(bytes)) != null) {
                        c098200Yq = Base64.encodeToString(bArrDigest, 2);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("hash error in calculate: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                arrayList.add(c098200Yq);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (String str2 : arrayList) {
                if ((str2 == null || str2.length() == 0) && strLIZIZ == null) {
                    strLIZIZ = "hash error in calculate: hash values is null";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sha256-");
                sbLIZ2.append(str2);
                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList2);
            if (strLIZIZ != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    ((C1544870qIv) it3.next()).LJFF.LJIIIZ = strLIZIZ;
                }
                return false;
            }
            try {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6), " ,", null, null, 0, null, new AwS592S0100000_13(hashSetLLIFFJFJJ, (HashSet<String>) 83), 30);
                if (webResourceResponse.getResponseHeaders().get("Content-Security-Policy") != null) {
                    webResourceResponse.getResponseHeaders().put("Content-Security-Policy", strLJJLIIIJ);
                } else if (webResourceResponse.getResponseHeaders().get("content-security-policy") != null) {
                    webResourceResponse.getResponseHeaders().put("content-security-policy", strLJJLIIIJ);
                }
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    ((C1544870qIv) it4.next()).LJFF.LJIIIIZZ = true;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Iterator it5 = set.iterator();
                while (it5.hasNext()) {
                    C1544930qJ1 c1544930qJ1 = ((C1544870qIv) it5.next()).LJFF;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("hash error in add to csp: ");
                    sbLIZ3.append(e.getMessage());
                    c1544930qJ1.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                return false;
            }
        }
        Iterator it6 = set.iterator();
        while (it6.hasNext()) {
            ((C1544870qIv) it6.next()).LJFF.LJIIIZ = "hash opt disabled";
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable] */
    public static String LJFF(String str, Set set, boolean z) {
        String strInvoke;
        boolean zLJJIIZI = a0.LJJIIZI(str, "script-src", false);
        boolean zLJJIIZI2 = a0.LJJIIZI(str, "default-src", false);
        boolean zLJJIIZI3 = a0.LJJIIZI(str, "script-src-elem", false);
        if (!zLJJIIZI2 && !zLJJIIZI && !zLJJIIZI3) {
            return str;
        }
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        for (String strLIZ : listLJJLIIIJILLIZJL) {
            String lowerCase = a0.LJLIIIL(strLIZ).toString().toLowerCase(Locale.ROOT);
            if (u.LJJIIJZLJL(lowerCase, "script-src-elem", false)) {
                strLIZ = LIZ(strLIZ, set, z);
            } else if (!zLJJIIZI3) {
                if (u.LJJIIJZLJL(lowerCase, "script-src", false)) {
                    strLIZ = LIZ(strLIZ, set, z);
                } else if (!zLJJIIZI && u.LJJIIJZLJL(lowerCase, "default-src", false)) {
                    strLIZ = LIZ(strLIZ, set, z);
                }
            }
            arrayList.add(strLIZ);
        }
        Function0<String> function0 = LIZIZ;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            strInvoke = "row";
        }
        Map<String, String> map = C1544810qIp.LIZJ.reportUris;
        if (map == null) {
            map = InlineInjectOptSettings.LIZ;
        }
        String str2 = map.get(strInvoke);
        if (str2 == null) {
            str2 = "https://mon.tiktokv.com/monitor_browser/collect/batch/security/?bid=tiktok_pns&ev_type=csp";
        }
        ?? arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (String str3 : arrayList) {
            if (u.LJJIIJZLJL(str3, "report-uri", true)) {
                List<String> listSplit = new Regex("\\s+").split(str3, 0);
                Pair pair = new Pair(C13LP.LJJJJZI(listSplit), C13LP.LJJJJIZL(listSplit, 1));
                String str4 = (String) pair.getFirst();
                List list = (List) pair.getSecond();
                if ((list instanceof Collection) && list.isEmpty()) {
                    str3 = str4 + ' ' + C13LP.LJJLIIIJ(list, " ", null, null, 0, null, null, 62) + ' ' + str2;
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (a0.LJJIIZI((String) it2.next(), str2, true)) {
                            break;
                        }
                    }
                    str3 = str4 + ' ' + C13LP.LJJLIIIJ(list, " ", null, null, 0, null, null, 62) + ' ' + str2;
                }
            }
            arrayList2.add(str3);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (u.LJJIIJZLJL((String) it3.next(), "report-uri", true)) {
                    break;
                }
            }
            arrayList2 = C13LP.LJLILLLLZI("report-uri ".concat(str2), arrayList2);
        } else {
            arrayList2 = C13LP.LJLILLLLZI("report-uri ".concat(str2), arrayList2);
        }
        return C13LP.LJJLIIIJ(arrayList2, "; ", null, null, 0, null, null, 62);
    }
}
