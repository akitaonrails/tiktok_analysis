package X;

import Y.ARunnableS129S0100000_29;
import Y.AsS55S0100000_29;
import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.12YN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YN implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$1(C12YN c12yn, View view) {
    }

    public static final void onViewAttachedToWindow$4(C12YN c12yn, View view) {
    }

    public static final void onViewAttachedToWindow$5(C12YN c12yn, View view) {
    }

    public static final void onViewDetachedFromWindow$2(C12YN c12yn, View view) {
    }

    public static final void onViewDetachedFromWindow$3(C12YN c12yn, View view) {
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
        }
    }

    public static final void onViewAttachedToWindow$0(C12YN c12yn, View view) {
        HashMap<String, Object> map = new HashMap<>(1);
        map.put("refer", "tips");
        C2212051Bhr.LIZJ().LJIIIIZZ(((C19674911yN) c12yn.l1).LIZIZ, 0L, "othershow", map, null);
        if (((Animator) c12yn.l0) != null) {
            C19674911yN c19674911yN = (C19674911yN) c12yn.l1;
            HandlerHook.viewPostDelay(c19674911yN.LIZJ, new ARunnableS129S0100000_29(c12yn, 5), c19674911yN.LIZIZ.LLLLIIL);
        }
    }

    public static final void onViewAttachedToWindow$2(C12YN c12yn, View view) {
        ((View) c12yn.l0).removeOnAttachStateChangeListener(c12yn);
        C12NV c12nv = (C12NV) c12yn.l1;
        c12nv.LLJIJIL.invoke(view, c12nv);
    }

    public static final void onViewAttachedToWindow$3(C12YN c12yn, View view) {
        ((View) c12yn.l0).removeOnAttachStateChangeListener(c12yn);
        C12NU c12nu = (C12NU) c12yn.l1;
        c12nu.LLJIJIL.invoke(view, c12nu);
    }

    public static final void onViewDetachedFromWindow$0(C12YN c12yn, View view) {
        Animator animator = (Animator) c12yn.l0;
        if (animator != null) {
            animator.removeAllListeners();
            ((Animator) c12yn.l0).cancel();
        }
    }

    public static final void onViewDetachedFromWindow$1(C12YN c12yn, View view) {
        C19713812Bc c19713812Bc = (C19713812Bc) c12yn.l0;
        C19713712Bb c19713712Bb = (C19713712Bb) c12yn.l1;
        ((LinkedList) c19713812Bc.LIZ).remove(c19713712Bb);
        if (c19713812Bc.LIZIZ == c19713712Bb) {
            c19713812Bc.LIZIZ = null;
        }
        view.removeOnAttachStateChangeListener(c12yn);
    }

    public static final void onViewDetachedFromWindow$4(C12YN c12yn, View view) {
        C786410Ut5.C3(((View) c12yn.l0).getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) c12yn.l1);
    }

    public static final void onViewDetachedFromWindow$5(C12YN c12yn, View view) {
        if (!(view instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) view).removeOnScrollListener((AsS55S0100000_29) c12yn.l0);
        ((RecyclerView) c12yn.l1).removeOnAttachStateChangeListener(c12yn);
    }

    public C12YN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
