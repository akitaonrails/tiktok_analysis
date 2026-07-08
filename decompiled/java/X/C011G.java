package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.011G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011G {
    public static final Uri LIZ(Uri uri, String str) {
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!Intrinsics.LJFF(str2, str)) {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            }
        }
        return builderClearQuery.build();
    }
}
