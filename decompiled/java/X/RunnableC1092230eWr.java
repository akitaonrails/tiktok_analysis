package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1092230eWr implements Runnable {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C1092220eWq LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ Function1<C1092430eXB, Unit> LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC1092230eWr(float f, C1092220eWq c1092220eWq, boolean z, float f2, Function1<? super C1092430eXB, Unit> function1) {
        this.LL = f;
        this.LLILLJJLI = c1092220eWq;
        this.LLILLL = z;
        this.LLILZ = f2;
        this.LLILZIL = function1;
    }

    public final void LIZ() {
        View view;
        float scaledWidth = this.LL;
        Object parent = this.LLILLJJLI.getParent();
        if (!(parent instanceof FrameLayout) || (view = (View) parent) == null) {
            return;
        }
        int width = view.getWidth();
        if (this.LLILLL) {
            C1092220eWq c1092220eWq = this.LLILLJJLI;
            if (c1092220eWq.LLJJIII) {
                scaledWidth = (width - c1092220eWq.getScaledWidth()) - this.LL;
            }
        }
        Pair<Float, Float> pairLIZ = this.LLILLJJLI.LIZ(scaledWidth, this.LLILZ);
        float fFloatValue = pairLIZ.getFirst().floatValue();
        float fFloatValue2 = pairLIZ.getSecond().floatValue();
        C1092220eWq c1092220eWq2 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq2);
        c1092220eWq2.setTranslationX(fFloatValue);
        C1092220eWq c1092220eWq3 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq3);
        c1092220eWq3.setTranslationY(fFloatValue2);
        this.LLILLJJLI.LJ(null);
        Function1<C1092430eXB, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI.getPositionAndDimensions());
        }
        C500260Jjc.LLFFF(this.LLILLJJLI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveBoardDraggableLayout@61a4.setInitialPosition$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBoardDraggableLayout@61a4.setInitialPosition$1");
    }
}
