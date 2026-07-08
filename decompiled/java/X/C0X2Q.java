package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.lang.reflect.Method;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2Q extends CookieManager {
    public final android.webkit.CookieManager LIZ;
    public volatile C842310X2n LIZIZ;
    public final Pattern LIZJ = PatternProtector.compile("(?<=Domain=)([^;]*)", 2);
    public final C0X2W LIZLLL;
    public final ArrayList<String> LJ;

    public static Map LIZJ(List list, Map map) {
        Map mapEmptyMap = Collections.emptyMap();
        if (map != null) {
            List listLJ = LJ("Cookie", map);
            if (listLJ == null || listLJ.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return mapEmptyMap;
        }
        return Collections.singletonMap("Cookie", list);
    }

    public static List LJ(String str, Map map) {
        if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
            List list = (List) map.get(str);
            if (list == null || list.isEmpty()) {
                return (List) map.get(str.toLowerCase());
            }
            return list;
        }
        return null;
    }

    public final void LIZIZ(String str, boolean z) {
        if (z) {
            C786410Ut5.A2().flush();
            Logger.debug();
            return;
        }
        ArrayList<String> arrayList = this.LJ;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it2 = this.LJ.iterator();
            while (it2.hasNext()) {
                if (str.equals(it2.next())) {
                    C786410Ut5.A2().flush();
                    Logger.debug();
                    return;
                }
            }
        }
    }

    public final boolean LJFF(URI uri, String str) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                String lowerCase2 = "";
                Matcher matcher = this.LIZJ.matcher(str);
                if (matcher.find()) {
                    lowerCase2 = matcher.group().toLowerCase();
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    return false;
                }
                if (!lowerCase.endsWith(lowerCase2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public final String LJIIJ(String str, String str2) {
        String lowerCase;
        String strReplaceFirst = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Matcher matcher = this.LIZJ.matcher(str2);
            if (matcher.find()) {
                lowerCase = matcher.group().toLowerCase();
            } else {
                lowerCase = null;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                return str2;
            }
            boolean z = false;
            if (lowerCase.length() >= 2) {
                int i = 0;
                for (int i2 = 1; i2 < lowerCase.length() && (lowerCase.charAt(i2) != '.' || (i = i + 1) < 2); i2++) {
                }
                if (i >= 2) {
                    z = true;
                }
            }
            if (z) {
                strReplaceFirst = matcher.replaceFirst(str);
                return strReplaceFirst;
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return strReplaceFirst;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    @Override // java.net.CookieManager, java.net.CookieHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map get(java.net.URI r20, java.util.Map r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X2Q.get(java.net.URI, java.util.Map):java.util.Map");
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final void put(URI uri, Map map) throws Throwable {
        List<String> listLJ;
        boolean z;
        Object string;
        boolean z2;
        LinkedHashMap linkedHashMap;
        List list;
        List<String> listLJ2;
        JSONObject jSONObject;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        String string2 = "";
        if (C0X2R.LIZ) {
            if (uri != null) {
                if (map != null) {
                    if (!map.isEmpty()) {
                        List<String> listLJ3 = LJ("Set-Cookie", map);
                        if (!C0IKQ.LIZ(listLJ3)) {
                            C0X2U c0x2u = C1494230ozF.LJI;
                            if (c0x2u != null) {
                                listLJ2 = c0x2u.LJ(uri.getHost());
                            } else {
                                listLJ2 = null;
                            }
                            if (this.LIZLLL != null && TTNetInit.cookieLogReportEnabled()) {
                                jSONObject = new JSONObject();
                                LJI("version", "v2", jSONObject);
                                LJI("url", uri.toString(), jSONObject);
                                if (listLJ2 != null) {
                                    string2 = listLJ2.toString();
                                }
                                LJI("shareHostList", string2, jSONObject);
                                LJI("responseHeaders", map.toString(), jSONObject);
                                LJI("setCookieList", listLJ3.toString(), jSONObject);
                            } else {
                                jSONObject = null;
                            }
                            if (C826940WcG.LIZ && "http".equalsIgnoreCase(uri.getScheme())) {
                                if (listLJ2 != null) {
                                    listLJ2.clear();
                                }
                                LJI("disable_share_insecure_cookie", "1", jSONObject);
                            }
                            if (this.LIZ == null) {
                                if (jSONObject != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                LJIIIZ(jSONObject, "mCookieMgr is null", z5);
                            } else {
                                HashSet hashSet = new HashSet();
                                List list2 = (List) map.get("webview-origin-url");
                                if (!C0IKQ.LIZ(list2)) {
                                    str = (String) ListProtector.get(list2, 0);
                                } else {
                                    str = null;
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it2 = listLJ3.iterator();
                                        while (it2.hasNext()) {
                                            String strLJIIJ = LJIIJ(str, (String) it2.next());
                                            if (!TextUtils.isEmpty(strLJIIJ)) {
                                                arrayList.add(strLJIIJ);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            Logger.debug();
                                            LJIIIIZZ(str, arrayList, hashSet);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                concurrentHashMap.put(uri, listLJ3);
                                boolean z6 = false;
                                for (String str2 : listLJ3) {
                                    Logger.debug();
                                    if (!TextUtils.isEmpty(str2)) {
                                        String strTrim = str2.toLowerCase().trim();
                                        if (strTrim.contains("sessionid=")) {
                                            z6 = true;
                                        } else if (!z6 && C0X2R.LJFF && (strTrim.contains("store-country-code=") || strTrim.contains("store-region="))) {
                                            z6 = true;
                                        }
                                        if (!C0X2R.LIZ(str2) && TextUtils.isEmpty(str) && !C0IKQ.LIZ(listLJ2) && LJFF(uri, str2)) {
                                            for (String str3 : listLJ2) {
                                                try {
                                                    if (!TextUtils.isEmpty(str3)) {
                                                        try {
                                                            if (!uri.getHost().endsWith(str3)) {
                                                                String strReplaceFirst = this.LIZJ.matcher(str2).replaceFirst(str3);
                                                                if (!TextUtils.isEmpty(strReplaceFirst)) {
                                                                    try {
                                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                        try {
                                                                            sbLIZ.append(uri.getScheme());
                                                                            try {
                                                                                sbLIZ.append("://");
                                                                                sbLIZ.append(str3);
                                                                                try {
                                                                                    sbLIZ.append("/");
                                                                                    URI uriCreate = URI.create(C2188811AlT.LIZIZ(sbLIZ));
                                                                                    List list3 = (List) concurrentHashMap.get(uriCreate);
                                                                                    if (list3 == null) {
                                                                                        ArrayList arrayList2 = new ArrayList();
                                                                                        arrayList2.add(strReplaceFirst);
                                                                                        concurrentHashMap.put(uriCreate, arrayList2);
                                                                                    } else {
                                                                                        list3.add(strReplaceFirst);
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    TryCatchGuardChecker.doCheck(th);
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                }
                                            }
                                        }
                                    }
                                }
                                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                    LJIIIIZZ(((URI) entry.getKey()).toString(), (List) entry.getValue(), hashSet);
                                }
                                InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
                                hashSet.isEmpty();
                                try {
                                    LIZIZ(uri.getPath(), z6);
                                } catch (Throwable th8) {
                                    TryCatchGuardChecker.doCheck(th8);
                                }
                                if (this.LIZIZ == null) {
                                    if (jSONObject != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    LJIIIZ(jSONObject, "mAppCookieMgr is null", z4);
                                } else {
                                    ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(concurrentHashMap, this, 51);
                                    if (C0X2R.LIZIZ) {
                                        C2126108Up.LIZ.submit(aRunnableS82S0200000_13);
                                    } else {
                                        aRunnableS82S0200000_13.run();
                                    }
                                    if (jSONObject != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    LJIIIZ(jSONObject, "last return", z3);
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            C0X2U c0x2u2 = C1494230ozF.LJI;
            if (c0x2u2 != null && uri != null) {
                listLJ = c0x2u2.LJ(uri.getHost());
            } else {
                listLJ = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (map != null && (map.containsKey("Set-Cookie") || map.containsKey("X-SS-Set-Cookie"))) {
                z = true;
            } else {
                z = false;
            }
            if (listLJ == null) {
                string = "";
            } else {
                try {
                    string = listLJ.toString();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            jSONObject2.put("shareHostList", string);
            if (z) {
                jSONObject2.put("responseHeaders", map.toString());
            }
            if (uri != null) {
                string2 = uri.toString();
            }
            jSONObject2.put("url", string2);
            if (uri != null && "http".equalsIgnoreCase(uri.getScheme()) && C826940WcG.LIZ) {
                if (listLJ != null) {
                    listLJ.clear();
                }
                jSONObject2.put("disable_share_insecure_cookie", 1);
            }
            try {
                InterfaceC1494070oyz interfaceC1494070oyz2 = C1494230ozF.LIZ;
            } catch (Throwable th9) {
                TryCatchGuardChecker.doCheck(th9);
            }
            if (map != null && map.containsKey("webview-origin-url")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (uri != null && map != null && this.LIZ != null) {
                HashSet hashSet2 = new HashSet();
                String string3 = uri.toString();
                boolean z7 = false;
                boolean z8 = false;
                for (String str4 : new String[]{"Set-Cookie"}) {
                    List<String> list4 = (List) map.get(str4);
                    if ((list4 != null && !list4.isEmpty()) || ((list4 = (List) map.get(str4.toLowerCase())) != null && !list4.isEmpty())) {
                        try {
                            jSONObject2.put("cookieMgrList", list4.toString());
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        for (String str5 : list4) {
                            if (str5.toLowerCase().trim().contains("sessionid=")) {
                                z8 = true;
                            } else if (!z8 && C0X2R.LJFF && (str5.toLowerCase().trim().contains("store-country-code=") || str5.toLowerCase().trim().contains("store-region="))) {
                                z8 = true;
                            }
                            LJII(string3, str5, hashSet2);
                            if (z2) {
                                String str6 = (String) ListProtector.get((List) map.get("webview-origin-url"), 0);
                                if (this.LIZ != null && !TextUtils.isEmpty(str6)) {
                                    String strLJIIJ2 = LJIIJ(str6, str5);
                                    if (!TextUtils.isEmpty(strLJIIJ2)) {
                                        Logger.debug();
                                        LJII(str6, strLJIIJ2, hashSet2);
                                    }
                                }
                            } else {
                                try {
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                if (!C0X2R.LIZ(str5) && (!C0IKQ.LIZ(listLJ)) && LJFF(uri, str5)) {
                                    for (String str7 : listLJ) {
                                        try {
                                            if (!TextUtils.isEmpty(str7)) {
                                                try {
                                                    if (!uri.getHost().endsWith(str7)) {
                                                        String strReplaceFirst2 = this.LIZJ.matcher(str5).replaceFirst(str7);
                                                        if (!TextUtils.isEmpty(strReplaceFirst2)) {
                                                            try {
                                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                try {
                                                                    sbLIZ2.append(uri.getScheme());
                                                                    try {
                                                                        sbLIZ2.append("://");
                                                                        sbLIZ2.append(str7);
                                                                        try {
                                                                            sbLIZ2.append("/");
                                                                            LJII(C2188811AlT.LIZIZ(sbLIZ2), strReplaceFirst2, hashSet2);
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            try {
                                                                                TryCatchGuardChecker.doCheck(th);
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                TryCatchGuardChecker.doCheck(th);
                                                                                Logger.debug();
                                                                            }
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                    }
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                }
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                        }
                                    }
                                    Logger.debug();
                                }
                            }
                        }
                        z7 = true;
                    }
                }
                InterfaceC1494070oyz interfaceC1494070oyz3 = C1494230ozF.LIZ;
                hashSet2.isEmpty();
                if (z7) {
                    try {
                        LIZIZ(uri.getPath(), z8);
                    } catch (Throwable th18) {
                        TryCatchGuardChecker.doCheck(th18);
                    }
                }
                if (this.LIZIZ == null) {
                    LJIIIZ(jSONObject2, "uri responseHeaders or mAppCookieMgr is null", z);
                } else {
                    try {
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(map);
                        this.LIZIZ.put(uri, linkedHashMap);
                        try {
                        } catch (Throwable th19) {
                            th = th19;
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th20) {
                        th = th20;
                    }
                    if ((!C0IKQ.LIZ(listLJ)) && !z2) {
                        for (String str8 : listLJ) {
                            try {
                            } catch (Throwable th21) {
                                th = th21;
                            }
                            if (!TextUtils.isEmpty(str8) && !uri.getHost().endsWith(str8)) {
                                try {
                                    List<String> list5 = (List) map.get("Set-Cookie");
                                    if (list5 == null) {
                                        LJIIIZ(jSONObject2, "cookieList is null", z);
                                        break;
                                    }
                                    LinkedList linkedList = new LinkedList();
                                    for (String str9 : list5) {
                                        if (!C0X2R.LIZ(str9) && LJFF(uri, str9)) {
                                            try {
                                                String strReplaceFirst3 = this.LIZJ.matcher(str9).replaceFirst(str8);
                                                if (!TextUtils.isEmpty(strReplaceFirst3)) {
                                                    linkedList.add(strReplaceFirst3);
                                                }
                                            } catch (IllegalArgumentException e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                            }
                                        }
                                    }
                                    linkedHashMap.put("Set-Cookie", linkedList);
                                    C842310X2n c842310X2n = this.LIZIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(uri.getScheme());
                                    sbLIZ3.append("://");
                                    sbLIZ3.append(str8);
                                    c842310X2n.put(URI.create(C2188811AlT.LIZIZ(sbLIZ3)), linkedHashMap);
                                } catch (Throwable th22) {
                                    th = th22;
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                th = th22;
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        LJIIIZ(jSONObject2, "last return", z);
                    } else {
                        LJIIIZ(jSONObject2, "isInShareCookieList is false", z);
                    }
                    if (map.size() <= 0 && (list = (List) map.get("Set-Cookie")) != null) {
                        int i = 0;
                        for (String str10 : C0X2O.LIZ) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    String str11 = (String) it3.next();
                                    if (str11.startsWith(str10)) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("key=");
                                        sbLIZ4.append(str11);
                                        C2188811AlT.LIZIZ(sbLIZ4);
                                        C0X2N.LJ();
                                        i++;
                                        break;
                                    }
                                }
                            }
                        }
                        if (i >= C0X2O.LIZ.length) {
                            C0X2N.LJ();
                            C0X2N.LIZIZ = !C0X2N.LIZIZ;
                            return;
                        }
                        return;
                    }
                }
            } else {
                LJIIIZ(jSONObject2, "uri responseHeaders or mCookieMgr is null", z);
            }
        }
        if (map == null) {
            return;
        }
        if (map.size() <= 0) {
        }
    }

    public static void LIZ(android.webkit.CookieManager cookieManager, String str, String str2) throws Throwable {
        String strLLIZ;
        C2204961BRm.LLJ(cookieManager, str, str2, new C0WZX("dzBzEgAjS8/YVFkiQFyCdOGDo1VxQnxjC8bCuoPiqW92K1QFZV0uThvHbrbkGuR6YbaiJO9W9Xe6xU8HhDOLbOng", null));
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(android.webkit.CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEgAjS8/YVFkiQFyCdOGDo1VxQnxjC8bCuoPiqW92K1QFZV0uThvHbrbkGuR6YbaiJO9W9Xe6xU8HhDOLbOng", null))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
            C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
        }
    }

    public static Map<String, List<String>> LIZLLL(boolean z, Map<String, List<String>> map, C0X2T c0x2t) {
        if (!z) {
            return map;
        }
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("x-tt-get-cookie-source", Collections.singletonList(String.valueOf(c0x2t.ordinal())));
        return linkedHashMap;
    }

    public static void LJI(String str, String str2, JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJII(String str, String str2, Set<String> set) throws Throwable {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((HashSet) set).add(str);
            LIZ(this.LIZ, str, str2);
            try {
                InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIIIZZ(String str, List<String> list, Set<String> set) throws Throwable {
        if (!TextUtils.isEmpty(str) && !C086I.LIZIZ(list)) {
            ((HashSet) set).add(str);
            boolean zBooleanValue = false;
            if (C0X2R.LIZLLL) {
                try {
                    Method declaredMethod = this.LIZ.getClass().getDeclaredMethod("setCookieList", String.class, List.class);
                    declaredMethod.setAccessible(true);
                    zBooleanValue = ((Boolean) declaredMethod.invoke(this.LIZ, str, list)).booleanValue();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
            if (zBooleanValue) {
                return;
            }
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZ(this.LIZ, str, it2.next());
            }
        }
    }

    public final void LJIIIZ(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && this.LIZLLL != null && z) {
            try {
                jSONObject.put("return", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZLLL.getClass();
            if (TTNetInit.cookieLogReportEnabled()) {
                TTNetInit.getTTNetDepend().LJIIJ();
            }
        }
    }

    public C0X2Q(final Context context, int i, android.webkit.CookieManager cookieManager, ArrayList arrayList, C0X2V c0x2v) {
        if (!C0X2R.LIZJ) {
            if (i > 0) {
                C2126108Up.LIZLLL.schedule(new Runnable() { // from class: X.0X2S
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SSCookieHandler@693e.<init>$1");
                        try {
                            this.LLILLJJLI.LIZIZ = new C842310X2n(new C842370X2t(context));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SSCookieHandler@693e.<init>$1");
                    }
                }, i, TimeUnit.SECONDS);
            } else {
                this.LIZIZ = new C842310X2n(new C842370X2t(context));
            }
        }
        this.LIZ = cookieManager;
        this.LJ = arrayList;
        this.LIZLLL = c0x2v;
        if (TTNetInit.cookieLogReportEnabled()) {
            try {
                new JSONObject().put("init", "success");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZLLL.getClass();
            if (TTNetInit.cookieLogReportEnabled()) {
                TTNetInit.getTTNetDepend().LJIIJ();
            }
        }
    }
}
