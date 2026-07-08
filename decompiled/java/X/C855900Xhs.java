package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Xhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855900Xhs {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(Activity activity) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131822167);
        creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
        creativeToastBuilder.iconColorRes(R.attr.a0i);
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZ(activity, 3012, creativeToastBuilder);
    }

    public static final void LIZ(Activity activity, Boolean bool) {
        boolean zBooleanValue;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        creativeToastBuilder.isCenterToast(zBooleanValue);
        creativeToastBuilder.messageRes(2131837710);
        creativeToastBuilder.duration(2000L);
        C1390380mHk.LIZ(activity, 3012, creativeToastBuilder);
    }
}
