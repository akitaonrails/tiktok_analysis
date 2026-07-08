package Y;

import X.C1002290cBn;
import X.C1077050e8N;
import X.C1C7U;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.series.seriesdetail.powercell.SeriesDetailViewItemCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS4S0100001_16 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS4S0100001_16 aRunnableS4S0100001_16) {
        boolean zLIZ;
        C1C7U.LIZ("DraggableFrameLayout@6371.onTouchEvent$1");
        try {
            Function2<? super Float, ? super Float, Unit> function2 = ((C1002290cBn) aRunnableS4S0100001_16.l0).LLIZLLLIL;
            if (function2 != null) {
                function2.invoke(Float.valueOf(aRunnableS4S0100001_16.f1), Float.valueOf(((C1002290cBn) aRunnableS4S0100001_16.l0).getY()));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraggableFrameLayout@6371.onTouchEvent$1");
    }

    public static final void run$1(ARunnableS4S0100001_16 aRunnableS4S0100001_16) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesDetailViewItemCell@6aad.updateProgressBar$1$1");
        try {
            View view = ((SeriesDetailViewItemCell) aRunnableS4S0100001_16.l0).LLILZIL;
            View view2 = null;
            if (view == null) {
                view = null;
            }
            view.setEnabled(false);
            View view3 = ((SeriesDetailViewItemCell) aRunnableS4S0100001_16.l0).LLILZIL;
            if (view3 == null) {
                view3 = null;
            }
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            View view4 = ((SeriesDetailViewItemCell) aRunnableS4S0100001_16.l0).LLILZLL;
            if (view4 == null) {
                view4 = null;
            }
            layoutParams.width = (int) (view4.getMeasuredWidth() * aRunnableS4S0100001_16.f1);
            View view5 = ((SeriesDetailViewItemCell) aRunnableS4S0100001_16.l0).LLILZIL;
            if (view5 != null) {
                view2 = view5;
            }
            C786410Ut5.W5(view2, layoutParams);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesDetailViewItemCell@6aad.updateProgressBar$1$1");
    }

    public static final void run$2(ARunnableS4S0100001_16 aRunnableS4S0100001_16) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoEditorRotationHelper@9e11.reset$1");
        try {
            HorizontalScrollView horizontalScrollView = ((C1077050e8N) aRunnableS4S0100001_16.l0).LJFF;
            HorizontalScrollView horizontalScrollView2 = null;
            if (horizontalScrollView == null) {
                horizontalScrollView = null;
            }
            horizontalScrollView.scrollTo((int) aRunnableS4S0100001_16.f1, 0);
            C1077050e8N c1077050e8N = (C1077050e8N) aRunnableS4S0100001_16.l0;
            HorizontalScrollView horizontalScrollView3 = c1077050e8N.LJFF;
            if (horizontalScrollView3 != null) {
                horizontalScrollView2 = horizontalScrollView3;
            }
            HandlerHook.viewPost(horizontalScrollView2, new ARunnableS116S0100000_16(c1077050e8N, 226));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoEditorRotationHelper@9e11.reset$1");
    }

    public ARunnableS4S0100001_16(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
