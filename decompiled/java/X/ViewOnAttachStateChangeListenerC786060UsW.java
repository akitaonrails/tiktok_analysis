package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnAttachStateChangeListenerC786060UsW implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$7(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
    }

    public static final void onViewDetachedFromWindow$6(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
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
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
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
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
        ((Function1) viewOnAttachStateChangeListenerC786060UsW.l1).invoke((View) viewOnAttachStateChangeListenerC786060UsW.l0);
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        if (((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.w3(((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver(), (C0T6A) viewOnAttachStateChangeListenerC786060UsW.l1);
        }
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC786060UsW.l0;
        C786410Ut5.w3(view2.getViewTreeObserver(), new C0T6E(view2, (Function0) viewOnAttachStateChangeListenerC786060UsW.l1));
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        if (((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.w3(((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver(), (C0T68) viewOnAttachStateChangeListenerC786060UsW.l1);
        }
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC786060UsW.l0;
        C786410Ut5.w3(view2.getViewTreeObserver(), new C0T6D(view2, (Function0) viewOnAttachStateChangeListenerC786060UsW.l1));
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        if (((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.w3(((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver(), (C0T69) viewOnAttachStateChangeListenerC786060UsW.l1);
        }
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
    }

    public static final void onViewAttachedToWindow$6(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        if (((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.w3(((View) viewOnAttachStateChangeListenerC786060UsW.l0).getViewTreeObserver(), (C0T6B) viewOnAttachStateChangeListenerC786060UsW.l1);
        }
        ((View) viewOnAttachStateChangeListenerC786060UsW.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC786060UsW);
    }

    public static final void onViewDetachedFromWindow$7(ViewOnAttachStateChangeListenerC786060UsW viewOnAttachStateChangeListenerC786060UsW, View view) {
        if (((C785330UrL) viewOnAttachStateChangeListenerC786060UsW.l0).isShowing()) {
            C785350UrN.LIZ((C785330UrL) viewOnAttachStateChangeListenerC786060UsW.l0, (C785330UrL) viewOnAttachStateChangeListenerC786060UsW.l1, 2);
        }
    }

    public ViewOnAttachStateChangeListenerC786060UsW(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
