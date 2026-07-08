package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ViewOnAttachStateChangeListenerC854620Xfo implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC854620Xfo viewOnAttachStateChangeListenerC854620Xfo, View view) {
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC854620Xfo viewOnAttachStateChangeListenerC854620Xfo, View view) {
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

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC854620Xfo viewOnAttachStateChangeListenerC854620Xfo, View view) {
        C16HO c16ho = (C16HO) viewOnAttachStateChangeListenerC854620Xfo.l0;
        ViewTreeObserver viewTreeObserver = ((RecyclerView) c16ho.l0).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(c16ho);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16ho, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((RecyclerView) viewOnAttachStateChangeListenerC854620Xfo.l1).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC854620Xfo);
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC854620Xfo viewOnAttachStateChangeListenerC854620Xfo, View view) {
        ((View) viewOnAttachStateChangeListenerC854620Xfo.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC854620Xfo);
        ((Function0) viewOnAttachStateChangeListenerC854620Xfo.l1).invoke();
    }

    public ViewOnAttachStateChangeListenerC854620Xfo(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
