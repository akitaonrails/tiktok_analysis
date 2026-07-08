package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Oxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC636480Oxq implements Runnable {
    public final View LL;
    public final Function0<Boolean> LLILLJJLI;
    public MotionEvent LLILLL;
    public MotionEvent LLILZ;
    public View LLILZIL;

    public final void LIZ() {
        MotionEvent motionEvent;
        View viewLIZIZ;
        ViewGroup viewGroup;
        View viewLIZIZ2;
        MotionEvent motionEvent2 = this.LLILLL;
        if (motionEvent2 == null || (motionEvent = this.LLILZ) == null) {
            return;
        }
        View view = this.LLILZIL;
        if (view != null && (view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            float x = motionEvent.getX() - viewGroup.getLeft();
            float y = motionEvent.getY() - viewGroup.getTop();
            if (x >= 0.0f && y >= 0.0f && x <= viewGroup.getWidth() && y <= viewGroup.getHeight() && (viewLIZIZ2 = LIZIZ(viewGroup, x, y)) != null) {
                viewLIZIZ2.dispatchTouchEvent(motionEvent2);
                viewLIZIZ2.dispatchTouchEvent(motionEvent);
                return;
            }
        }
        if (this.LLILLJJLI.invoke().booleanValue()) {
            return;
        }
        View view2 = this.LL;
        if (!(view2 instanceof ViewGroup) || (viewLIZIZ = LIZIZ((ViewGroup) view2, motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        viewLIZIZ.dispatchTouchEvent(motionEvent2);
        viewLIZIZ.dispatchTouchEvent(motionEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AntiShakeGestureHelper$TouchRunnable@c948.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AntiShakeGestureHelper$TouchRunnable@c948.run");
    }

    public RunnableC636480Oxq(View view, AwS553S0100000_9 awS553S0100000_9) {
        this.LL = view;
        this.LLILLJJLI = awS553S0100000_9;
    }

    public static View LIZIZ(ViewGroup viewGroup, float f, float f2) {
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            Rect rect = new Rect();
            View childAt = viewGroup.getChildAt(childCount);
            childAt.getHitRect(rect);
            if (childAt.getVisibility() == 0 && rect.contains((int) f, (int) f2)) {
                if (childAt instanceof ViewGroup) {
                    View viewLIZIZ = LIZIZ((ViewGroup) childAt, f - r2.getLeft(), f2 - r2.getTop());
                    if (viewLIZIZ != null) {
                        return viewLIZIZ;
                    }
                }
                if (childAt.isClickable()) {
                    return childAt;
                }
            }
        }
        if (!viewGroup.isClickable()) {
            return null;
        }
        return viewGroup;
    }
}
