package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0JgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498210JgJ {
    public final C495920Jcc LIZ;
    public final User LIZIZ;
    public final UserProfileEvent LIZJ;
    public boolean LIZLLL;

    public static String LIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "noble_intercept");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null || C0IZJ.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) == 0 || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) == null) {
            return str;
        }
        String string = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon().appendQueryParameter("status_bar_height", String.valueOf(C497740JfY.LJJI(C497740JfY.LJIJ()))).build().toString();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (str2.equals("url")) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = string;
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            }
            builderClearQuery.appendQueryParameter(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        }
        return builderClearQuery.build().toString();
    }

    public C498210JgJ(C495920Jcc c495920Jcc, User user) {
        this.LIZ = c495920Jcc;
        this.LIZIZ = user;
        this.LIZJ = c495920Jcc.LJIIIIZZ;
    }
}
