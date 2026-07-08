package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.experiment.AdAutofillJsConfigExp;
import com.ss.android.ugc.aweme.autofill.setting.AdIframeInjectConfigSettings;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.web.experiment.AutofillPrefillConfigExp;
import com.ss.android.ugc.aweme.web.experiment.IABLoginConfigExp;
import com.ss.android.ugc.aweme.web.experiment.IABPaymentConfigExp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS16S2000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047720dN4 {
    public static final C1047720dN4 LIZ = new C1047720dN4();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(572));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(570));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(571));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(567));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(569));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(568));
    public static final CopyOnWriteArrayList<C1047860dNI> LJII = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<C1047860dNI> LJIIIIZZ = new CopyOnWriteArrayList<>();

    public static C1047800dNC LIZ() {
        Iterator<C1047860dNI> it2 = LJII.iterator();
        int i = 0;
        long j = 0;
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        long jLongValue4 = 0;
        while (it2.hasNext()) {
            i++;
            C1047790dNB c1047790dNB = it2.next().LIZJ;
            if (c1047790dNB != null) {
                j += c1047790dNB.LIZ;
                Long l = c1047790dNB.LIZIZ.get("ttnet_request_duration");
                jLongValue += l != null ? l.longValue() : 0L;
                Long l2 = c1047790dNB.LIZIZ.get("security_decision_duration");
                jLongValue2 += l2 != null ? l2.longValue() : 0L;
                Long l3 = c1047790dNB.LIZIZ.get("script_load_duration");
                jLongValue3 += l3 != null ? l3.longValue() : 0L;
                Long l4 = c1047790dNB.LIZIZ.get("prepare_script_duration");
                jLongValue4 += l4 != null ? l4.longValue() : 0L;
            }
        }
        C1068640duo c1068640duo = new C1068640duo(i, j, jLongValue, jLongValue2, jLongValue3, jLongValue4);
        new ArrayList();
        Iterator<C1047860dNI> it3 = LJIIIIZZ.iterator();
        int i2 = 0;
        long j2 = 0;
        long jLongValue5 = 0;
        long jLongValue6 = 0;
        long jLongValue7 = 0;
        long jLongValue8 = 0;
        while (it3.hasNext()) {
            i2++;
            C1047790dNB c1047790dNB2 = it3.next().LIZJ;
            if (c1047790dNB2 != null) {
                j2 += c1047790dNB2.LIZ;
                Long l5 = c1047790dNB2.LIZIZ.get("ttnet_request_duration");
                jLongValue5 += l5 != null ? l5.longValue() : 0L;
                Long l6 = c1047790dNB2.LIZIZ.get("security_decision_duration");
                jLongValue6 += l6 != null ? l6.longValue() : 0L;
                Long l7 = c1047790dNB2.LIZIZ.get("script_load_duration");
                jLongValue7 += l7 != null ? l7.longValue() : 0L;
                Long l8 = c1047790dNB2.LIZIZ.get("prepare_script_duration");
                jLongValue8 += l8 != null ? l8.longValue() : 0L;
            }
        }
        return new C1047800dNC(!LJII.isEmpty() ? 1 : 0, c1068640duo, new C1068630dun(i2, j2, jLongValue5, jLongValue6, jLongValue7, jLongValue8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.lang.String r3) {
        /*
            r2 = 0
            if (r3 == 0) goto La
            boolean r0 = kotlin.text.a0.LJJJIL(r3)     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto La
            goto Lc
        La:
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L1e
            return r0
        L12:
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L1e
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r3, r1, r2, r0)     // Catch: java.lang.Exception -> L1e
            return r0
        L1e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047720dN4.LIZJ(java.lang.String):java.util.List");
    }

    public static void LJI(C1035880d3y c1035880d3y) {
        String creativeIdStr;
        String logExtra;
        C1047800dNC c1047800dNCLIZ = LIZ();
        C1067990dtl.LIZ.getClass();
        C1068590duj c1068590duj = new C1068590duj(C1067990dtl.LJIIZILJ);
        C1023960ckk c1023960ckk = C1068600duk.LJ;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        String str = "";
        if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
            creativeIdStr = "";
        }
        AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd2 != null && (logExtra = awemeRawAd2.getLogExtra()) != null) {
            str = logExtra;
        }
        c1068590duj.logAd(c1023960ckk, creativeIdStr, str, null, new AwS595S0100000_16(c1047800dNCLIZ, 478));
        LJII.clear();
        LJIIIIZZ.clear();
    }

    public static AbstractC1544900qIy LIZIZ(final InterfaceC1041500dD2 interfaceC1041500dD2, final String str) {
        if (((AdAutofillJsConfigExp.AdAutofillJsConfig) AdAutofillJsConfigExp.LIZIZ.getValue()).useJsPlatform) {
            return new AbstractC1047780dNA() { // from class: X.0dN6
                @Override // X.AbstractC1544900qIy
                public final void LJIIIZ(C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJII.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) {
                    return str;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJIIIIZZ.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                public final boolean LIZJ(WebView webView, String str2, String str3, JSInjectConfig jSInjectConfig, Integer num) {
                    return C1047720dN4.LIZ.LJ(str2, str3, interfaceC1041500dD2, num);
                }
            };
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_promo_code_android", true, false)) {
            return new AbstractC1047880dNK() { // from class: X.0dN5
                @Override // X.AbstractC1544900qIy
                public final void LJIIIZ(C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJII.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) {
                    return str;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJIIIIZZ.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                public final boolean LIZJ(WebView webView, String str2, String str3, JSInjectConfig jSInjectConfig, Integer num) {
                    return C1047720dN4.LIZ.LJ(str2, str3, interfaceC1041500dD2, num);
                }
            };
        }
        if (C255710A0j.LIZ()) {
            return new AbstractC1047870dNJ() { // from class: X.0dN7
                @Override // X.AbstractC1544900qIy
                public final void LJIIIZ(C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJII.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) {
                    return str;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJIIIIZZ.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                public final boolean LIZJ(WebView webView, String str2, String str3, JSInjectConfig jSInjectConfig, Integer num) {
                    return C1047720dN4.LIZ.LJ(str2, str3, interfaceC1041500dD2, num);
                }
            };
        }
        if (AutofillPrefillConfigExp.LIZ()) {
            return new AbstractC1047890dNL() { // from class: X.0dN8
                @Override // X.AbstractC1544900qIy
                public final void LJIIIZ(C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJII.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) {
                    return str;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJIIIIZZ.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                public final boolean LIZJ(WebView webView, String str2, String str3, JSInjectConfig jSInjectConfig, Integer num) {
                    return C1047720dN4.LIZ.LJ(str2, str3, interfaceC1041500dD2, num);
                }
            };
        }
        if (!((IABLoginConfigExp.IABLoginConfig) IABLoginConfigExp.LIZIZ.getValue()).enable && !((IABPaymentConfigExp.IABPaymentConfig) IABPaymentConfigExp.LIZIZ.getValue()).enable) {
            return new AbstractC1047900dNM() { // from class: X.0dN9
                @Override // X.AbstractC1544900qIy
                public final void LJIIIZ(C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJII.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) {
                    return str;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                    try {
                        C1047720dN4.LJIIIIZZ.add(c1047860dNI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                public final boolean LIZJ(WebView webView, String str2, String str3, JSInjectConfig jSInjectConfig, Integer num) {
                    return C1047720dN4.LIZ.LJ(str2, str3, interfaceC1041500dD2, num);
                }
            };
        }
        return new AbstractC1047900dNM() { // from class: X.0dN9
            @Override // X.AbstractC1544900qIy
            public final void LJIIIZ(C1047860dNI c1047860dNI) {
                try {
                    C1047720dN4.LJII.add(c1047860dNI);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }

            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView) {
                return str;
            }

            @Override // X.AbstractC1544900qIy
            public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                try {
                    C1047720dN4.LJIIIIZZ.add(c1047860dNI);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }

            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
            public final boolean LIZJ(WebView webView, String str2, String str3, JSInjectConfig jSInjectConfig, Integer num) {
                return C1047720dN4.LIZ.LJ(str2, str3, interfaceC1041500dD2, num);
            }
        };
    }

    public static void LJFF(InterfaceC1041500dD2 interfaceC1041500dD2, String str, String str2) {
        C1035880d3y c1035880d3y;
        String creativeIdStr;
        String logExtra;
        if ((interfaceC1041500dD2 instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) interfaceC1041500dD2) != null) {
            C1067990dtl.LIZ.getClass();
            C1068590duj c1068590duj = new C1068590duj(C1067990dtl.LJIIZILJ);
            C1023960ckk c1023960ckk = C1068600duk.LJFF;
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            String str3 = "";
            if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd2 != null && (logExtra = awemeRawAd2.getLogExtra()) != null) {
                str3 = logExtra;
            }
            c1068590duj.logAd(c1023960ckk, creativeIdStr, str3, null, new AwS16S2000000_16(str, str2, 14));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.String r8, java.util.List r9, java.util.List r10, X.InterfaceC1041500dD2 r11) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047720dN4.LIZLLL(java.lang.String, java.util.List, java.util.List, X.0dD2):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.String r7, java.lang.String r8, X.InterfaceC1041500dD2 r9, java.lang.Integer r10) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047720dN4.LJ(java.lang.String, java.lang.String, X.0dD2, java.lang.Integer):boolean");
    }

    public static final boolean LJII(String str, String str2, boolean z, List<String> list, InterfaceC1041500dD2 interfaceC1041500dD2) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "commerce_iframe_inject_first_page_disable_v3", true, false)) {
            return true;
        }
        List list2 = (List) LJ.getValue();
        if (list2 != null && !list2.isEmpty() && !list2.contains(str2)) {
            return true;
        }
        boolean zBooleanValue = ((Boolean) C0A71.LIZ.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) C0A72.LIZ.getValue()).booleanValue();
        if (zBooleanValue) {
            if (z) {
                if (zBooleanValue2) {
                    boolean z2 = AdIframeInjectConfigSettings.LIZ().iframeInjectOptStrategyFirstEnable;
                    List list3 = (List) LIZJ.getValue();
                    if (!z2) {
                        list = null;
                    }
                    if (LIZLLL(str, list3, list, interfaceC1041500dD2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        if (!zBooleanValue2) {
            return false;
        }
        boolean z3 = AdIframeInjectConfigSettings.LIZ().iframeInjectOptStrategyFirstEnable;
        List list4 = (List) LIZJ.getValue();
        if (!z3) {
            list = null;
        }
        return !LIZLLL(str, list4, list, null);
    }
}
