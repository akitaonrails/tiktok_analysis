package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewTreeObserverOnPreDrawListenerC738810SyV implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC738810SyV viewTreeObserverOnPreDrawListenerC738810SyV) {
        for (Pair pair : (List) viewTreeObserverOnPreDrawListenerC738810SyV.l0) {
            ((View) pair.getFirst()).scrollTo(0, ((Number) pair.getSecond()).intValue());
        }
        C118300cf c118300cf = (C118300cf) viewTreeObserverOnPreDrawListenerC738810SyV.l1;
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        if (i >= 3) {
            C786410Ut5.D3((ViewTreeObserver) viewTreeObserverOnPreDrawListenerC738810SyV.l2, viewTreeObserverOnPreDrawListenerC738810SyV);
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC738810SyV viewTreeObserverOnPreDrawListenerC738810SyV) {
        ViewTreeObserver viewTreeObserver = ((C0STE) viewTreeObserverOnPreDrawListenerC738810SyV.l0).LLILLJJLI.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC738810SyV);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC738810SyV, ViewTreeObserver.OnPreDrawListener.class);
        }
        ((Function0) viewTreeObserverOnPreDrawListenerC738810SyV.l1).invoke();
        ((Function0) viewTreeObserverOnPreDrawListenerC738810SyV.l2).invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTreeObserverOnPreDrawListenerC738810SyV(Object obj, List<Pair<View, Integer>> list, C118300cf c118300cf, ViewTreeObserver viewTreeObserver) {
        this.$t = viewTreeObserver;
        this.l0 = obj;
        this.l1 = list;
        this.l2 = c118300cf;
    }
}
