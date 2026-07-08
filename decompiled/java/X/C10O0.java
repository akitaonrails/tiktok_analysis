package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10O0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10O0 {
    public static boolean LIZ(Uri uri) {
        String path;
        if (uri == null) {
            return false;
        }
        if (Intrinsics.LJFF(uri.getHost(), "detail")) {
            return true;
        }
        if (Intrinsics.LJFF(uri.getHost(), "aweme") && (path = uri.getPath()) != null && a0.LJJIIZI(path, "/detail/", false)) {
            return true;
        }
        if (!Intrinsics.LJFF(uri.getHost(), "item") || !Intrinsics.LJFF(uri.getPath(), "/imfans")) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (!Intrinsics.LJFF(uri.getHost(), "webview_popup") && !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_webview_popup"), "1")) {
            return false;
        }
        return true;
    }
}
