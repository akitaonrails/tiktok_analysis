package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import java.net.URLDecoder;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041360dCo {
    public static final C1041360dCo LIZ = new C1041360dCo();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(199));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(123));
    public static boolean LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r5) {
        /*
            X.14c6 r0 = X.C20301014c4.LIZ
            X.14c6 r0 = X.C20301014c4.LIZ
            java.lang.String r1 = r0.LIZIZ
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r1.toUpperCase(r0)
            if (r5 == 0) goto L4f
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r1 = 0
            r0 = 6
            java.util.List r1 = kotlin.text.a0.LJJLIIIJILLIZJL(r5, r2, r1, r0)
            if (r1 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            r3.add(r0)
            goto L2b
        L49:
            java.util.Set r0 = X.C13LP.LLIIJI(r3)
            if (r0 != 0) goto L51
        L4f:
            X.08CX r0 = X.C08CX.INSTANCE
        L51:
            boolean r0 = r0.contains(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1041360dCo.LIZ(java.lang.String):boolean");
    }

    public static boolean LIZIZ(String str) {
        String path;
        boolean z;
        boolean zLJFF;
        Uri uri = UriProtector.parse(str);
        String authority = uri.getAuthority();
        if (authority == null || (path = uri.getPath()) == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(authority);
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) C0BZV.LIZ.getValue(), new String[]{","}, 0, 6);
        if ((listLJJLIIIJILLIZJL instanceof Collection) && listLJJLIIIJILLIZJL.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(strLIZIZ, (String) it2.next(), false)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (Intrinsics.LJFF(LIZJ.getValue(), Boolean.TRUE)) {
            try {
                Uri uri2 = UriProtector.parse(str);
                String path2 = uri2.getPath();
                if (path2 != null && a0.LJJIIZI(path2, "/processing", false)) {
                    zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "completed"), "true");
                } else {
                    zLJFF = false;
                }
                String path3 = uri2.getPath();
                if (path3 != null && a0.LJJIIZI(path3, "/thank_you", false)) {
                    return false;
                }
                String path4 = uri2.getPath();
                if (path4 != null) {
                    if (a0.LJJIIZI(path4, "/thank-you", false)) {
                        return false;
                    }
                }
                if (!zLJFF) {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            if (z || LJ(str)) {
                return true;
            }
        } else if (z || LJ(str)) {
            return true;
        }
        return false;
    }

    public static Locale LIZLLL(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getResources().getConfiguration().getLocales().get(0);
        }
        return context.getResources().getConfiguration().locale;
    }

    public static boolean LJ(String str) {
        String str2;
        String query;
        C01GW c01gw = C2539509xJ.LIZ;
        if (TextUtils.isEmpty((String) c01gw.getValue())) {
            str2 = "checkout_automatic_redirect,checkout_universal_redirect,direct_checkout_checkout";
        } else {
            str2 = (String) c01gw.getValue();
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6);
        Uri uri = UriProtector.parse(str);
        String host = uri.getHost();
        if (host == null || (query = uri.getQuery()) == null || !a0.LJJIIZI(host, "shop.app", false)) {
            return false;
        }
        List listLJJLIIIJ = a0.LJJLIIIJ(URLDecoder.decode(query, "UTF-8"), new char[]{'&'}, false, 0, 6);
        ArrayList<List> arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJJLIIIJ((String) it2.next(), new char[]{'='}, false, 0, 6));
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (List list : arrayList) {
            if (list.size() == 2 && Intrinsics.LJFF(ListProtector.get(list, 0), "redirect_source") && listLJJLIIIJILLIZJL.contains(ListProtector.get(list, 1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(WebView webView, C1039580d9w c1039580d9w) {
        String str;
        String strLJJIFFI;
        String userAgentString = webView.getSettings().getUserAgentString();
        if (userAgentString != null && (str = c1039580d9w.LIZJ) != null && a0.LJJIIZI(userAgentString, str, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" ");
            sbLIZ.append(str);
            sbLIZ.append(" ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (a0.LJJIIZI(userAgentString, strLIZIZ, false)) {
                strLJJIFFI = u.LJJIFFI(userAgentString, strLIZIZ, " ", false);
            } else {
                strLJJIFFI = u.LJJIFFI(userAgentString, str, "", false);
            }
            if (!Intrinsics.LJFF(strLJJIFFI, userAgentString)) {
                C786410Ut5.se(webView.getSettings(), strLJJIFFI);
                return true;
            }
        }
        return false;
    }

    public static String LJI(float f, Currency currency, Locale locale) {
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(currency);
            currencyInstance.setMinimumFractionDigits(currency.getDefaultFractionDigits());
            currencyInstance.setMaximumFractionDigits(currency.getDefaultFractionDigits());
            return currencyInstance.format(Float.valueOf(f));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public static void LIZJ(WebView webView, C1039580d9w c1039580d9w, C1035880d3y c1035880d3y, C1040740dBo c1040740dBo, C1041370dCp c1041370dCp) {
        Boolean boolValueOf;
        String strLIZ;
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        LJFF(webView, c1039580d9w);
        Boolean bool = Boolean.TRUE;
        c1039580d9w.LIZ = bool;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null) {
            boolValueOf = Boolean.valueOf(landingPageConfig.strictUsePureLink);
        } else {
            boolValueOf = null;
        }
        String str = c1039580d9w.LIZIZ;
        if (str != null && !Intrinsics.LJFF(boolValueOf, bool)) {
            strLIZ = C2215608mA.LIZ(str, "clear_checkout_sheet_protocol_context", "true");
        } else {
            strLIZ = c1039580d9w.LIZIZ;
        }
        if (strLIZ != null) {
            C786410Ut5.ue(webView, strLIZ);
        } else {
            webView.reload();
        }
        Integer num = c1041370dCp.LIZ;
        Integer num2 = c1041370dCp.LIZIZ;
        String str2 = c1041370dCp.LIZJ;
        if (c1040740dBo != null) {
            c1040740dBo.LJJLIL(num, num2, str2);
        }
    }
}
