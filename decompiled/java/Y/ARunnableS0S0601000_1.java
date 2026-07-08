package Y;

import X.C1C7U;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS0S0601000_1 implements Runnable {
    public final int $t;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (!((Boolean) ((Function0) this.l1).invoke()).booleanValue()) {
            ((Function0) this.l2).invoke();
            return;
        }
        View viewFindViewByPosition = ((LinearLayoutManager) this.l3).findViewByPosition(this.i6);
        if (viewFindViewByPosition == null) {
            ((LinearLayoutManager) this.l3).scrollToPositionWithOffset(this.i6, 0);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.l4;
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS0S0601000_1(viewOnAttachStateChangeListenerC20604515jv, (Function0) this.l1, (Function0) this.l2, (LinearLayoutManager) this.l3, this.i6, viewOnAttachStateChangeListenerC20604515jv, (Function0) this.l5, 1));
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) this.l4;
            Function0 function0 = (Function0) this.l5;
            viewOnAttachStateChangeListenerC20604515jv2.scrollBy(0, ((viewFindViewByPosition.getTop() + viewFindViewByPosition.getBottom()) / 2) - (viewOnAttachStateChangeListenerC20604515jv2.getHeight() / 2));
            function0.invoke();
        }
    }

    public static final void run$0(ARunnableS0S0601000_1 aRunnableS0S0601000_1) {
        boolean zLIZ;
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.scrollToCenter$$inlined$doOnPreDraw$1");
        try {
            aRunnableS0S0601000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.scrollToCenter$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS0S0601000_1 aRunnableS0S0601000_1) {
        boolean zLIZ;
        View viewFindViewByPosition;
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.scrollToCenter$lambda$7$$inlined$doOnPreDraw$1");
        try {
            if (!((Boolean) ((Function0) aRunnableS0S0601000_1.l1).invoke()).booleanValue() || (viewFindViewByPosition = ((LinearLayoutManager) aRunnableS0S0601000_1.l3).findViewByPosition(aRunnableS0S0601000_1.i6)) == null) {
                ((Function0) aRunnableS0S0601000_1.l2).invoke();
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) aRunnableS0S0601000_1.l4;
                Function0 function0 = (Function0) aRunnableS0S0601000_1.l5;
                viewOnAttachStateChangeListenerC20604515jv.scrollBy(0, ((viewFindViewByPosition.getTop() + viewFindViewByPosition.getBottom()) / 2) - (viewOnAttachStateChangeListenerC20604515jv.getHeight() / 2));
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.scrollToCenter$lambda$7$$inlined$doOnPreDraw$1");
    }

    public ARunnableS0S0601000_1(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Function0 function0, Function0 function02, LinearLayoutManager linearLayoutManager, int i, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2, Function0 function03, int i2) {
        this.$t = i2;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = function0;
        this.l2 = function02;
        this.l3 = linearLayoutManager;
        this.i6 = i;
        this.l4 = viewOnAttachStateChangeListenerC20604515jv2;
        this.l5 = function03;
    }
}
