package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.19Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21508119Ff {
    public static void LIZ(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//profile/crop");
        smartRouteBuildRoute.withParam("original_url", str);
        smartRouteBuildRoute.withParam("is_oval", z);
        smartRouteBuildRoute.withParam("rect_ratio", f);
        smartRouteBuildRoute.withParam("rect_margin", i);
        smartRouteBuildRoute.withParam("extra_min_width", i3);
        smartRouteBuildRoute.withParam("extra_min_height", i4);
        smartRouteBuildRoute.withParam("extra_source_type", i5);
        smartRouteBuildRoute.withParam("extra_need_update_avatar", z2);
        smartRouteBuildRoute.withParam("extra_upload_avatar", z3);
        smartRouteBuildRoute.withParam("extra_show_post_to_story", z4);
        smartRouteBuildRoute.withParam("extra_use_new_ui", z5);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open(i2);
    }

    public static void LIZIZ(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        SmartRoute smartRouteBuildFragmentRoute = SmartRouter.buildFragmentRoute(fragment, "//profile/crop");
        smartRouteBuildFragmentRoute.withParam("original_url", str);
        smartRouteBuildFragmentRoute.withParam("is_oval", z);
        smartRouteBuildFragmentRoute.withParam("rect_ratio", f);
        smartRouteBuildFragmentRoute.withParam("rect_margin", i);
        smartRouteBuildFragmentRoute.withParam("extra_min_width", i3);
        smartRouteBuildFragmentRoute.withParam("extra_min_height", i4);
        smartRouteBuildFragmentRoute.withParam("extra_source_type", i5);
        smartRouteBuildFragmentRoute.withParam("extra_need_update_avatar", z2);
        smartRouteBuildFragmentRoute.withParam("extra_upload_avatar", z3);
        smartRouteBuildFragmentRoute.withParam("extra_show_post_to_story", z4);
        smartRouteBuildFragmentRoute.withParam("extra_use_new_ui", z5);
        smartRouteBuildFragmentRoute.withParam(bundle);
        smartRouteBuildFragmentRoute.open(i2);
    }
}
