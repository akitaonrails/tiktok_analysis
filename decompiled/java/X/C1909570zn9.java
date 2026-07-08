package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightPageRefactorSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909570zn9 {
    public static final C1909570zn9 LIZ = new C1909570zn9();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("status_bar_height", "type", "gravity", "status_bar_color", "radius", "height", "width", "hide_nav_bar", "hide_status", "close_button", "use_page_back", "disable_background", "show_title_bar", "title", "show_title_close", "show_title_share", "show_dim", "mask_alpha", "soft_input_mode", "use_new_container", "disable_back_press", "show_closeall", "use_spark", "__live_platform__");

    public static boolean LIZJ(Uri uri) {
        String authority;
        String authority2;
        if (uri != null && (((authority = uri.getAuthority()) == null || a0.LJJIIZI(authority, "webview", false) || (authority2 = uri.getAuthority()) == null || a0.LJJIIZI(authority2, "lynxview", false)) && TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "__live_platform__"), "webcast"))) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Uri uri) {
        if (TextUtils.equals("webcast_lynxview", uri.getHost())) {
            return false;
        }
        if (!TextUtils.equals("webcast_webview", uri.getHost()) && !TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "__live_platform__"), "webcast")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(Context context, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri == null) {
            return false;
        }
        String string = uri.toString();
        LIZ.getClass();
        if (LIZJ(uri)) {
            if ((Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bdhm_bid"), "tiktok_live_fundamental_replay") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bd_hybrid_monitor_bid"), "tiktok_live_fundamental_replay")) && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bdhm_pid"), "highlight") && LiveReplayHighlightPageRefactorSetting.INSTANCE.enable()) {
                LIZIZ(context, string);
                return true;
            }
            if (context == null) {
                context = ActivityStack.getTopActivity();
            }
            C1545700qKG.LIZ(context, string, null, null, null);
            return true;
        }
        if (LIZLLL(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                return false;
            }
            String strDecode = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            StringBuilder sb = new StringBuilder();
            Uri uri2 = UriProtector.parse(strDecode);
            for (String str : LIZIZ) {
                LIZ.getClass();
                if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('&');
                    sbLIZ.append(str);
                    sbLIZ.append('=');
                    sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('&');
                        sbLIZ2.append(str);
                        sbLIZ2.append('=');
                        sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            String string2 = sb.toString();
            String strEncode = URLEncoder.encode(strDecode);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sslocal://webcast_webview?url=");
            sbLIZ3.append(strEncode);
            sbLIZ3.append(string2);
            LIZIZ(null, C2188811AlT.LIZIZ(sbLIZ3));
            return true;
        }
        return LIZIZ(context, string);
    }

    public static final boolean LIZIZ(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        try {
            if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).n4().LIZIZ()) {
                if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZLLL(context, str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (!C2697012p.LIZ(str)) {
            return false;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJLL(str);
        return true;
    }
}
