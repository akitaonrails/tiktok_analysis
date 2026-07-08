package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0chd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022030chd {
    public static final C1022030chd LIZ = new C1022030chd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1022040che());
    public static String LIZJ;
    public static String LIZLLL;
    public static Map<String, ? extends Object> LJ;

    public static Map LJIIIIZZ() {
        Map<String, ? extends Object> map = LJ;
        LJ = null;
        return map;
    }

    public static final boolean LJFF() {
        return ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIILLIIL();
    }

    public static final boolean LJIILL() {
        return ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LIZJ();
    }

    public static final boolean LJIJJLI() {
        return ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LIZ();
    }

    public static final String LJIIIZ() {
        return LIZJ;
    }

    public static final String LJIIJ() {
        return LIZLLL;
    }

    public static final Aweme LJII(String str) {
        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
        Aweme awemeEr = iAwemeService.Er(str);
        Aweme awemeLLILZ = iAwemeService.LLILZ(str);
        if (awemeEr == null) {
            return awemeLLILZ;
        }
        return awemeEr;
    }

    public static Integer LJIIL(String str) {
        Object c098200Yq;
        if (str.length() == 9 && str.charAt(0) == '#') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(str.substring(7));
            sbLIZ.append(str.substring(1, 7));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    public static final boolean LJIILLIIL(Uri uri) {
        if (uri != null) {
            if (TextUtils.equals("http", uri.getScheme()) || TextUtils.equals("https", uri.getScheme())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!Intrinsics.LJFF(lowerCase, "sslocal") && !Intrinsics.LJFF(lowerCase, "localsdk")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(String str) {
        Uri uri;
        String scheme;
        String lowerCase;
        if (TextUtils.isEmpty(str) || (uri = UriProtector.parse(str)) == null || (scheme = uri.getScheme()) == null || (lowerCase = scheme.toLowerCase(Locale.ROOT)) == null) {
            return false;
        }
        if (!LJIJ(lowerCase) && !TextUtils.equals(lowerCase, "aweme")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            C844470XAv.LIZ.getClass();
            return C2162308dZ.LJ(C844470XAv.LIZ(), intent);
        }
        return true;
    }

    @InterfaceC1294060jmO
    public static final boolean LJIJJ(Context context) {
        if (context == null) {
            return false;
        }
        return ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJJIIZ(context, null);
    }

    public static boolean LJIL(AdStickerData adStickerData) {
        if (adStickerData == null) {
            return false;
        }
        if (adStickerData.enableShowInterval) {
            float f = adStickerData.startShowTime;
            if (f < 0.0f || adStickerData.stopShowTime <= f) {
                return false;
            }
        } else if (adStickerData.showSeconds <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = UriProtector.parse(str)) == null || (scheme = uri.getScheme()) == null || LJIJ(scheme)) {
            return false;
        }
        return !LJIILLIIL(uri);
    }

    public static final boolean LJJI(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = UriProtector.parse(str)) == null || (scheme = uri.getScheme()) == null || LJIJ(scheme)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        C844470XAv.LIZ.getClass();
        return C2162308dZ.LJ(C844470XAv.LIZ(), intent);
    }

    public static boolean LJJIFFI(String str) {
        if (!TextUtils.equals(str, "name") && !TextUtils.equals(str, "title") && !TextUtils.equals(str, "photo") && !TextUtils.equals(str, "button") && !TextUtils.equals(str, "slide") && !TextUtils.equals(str, "auto_show_feedplay") && !TextUtils.equals(str, "auto_show_feedfinish")) {
            return false;
        }
        return true;
    }

    public static boolean LJJII(String str) {
        if (!TextUtils.equals(str, "name") && !TextUtils.equals(str, "title") && !TextUtils.equals(str, "photo") && !TextUtils.equals(str, "slide")) {
            return false;
        }
        return true;
    }

    public static boolean LJJIII(String str) {
        if (!TextUtils.equals(str, "name") && !TextUtils.equals(str, "title") && !TextUtils.equals(str, "photo") && !TextUtils.equals(str, "button") && !TextUtils.equals(str, "slide") && !TextUtils.equals(str, "auto_show_feedplay") && !TextUtils.equals(str, "auto_show_feedfinish")) {
            return false;
        }
        return true;
    }

    public static void LJJIIZ(Aweme aweme) {
        boolean z;
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "post_receive", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZIZ(Boolean.valueOf(AwemeExtKt.isAdFiled(aweme)), "is_ad_field");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            z = true;
        } else {
            z = false;
        }
        c1022820ciuLIZLLL.LIZIZ(Boolean.valueOf(z), "has_raw_ad_data");
        if (awemeRawAd != null) {
            c1022820ciuLIZLLL.LIZIZ(awemeRawAd.getType(), "pack_content_type");
            c1022820ciuLIZLLL.LIZIZ(awemeRawAd.getPackageName(), "package_name");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(awemeRawAd.isHideIfExists() ? 1 : 0), "hide_if_exist");
        }
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    public static boolean LIZJ(AwemeRawAd awemeRawAd, InterfaceC1022050chf interfaceC1022050chf) {
        if (awemeRawAd == null) {
            return false;
        }
        String packageName = awemeRawAd.getPackageName();
        if (!awemeRawAd.isHideIfExists() || packageName == null || packageName.length() == 0 || !C1022060chg.LIZ(null, packageName)) {
            return false;
        }
        interfaceC1022050chf.invoke(awemeRawAd, "feed_download_ad");
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("feed_download_ad", "hide_app", awemeRawAd);
        String packageName2 = awemeRawAd.getPackageName();
        c1022820ciuLIZLLL.LIZIZ(packageName2, "package_name");
        if (packageName2 != null && packageName2.length() != 0) {
            C1022060chg.LIZ(c1022820ciuLIZLLL, packageName2);
        }
        c1022820ciuLIZLLL.LJIIIIZZ();
        return true;
    }

    public static final Intent LIZLLL(Context context, String str) {
        if (context == null || str == null || a0.LJJJIL(str)) {
            return null;
        }
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(UriProtector.parse(str));
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", String.valueOf(packageName));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
        return intent;
    }

    public static final void LJ(List<Aweme> list, InterfaceC1022050chf<Object> interfaceC1022050chf) {
        int size;
        boolean z;
        if (list == null || list.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            Aweme aweme = (Aweme) ListProtector.get(list, size);
            if (AwemeExtKt.isAdTraffic(aweme)) {
                C1022030chd c1022030chd = LIZ;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                c1022030chd.getClass();
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("feed_download_ad", "pre_hide_check", awemeRawAd);
                C1022060chg.LIZIZ(c1022820ciuLIZLLL, awemeRawAd);
                c1022820ciuLIZLLL.LJIIIIZZ();
                if (((Number) C258140A9s.LIZ.getValue()).intValue() != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Number) C258130A9r.LIZ.getValue()).intValue() == 1) {
                    if (LIZJ(aweme.getAwemeRawAd(), interfaceC1022050chf) && z) {
                        ListProtector.remove(list, size);
                    }
                } else if (LIZJ(aweme.getAwemeRawAd(), interfaceC1022050chf)) {
                    if (z) {
                        ListProtector.remove(list, size);
                    }
                } else {
                    return;
                }
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJI(android.content.Context r3, com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r2 = 0
            if (r4 == 0) goto L46
            boolean r1 = X.C1017070cZd.LJLLI(r4)
            r0 = 1
            if (r1 != r0) goto L46
        La:
            r1 = 0
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 == 0) goto L2b
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct r0 = r0.getPhotoCarouselInfo()
            if (r0 == 0) goto L2b
            java.util.List r0 = r0.getProductList()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct r0 = (com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct) r0
            if (r0 == 0) goto L2b
            java.lang.String r1 = r0.getColor()
        L2b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L48
            r0 = 2131100571(0x7f06039b, float:1.7813527E38)
            int r0 = X.C475630Ikz.LIZIZ(r0, r3)
            return r0
        L39:
            if (r4 == 0) goto L2b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 == 0) goto L2b
            java.lang.String r1 = r0.getLearnMoreBgColor()
            goto L2b
        L46:
            r0 = 0
            goto La
        L48:
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022030chd.LJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    public static final int LJIIJJI(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        String buttonBgColor;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adLive = awemeRawAd.getAdLive()) != null && (buttonBgColor = adLive.getButtonBgColor()) != null) {
            return ColorProtector.parseColor(buttonBgColor);
        }
        return C475630Ikz.LIZIZ(R.attr.a04, context);
    }

    public static final boolean LJIILIIL(Context context, Uri uri) throws Throwable {
        if (context != null && uri != null && LJIILLIIL(uri)) {
            LIZ.getClass();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            List listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMvGDskXmVBcwydQTy+xP2YTJ3fz+z", null));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
            Iterator it2 = listLJJJJZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
            }
            LIZ.getClass();
            PackageManager packageManager2 = context.getPackageManager();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(UriProtector.parse("http://"));
            List listLJJJJZ2 = C2204961BRm.LJJJJZ(packageManager2, intent2, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMvGDskXmVBcwydQTy+xP2YTJ3fz+z", null));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJZ2, 10));
            Iterator it3 = listLJJJJZ2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((ResolveInfo) it3.next()).activityInfo.packageName);
            }
            return !C13LP.LJLLLLLL(arrayList, arrayList2).isEmpty();
        }
        return false;
    }

    public static boolean LJIILJJIL(Context context, Intent intent) {
        C098200Yq c098200Yq;
        Activity activityLIZ;
        if (context == null || intent == null) {
            return false;
        }
        try {
            if (C1388190mED.LIZ(context) == null) {
                activityLIZ = ActivityStack.getTopActivity();
            } else {
                activityLIZ = C1388190mED.LIZ(context);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (activityLIZ != null) {
            if (intent.resolveActivity(activityLIZ.getPackageManager()) == null) {
                return false;
            }
            return true;
        }
        c098200Yq = null;
        C189200o6.m2constructorimpl(null);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    public static final boolean LJIIZILJ(Aweme aweme, InterfaceC1022050chf<Object> interfaceC1022050chf) {
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        C1022030chd c1022030chd = LIZ;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        c1022030chd.getClass();
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("feed_download_ad", "pre_hide_check", awemeRawAd);
        C1022060chg.LIZIZ(c1022820ciuLIZLLL, awemeRawAd);
        c1022820ciuLIZLLL.LJIIIIZZ();
        return LIZJ(aweme.getAwemeRawAd(), interfaceC1022050chf);
    }

    public static final void LJJIIJZLJL(List<? extends Aweme> list, InterfaceC1022050chf<? super Aweme> interfaceC1022050chf) {
        if (list == null) {
            return;
        }
        for (Aweme aweme : list) {
            if (AwemeExtKt.isAdTraffic(aweme)) {
                interfaceC1022050chf.invoke(aweme);
                C2184171Adz.LIZLLL("draw_ad", "receive", aweme.getAwemeRawAd()).LJIIIIZZ();
                LIZ.getClass();
                LJJIIZ(aweme);
            }
        }
    }

    public static final void LJJIIJ(int i, List<? extends Aweme> list, InterfaceC1022050chf<? super Aweme> interfaceC1022050chf) {
        String str;
        if (list == null) {
            return;
        }
        for (Aweme aweme : list) {
            if (AwemeExtKt.isAdTraffic(aweme)) {
                interfaceC1022050chf.invoke(aweme);
                C2184171Adz.LIZLLL("draw_ad", "receive", aweme.getAwemeRawAd()).LJIIIIZZ();
                LIZ.getClass();
                LJJIIZ(aweme);
                new C1015330cWp(aweme).LJJIIZ();
            } else {
                LIZ.getClass();
                HashMap map = new HashMap();
                map.put("aweme_id", aweme.getAid());
                map.put("aweme_type", String.valueOf(aweme.getAwemeType()));
                int distributeType = aweme.getDistributeType();
                if (distributeType != 1) {
                    if (distributeType != 2) {
                        if (distributeType != 3) {
                            str = "";
                        } else {
                            str = "long_with_short";
                        }
                    } else {
                        str = "long_direct";
                    }
                } else {
                    str = "short";
                }
                map.put("impr_type", str);
                map.put("feed_page_type", String.valueOf(i));
                C20684815ws.LJIILLIIL("video_receive", map);
            }
        }
    }

    public static final void LIZ(AwemeRawAd awemeRawAd, String str, Map<String, Object> map, boolean z) {
        String xiaomiSupplementalInfo;
        String xiaomiSupplementalInfo2;
        if (str == null || awemeRawAd == null) {
            return;
        }
        int i = 1;
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) == 1) {
            LIZ.getClass();
            if (TextUtils.equals(str, "button") || ((TextUtils.equals(str, "photo") && C1017180cZo.LIZLLL(awemeRawAd)) || TextUtils.equals(str, "card") || (TextUtils.equals(str, "title") && (xiaomiSupplementalInfo2 = awemeRawAd.getXiaomiSupplementalInfo()) != null && xiaomiSupplementalInfo2.length() != 0))) {
                if (C1017180cZo.LJIILLIIL(awemeRawAd)) {
                    map.put("download_type", 1);
                } else {
                    map.put("download_type", 2);
                }
            }
            if (TextUtils.equals(str, "name") || ((TextUtils.equals(str, "title") && ((xiaomiSupplementalInfo = awemeRawAd.getXiaomiSupplementalInfo()) == null || xiaomiSupplementalInfo.length() == 0)) || TextUtils.equals(str, "slide"))) {
                map.put("download_type", 2);
                return;
            }
            return;
        }
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) == 2) {
            LIZ.getClass();
            if (!LJJIFFI(str) && !z) {
                return;
            }
            if (!C1017180cZo.LJIILLIIL(awemeRawAd)) {
                i = 2;
            }
            map.put("download_type", Integer.valueOf(i));
            return;
        }
        if (C1017180cZo.LJJ(awemeRawAd)) {
            LIZ.getClass();
            if (!LJJII(str) && !z) {
                return;
            }
            map.put("download_type", 2);
            return;
        }
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) != 3) {
            return;
        }
        LIZ.getClass();
        if (!LJJIII(str) && !z) {
            return;
        }
        map.put("download_type", 2);
    }

    public static final void LIZIZ(AwemeRawAd awemeRawAd, String str, Map<String, Object> map, boolean z) {
        ISamsungPageService iSamsungPageService;
        Integer numLJFF;
        if (str == null || awemeRawAd == null) {
            return;
        }
        int i = 2;
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) == 1) {
            if (TextUtils.equals(str, "slide")) {
                map.put("minicard_type", 1);
            }
            LIZ.getClass();
            if (TextUtils.equals(str, "name") || TextUtils.equals(str, "title") || TextUtils.equals(str, "photo") || TextUtils.equals(str, "card") || TextUtils.equals(str, "button")) {
                map.put("minicard_type", 2);
                return;
            }
            return;
        }
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) == 2) {
            LIZ.getClass();
            if (!LJJIFFI(str) && !z) {
                return;
            }
            if (TextUtils.equals(str, "slide") && C1017180cZo.LJIILIIL(awemeRawAd)) {
                i = 1;
            }
            map.put("minicard_type", Integer.valueOf(i));
            return;
        }
        if (C1017180cZo.LJJ(awemeRawAd)) {
            LIZ.getClass();
            if (!LJJII(str) && !z) {
                return;
            }
            map.put("minicard_type", 2);
            return;
        }
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) != 3) {
            return;
        }
        LIZ.getClass();
        if ((!LJJIII(str) && !z) || (iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null)) == null || (numLJFF = iSamsungPageService.LJFF(awemeRawAd)) == null) {
            return;
        }
        map.put("minicard_type", Integer.valueOf(numLJFF.intValue()));
    }
}
