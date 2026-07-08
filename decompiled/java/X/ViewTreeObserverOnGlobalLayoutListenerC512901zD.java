package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01zD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC512901zD implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC512901zD viewTreeObserverOnGlobalLayoutListenerC512901zD) {
        C786410Ut5.C3(((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC512901zD);
        if (((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getWidth() <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC512901zD.l1).getLayoutParams();
        layoutParams.width = ((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getWidth();
        C786410Ut5.a6((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC512901zD.l1, layoutParams);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC512901zD viewTreeObserverOnGlobalLayoutListenerC512901zD) {
        Object c098200Yq;
        if (((View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getWidth() != 0 && ((View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getHeight() != 0) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC512901zD);
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) viewTreeObserverOnGlobalLayoutListenerC512901zD.l1;
            View view = (View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0;
            try {
                Pair pair = new Pair(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
                C189200o6.m2constructorimpl(pair);
                interfaceC1364105Vn.resumeWith(pair);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJFF(thM5exceptionOrNullimpl, "getValidSize");
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC512901zD viewTreeObserverOnGlobalLayoutListenerC512901zD) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getWidth() != 0) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC512901zD);
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) viewTreeObserverOnGlobalLayoutListenerC512901zD.l1;
            Integer numValueOf = Integer.valueOf(((View) viewTreeObserverOnGlobalLayoutListenerC512901zD.l0).getWidth());
            C189200o6.m2constructorimpl(numValueOf);
            interfaceC1364105Vn.resumeWith(numValueOf);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC512901zD(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
