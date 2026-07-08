package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.10Zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19267810Zo {
    public static ExecutorService LIZ;
    public static String LIZIZ;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(Activity activity, String str) {
        if (activity == null) {
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1965615457:
                if (!str.equals("Nearby")) {
                }
                C497270Jen.LJFF(activity);
                C455790Hu5.LIZ(activity);
                break;
            case -1672998758:
                if (!str.equals("UNLOGIN_PROFILE")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
            case -1382453013:
                if (!str.equals("NOTIFICATION")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
            case -1376148670:
                if (!str.equals("homepage_explore")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
            case -734952021:
                if (!str.equals("FRIENDS_TAB")) {
                }
                C497270Jen.LJFF(activity);
                C455790Hu5.LIZ(activity);
                break;
            case 2223327:
                if (!str.equals("HOME")) {
                }
                C497270Jen.LJFF(activity);
                C455790Hu5.LIZ(activity);
                break;
            case 2368780:
                if (!str.equals("Live")) {
                }
                C497270Jen.LJFF(activity);
                C455790Hu5.LIZ(activity);
                break;
            case 2614219:
                if (!str.equals("USER")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
            case 53655674:
                if (!str.equals("UNLOGIN_NOTIFICATION")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
            case 877821105:
                if (!str.equals("SERIES_DISCOVER")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
            case 1055811561:
                if (!str.equals("DISCOVER")) {
                }
                C497270Jen.LJFF(activity);
                C497270Jen.LIZJ(activity);
                break;
        }
    }

    public static void LIZIZ(final C1402840mbq c1402840mbq, String str) {
        boolean z;
        String str2;
        C2344009Gk c2344009Gk;
        final Activity activityLJFF;
        String string;
        AbstractC20656215sG abstractC20656215sGLJII;
        if (c1402840mbq != null && !c1402840mbq.mIsFromDraft) {
            String str3 = c1402840mbq.mClientKey;
            if (str3 != null && !str3.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            final String str4 = "";
            if (z) {
                c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("channel", "");
                c2344009Gk.LJIIIIZZ("result", "success");
                c2344009Gk.LIZJ(20000, "error_code");
                c2344009Gk.LIZJ(20000, "error_msg");
                c2344009Gk.LJIIIIZZ("launch_method", "system_share");
                c2344009Gk.LJIIIIZZ("launch_from", "system_share");
                c2344009Gk.LJIIIIZZ("sdk_name", "");
                c2344009Gk.LJIIIIZZ("sdk_version", "");
            } else {
                String sdkNameForServer = c1402840mbq.getSdkNameForServer();
                String str5 = "link_share";
                if (!"link_share".equalsIgnoreCase(str)) {
                    str5 = "sdk";
                }
                if (TextUtils.isEmpty(c1402840mbq.mSdkVersion)) {
                    str2 = "";
                } else {
                    str2 = c1402840mbq.mSdkVersion;
                }
                c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("channel", c1402840mbq.mClientKey);
                c2344009Gk.LJIIIIZZ("result", "success");
                c2344009Gk.LIZJ(20000, "error_code");
                c2344009Gk.LIZJ(20000, "error_msg");
                c2344009Gk.LJIIIIZZ("launch_method", str5);
                c2344009Gk.LJIIIIZZ("launch_from", str);
                c2344009Gk.LJIIIIZZ("sdk_name", sdkNameForServer);
                c2344009Gk.LJIIIIZZ("sdk_version", str2);
            }
            C20684815ws.LJIILLIIL("open_share_after_check_result", c2344009Gk.LIZ);
            if (C1B46.LJFF(c1402840mbq) && (activityLJFF = C2214201BlK.LJFF()) != null) {
                if (TextUtils.isEmpty(c1402840mbq.mAppName)) {
                    string = activityLJFF.getString(2131850162);
                } else {
                    string = c1402840mbq.mAppName;
                }
                final String sdkNameForServer2 = c1402840mbq.getSdkNameForServer();
                if (!TextUtils.isEmpty(c1402840mbq.mSdkVersion)) {
                    str4 = c1402840mbq.mSdkVersion;
                }
                DialogC19267910Zp dialogC19267910Zp = new DialogC19267910Zp(activityLJFF, string, "share success", c1402840mbq.mClientKey, new InterfaceC19268010Zq() { // from class: X.10Zz
                    @Override // X.InterfaceC19268010Zq
                    public final void LIZ() throws Throwable {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ShareRespSendServiceImpl", "ShareDialog#clickStayInTikTok");
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("launch_from", c1402840mbq.mClientKey);
                        c2344009Gk2.LJIIIIZZ("channel", c1402840mbq.mClientKey);
                        c2344009Gk2.LJIIIIZZ("product", "share_sdk");
                        String string2 = "";
                        if (c1402840mbq.getShareRequestBundle() != null && c1402840mbq.getShareRequestBundle().getBundle("_bytedance_params_extra") != null) {
                            string2 = c1402840mbq.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", "");
                        }
                        c2344009Gk2.LJIIIIZZ("style_id", string2);
                        c2344009Gk2.LJIIIIZZ("sdk_name", sdkNameForServer2);
                        c2344009Gk2.LJIIIIZZ("sdk_version", str4);
                        C20684815ws.LJIILLIIL("stay_in_tt", c2344009Gk2.LIZ);
                        Intent intent = new Intent();
                        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                        C2204961BRm.LJIIJJI(activityLJFF, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi6apvJ2SHOZLgUJ/w8AJRfz+J9Z9NCcbY6/mZ85o7swumhow==", null));
                    }

                    @Override // X.InterfaceC19268010Zq
                    public final void LIZIZ() {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ShareRespSendServiceImpl", "ShareDialog#clickReturnToCallerApp");
                        ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LJFF(activityLJFF, c1402840mbq);
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("launch_from", c1402840mbq.mClientKey);
                        c2344009Gk2.LJIIIIZZ("channel", c1402840mbq.mClientKey);
                        c2344009Gk2.LJIIIIZZ("product", "share_sdk");
                        String string2 = "";
                        if (c1402840mbq.getShareRequestBundle() != null && c1402840mbq.getShareRequestBundle().getBundle("_bytedance_params_extra") != null) {
                            string2 = c1402840mbq.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", "");
                        }
                        c2344009Gk2.LJIIIIZZ("style_id", string2);
                        c2344009Gk2.LJIIIIZZ("sdk_name", sdkNameForServer2);
                        c2344009Gk2.LJIIIIZZ("sdk_version", str4);
                        C20684815ws.LJIILLIIL("return_to_origin_app", c2344009Gk2.LIZ);
                    }
                });
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_open_share_complete_popup_center", true)) {
                    IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) PluggableExtentionKt.pluggableSpi(IOpenPlatformService.class);
                    if (iOpenPlatformService != null && (abstractC20656215sGLJII = iOpenPlatformService.LJII(activityLJFF, dialogC19267910Zp)) != null) {
                        PopupManager.LJIJI(abstractC20656215sGLJII, true);
                        return;
                    }
                    return;
                }
                C786410Ut5.B4(dialogC19267910Zp);
            }
        }
    }
}
