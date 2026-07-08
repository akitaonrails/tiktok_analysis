package Y;

import X.C01GW;
import X.C1701180uN2;
import X.C1C7U;
import X.C2104908Ml;
import com.bytedance.common.jato.boost.GCThreadOpt;
import com.bytedance.common.jato.boost.PrePageFaultOpt;
import com.bytedance.common.jato.boost.PrePageFaultOpt3;
import com.bytedance.common.jato.boost.PrePageFaultOpt4;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS1S0002000_26 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f281i0;
    public int i1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.shrinkVM$1");
        try {
            Shrinker.getInstance().doShrink(aRunnableS1S0002000_26.f281i0, aRunnableS1S0002000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.shrinkVM$1");
    }

    public static final void run$1(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.prePageFault$1");
        try {
            PrePageFaultOpt.prePageFaultInner(aRunnableS1S0002000_26.f281i0, aRunnableS1S0002000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.prePageFault$1");
    }

    public static final void run$2(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.setGCThreadPriorityWhenBlockGC$1");
        try {
            GCThreadOpt gCThreadOptLIZ = GCThreadOpt.LIZ();
            int i = aRunnableS1S0002000_26.f281i0;
            int i2 = aRunnableS1S0002000_26.i1;
            synchronized (gCThreadOptLIZ) {
                if (C2104908Ml.LIZIZ()) {
                    GCThreadOpt.nSetGCThreadPriorityWhenBlockGC(i, i2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.setGCThreadPriorityWhenBlockGC$1");
    }

    public static final void run$3(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.prePageFaultV3$1");
        try {
            PrePageFaultOpt3.prePageFaultInner(aRunnableS1S0002000_26.f281i0, aRunnableS1S0002000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.prePageFaultV3$1");
    }

    public static final void run$4(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.prePageFaultV4$1");
        try {
            PrePageFaultOpt4.prePageFaultInner(aRunnableS1S0002000_26.f281i0, aRunnableS1S0002000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.prePageFaultV4$1");
    }

    public static final void run$5(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.mlockCodeOdexV4$1");
        try {
            PrePageFaultOpt4.mlockCodeOdex(aRunnableS1S0002000_26.f281i0, aRunnableS1S0002000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.mlockCodeOdexV4$1");
    }

    public static final void run$6(ARunnableS1S0002000_26 aRunnableS1S0002000_26) {
        boolean zLIZ;
        C1C7U.LIZ("TakoVideoCoverViewSizeCache@9dab.writeCoverSizeToDiskOnce$2");
        try {
            C01GW c01gw = C1701180uN2.LIZIZ;
            ((Keva) c01gw.getValue()).storeInt("cover_width_px", aRunnableS1S0002000_26.f281i0);
            ((Keva) c01gw.getValue()).storeInt("cover_height_px", aRunnableS1S0002000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoVideoCoverViewSizeCache@9dab.writeCoverSizeToDiskOnce$2");
    }

    public ARunnableS1S0002000_26(int i, int i2, int i3) {
        this.$t = i3;
        this.f281i0 = i;
        this.i1 = i2;
    }
}
