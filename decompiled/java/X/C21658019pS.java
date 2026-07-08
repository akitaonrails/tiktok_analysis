package X;

import Y.ARunnableS133S0100000_33;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19pS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21658019pS {
    public final View LIZ;
    public final View LIZIZ;
    public final Function0<Unit> LIZJ;
    public boolean LJ;
    public final boolean LIZLLL = false;
    public final ViewTreeObserverOnScrollChangedListenerC21658119pT LJFF = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.19pT
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            this.LL.LIZ();
        }
    };

    public final void LIZ() {
        if (this.LJ || this.LIZIZ == null || this.LIZ == null) {
            return;
        }
        HandlerHook.viewPost(this.LIZ, new ARunnableS133S0100000_33(this, 104));
    }

    public final void LIZIZ() {
        View view = this.LIZ;
        if (view == null || this.LIZIZ == null || this.LJ) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnScrollChangedListenerC21658119pT viewTreeObserverOnScrollChangedListenerC21658119pT = this.LJFF;
            viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21658119pT);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21658119pT, ViewTreeObserver.OnScrollChangedListener.class);
        }
        ViewTreeObserver viewTreeObserver2 = this.LIZ.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            ViewTreeObserverOnScrollChangedListenerC21658119pT viewTreeObserverOnScrollChangedListenerC21658119pT2 = this.LJFF;
            viewTreeObserver2.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21658119pT2);
            C2187701Ajg.LIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC21658119pT2, ViewTreeObserver.OnScrollChangedListener.class);
        }
    }

    public final void LIZJ() {
        ViewTreeObserver viewTreeObserver;
        View view = this.LIZ;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC21658119pT viewTreeObserverOnScrollChangedListenerC21658119pT = this.LJFF;
        viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21658119pT);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21658119pT, ViewTreeObserver.OnScrollChangedListener.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19pT] */
    public C21658019pS(View view, View view2, Function0 function0) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = function0;
    }
}
