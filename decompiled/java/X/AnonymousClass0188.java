package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0188, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0188 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "surl");
        }
        if (LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).length() > 0) {
            return LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            Regex regex = new Regex("view/([^/]+)/index\\.html");
            if (regex.containsMatchIn(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(Regex.find$default(regex, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 0, 2, null).getValue(), new String[]{"/"}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() > 1) {
                    return (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0 && u.LJIIZILJ(str, ".js", false) && a0.LJJIIZI(str, "byte-gurd-source-sg", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str.substring(a0.LJJJ(str, "byte-gurd-source-sg", 0, false, 6)), new String[]{"/"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() > 4) {
                return (String) ListProtector.get(listLJJLIIIJILLIZJL, 4);
            }
            return "";
        }
        return "";
    }
}
