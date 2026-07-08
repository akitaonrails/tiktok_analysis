package X;

import Y.ARunnableS98S0200000_29;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.10nG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19351210nG implements Drawable.Callback {
    public final TextView LL;
    public final InterfaceC19351010nE LLILLJJLI;
    public Rect LLILLL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerHook.viewPost(this.LL, new ARunnableS98S0200000_29(drawable, this, 64));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (!this.LLILLL.equals(bounds)) {
            RunnableC19351110nF runnableC19351110nF = (RunnableC19351110nF) this.LLILLJJLI;
            HandlerHook.viewRemoveCallbacks(runnableC19351110nF.LL, runnableC19351110nF);
            HandlerHook.viewPost(runnableC19351110nF.LL, runnableC19351110nF);
            this.LLILLL = new Rect(bounds);
            return;
        }
        this.LL.invalidate();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        HandlerHook.viewRemoveCallbacks(this.LL, runnable);
    }

    public C19351210nG(TextView textView, RunnableC19351110nF runnableC19351110nF, Rect rect) {
        this.LL = textView;
        this.LLILLJJLI = runnableC19351110nF;
        this.LLILLL = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        HandlerHook.viewPostDelay(this.LL, runnable, j - SystemClock.uptimeMillis());
    }
}
