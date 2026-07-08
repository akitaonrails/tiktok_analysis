package X;

import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0GgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421890GgV extends HorizontalScrollView {
    public final void LIZ(View view) {
        if (getWidth() == 0) {
            HandlerHook.viewPostDelay(this, new ARunnableS75S0200000_6(view, this, 18), 100L);
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }

    public C421890GgV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }
}
