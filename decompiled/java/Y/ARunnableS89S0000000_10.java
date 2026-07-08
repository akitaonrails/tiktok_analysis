package Y;

import X.C1490100osa;
import X.C1C7U;
import X.C688400QzO;
import android.animation.AnimatorSet;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS89S0000000_10 implements Runnable {
    public final int $t;

    public static final void run$1(ARunnableS89S0000000_10 aRunnableS89S0000000_10) {
        C1C7U.LIZ("ThreadLocalUtils@fb5d.clearRunQueueActions$1");
        C1C7U.LIZIZ("ThreadLocalUtils@fb5d.clearRunQueueActions$1");
    }

    public static final void run$2(ARunnableS89S0000000_10 aRunnableS89S0000000_10) {
        C1C7U.LIZ("ThreadUtil@f185.clearRunQueueActions$1");
        C1C7U.LIZIZ("ThreadUtil@f185.clearRunQueueActions$1");
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

    public ARunnableS89S0000000_10(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS89S0000000_10 aRunnableS89S0000000_10) {
        C1C7U.LIZ("OptimizerHelper@3f44.switchRequestControllerEnable$1L");
        C1490100osa.LJFF().LJIIJJI("");
        C1C7U.LIZIZ("OptimizerHelper@3f44.switchRequestControllerEnable$1L");
    }

    public static final void run$3(ARunnableS89S0000000_10 aRunnableS89S0000000_10) {
        boolean zLIZ;
        IShopIconService iShopIconServiceLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.recordShopBottomTabShow$lambda$58$lambda$57$$inlined$runOnMainThread$1");
        try {
            IMallServiceManager iMallServiceManagerLIZIZ = MallServiceManager.LIZIZ();
            if (iMallServiceManagerLIZIZ != null && (iShopIconServiceLIZ = iMallServiceManagerLIZIZ.LIZ()) != null) {
                iShopIconServiceLIZ.vj();
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.recordShopBottomTabShow$lambda$58$lambda$57$$inlined$runOnMainThread$1");
    }

    public static final void run$4(ARunnableS89S0000000_10 aRunnableS89S0000000_10) {
        boolean zLIZ;
        AnimatorSet animatorSet;
        C1C7U.LIZ("FeedSearchBottomBarEffectUtils@575b.onHide$$inlined$postOnUIThread$1");
        try {
            AnimatorSet animatorSet2 = C688400QzO.LIZ;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = C688400QzO.LIZ) != null) {
                animatorSet.cancel();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSearchBottomBarEffectUtils@575b.onHide$$inlined$postOnUIThread$1");
    }
}
