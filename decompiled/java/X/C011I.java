package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.011I, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011I {
    public static final Uri LIZ(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str2, "enter_from")) {
                builderBuildUpon.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            } else {
                builderBuildUpon.appendQueryParameter("enter_from", str);
            }
        }
        return builderBuildUpon.build();
    }
}
