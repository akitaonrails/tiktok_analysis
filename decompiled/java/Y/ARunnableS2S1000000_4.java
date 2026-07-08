package Y;

import X.C0AWB;
import X.C0CPK;
import X.C1618440sDa;
import X.C1C7U;
import X.InterfaceC20318714ev;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS2S1000000_4 implements Runnable {
    public final int $t;
    public String s0;

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

    public static final void run$0(ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
        boolean zLIZ;
        C0CPK c0cpkLJI;
        C1C7U.LIZ("CombineLiveSettingRequest@a548.doUpdateSettingV2$1$1");
        try {
            InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4();
            if (interfaceC20318714evB4 != null && (c0cpkLJI = interfaceC20318714evB4.LJI()) != null) {
                c0cpkLJI.LIZJ(aRunnableS2S1000000_4.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CombineLiveSettingRequest@a548.doUpdateSettingV2$1$1");
    }

    public static final void run$1(ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FypAvatarStoryPreloader@a6dd.preloadStory$1");
        try {
            if (((Number) C0AWB.LIZ.getValue()).intValue() > 0) {
                Thread.sleep(((Number) r1.getValue()).intValue());
            }
            C1618440sDa.LIZIZ.LJJJJLI(aRunnableS2S1000000_4.s0);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("FypAvatarStoryPreloader@a6dd.preloadStory$1");
    }

    public ARunnableS2S1000000_4(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
