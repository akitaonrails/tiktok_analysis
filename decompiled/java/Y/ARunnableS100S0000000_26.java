package Y;

import X.C1701210uN5;
import X.C1701250uN9;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786840Utm;
import android.os.SystemClock;
import com.bytedance.common.jato.boost.PrePageFaultOpt;
import com.bytedance.common.jato.boost.PrePageFaultOpt3;
import com.bytedance.common.jato.boost.PrePageFaultOpt4;
import com.bytedance.common.jato.boost.WaitingForGCBoost;
import com.bytedance.common.jato.gfx.BufferBarrier;
import com.bytedance.common.jato.gfx.RenderThreadOpt;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.common.jato.jit.JitCodeCacheGc;
import com.bytedance.common.jato.memory.MadviseFreeOpt;
import com.bytedance.common.jato.memory.WeakRefUnblockOpt;
import com.bytedance.common.jato.shrinker.MemTrim;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS100S0000000_26 implements Runnable {
    public final int $t;

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
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS100S0000000_26(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.weakRefUnblock$1");
        try {
            WeakRefUnblockOpt.init();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.weakRefUnblock$1");
    }

    public static final void run$1(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.pinImagesOpt$1");
        try {
            RenderThreadOpt.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.pinImagesOpt$1");
    }

    public static final void run$10(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.munlockInBackgroundV4$1");
        try {
            PrePageFaultOpt4.munlockInBackground();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.munlockInBackgroundV4$1");
    }

    public static final void run$11(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.munlockCodeOdexV4$1");
        try {
            PrePageFaultOpt4.munlockCodeOdex();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.munlockCodeOdexV4$1");
    }

    public static final void run$12(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.replaceMadviseDontNeedToFree$1");
        try {
            MadviseFreeOpt.replaceDontNeedToFree();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.replaceMadviseDontNeedToFree$1");
    }

    public static final void run$13(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.enableJitCodeCacheGc$1");
        try {
            JitCodeCacheGc.enable();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.enableJitCodeCacheGc$1");
    }

    public static final void run$14(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.disableJitCodeCacheGc$1");
        try {
            JitCodeCacheGc.disable();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.disableJitCodeCacheGc$1");
    }

    public static final void run$15(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        C1C7U.LIZ("OptimizerHelper@3f44.startLightJitBlockOpt$1L");
        if (C2187451AjH.LIZLLL < 2) {
            JitBlock.lightJitBlockStop();
        }
        C2187451AjH.LIZLLL = Math.max(C2187451AjH.LIZLLL - 1, 0);
        C1C7U.LIZIZ("OptimizerHelper@3f44.startLightJitBlockOpt$1L");
    }

    public static final void run$16(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        C1C7U.LIZ("LargeTransaction@30f6.clearPreviousDiskBundle$1L");
        C1701210uN5 c1701210uN5 = C1701250uN9.LJFF;
        for (Map.Entry<String, ?> entry : ((Keva) c1701210uN5.LIZIZ.getValue()).getAll().entrySet()) {
            ((Keva) c1701210uN5.LIZIZ.getValue()).storeInt(entry.getKey(), ((Integer) entry.getValue()).intValue() + 1);
        }
        C1701210uN5 c1701210uN52 = C1701250uN9.LJFF;
        for (Map.Entry<String, ?> entry2 : ((Keva) c1701210uN52.LIZIZ.getValue()).getAll().entrySet()) {
            String key = entry2.getKey();
            if (((Integer) entry2.getValue()).intValue() > 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LargeTransaction clear disk uuid: ");
                sbLIZ.append(key);
                C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                ((Keva) c1701210uN52.LIZ.getValue()).erase(key);
                ((Keva) c1701210uN52.LIZIZ.getValue()).erase(key);
                ((Keva) c1701210uN52.LIZJ.getValue()).erase(key);
            }
        }
        for (Map.Entry<String, ?> entry3 : ((Keva) c1701210uN52.LIZJ.getValue()).getAll().entrySet()) {
            String key2 = entry3.getKey();
            if (TimeUnit.MILLISECONDS.toHours(SystemClock.uptimeMillis() - ((Long) entry3.getValue()).longValue()) > 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LargeTransaction clear disk uuid: ");
                sbLIZ2.append(key2);
                sbLIZ2.append(" by time");
                C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                ((Keva) c1701210uN52.LIZ.getValue()).erase(key2);
                ((Keva) c1701210uN52.LIZIZ.getValue()).erase(key2);
                ((Keva) c1701210uN52.LIZJ.getValue()).erase(key2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LargeTransaction skip clear disk uuid: ");
                sbLIZ3.append(key2);
                sbLIZ3.append(" by time because time is not enough");
                C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        C1C7U.LIZIZ("LargeTransaction@30f6.clearPreviousDiskBundle$1L");
    }

    public static final void run$2(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.unboostWaitForGC$1");
        try {
            WaitingForGCBoost.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.unboostWaitForGC$1");
    }

    public static final void run$3(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.munlockInBackground$1");
        try {
            PrePageFaultOpt.munlockInBackground();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.munlockInBackground$1");
    }

    public static final void run$4(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.trimDexMap$1");
        try {
            MemTrim.trimVdex();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.trimDexMap$1");
    }

    public static final void run$5(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.shrinkWebviewNative$1");
        try {
            Shrinker.getInstance().shrinkWebviewNative();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.shrinkWebviewNative$1");
    }

    public static final void run$6(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.keepBuffers$1");
        try {
            BufferBarrier.LIZ();
            BufferBarrier.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.keepBuffers$1");
    }

    public static final void run$7(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.releaseBuffers$1");
        try {
            BufferBarrier.LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.releaseBuffers$1");
    }

    public static final void run$8(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.munlockInBackgroundV3$1");
        try {
            PrePageFaultOpt3.munlockInBackground();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.munlockInBackgroundV3$1");
    }

    public static final void run$9(ARunnableS100S0000000_26 aRunnableS100S0000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.munlockCodeItemV3$1");
        try {
            PrePageFaultOpt3.munlockCodeItem();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.munlockCodeItemV3$1");
    }
}
