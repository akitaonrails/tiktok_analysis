package X;

import Y.ARunnableS120S0100000_20;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnAttachStateChangeListenerC1339220kxE implements View.OnAttachStateChangeListener {
    public final int $t;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1339220kxE viewOnAttachStateChangeListenerC1339220kxE, View view) {
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1339220kxE viewOnAttachStateChangeListenerC1339220kxE, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1339220kxE(int i) {
        this.$t = i;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1339220kxE viewOnAttachStateChangeListenerC1339220kxE, View view) {
        Runnable runnableRemove;
        if ((view instanceof SmartImageView) && view != null && (runnableRemove = C1337680kuk.LIZLLL.remove(view)) != null) {
            C1337680kuk.LJ.removeCallbacks(runnableRemove);
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1339220kxE viewOnAttachStateChangeListenerC1339220kxE, View view) {
        if ((view instanceof SmartImageView) && view != null) {
            Runnable runnableRemove = C1337680kuk.LIZLLL.remove(view);
            if (runnableRemove != null) {
                C1337680kuk.LJ.removeCallbacks(runnableRemove);
            }
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(new WeakReference(view), 316);
            C1337680kuk.LIZLLL.put(view, aRunnableS120S0100000_20);
            C786410Ut5.LJLIIL(500L, C1337680kuk.LJ, aRunnableS120S0100000_20);
        }
    }
}
