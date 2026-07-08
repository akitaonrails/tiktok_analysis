package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0Jgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498400Jgc {
    public final C495920Jcc LIZ;
    public final User LIZIZ;
    public final Room LIZJ;
    public final User LIZLLL;
    public final UserProfileEvent LJ;

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
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_nobility_page_click");
        c474500IjALIZ.LJJII("card", "type");
        c474500IjALIZ.LIZ();
        return builderClearQuery.build().toString();
    }

    public C498400Jgc(C495920Jcc c495920Jcc, User user) {
        this.LIZ = c495920Jcc;
        this.LIZIZ = user;
        this.LIZJ = c495920Jcc.LJFF;
        this.LIZLLL = c495920Jcc.LJI;
        this.LJ = c495920Jcc.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C498400Jgc.LIZIZ(long, boolean):void");
    }
}
