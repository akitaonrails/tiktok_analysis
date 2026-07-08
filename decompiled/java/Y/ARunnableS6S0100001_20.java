package Y;

import X.C1266500j3w;
import X.C1277680jLy;
import X.C1C7U;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS6S0100001_20 implements Runnable {
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS6S0100001_20 aRunnableS6S0100001_20) {
        LynxFoldViewNG lynxFoldViewNG = (LynxFoldViewNG) aRunnableS6S0100001_20.l0;
        float f = aRunnableS6S0100001_20.f1;
        int i = LynxFoldViewNG.LLJJIII;
        C1C7U.LIZ("LynxFoldViewNG@9829.onGestureScrollBy$1L");
        T t = lynxFoldViewNG.mView;
        if (t != 0) {
            t.scrollBy(0, (int) f);
        }
        C1C7U.LIZIZ("LynxFoldViewNG@9829.onGestureScrollBy$1L");
    }

    public static final void run$1(ARunnableS6S0100001_20 aRunnableS6S0100001_20) {
        float f = aRunnableS6S0100001_20.f1;
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS6S0100001_20.l0;
        C1C7U.LIZ("LyraxPlayerImpl@d373.setVolume$1L");
        int i = (int) (400 * f);
        c1277680jLy.LJJ = i;
        ILyraxSubscriber iLyraxSubscriber = c1277680jLy.LIZ;
        if (iLyraxSubscriber != null) {
            iLyraxSubscriber.setAudioPlaybackVolume(i);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl@d373.setVolume$1L");
    }

    public static final void run$2(ARunnableS6S0100001_20 aRunnableS6S0100001_20) {
        LynxUIScrollCoordinator lynxUIScrollCoordinator = (LynxUIScrollCoordinator) aRunnableS6S0100001_20.l0;
        float f = aRunnableS6S0100001_20.f1;
        int i = LynxUIScrollCoordinator.LLJJIII;
        C1C7U.LIZ("LynxUIScrollCoordinator@7ba0.onGestureScrollBy$1L");
        T t = lynxUIScrollCoordinator.mView;
        if (t != 0) {
            t.scrollBy(0, (int) f);
        }
        C1C7U.LIZIZ("LynxUIScrollCoordinator@7ba0.onGestureScrollBy$1L");
    }

    public static final void run$3(ARunnableS6S0100001_20 aRunnableS6S0100001_20) {
        C1266500j3w c1266500j3w = (C1266500j3w) aRunnableS6S0100001_20.l0;
        float f = aRunnableS6S0100001_20.f1;
        c1266500j3w.getClass();
        C1C7U.LIZ("LiveStream@24e7.initBmfVideoFilters$1$onBitrateRatioChange$1L");
        TEBundle tEBundle = new TEBundle();
        tEBundle.setString("from", "videoDenoise");
        tEBundle.setDouble("bitrateRatio", f);
        c1266500j3w.LIZ.LJJLIIJ(tEBundle);
        tEBundle.release();
        C1C7U.LIZIZ("LiveStream@24e7.initBmfVideoFilters$1$onBitrateRatioChange$1L");
    }

    public ARunnableS6S0100001_20(float f, Object obj, int i) {
        this.$t = i;
        this.f1 = f;
        this.l0 = obj;
    }
}
