package Y;

import X.C1C7U;
import com.bytedance.common.jato.boost.MutexOpt;
import com.bytedance.common.jato.boost.PrePageFaultOpt;
import com.bytedance.common.jato.boost.PrePageFaultOpt3;
import com.bytedance.common.jato.boost.PrePageFaultOpt4;
import com.bytedance.common.jato.boost.WaitingForGCBoost;
import com.bytedance.common.jato.gfx.RenderThreadOpt;
import com.bytedance.common.jato.gfx.RenderThreadUnblockOpt;
import com.bytedance.common.jato.lock.LockMaxSpinsOpt;
import com.bytedance.common.jato.threads.ThreadSuspendTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS8S0001000_26 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f288i0;

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
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.resourceCacheOpt$1");
        try {
            RenderThreadOpt.LIZIZ(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.resourceCacheOpt$1");
    }

    public static final void run$1(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.unblockRenderThreadTask$1");
        try {
            RenderThreadUnblockOpt.nativeUnblockRenderThreadTask(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.unblockRenderThreadTask$1");
    }

    public static final void run$10(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.setLockMaxSpinsAsync$1");
        try {
            LockMaxSpinsOpt.nativeSetMaxSpins(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.setLockMaxSpinsAsync$1");
    }

    public static final void run$2(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.setThreadSuspendTimeoutInSeconds$1");
        try {
            ThreadSuspendTimeout.setSuspendTimeoutInSeconds(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.setThreadSuspendTimeoutInSeconds$1");
    }

    public static final void run$3(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.exclusiveLockSpinOpt$1");
        try {
            MutexOpt.LIZ(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.exclusiveLockSpinOpt$1");
    }

    public static final void run$4(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.reclaimCodeItem$1");
        try {
            PrePageFaultOpt.reclaimCodeItem(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.reclaimCodeItem$1");
    }

    public static final void run$5(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.boostWaitForGC$1");
        try {
            WaitingForGCBoost.LIZ(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.boostWaitForGC$1");
    }

    public static final void run$6(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.mlockCodeItem$1");
        try {
            PrePageFaultOpt.mlockCodeItem(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.mlockCodeItem$1");
    }

    public static final void run$7(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.reclaimCodeItemV3$1");
        try {
            PrePageFaultOpt3.reclaimCodeItem(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.reclaimCodeItemV3$1");
    }

    public static final void run$8(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.mlockCodeItemV3$1");
        try {
            PrePageFaultOpt3.mlockCodeItem(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.mlockCodeItemV3$1");
    }

    public static final void run$9(ARunnableS8S0001000_26 aRunnableS8S0001000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.reclaimCodeOdexV4$1");
        try {
            PrePageFaultOpt4.reclaimCodeOdex(aRunnableS8S0001000_26.f288i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.reclaimCodeOdexV4$1");
    }

    public ARunnableS8S0001000_26(int i, int i2) {
        this.$t = i2;
        this.f288i0 = i;
    }
}
