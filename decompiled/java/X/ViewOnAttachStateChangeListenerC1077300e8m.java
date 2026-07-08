package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0e8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewOnAttachStateChangeListenerC1077300e8m implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1077300e8m viewOnAttachStateChangeListenerC1077300e8m, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1077300e8m viewOnAttachStateChangeListenerC1077300e8m, View view) {
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
        }
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1077300e8m viewOnAttachStateChangeListenerC1077300e8m, View view) {
        C786410Ut5.x3(((LinearLayout) viewOnAttachStateChangeListenerC1077300e8m.l0).getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC1077300e8m.l1);
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1077300e8m viewOnAttachStateChangeListenerC1077300e8m, View view) {
        C19EG c19egLIZIZ;
        ((C1010790cPV) viewOnAttachStateChangeListenerC1077300e8m.l0).LLILZIL = new C1010780cPU((C1010790cPV) viewOnAttachStateChangeListenerC1077300e8m.l0, (C1010630cPF) viewOnAttachStateChangeListenerC1077300e8m.l1);
        C1010780cPU c1010780cPU = ((C1010790cPV) viewOnAttachStateChangeListenerC1077300e8m.l0).LLILZIL;
        if (c1010780cPU != null) {
            c1010780cPU.LIZJ();
        }
        C1010790cPV c1010790cPV = (C1010790cPV) viewOnAttachStateChangeListenerC1077300e8m.l0;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = c1010790cPV.LL.getView();
        Context contextLIZ = ((C1010790cPV) viewOnAttachStateChangeListenerC1077300e8m.l0).LL.LIZ();
        if (contextLIZ != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(contextLIZ);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        c1010790cPV.LLILZ = SAFHelper.LJIJI(view2, c19egLIZIZ);
        View view3 = ((C1010790cPV) viewOnAttachStateChangeListenerC1077300e8m.l0).LL.getView();
        if (view3 != null) {
            view3.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1077300e8m);
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1077300e8m viewOnAttachStateChangeListenerC1077300e8m, View view) {
        C786410Ut5.C3(((LinearLayout) viewOnAttachStateChangeListenerC1077300e8m.l0).getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC1077300e8m.l1);
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1077300e8m viewOnAttachStateChangeListenerC1077300e8m, View view) {
        C786410Ut5.C3(((View) viewOnAttachStateChangeListenerC1077300e8m.l0).getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC1077300e8m.l1);
    }

    public ViewOnAttachStateChangeListenerC1077300e8m(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
