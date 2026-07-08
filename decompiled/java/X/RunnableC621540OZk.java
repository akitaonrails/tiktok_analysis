package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC621540OZk implements Runnable {
    public final ViewGroup LL;
    public final Function0<Boolean> LLILLJJLI;
    public MotionEvent LLILLL;
    public MotionEvent LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        MotionEvent motionEvent;
        C1C7U.LIZ("HybridRoundingCornerFreeHeightLayout$TouchRunnable@3f22.run");
        try {
            MotionEvent motionEvent2 = this.LLILLL;
            if (motionEvent2 != null && (motionEvent = this.LLILZ) != null && !this.LLILLJJLI.invoke().booleanValue()) {
                View childAt = this.LL.getChildAt(0);
                if (childAt != null) {
                    childAt.dispatchTouchEvent(motionEvent2);
                }
                View childAt2 = this.LL.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.dispatchTouchEvent(motionEvent);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HybridRoundingCornerFreeHeightLayout$TouchRunnable@3f22.run");
    }

    public RunnableC621540OZk(ViewGroup viewGroup, AwS553S0100000_9 awS553S0100000_9) {
        this.LL = viewGroup;
        this.LLILLJJLI = awS553S0100000_9;
    }
}
