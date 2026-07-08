package X;

import Y.ARunnableS126S0100000_26;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.pipo.ocr.view.OcrResultFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import oo5.b;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0wJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewTreeObserverOnPreDrawListenerC1775920wJa implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1775920wJa viewTreeObserverOnPreDrawListenerC1775920wJa) {
        final C1700260uLY c1700260uLY = (C1700260uLY) viewTreeObserverOnPreDrawListenerC1775920wJa.l0;
        if (c1700260uLY.LIZJ) {
            C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0uLW
                public int LL;

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    int i = this.LL + 1;
                    this.LL = i;
                    if (i >= 3) {
                        C1700260uLY c1700260uLY2 = c1700260uLY;
                        synchronized (c1700260uLY2) {
                            try {
                                Iterator it2 = ((ArrayList) c1700260uLY2.LIZ).iterator();
                                while (it2.hasNext()) {
                                    AbstractC1700220uLU abstractC1700220uLU = (AbstractC1700220uLU) it2.next();
                                    if (abstractC1700220uLU.LIZ > 0) {
                                        C786410Ut5.LJLIIL(abstractC1700220uLU.LIZ, (Handler) c1700260uLY2.LIZIZ.getValue(), new ARunnableS126S0100000_26(abstractC1700220uLU, 3));
                                    } else {
                                        abstractC1700220uLU.LIZ();
                                    }
                                    it2.remove();
                                }
                                c1700260uLY2.LIZLLL = true;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return;
                    }
                    C786410Ut5.v2().postFrameCallback(this);
                }
            });
            C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1775920wJa.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1775920wJa);
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1775920wJa viewTreeObserverOnPreDrawListenerC1775920wJa) throws JSONException {
        b bVar = b.LJIJJLI;
        long j = ((OcrResultFragment) viewTreeObserverOnPreDrawListenerC1775920wJa.l1).LLILZIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVar.getClass();
        b.LJIIIZ(j, jCurrentTimeMillis, "info_confirm_ocr");
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1775920wJa.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1775920wJa);
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC1775920wJa viewTreeObserverOnPreDrawListenerC1775920wJa) {
        final C1700280uLa c1700280uLa = (C1700280uLa) viewTreeObserverOnPreDrawListenerC1775920wJa.l0;
        if (c1700280uLa.LIZLLL) {
            C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0uLZ
                public int LL;

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    int i = this.LL + 1;
                    this.LL = i;
                    if (i >= 2) {
                        C1700280uLa c1700280uLa2 = c1700280uLa;
                        synchronized (c1700280uLa2) {
                            try {
                                c1700280uLa2.LIZJ = true;
                                Iterator it2 = ((ArrayList) c1700280uLa2.LIZ).iterator();
                                while (it2.hasNext()) {
                                    AbstractC1700300uLc abstractC1700300uLc = (AbstractC1700300uLc) it2.next();
                                    if (abstractC1700300uLc.LIZ > 0) {
                                        C786410Ut5.LJLIIL(abstractC1700300uLc.LIZ, (Handler) c1700280uLa2.LIZIZ.getValue(), new ARunnableS126S0100000_26(abstractC1700300uLc, 92));
                                    } else {
                                        abstractC1700300uLc.LIZ();
                                    }
                                    it2.remove();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return;
                    }
                    C786410Ut5.v2().postFrameCallback(this);
                }
            });
            C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1775920wJa.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1775920wJa);
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1775920wJa(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
