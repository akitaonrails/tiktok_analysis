package Y;

import X.C1019610cdj;
import X.C1019640cdm;
import X.C1020690cfT;
import X.C1C7U;
import X.C588660N6y;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.preload.services.PreloadServiceImpl;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS2S1210000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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
        new C1020690cfT((C588660N6y) this.l1, (AwemeRawAd) this.l2).logAd(C1019640cdm.LIZ, (AwemeRawAd) this.l2, new C1019610cdj(this.z3, this.s0));
    }

    public static final void run$0(ARunnableS2S1210000_16 aRunnableS2S1210000_16) {
        boolean zLIZ;
        C1C7U.LIZ("OmsdkFunnelTracker@284.trackEligible$1");
        try {
            aRunnableS2S1210000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OmsdkFunnelTracker@284.trackEligible$1");
    }

    public static final void run$1(ARunnableS2S1210000_16 aRunnableS2S1210000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadServiceImpl@2dec.createPhotoPreloadClient$3");
        try {
            PreloadServiceImpl preloadServiceImpl = (PreloadServiceImpl) aRunnableS2S1210000_16.l1;
            Fragment fragment = (Fragment) aRunnableS2S1210000_16.l2;
            boolean z = aRunnableS2S1210000_16.z3;
            String str = aRunnableS2S1210000_16.s0;
            preloadServiceImpl.getClass();
            PreloadServiceImpl.LIZJ(fragment, str, z);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadServiceImpl@2dec.createPhotoPreloadClient$3");
    }

    public ARunnableS2S1210000_16(Object obj, Object obj2, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
        this.s0 = str;
    }
}
