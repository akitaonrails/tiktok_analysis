package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.List;

/* JADX INFO: renamed from: X.03D0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03D0 extends LinearLayout {
    public final void setData(List<? extends View> list) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (View view : list) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            layoutParams.gravity = 17;
            addView(view, layoutParams);
        }
    }

    public C03D0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
    }
}
