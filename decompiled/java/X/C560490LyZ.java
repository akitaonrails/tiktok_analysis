package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;

/* JADX INFO: renamed from: X.0LyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560490LyZ {
    public static final void LIZ(Activity activity, Bundle bundle, EnterStoryParam enterStoryParam, long j, C0L9U c0l9u) {
        boolean z;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//social_media_picker");
        smartRouteBuildRoute.withParam(bundle);
        if (!(enterStoryParam instanceof Parcelable)) {
            enterStoryParam = null;
        }
        smartRouteBuildRoute.withParam("story_param", (Parcelable) enterStoryParam);
        smartRouteBuildRoute.withParam("enter_activity_time", SystemClock.elapsedRealtime());
        smartRouteBuildRoute.withParam("click_entry_time", j);
        if (c0l9u == C0L9U.GRANTED_BEFORE_REQUEST) {
            z = true;
        } else {
            z = false;
        }
        smartRouteBuildRoute.withParam("has_permission_before", z);
        smartRouteBuildRoute.withParam("key_choose_request_code", 1);
        smartRouteBuildRoute.addFlags(603979776);
        smartRouteBuildRoute.open();
    }
}
