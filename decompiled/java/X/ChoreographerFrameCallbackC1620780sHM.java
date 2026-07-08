package X;

import Y.ARunnableS124S0100000_24;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;

/* JADX INFO: renamed from: X.0sHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ChoreographerFrameCallbackC1620780sHM implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
            case 2:
                doFrame$2(this, j);
                break;
        }
    }

    public ChoreographerFrameCallbackC1620780sHM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(ChoreographerFrameCallbackC1620780sHM choreographerFrameCallbackC1620780sHM, long j) {
        C1616050s9j c1616050s9j = (C1616050s9j) choreographerFrameCallbackC1620780sHM.l0;
        if (c1616050s9j.LIZJ) {
            c1616050s9j.LIZIZ = false;
            return;
        }
        int i = 0;
        while (!((C1616050s9j) choreographerFrameCallbackC1620780sHM.l0).LIZ.isEmpty()) {
            ((C1616050s9j) choreographerFrameCallbackC1620780sHM.l0).getClass();
            if (i >= 5) {
                break;
            }
            Runnable runnableLJIILJJIL = ((C1616050s9j) choreographerFrameCallbackC1620780sHM.l0).LIZ.LJIILJJIL();
            if (runnableLJIILJJIL != null) {
                try {
                    runnableLJIILJJIL.run();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            i++;
        }
        if (!((C1616050s9j) choreographerFrameCallbackC1620780sHM.l0).LIZ.isEmpty()) {
            C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC1620780sHM);
        } else {
            ((C1616050s9j) choreographerFrameCallbackC1620780sHM.l0).LIZIZ = false;
        }
    }

    public static final void doFrame$1(ChoreographerFrameCallbackC1620780sHM choreographerFrameCallbackC1620780sHM, long j) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS124S0100000_24((ViewPagerPanelComponent) choreographerFrameCallbackC1620780sHM.l0, 121));
    }

    public static final void doFrame$2(ChoreographerFrameCallbackC1620780sHM choreographerFrameCallbackC1620780sHM, long j) {
        Choreographer choreographer;
        boolean zLo = ((StoryToolBarIconAssem) choreographerFrameCallbackC1620780sHM.l0).Lo();
        boolean zJo = ((StoryToolBarIconAssem) choreographerFrameCallbackC1620780sHM.l0).Jo();
        if (zLo && zJo) {
            ((StoryToolBarIconAssem) choreographerFrameCallbackC1620780sHM.l0).LLJILJILJ = null;
            return;
        }
        StoryToolBarIconAssem storyToolBarIconAssem = (StoryToolBarIconAssem) choreographerFrameCallbackC1620780sHM.l0;
        ChoreographerFrameCallbackC1620780sHM choreographerFrameCallbackC1620780sHM2 = storyToolBarIconAssem.LLJILJILJ;
        if (choreographerFrameCallbackC1620780sHM2 == null || (choreographer = storyToolBarIconAssem.LLJILJIL) == null) {
            return;
        }
        choreographer.postFrameCallback(choreographerFrameCallbackC1620780sHM2);
    }
}
