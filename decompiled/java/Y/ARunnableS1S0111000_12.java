package Y;

import X.C0CN8;
import X.C1259360isQ;
import X.C1603970rqF;
import X.C1C7U;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS1S0111000_12 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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

    public static final void run$0(ARunnableS1S0111000_12 aRunnableS1S0111000_12) {
        C1603970rqF c1603970rqF = (C1603970rqF) aRunnableS1S0111000_12.l0;
        int i = aRunnableS1S0111000_12.i2;
        boolean z = aRunnableS1S0111000_12.z1;
        c1603970rqF.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelected$1L");
        C0CN8.LIZ(new ARunnableS1S0111000_12(i, z, c1603970rqF, 2));
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelected$1L");
    }

    public static final void run$1(ARunnableS1S0111000_12 aRunnableS1S0111000_12) {
        C1603970rqF c1603970rqF = (C1603970rqF) aRunnableS1S0111000_12.l0;
        int i = aRunnableS1S0111000_12.i2;
        boolean z = aRunnableS1S0111000_12.z1;
        c1603970rqF.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelected$2L");
        c1603970rqF.LIZJ(i, z);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelected$2L");
    }

    public static final void run$2(ARunnableS1S0111000_12 aRunnableS1S0111000_12) {
        C1603970rqF c1603970rqF = (C1603970rqF) aRunnableS1S0111000_12.l0;
        int i = aRunnableS1S0111000_12.i2;
        boolean z = aRunnableS1S0111000_12.z1;
        c1603970rqF.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelected$1L$1L");
        c1603970rqF.LIZJ(i, z);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelected$1L$1L");
    }

    public static final void run$3(ARunnableS1S0111000_12 aRunnableS1S0111000_12) {
        boolean zLIZ;
        LiveHighLightPageFragment liveHighLightPageFragment;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.subscribeData$10$4");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = ((LiveHighLightPageFragment) aRunnableS1S0111000_12.l0).LLJJI;
            if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
                viewOnAttachStateChangeListenerC20631115oD2.setCurrentItem(aRunnableS1S0111000_12.i2, false);
            }
            if (aRunnableS1S0111000_12.z1 && (viewOnAttachStateChangeListenerC20631115oD = (liveHighLightPageFragment = (LiveHighLightPageFragment) aRunnableS1S0111000_12.l0).LLJJI) != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS112S0100000_12(liveHighLightPageFragment, 353));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.subscribeData$10$4");
    }

    public static final void run$4(ARunnableS1S0111000_12 aRunnableS1S0111000_12) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeAdapter@6f5.onBindBasicViewHolder$2");
        try {
            C1259360isQ.LLLLLJIL((Aweme) aRunnableS1S0111000_12.l0, aRunnableS1S0111000_12.i2, aRunnableS1S0111000_12.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeAdapter@6f5.onBindBasicViewHolder$2");
    }

    public ARunnableS1S0111000_12(int i, boolean z, Object obj, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
