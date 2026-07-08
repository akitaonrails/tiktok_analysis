package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1054130dXP implements InterfaceC1054160dXS {
    public static Uri LIZ(Uri uri, String str) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("/d").appendQueryParameter(FollowStatusChangeMethod.PARAM_UID, str);
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str2, FollowStatusChangeMethod.PARAM_UID)) {
                builderAppendQueryParameter.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            }
        }
        String fragment = uri.getFragment();
        if (fragment != null) {
            builderAppendQueryParameter.fragment(fragment);
        }
        return builderAppendQueryParameter.build();
    }
}
