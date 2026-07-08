package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.15pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20640215pg {
    public static final C20640215pg LIZ = new C20640215pg();
    public static final InterfaceC849010XSh LIZIZ = (InterfaceC849010XSh) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC849010XSh.class);

    public static String LIZIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "user_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return "";
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static String LIZJ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "gd_label");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return "";
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static String LIZLLL(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "inner_push_type");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return "official";
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static String LJ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "room_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return "";
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static String LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(str2);
            sbLIZ.append("=[^&]*)");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append('=');
            sbLIZ2.append("inner_push");
            return PatternProtector.compile(strLIZIZ).matcher(str).replaceAll(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return str;
    }

    public static final void LJFF(String str, String str2, String str3, String str4, boolean z, String str5) {
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("room_id", str);
            c2344009Gk.LJIIIIZZ("inner_push_type", str4);
            c2344009Gk.LJIIIIZZ("enter_method", "inner_push");
            c2344009Gk.LJIIIIZZ("enter_from_merge", "inner_push");
            c2344009Gk.LJIIIIZZ("type", str3);
            c2344009Gk.LJIIIIZZ("anchor_id", str2);
            c2344009Gk.LJIIIIZZ("gd_label", str5);
            C2080208Cy.LIZIZ(c2344009Gk, "");
            C20684815ws.LJIILLIIL("livesdk_inner_push_disappear", c2344009Gk.LIZ);
        }
    }
}
