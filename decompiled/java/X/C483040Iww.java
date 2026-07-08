package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveFullScreenSurveyUiAdjustment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Iww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483040Iww {
    public static int LIZ(boolean z) {
        if (z) {
            if (LiveFullScreenSurveyUiAdjustment.v2()) {
                return R.drawable.fad;
            }
            return R.drawable.fac;
        }
        if (LiveFullScreenSurveyUiAdjustment.v2()) {
            return R.drawable.fae;
        }
        return R.drawable.fab;
    }
}
