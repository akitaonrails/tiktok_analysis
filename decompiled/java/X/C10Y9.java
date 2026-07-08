package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.DeeplinkPersonalizationConfig;
import com.ss.android.ugc.aweme.setting.PersonalizationModel;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Y9 {
    public static boolean LIZJ() {
        return ((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot();
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = UriProtector.parse(str);
        if (uri.isOpaque()) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getScheme());
        sbLIZ.append("://");
        sbLIZ.append(uri.getEncodedAuthority());
        sbLIZ.append(uri.getEncodedPath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJFF(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            DeeplinkPersonalizationConfig[] deeplinkPersonalizationConfigArr = null;
            try {
                if (((DeeplinkPersonalizationConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("linker_platform_config", DeeplinkPersonalizationConfig[].class, null)) != null) {
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    if (queryParameterNames != null && queryParameterNames.contains("sharer_biz")) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sharer_biz");
                    } else {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                    }
                    if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        return false;
                    }
                    try {
                        DeeplinkPersonalizationConfig[] deeplinkPersonalizationConfigArr2 = (DeeplinkPersonalizationConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("linker_platform_config", DeeplinkPersonalizationConfig[].class, null);
                        if (deeplinkPersonalizationConfigArr2 != null) {
                            deeplinkPersonalizationConfigArr = deeplinkPersonalizationConfigArr2;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    for (DeeplinkPersonalizationConfig deeplinkPersonalizationConfig : deeplinkPersonalizationConfigArr) {
                        if (PatternProtector.compile(deeplinkPersonalizationConfig.urlRegex).matcher(strLIZIZ).matches()) {
                            for (PersonalizationModel personalizationModel : deeplinkPersonalizationConfig.urlConfig) {
                                if (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, personalizationModel.bizName)) {
                                    if (personalizationModel.needPersonalization) {
                                        C19263710Xz.LIZ.getClass();
                                        C19263710Xz.LJIILIIL = true;
                                    }
                                    return personalizationModel.needPersonalization;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return false;
    }

    public static void LIZ(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+nisb6k2v/7Dg/diPhY=", null));
    }

    public static boolean LIZLLL(String str, String str2) {
        if (str2 != null && u.LJJIIJZLJL(str2, "/t/", false)) {
            return false;
        }
        if (Intrinsics.LJFF(str, "www.tiktok.com") && str2 != null && u.LJJIIJZLJL(str2, "/d/", false)) {
            return false;
        }
        if (C10YT.LIZ()) {
            if (str == null || str.length() == 0) {
                return false;
            }
            return C1E65.LIZIZ.contains(str);
        }
        for (String str3 : C1E66.LIZ()) {
            if (Intrinsics.LJFF(str3, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.String r10, java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L8
            return r5
        L8:
            java.lang.String[] r4 = X.C841530Wzn.LIZIZ
            int r3 = r4.length
            r1 = 0
        Lc:
            r2 = 1
            if (r1 >= r3) goto L1b
            r0 = r4[r1]
            boolean r0 = android.text.TextUtils.equals(r10, r0)
            if (r0 == 0) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto Lc
        L1b:
            java.lang.String r1 = "tiktok.me"
            if (r10 == 0) goto L43
            boolean r0 = kotlin.text.u.LJIIZILJ(r10, r1, r5)
            if (r0 != r2) goto L32
            if (r11 == 0) goto L30
            java.lang.String r0 = "/group/"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r11, r0, r5)
            if (r0 != r2) goto L30
            return r2
        L30:
            if (r10 == 0) goto L43
        L32:
            boolean r0 = kotlin.text.u.LJIIZILJ(r10, r1, r5)
            if (r0 != r2) goto L43
            if (r11 == 0) goto L43
            java.lang.String r0 = "/streak/"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r11, r0, r5)
            if (r0 != r2) goto L43
            return r2
        L43:
            java.lang.Class<com.ss.android.ugc.aweme.share.multiapp.IShareExService> r4 = com.ss.android.ugc.aweme.share.multiapp.IShareExService.class
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.share.multiapp.IShareExService r0 = (com.ss.android.ugc.aweme.share.multiapp.IShareExService) r0
            if (r0 == 0) goto L59
            boolean r0 = r0.LIZIZ(r10, r11)
            if (r0 != r2) goto L59
            return r2
        L59:
            if (r10 == 0) goto L6e
            if (r11 == 0) goto L6e
            java.lang.String r0 = "www.tiktok.com"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r0)
            if (r0 == 0) goto L6f
            java.lang.String r0 = "/d/"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r11, r0, r5)
            if (r0 == 0) goto L6f
        L6d:
            r5 = 1
        L6e:
            return r5
        L6f:
            java.lang.String r0 = ".tiktok.com"
            boolean r0 = kotlin.text.u.LJIIZILJ(r10, r0, r5)
            if (r0 != 0) goto L7f
            java.util.List<java.lang.String> r0 = X.C1E63.LIZ
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L6e
        L7f:
            java.lang.String r0 = "/t/"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r11, r0, r5)
            if (r0 == 0) goto L6e
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10Y9.LJ(java.lang.String, java.lang.String):boolean");
    }

    public static void LJI(Activity activity, Intent intent) {
        Class<? extends Activity> deepLinkHandlerActivityClass;
        String string;
        if (intent != null && intent.getData() != null) {
            if (Intrinsics.LJFF("from_deep_link", "from_app_link")) {
                deepLinkHandlerActivityClass = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppLinkHandlerActivityClass(true);
            } else {
                deepLinkHandlerActivityClass = ((IMainService) ServiceManager.get().getService(IMainService.class)).getDeepLinkHandlerActivityClass(true, "DeepLinkUtils#restartDeepLink");
            }
            if (deepLinkHandlerActivityClass == null) {
                return;
            }
            Intent intent2 = new Intent(activity, deepLinkHandlerActivityClass);
            Uri data = intent.getData();
            if (data != null) {
                string = data.toString();
            } else {
                string = null;
            }
            C0XI4 c0xi4 = new C0XI4(string);
            c0xi4.LJ("random", new Random(1000L).toString());
            intent2.setData(UriProtector.parse(c0xi4.LJFF()));
            intent2.putExtras(intent);
            intent2.putExtra("inner_from", "require_login");
            LIZ(activity, intent2);
        }
    }
}
