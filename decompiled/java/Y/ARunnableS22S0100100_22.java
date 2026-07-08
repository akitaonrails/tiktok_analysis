package Y;

import X.C1452090ntH;
import X.C1452730nuJ;
import X.C1C7U;
import X.InterfaceC1447490nlr;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS22S0100100_22 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    public static final void run$3(ARunnableS22S0100100_22 aRunnableS22S0100100_22) {
        NLETemplateSource.LIZIZ((NLETemplateSource) aRunnableS22S0100100_22.l0, aRunnableS22S0100100_22.j1);
    }

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
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS22S0100100_22 aRunnableS22S0100100_22) {
        boolean zLIZ;
        C1C7U.LIZ("FTCChooseCoverFragment@b1ed.startCyclePlay$1");
        try {
            ((FTCChooseCoverFragment) aRunnableS22S0100100_22.l0).LLJJIJI = false;
            C1452730nuJ c1452730nuJLIZLLL = C1452730nuJ.LIZLLL(aRunnableS22S0100100_22.j1);
            InterfaceC1447490nlr interfaceC1447490nlr = ((FTCChooseCoverFragment) aRunnableS22S0100100_22.l0).LLJILJIL;
            if (interfaceC1447490nlr == null) {
                interfaceC1447490nlr = null;
            }
            interfaceC1447490nlr.LLIIII().setValue(c1452730nuJLIZLLL);
            ((FTCChooseCoverFragment) aRunnableS22S0100100_22.l0).SR(aRunnableS22S0100100_22.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCChooseCoverFragment@b1ed.startCyclePlay$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS22S0100100_22 r33) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS22S0100100_22.run$1(Y.ARunnableS22S0100100_22):void");
    }

    public static final void run$2(ARunnableS22S0100100_22 aRunnableS22S0100100_22) {
        boolean zLIZ;
        C1C7U.LIZ("BaseTTEditPreviewComponent@89f0.onFirstFrameOnAvailable$1");
        try {
            ((C1452090ntH) aRunnableS22S0100100_22.l0).Id(aRunnableS22S0100100_22.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.onFirstFrameOnAvailable$1");
    }

    public static final void run$4(ARunnableS22S0100100_22 aRunnableS22S0100100_22) {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aRunnableS22S0100100_22.l0;
        long j = aRunnableS22S0100100_22.j1;
        vEChooseVideoCoverFragment.getClass();
        C1C7U.LIZ("VEChooseVideoCoverFragment@ea5.startCyclePlay$1L");
        vEChooseVideoCoverFragment.LLJZ = false;
        vEChooseVideoCoverFragment.LLJLL.LLIIII().setValue(C1452730nuJ.LIZLLL(j));
        vEChooseVideoCoverFragment.bS();
        C1C7U.LIZIZ("VEChooseVideoCoverFragment@ea5.startCyclePlay$1L");
    }

    public ARunnableS22S0100100_22(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }

    public ARunnableS22S0100100_22(VideoPublishContainerScene videoPublishContainerScene, long j, Pair pair, long j2, int i) {
        this.$t = i;
        this.l0 = videoPublishContainerScene;
        this.j1 = j2;
    }
}
