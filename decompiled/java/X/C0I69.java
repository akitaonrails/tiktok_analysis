package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting;

/* JADX INFO: renamed from: X.0I69, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I69 extends LinearLayout {
    public C0I69(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        float f = (IMMessageBubbleLayoutSetting.LIZ().minHeightDp - 7.0f) / 2.0f;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f < 0.0f ? 0.0f : f)));
        setPadding(iLIZIZ, iLIZIZ2, iLIZIZ, iLIZIZ2);
    }
}
