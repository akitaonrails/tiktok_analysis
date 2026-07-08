package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0oGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class ViewTreeObserverOnPreDrawListenerC1466700oGq implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

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

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1466700oGq viewTreeObserverOnPreDrawListenerC1466700oGq) {
        C1413350msn c1413350msn = (C1413350msn) viewTreeObserverOnPreDrawListenerC1466700oGq.l0;
        if (c1413350msn.LJII) {
            return true;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = C1413350msn.LJIIJJI.get(c1413350msn.LIZIZ);
        if ((copyOnWriteArraySet != null && copyOnWriteArraySet.contains(((C1413350msn) viewTreeObserverOnPreDrawListenerC1466700oGq.l0).LIZJ)) || ((C1413350msn) viewTreeObserverOnPreDrawListenerC1466700oGq.l0).LJIIIIZZ != null) {
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1413350msn c1413350msn2 = (C1413350msn) viewTreeObserverOnPreDrawListenerC1466700oGq.l0;
        if (jElapsedRealtime - c1413350msn2.LJFF < 300) {
            c1413350msn2.LJIIIIZZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1411500mpo((C1413350msn) viewTreeObserverOnPreDrawListenerC1466700oGq.l0, jElapsedRealtime, null), 3);
            return true;
        }
        c1413350msn2.LJIIIIZZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1411510mpp((C1413350msn) viewTreeObserverOnPreDrawListenerC1466700oGq.l0, null), 3);
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1466700oGq viewTreeObserverOnPreDrawListenerC1466700oGq) {
        View view = ((C1450990nrV) viewTreeObserverOnPreDrawListenerC1466700oGq.l0).LLL;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        C786410Ut5.D3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1466700oGq);
        C1450990nrV c1450990nrV = (C1450990nrV) viewTreeObserverOnPreDrawListenerC1466700oGq.l0;
        View view3 = c1450990nrV.LLL;
        if (view3 == null) {
            view3 = null;
        }
        c1450990nrV.LLLFF = view3.getWidth();
        C1450990nrV c1450990nrV2 = (C1450990nrV) viewTreeObserverOnPreDrawListenerC1466700oGq.l0;
        View view4 = c1450990nrV2.LLL;
        if (view4 != null) {
            view2 = view4;
        }
        c1450990nrV2.LLLFFI = view2.getHeight();
        ((C1450990nrV) viewTreeObserverOnPreDrawListenerC1466700oGq.l0).LLLLIILL();
        ((C1450990nrV) viewTreeObserverOnPreDrawListenerC1466700oGq.l0).LLLLILI();
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1466700oGq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
