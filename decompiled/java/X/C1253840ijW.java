package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.wallet.BalancePageSchemaModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ijW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253840ijW {
    public static BalancePageSchemaModel LIZ;

    public static boolean LIZJ() {
        return ServiceManager.get().getService(ILiveOuterService.class) != null;
    }

    public static String LIZ(String str, boolean z, boolean z2) {
        Object obj;
        String str2;
        InterfaceC1253830ijV interfaceC1253830ijVLJJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJL();
        if (interfaceC1253830ijVLJJL == null) {
            return str;
        }
        HashMap map = new HashMap();
        String str3 = "1";
        if (interfaceC1253830ijVLJJL.LJIILJJIL()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("has_income_before", obj);
        if (!interfaceC1253830ijVLJJL.LJIIL()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("display_balance", str3);
        InterfaceC1253830ijV interfaceC1253830ijVLJJL2 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJL();
        if (z) {
            str2 = "profile_common_function";
        } else if (z2) {
            str2 = "profile_center";
        } else if (interfaceC1253830ijVLJJL2.LJIIIZ()) {
            str2 = "setting_panel";
        } else {
            str2 = "settings_privacy";
        }
        map.put("entrance", str2);
        map.put("total_balance", interfaceC1253830ijVLJJL.LJIIJJI());
        if (str.contains("roma_redirect")) {
            C495520Jby c495520Jby = new C495520Jby(str);
            for (Map.Entry entry : map.entrySet()) {
                c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
            return UriProtector.parse(c495520Jby.LIZLLL()).toString();
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        for (Map.Entry entry2 : map.entrySet()) {
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append((String) entry2.getValue());
        }
        return str.replace(Uri.encode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), Uri.encode(sb.toString()));
    }

    public static void LIZIZ(Activity activity, boolean z, boolean z2) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
        if (iLiveOuterService != null) {
            iLiveOuterService.updateReferrerHostFromKeva(activity);
            iLiveOuterService.p6(activity, z, "page_index", z2);
        }
    }
}
