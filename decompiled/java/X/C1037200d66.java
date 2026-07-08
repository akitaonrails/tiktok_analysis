package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0d66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037200d66 {
    public static List<Pattern> LIZ;

    public static final Set<String> LJFF() {
        String str = (String) C2505109rl.LIZ.getValue();
        if (str == null) {
            return C08CX.INSTANCE;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList2);
    }

    public static final boolean LIZLLL(AwemeRawAd awemeRawAd) {
        LandingPageConfig landingPageConfig;
        Integer num;
        LandingPageConfig landingPageConfig2;
        if (awemeRawAd != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && (num = landingPageConfig.enableUtmAttach) != null && num.intValue() == 1 && ((landingPageConfig2 = awemeRawAd.getLandingPageConfig()) == null || !landingPageConfig2.strictUsePureLink)) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(AwemeRawAd awemeRawAd) {
        LandingPageConfig landingPageConfig;
        Integer num;
        LandingPageConfig landingPageConfig2;
        if (awemeRawAd != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && (num = landingPageConfig.iabToIabAddUtm) != null && num.intValue() == 1 && ((landingPageConfig2 = awemeRawAd.getLandingPageConfig()) == null || !landingPageConfig2.strictUsePureLink)) {
            return true;
        }
        return false;
    }

    public static final Map<String, String> LJI(Uri uri) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uri != null && uri.getQuery() != null) {
            try {
                for (String str : LJFF()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        return linkedHashMap;
    }

    public static final String LIZIZ(C1035880d3y c1035880d3y, String str) {
        return LIZ(str, c1035880d3y, "boc", false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(android.net.Uri r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Le
            r0 = 1
        L7:
            if (r0 == 0) goto L10
            java.lang.String r0 = r7.toString()
            return r0
        Le:
            r0 = 0
            goto L7
        L10:
            X.0XI4 r6 = new X.0XI4     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Exception -> L6c
            r6.<init>(r0)     // Catch: java.lang.Exception -> L6c
            java.util.Set r5 = LJFF()     // Catch: java.lang.Exception -> L6c
            java.util.Set r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r7)     // Catch: java.lang.Exception -> L6c
            java.util.Set r0 = r8.entrySet()     // Catch: java.lang.Exception -> L6c
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> L6c
        L29:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L67
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Exception -> L6c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L6c
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L6c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            boolean r0 = r5.contains(r2)     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L29
            boolean r0 = r4.contains(r2)     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L5b
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r7, r2)     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L5d
            int r0 = r0.length()     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L5d
            r0 = 0
            goto L5e
        L5b:
            r0 = 1
            goto L61
        L5d:
            r0 = 1
        L5e:
            if (r0 != 0) goto L5b
            r0 = 0
        L61:
            if (r0 == 0) goto L29
            r6.LJ(r2, r1)     // Catch: java.lang.Exception -> L6c
            goto L29
        L67:
            java.lang.String r0 = r6.LJFF()     // Catch: java.lang.Exception -> L6c
            return r0
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1037200d66.LIZJ(android.net.Uri, java.util.Map):java.lang.String");
    }

    public static String LIZ(String str, C1035880d3y c1035880d3y, String str2, boolean z, boolean z2) {
        boolean z3;
        boolean zLIZLLL;
        Object c098200Yq;
        Set setLJLIIL;
        boolean zContains;
        Integer num;
        AwemeRawAd awemeRawAd;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Set<String> queryParameterNames;
        Object c098200Yq2;
        boolean z8;
        if (str.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && c1035880d3y != null) {
            if (Intrinsics.LJFF(str2, "iab")) {
                zLIZLLL = LJ(c1035880d3y.getAwemeRawAd());
            } else if (Intrinsics.LJFF(str2, "boc")) {
                zLIZLLL = LIZLLL(c1035880d3y.getAwemeRawAd());
            } else {
                zLIZLLL = false;
            }
            List<String> listAsList = null;
            if (!zLIZLLL) {
                num = 1;
            } else {
                try {
                    c098200Yq = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("iab_attach_utm_block_cid_list", String[].class, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Object[] objArr = (Object[]) c098200Yq;
                if (objArr == null || (setLJLIIL = C13LQ.LJLIIL(objArr)) == null) {
                    setLJLIIL = C08CX.INSTANCE;
                }
                if (!setLJLIIL.isEmpty() && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
                    zContains = setLJLIIL.contains(awemeRawAd.getCreativeId().toString());
                } else {
                    zContains = false;
                }
                if (zContains) {
                    num = 7;
                } else if (z) {
                    num = 8;
                } else if (!z2) {
                    num = 9;
                } else {
                    num = null;
                }
            }
            if (num != null) {
                LJII(c1035880d3y, num.intValue(), 0, str, str2);
                return str;
            }
            try {
                Uri uri = UriProtector.parse(str);
                String host = uri.getHost();
                if (host != null && host.length() != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z4) {
                    List<Pattern> list = LIZ;
                    List list2 = list;
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            c098200Yq2 = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("landing_page_utm_regex_blocklist", String[].class, null);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        Object[] objArr2 = (Object[]) c098200Yq2;
                        if (objArr2 != null) {
                            listAsList = Arrays.asList(objArr2);
                        }
                        if (listAsList != null && !listAsList.isEmpty()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z8) {
                            listAsList = C1106504Ul.LIZ;
                        }
                        Iterator<String> it2 = listAsList.iterator();
                        while (it2.hasNext()) {
                            try {
                                C189200o6.m2constructorimpl(Boolean.valueOf(arrayList.add(PatternProtector.compile(it2.next()))));
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                C189200o6.m2constructorimpl(new C098200Yq(th3));
                            }
                        }
                        LIZ = arrayList;
                        list2 = arrayList;
                    }
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((Pattern) it3.next()).matcher(host).matches()) {
                            z5 = true;
                            break;
                        }
                    }
                    z5 = false;
                } else {
                    z5 = true;
                    break;
                }
                if (z5) {
                    LJII(c1035880d3y, 2, 0, str, str2);
                    return str;
                }
                Map<String, String> utmParams = c1035880d3y.getUtmParams();
                if (utmParams == null) {
                    try {
                        String url = c1035880d3y.getUrl();
                        if (url != null && url.length() != 0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z6) {
                            c1035880d3y.setUtmParams(C2097608Jq.LJ());
                            utmParams = C2097608Jq.LJ();
                        } else {
                            utmParams = LJI(UriProtector.parse(url));
                            c1035880d3y.setUtmParams(utmParams);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                        c1035880d3y.setUtmParams(C2097608Jq.LJ());
                        utmParams = C2097608Jq.LJ();
                    }
                }
                if (utmParams.isEmpty()) {
                    LJII(c1035880d3y, 4, 0, str, str2);
                    return str;
                }
                if (!utmParams.isEmpty()) {
                    try {
                        queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1AF0.LJ(e2);
                    }
                    for (Map.Entry<String, String> entry : utmParams.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (queryParameterNames.contains(key) && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, key), value)) {
                        }
                        z7 = false;
                    }
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z7) {
                    LJII(c1035880d3y, 3, 0, str, str2);
                    return str;
                }
                try {
                    String strLIZJ = LIZJ(uri, utmParams);
                    if (!Intrinsics.LJFF(strLIZJ, str)) {
                        LJII(c1035880d3y, -1, 1, strLIZJ, str2);
                        return strLIZJ;
                    }
                    LJII(c1035880d3y, 5, 0, str, str2);
                    return str;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C1AF0.LJ(e3);
                    LJII(c1035880d3y, 6, 0, str, str2);
                    return str;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C1AF0.LJ(e4);
                LJII(c1035880d3y, 6, 0, str, str2);
            }
        }
        return str;
    }

    public static final void LJII(C1035880d3y c1035880d3y, int i, int i2, String str, String str2) {
        AdWebLogService.LJIIIZ().LJII();
        C1040770dBr.LIZ(c1035880d3y.getRealCreativeIdStr(), i2, c1035880d3y.getRealLogExtra(), c1035880d3y.getUrl(), Integer.valueOf(i), c1035880d3y.getCurrentUrl(), str, str2);
    }
}
