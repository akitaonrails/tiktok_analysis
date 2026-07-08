package X;

import Y.ARunnableS66S0300000_33;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21657819pQ {
    public final View LIZ;
    public final View LIZIZ;
    public final Function0<Unit> LIZJ;
    public boolean LJ;
    public final boolean LIZLLL = false;
    public final ViewTreeObserverOnScrollChangedListenerC21657919pR LJFF = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.19pR
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            this.LL.LIZ();
        }
    };
    public final ViewOnLayoutChangeListenerC2189561Amg LJI = new ViewOnLayoutChangeListenerC2189561Amg(this, 5);

    public final void LIZ() {
        View view;
        View view2;
        if (this.LJ || (view = this.LIZ) == null || (view2 = this.LIZIZ) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS66S0300000_33(view2, this, view, 16));
    }

    public final void LIZIZ() {
        View view = this.LIZ;
        if (view == null || this.LIZIZ == null || this.LJ) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserverOnScrollChangedListenerC21657919pR viewTreeObserverOnScrollChangedListenerC21657919pR = this.LJFF;
            viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21657919pR);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21657919pR, ViewTreeObserver.OnScrollChangedListener.class);
            ViewTreeObserverOnScrollChangedListenerC21657919pR viewTreeObserverOnScrollChangedListenerC21657919pR2 = this.LJFF;
            viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21657919pR2);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21657919pR2, ViewTreeObserver.OnScrollChangedListener.class);
            this.LIZIZ.removeOnLayoutChangeListener(this.LJI);
            this.LIZIZ.addOnLayoutChangeListener(this.LJI);
        }
    }

    public final void LIZJ() {
        ViewTreeObserver viewTreeObserver;
        View view = this.LIZ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            ViewTreeObserverOnScrollChangedListenerC21657919pR viewTreeObserverOnScrollChangedListenerC21657919pR = this.LJFF;
            viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21657919pR);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21657919pR, ViewTreeObserver.OnScrollChangedListener.class);
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.LJI);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19pR] */
    public C21657819pQ(C21578619ce c21578619ce, View view, Function0 function0) {
        this.LIZ = c21578619ce;
        this.LIZIZ = view;
        this.LIZJ = function0;
    }
}
