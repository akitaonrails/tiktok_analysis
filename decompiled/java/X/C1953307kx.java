package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1953307kx {
    public static final C1953307kx LIZ = new C1953307kx();

    public static HashMap LIZ(String str) {
        String str2;
        String strDecode;
        Object c098200Yq;
        String strDecode2;
        Object c098200Yq2;
        HashMap map = new HashMap();
        if (str != null) {
            try {
                for (String str3 : (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
                    String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str3, new String[]{"="}, 0, 6).toArray(new String[0]);
                    try {
                        strDecode = URLDecoder.decode(strArr[0], "UTF-8");
                        try {
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        strDecode = "";
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        strDecode = strArr[0];
                    }
                    if (strArr.length <= 1) {
                        strDecode2 = "";
                    } else {
                        try {
                            strDecode2 = URLDecoder.decode(strArr[1], "UTF-8");
                            try {
                                c098200Yq2 = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th3) {
                                th = th3;
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq2 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            strDecode2 = "";
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                            strDecode2 = strArr[1];
                        }
                    }
                    map.put(strDecode, strDecode2);
                }
                Object obj = map.get("params_url");
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                LIZ.getClass();
                if (LIZLLL(str2)) {
                    map.putAll(LIZ(UriProtector.parse(str2).getQuery()));
                    return map;
                }
                return map;
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError(e);
            }
        }
        return map;
    }

    public static String LIZJ(Uri uri) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String lastPathSegment = uri.getLastPathSegment();
        int i = 0;
        if (lastPathSegment != null && PatternProtector.compile("^[0-9]+\\d*$").matcher(lastPathSegment).find()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(uri.getHost());
            StringBuilder sb = new StringBuilder("/");
            for (String str : uri.getPathSegments()) {
                int i2 = i + 1;
                if (i < uri.getPathSegments().size() - 1) {
                    sb.append(str);
                }
                i = i2;
            }
            sbLIZ2.append(sb.toString());
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }

    public static boolean LIZLLL(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC1950207kS LIZIZ(java.lang.String r4, X.C1950707kX r5, X.C1962707mT r6) {
        /*
            X.01GW<X.07kM> r0 = X.C1949607kM.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.07kM r0 = (X.C1949607kM) r0
            java.util.HashMap<java.lang.String, X.07kN> r0 = r0.LIZ
            java.lang.Object r0 = r0.get(r4)
            X.07kN r0 = (X.C1949707kN) r0
            r2 = 0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.LIZIZ
        L15:
            if (r5 == 0) goto L25
            X.07kS<?> r1 = r5.LJIIIIZZ
            if (r1 == 0) goto L20
            X.07kS<?> r0 = r5.LJIIIIZZ
            return r0
        L1e:
            r0 = r2
            goto L15
        L20:
            if (r5 == 0) goto L25
            android.net.Uri r4 = r5.LIZIZ
            goto L26
        L25:
            r4 = r2
        L26:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "//"
            r3.append(r1)
            if (r4 == 0) goto L63
            java.lang.String r1 = r4.getHost()
        L35:
            r3.append(r1)
            if (r4 == 0) goto L61
            java.lang.String r1 = r4.getPath()
        L3e:
            r3.append(r1)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)
            boolean r1 = LIZLLL(r0)
            if (r1 == 0) goto L50
            if (r0 != 0) goto L65
        L4d:
            java.lang.String r0 = ""
            goto L65
        L50:
            com.bytedance.router.RouteManager r0 = com.bytedance.router.RouteManager.getInstance()
            java.util.Map r0 = r0.getExternalRouteMap()
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L65
            goto L4d
        L61:
            r1 = r2
            goto L3e
        L63:
            r1 = r2
            goto L35
        L65:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L6a
            goto L7d
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r6 == 0) goto L9d
            boolean r1 = r6.LIZ
            r0 = 1
            if (r1 != r0) goto L9d
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LIZLLL
            if (r0 == 0) goto L7c
            r0.invoke()
        L7c:
            r0 = r2
        L7d:
            if (r5 == 0) goto L8d
            if (r0 == 0) goto La6
            java.lang.Object r1 = r0.newInstance()
        L85:
            boolean r0 = r1 instanceof X.AbstractC1950207kS
            if (r0 == 0) goto L9b
            X.07kS r1 = (X.AbstractC1950207kS) r1
        L8b:
            r5.LJIIIIZZ = r1
        L8d:
            if (r5 == 0) goto L99
            X.07kS<?> r0 = r5.LJIIIIZZ
        L91:
            java.util.Objects.toString(r0)
            if (r5 == 0) goto L98
            X.07kS<?> r2 = r5.LJIIIIZZ
        L98:
            return r2
        L99:
            r0 = r2
            goto L91
        L9b:
            r1 = r2
            goto L8b
        L9d:
            if (r5 == 0) goto L8d
            android.app.Activity r0 = r5.LIZ
            if (r0 == 0) goto La6
            r0.finish()
        La6:
            r1 = r2
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1953307kx.LIZIZ(java.lang.String, X.07kX, X.07mT):X.07kS");
    }
}
