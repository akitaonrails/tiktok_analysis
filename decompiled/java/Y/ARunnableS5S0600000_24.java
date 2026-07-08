package Y;

import X.C1514430pVp;
import X.C15MU;
import X.C1C7U;
import X.C2344009Gk;
import X.C259800zU;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1584370rKd;
import android.os.Handler;
import android.view.Choreographer;
import com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import java.util.Objects;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS5S0600000_24 implements Runnable {
    public final int $t;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        C2344009Gk c2344009Gk = (C2344009Gk) this.l0;
        String str = (String) ((C259800zU) this.l1).element;
        String str2 = (String) ((C259800zU) this.l2).element;
        PublishTabAbility publishTabAbility = (PublishTabAbility) this.l3;
        C15MU.LIZ(c2344009Gk, str, str2, (String) ((C259800zU) this.l4).element, publishTabAbility != null && publishTabAbility.D80());
        PublishTabAbility publishTabAbility2 = (PublishTabAbility) this.l3;
        if (publishTabAbility2 != null && publishTabAbility2.D80()) {
            ((BottomPublishObserver) this.l5).LIZIZ((String) ((C259800zU) this.l2).element);
        }
        C1514430pVp.LJFF(EnumC1584370rKd.MUSICAL);
    }

    public static final void run$0(ARunnableS5S0600000_24 aRunnableS5S0600000_24) {
        boolean[] zArr = (boolean[]) aRunnableS5S0600000_24.l0;
        Runnable[] runnableArr = (Runnable[]) aRunnableS5S0600000_24.l1;
        Runnable[] runnableArr2 = (Runnable[]) aRunnableS5S0600000_24.l2;
        Choreographer.FrameCallback[] frameCallbackArr = (Choreographer.FrameCallback[]) aRunnableS5S0600000_24.l3;
        Choreographer choreographer = (Choreographer) aRunnableS5S0600000_24.l4;
        Runnable runnable = (Runnable) aRunnableS5S0600000_24.l5;
        C1C7U.LIZ("ColdBootStartJankOptimize@acf0.postEnableViewPagerPreloadAfterDoFrame$1L");
        if (zArr[0]) {
            C1C7U.LIZIZ("ColdBootStartJankOptimize@acf0.postEnableViewPagerPreloadAfterDoFrame$1L");
            return;
        }
        zArr[0] = true;
        Runnable runnable2 = runnableArr[0];
        if (runnable2 != null) {
            ColdBootStartJankOptimize.LIZIZ.removeCallbacks(runnable2);
        }
        Runnable runnable3 = runnableArr2[0];
        if (runnable3 != null) {
            ColdBootStartJankOptimize.LIZIZ.removeCallbacks(runnable3);
        }
        Choreographer.FrameCallback frameCallback = frameCallbackArr[0];
        if (frameCallback != null) {
            choreographer.removeFrameCallback(frameCallback);
        }
        Handler handlerLIZJ = C799570VYd.LIZJ();
        Objects.requireNonNull(runnable);
        C786410Ut5.LJJZZIII(handlerLIZJ, new ARunnableS109S0100000_9(runnable, 39));
        C1C7U.LIZIZ("ColdBootStartJankOptimize@acf0.postEnableViewPagerPreloadAfterDoFrame$1L");
    }

    public static final void run$1(ARunnableS5S0600000_24 aRunnableS5S0600000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BottomPublishObserver@8f34.startShoot$4");
        try {
            aRunnableS5S0600000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomPublishObserver@8f34.startShoot$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS5S0600000_24(Object obj, C2344009Gk c2344009Gk, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, PublishTabAbility publishTabAbility, C259800zU<String> c259800zU3, BottomPublishObserver bottomPublishObserver) {
        this.$t = bottomPublishObserver;
        this.l0 = obj;
        this.l1 = c2344009Gk;
        this.l2 = c259800zU;
        this.l3 = c259800zU2;
        this.l4 = publishTabAbility;
        this.l5 = c259800zU3;
    }
}
