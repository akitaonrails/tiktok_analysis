package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.experiment.PushSurveyExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400240mXe {
    public static int LIZJ() {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        return (iDeepLinkService == null || !iDeepLinkService.LJJJJJL()) ? 0 : 1;
    }

    public static long LJ(int i) {
        if (i == 1) {
            return C202094145s.LJII;
        }
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null) {
            return iDeepLinkService.LJJJLIIL();
        }
        return 0L;
    }

    public static boolean LJFF(Activity activity) {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null) {
            return iDeepLinkService.LJJIIJZLJL(activity);
        }
        if (!C1400380mXs.LIZ().LIZ && !activity.isTaskRoot()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(Uri uri) {
        if (!C01CD.LIZJ(uri, "jump_to_search_detail", "1")) {
            return false;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if (!c1er1.LJJJJJ()) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_keyword");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            return false;
        }
        if (ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
            c1er1.LLLLZLLIL(uri);
            return false;
        }
        C0XQ7.LJ();
        if (!C0XQ7.LIZ.LJIIJ().isLogin()) {
            C2222691Bz1.LIZ.getClass();
            if (C1697810uHb.LJIILJJIL("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "CH", "GB", "US").contains(C2222691Bz1.LIZ())) {
                c1er1.LJJZZIII(uri);
                return false;
            }
        }
        return true;
    }

    public static void LIZ(Activity activity, Intent intent) {
        String stringExtra;
        String stringExtra2;
        Integer numValueOf = Integer.valueOf(activity.getIntent().getIntExtra("is_from_push", 0));
        if (numValueOf.intValue() == 1) {
            String stringExtra3 = null;
            if (1 != 0) {
                numValueOf.intValue();
                try {
                    stringExtra = activity.getIntent().getStringExtra("push_type");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                intent.putExtra("push_type", stringExtra);
                intent.putExtra("is_from_push", 1);
                try {
                    stringExtra2 = activity.getIntent().getStringExtra("push_id");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra2 = null;
                }
                intent.putExtra("push_id", stringExtra2);
                try {
                    stringExtra3 = activity.getIntent().getStringExtra("push_user_id");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                intent.putExtra("push_user_id", stringExtra3);
            }
        }
    }

    public static void LIZIZ(Intent intent, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkSurvey(gdLabel: ");
        sbLIZ.append(str);
        sbLIZ.append(", isSurvey: ");
        C01GW c01gw = PushSurveyExperiment.LIZLLL;
        sbLIZ.append(((List) c01gw.getValue()).contains(str));
        sbLIZ.append(", EXP: ");
        sbLIZ.append(PushSurveyExperiment.LIZ());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (PushSurveyExperiment.LIZ() > 0 && ((List) c01gw.getValue()).contains(str)) {
            intent.putExtra("show_survey_style", PushSurveyExperiment.LIZ());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkSurvey() - set EXTRA_SHOW_SURVEY ");
            sbLIZ2.append(PushSurveyExperiment.LIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static String LJIIIZ(String str, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_uid");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            C0W75.LIZ().LJI(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        C0W75 c0w75LIZ = C0W75.LIZ();
        String string = uri.toString();
        if (string == null) {
            string = "";
        }
        c0w75LIZ.getClass();
        C0W75.LIZLLL(string, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static void LJI(Uri uri, Intent intent, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        try {
            int i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            intent.putExtra("tab", i);
            if (i != 1) {
                if (i == 5) {
                    C19264010Yc.LIZIZ.LIZIZ(uri, "follow", z);
                    return;
                }
                return;
            }
            C19264010Yc.LIZIZ.LIZIZ(uri, "discovery", z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LJII(Uri uri, String str, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_comment_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (!z) {
            C1400160mXW.LIZ.getClass();
            if (!C1400160mXW.LIZJ(uri, str) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                if (C01CD.LIZJ(uri, "insert_feed", "1")) {
                    return true;
                }
                if (C01CD.LIZJ(uri, "video_detail", "1") || LJIIIIZZ(uri)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static Intent LIZLLL(Activity activity, Intent intent, Uri uri, String str, String str2, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_comment_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (!z) {
            C1400160mXW.LIZ.getClass();
            if (!C1400160mXW.LIZJ(uri, str2) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                if (C01CD.LIZJ(uri, "insert_feed", "1")) {
                    return LJIIJ(activity, intent, uri, str, str2, z);
                }
                if (C01CD.LIZJ(uri, "video_detail", "1") || LJIIIIZZ(uri)) {
                    return intent;
                }
                return LJIIJ(activity, intent, uri, str, str2, z);
            }
        }
        return intent;
    }

    public static Intent LJIIJ(Activity activity, Intent intent, Uri uri, String str, String str2, boolean z) {
        String stringExtra;
        Intent intent2;
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        if (!iExternalService.configService().shortVideoConfig().isRecording() && !iExternalService.publishService().inPublishPage(activity) && !iExternalService.publishService().isPublishing()) {
            intent = C1076350e7F.LIZ(activity);
            boolean z2 = true;
            intent.putExtra("extra_from_deeplink", true);
            if (C01CD.LIZJ(uri, "utm_campaign", "client_share") && !z) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ug_af_success");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                    if (((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJL()) {
                        intent.putExtra("forbid_insert_feed", "1");
                    }
                    if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                        intent.putExtra("ug_af_success", "1");
                    }
                } else if (((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLJLI()) {
                    intent.putExtra("forbid_insert_feed", "1");
                }
            }
            intent.putExtra("ug_dp_id", str);
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            intent.putExtra("tab", 1);
            intent.putExtra("need_post", true);
            try {
                stringExtra = intent.getStringExtra("forbid_insert_feed");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (!Intrinsics.LJFF(stringExtra, "1")) {
                intent.putExtra(FollowStatusChangeMethod.PARAM_UID, str2);
                intent.putExtra("gids", str2);
                if (C07HK.LIZ()) {
                    IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
                    if (iDeepLinkService == null || !iDeepLinkService.LJLIIIL(activity)) {
                        z2 = false;
                    }
                    if (z2 && (intent2 = activity.getIntent()) != null) {
                        intent2.putExtra(FollowStatusChangeMethod.PARAM_UID, str2);
                        intent2.putExtra("gids", str2);
                        C1234250iDv.LIZ(uri, intent2, z);
                        return intent;
                    }
                }
            } else {
                IDeepLinkService iDeepLinkService2 = (IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class);
                if (str2 == null) {
                    str2 = "";
                }
                C1400160mXW.LIZ.getClass();
                iDeepLinkService2.LJJLI(C1400160mXW.LIZ(z, uri), str2, str);
            }
        }
        return intent;
    }
}
