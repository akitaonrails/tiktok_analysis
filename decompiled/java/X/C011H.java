package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.011H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011H {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC1294060jmO
    public static Uri LIZ(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null && queryParameterNames.contains(str)) {
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str3, str)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
                }
                builderClearQuery.appendQueryParameter(str3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        } else {
            builderClearQuery.appendQueryParameter(str, str2);
        }
        return builderClearQuery.build();
    }
}
