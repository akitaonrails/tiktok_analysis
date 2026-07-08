package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.06MJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06MJ extends FrameLayout {
    public C06MJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public C06MJ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
