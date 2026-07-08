package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.011E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011E {
    public static final /* synthetic */ int LIZ = 0;

    public static Uri LIZ(Uri uri, String str, String str2) {
        if (uri == null || TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str))) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str3, str)) {
                for (String str4 : UriProtector.getQueryParameters(uri, str3)) {
                    if (C123100dR.LIZ(str4)) {
                        builderBuildUpon.appendQueryParameter(str3, str4);
                    }
                }
            } else if (C123100dR.LIZ(str2)) {
                builderBuildUpon.appendQueryParameter(str3, str2);
            }
        }
        return builderBuildUpon.build();
    }
}
