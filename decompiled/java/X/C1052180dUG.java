package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052180dUG {
    public static final boolean LIZ(String str) {
        Uri uri;
        if (str == null || (uri = UriProtector.parse(str)) == null || !Intrinsics.LJFF(uri.getHost(), "flex_panel") || UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "target_schema") == null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(String str) {
        Uri uri;
        if (str != null && (uri = UriProtector.parse(str)) != null) {
            return Intrinsics.LJFF(uri.getHost(), "flex_panel");
        }
        return false;
    }
}
