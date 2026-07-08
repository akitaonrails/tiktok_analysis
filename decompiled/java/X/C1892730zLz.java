package X;

import android.net.Uri;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892730zLz {
    public static final C1892730zLz LIZ = new C1892730zLz();
    public static String LIZIZ;
    public static long LIZJ;
    public static String LIZLLL;

    public static boolean LIZLLL(String str) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        String strLJII = LJII(str, (Map) C1201704n1.LIZIZ.getValue());
        if (strLJII == null || strLJII.length() == 0) {
            z = true;
        }
        return !z;
    }

    public static String LJFF(String str) {
        boolean z;
        Object c098200Yq;
        boolean z2;
        boolean z3 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (z) {
            return "";
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return str;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = uri.getHost();
        if (host == null) {
            host = "";
        }
        String path = uri.getPath();
        if (path != null) {
            str2 = path;
        }
        if (scheme.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (host.length() == 0) {
                z3 = true;
            }
            if (z3) {
                return str;
            }
        }
        return scheme + "://" + host + str2;
    }

    public static Map LJI(String str) {
        String strLJII = LJII(str, (Map) C1201704n1.LIZIZ.getValue());
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1892770zM3.LIZ.getClass();
        LIZ(c2344009Gk, C1892770zM3.LIZJ);
        if (strLJII == null) {
            strLJII = "";
        }
        c2344009Gk.LJFF("ota_name", strLJII);
        return c2344009Gk.LIZ;
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str) {
        String string;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    string = objOpt.toString();
                } else {
                    string = null;
                }
                c2344009Gk.LJFF(next, string);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static C2344009Gk LIZIZ(String str, String str2) {
        Object c098200Yq;
        String host;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1892770zM3.LIZ.getClass();
        LIZ(c2344009Gk, C1892770zM3.LIZJ);
        if (str != null && str.length() != 0) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String path = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            c2344009Gk.LJIIIIZZ("page_url", str);
            if (uri != null) {
                host = uri.getHost();
            } else {
                host = null;
            }
            c2344009Gk.LJIIIIZZ("domain_name", host);
            if (uri != null) {
                path = uri.getPath();
            }
            c2344009Gk.LJFF("page_path", path);
        }
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJFF("ota_name", str2);
        return c2344009Gk;
    }

    public static void LIZJ(String str, PageFinder pageFinder) {
        if (str != null && str.length() != 0) {
            String strLJFF = LJFF(str);
            if (Intrinsics.LJFF(strLJFF, LIZLLL)) {
                return;
            }
            LIZLLL = strLJFF;
            Map map = (Map) C1201704n1.LIZIZ.getValue();
            String strLJII = LJII(str, map);
            String strLJ = LJ(str, strLJII, map);
            C2344009Gk c2344009GkLIZIZ = LIZIZ(str, strLJII);
            if (strLJ != null && strLJ.length() != 0) {
                c2344009GkLIZIZ.LJFF("current_page", strLJ);
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                HashMap map2 = (HashMap) c2344009GkLIZIZ.LIZ;
                map2.remove("page_url");
                map2.remove("url");
                map2.remove("click_path");
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ("ttls_transaction_poi_webview_page_show", map2, c1185050gwZ);
            }
        }
    }

    public static String LJII(String str, Map map) {
        boolean z;
        Object c098200Yq;
        String lowerCase;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (!map.isEmpty()) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    c098200Yq = UriProtector.parse(str).getHost();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str2 = (String) c098200Yq;
                if (str2 != null) {
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = null;
                }
                if (lowerCase == null) {
                    lowerCase = "";
                }
                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                if (lowerCase.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (lowerCase2.length() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        return null;
                    }
                }
                for (String str3 : map.keySet()) {
                    if (str3.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        String lowerCase3 = str3.toLowerCase(Locale.ROOT);
                        if (lowerCase.length() > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4 || !a0.LJJIIZI(lowerCase, lowerCase3, false)) {
                            if (lowerCase2.length() > 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5 || !a0.LJJIIZI(lowerCase2, lowerCase3, false)) {
                            }
                        }
                        return str3;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(java.lang.String r7, java.lang.String r8, java.util.Map r9) {
        /*
            if (r8 == 0) goto Ld
            int r0 = r8.length()
            if (r0 == 0) goto Ld
            r0 = 0
        L9:
            r6 = 0
            if (r0 == 0) goto Lf
            return r6
        Ld:
            r0 = 1
            goto L9
        Lf:
            java.lang.Object r0 = r9.get(r8)
            com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyRecordingOtaRules r0 = (com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyRecordingOtaRules) r0
            if (r0 == 0) goto La2
            java.util.List<com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyRecordingViewRule> r0 = r0.view
            if (r0 == 0) goto La2
            java.util.Iterator r5 = r0.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r1 = r5.next()
            com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyRecordingViewRule r1 = (com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyRecordingViewRule) r1
            java.lang.String r3 = r1.pageName
            if (r3 == 0) goto La0
            int r0 = r3.length()
            if (r0 == 0) goto La0
            r0 = 0
        L36:
            if (r0 != 0) goto L1f
            java.util.List<java.lang.String> r0 = r1.urlRegex
            if (r0 == 0) goto L1f
            java.util.Iterator r4 = r0.iterator()
        L40:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L9e
            int r0 = r1.length()
            if (r0 == 0) goto L9e
            r0 = 0
        L55:
            if (r0 != 0) goto L40
            int r0 = r7.length()
            if (r0 != 0) goto L9c
            r0 = 1
        L5e:
            if (r0 != 0) goto L7c
            int r0 = r1.length()
            if (r0 != 0) goto L7a
            r0 = 1
        L67:
            if (r0 != 0) goto L7c
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.containsMatchIn(r7)     // Catch: java.lang.Throwable -> L7e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L7e
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L7e
            goto L8a
        L7a:
            r0 = 0
            goto L67
        L7c:
            r0 = 0
            goto L99
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L8a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L93
            r2 = r1
        L93:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
        L99:
            if (r0 == 0) goto L40
            return r3
        L9c:
            r0 = 0
            goto L5e
        L9e:
            r0 = 1
            goto L55
        La0:
            r0 = 1
            goto L36
        La2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892730zLz.LJ(java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }
}
