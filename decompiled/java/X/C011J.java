package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.011J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011J {
    public static final Uri LIZ(Uri uri, String str, String str2) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str3, str)) {
                builderBuildUpon.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
            } else {
                builderBuildUpon.appendQueryParameter(str, str2);
            }
        }
        return builderBuildUpon.build();
    }
}
