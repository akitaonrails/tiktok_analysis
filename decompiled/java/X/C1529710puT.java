package X;

import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0puT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529710puT {
    public static final C1529710puT LIZ = new C1529710puT();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("no-store", "no-cache", "max-age=0", "max-age=0", "must-revalidate", "proxy-revalidate");
    public static final Gson LIZJ = new Gson();

    public static long LIZ(Map map) {
        long jCurrentTimeMillis;
        Object c098200Yq;
        String strLJJLIL;
        String strLJJLL;
        Integer numLJIIJJI;
        int iIntValue;
        Integer numLJIIJJI2;
        Long lLJIILIIL;
        String str = (String) map.get("forest-append-on-request");
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jCurrentTimeMillis = lLJIILIIL.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        String str2 = (String) map.get("cache-control");
        if (str2 != null && (strLJJLIL = a0.LJJLIL(str2, "max-age=", str2)) != null && (strLJJLL = a0.LJJLL(',', strLJJLIL, strLJJLIL)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLJJLL)) != null) {
            int iIntValue2 = numLJIIJJI.intValue();
            String str3 = (String) map.get("age");
            if (str3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
            }
            return jCurrentTimeMillis + (((long) (iIntValue2 - iIntValue)) * 1000);
        }
        String str4 = (String) map.get("expires");
        if (str4 != null) {
            try {
                c098200Yq = Long.valueOf(new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH).parse(str4).getTime());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Long l = (Long) c098200Yq;
            if (l != null) {
                return l.longValue();
            }
            return jCurrentTimeMillis;
        }
        return jCurrentTimeMillis;
    }

    public static Map LIZJ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (HashMap) LIZJ.LJII(str, new HashMap().getClass());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Map) c098200Yq;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LJ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 3401:
                    if (str.equals("js")) {
                        return "application/x-javascript";
                    }
                    break;
                case 98819:
                    if (str.equals("css")) {
                        return "text/css";
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        return "image/gif";
                    }
                    break;
                case 104085:
                    if (str.equals("ico")) {
                        return "image/x-icon";
                    }
                    break;
                case 105441:
                    if (str.equals("jpg")) {
                        return "image/jpeg";
                    }
                    break;
                case 111145:
                    if (str.equals("png")) {
                        return "image/png";
                    }
                    break;
                case 114276:
                    if (str.equals("svg")) {
                        return "image/svg+xml";
                    }
                    break;
                case 115174:
                    if (str.equals("ttf")) {
                        return "font/ttf";
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        return "text/html";
                    }
                    break;
                case 3268712:
                    if (str.equals("jpeg")) {
                        return "image/jpeg";
                    }
                    break;
                case 3271912:
                    if (str.equals("json")) {
                        return "application/json";
                    }
                    break;
                case 3645340:
                    if (str.equals("webp")) {
                        return "image/webp";
                    }
                    break;
                case 3655064:
                    if (str.equals("woff")) {
                        return "font/woff";
                    }
                    break;
                case 113307034:
                    if (str.equals("woff2")) {
                        return "font/woff2";
                    }
                    break;
            }
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    public static Map LJFF(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!u.LJJIIJZLJL((String) entry.getKey(), "forest-append-", false)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r2, boolean r3) {
        /*
            if (r3 == 0) goto L11
            r1 = 46
            java.lang.String r0 = ""
            java.lang.String r1 = kotlin.text.a0.LJJLJ(r1, r2, r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r0)
        L10:
            return r1
        L11:
            java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L24
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L24
            r0 = 0
            goto L25
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L27
        L24:
            r0 = 1
        L25:
            if (r0 == 0) goto L10
        L27:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529710puT.LIZIZ(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WebResourceResponse LIZLLL(String str, String str2, InputStream inputStream, String str3, Map map) {
        String strLJJLIIIJ;
        Set setEntrySet;
        Map map2 = map;
        if (Intrinsics.LJFF(str, "unknown")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(", cannot resolve mimetype, ");
            sbLIZ.append(str3);
            sbLIZ.append(", headers: ");
            if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(setEntrySet, null, null, null, 0, null, AFwS263S0000000_23.get$arr$(49), 31);
            } else {
                strLJJLIIIJ = null;
            }
            sbLIZ.append(strLJJLIIIJ);
            C1534250q1n.LIZJ("header", C2188811AlT.LIZIZ(sbLIZ), null, true);
            return null;
        }
        if (inputStream != null) {
            if (map2 == null) {
                try {
                    map2 = new HashMap();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (map2.get("Access-Control-Allow-Origin") == null && map2.get("access-control-allow-origin") == null) {
                map2.put("access-control-allow-origin", "*");
            }
            if (Intrinsics.LJFF("font/ttf", str)) {
                return new WebResourceResponse(str, str2, 200, "OK", map2, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            webResourceResponse.setResponseHeaders(map2);
            return webResourceResponse;
        }
        return null;
    }
}
