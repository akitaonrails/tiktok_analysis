package Y;

import X.C0WRY;
import X.C0XK9;
import X.C1272090jCx;
import X.C1C7U;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import android.app.Activity;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.pumbaa.utility.utils.CostTimeLog;
import com.bytedance.pumbaa.utility.utils.CostTimeline;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS2S1101000_13 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
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

    public final void LIZ$0() {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            ((C0XK9) this.l1).LIZJ(this.i2, activityLJFF, this.s0);
            return;
        }
        C786410Ut5.LJLIIL(1000L, new BPEAHandler(), new ARunnableS2S1101000_13(this.i2, this.s0, (C0XK9) this.l1, 1));
    }

    public static final void run$0(ARunnableS2S1101000_13 aRunnableS2S1101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.stopCatchTask$1");
        try {
            ((C1272090jCx) aRunnableS2S1101000_13.l1).LLJJJJ(aRunnableS2S1101000_13.i2, aRunnableS2S1101000_13.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.stopCatchTask$1");
    }

    public static final void run$1(ARunnableS2S1101000_13 aRunnableS2S1101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AntiCrawlerNode@c051.doAntiCrawler$1$1");
        try {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                ((C0XK9) aRunnableS2S1101000_13.l1).LIZJ(aRunnableS2S1101000_13.i2, activityLJFF, aRunnableS2S1101000_13.s0);
            } else {
                ((C0XK9) aRunnableS2S1101000_13.l1).LIZJ.set(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AntiCrawlerNode@c051.doAntiCrawler$1$1");
    }

    public static final void run$2(ARunnableS2S1101000_13 aRunnableS2S1101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AntiCrawlerNode@c051.doAntiCrawler$1");
        try {
            aRunnableS2S1101000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AntiCrawlerNode@c051.doAntiCrawler$1");
    }

    public static final void run$3(ARunnableS2S1101000_13 aRunnableS2S1101000_13) {
        CostTimeline costTimeline = (CostTimeline) aRunnableS2S1101000_13.l1;
        String str = aRunnableS2S1101000_13.s0;
        int i = aRunnableS2S1101000_13.i2;
        C1C7U.LIZ("CostTimeUtil@62c9.reportCostTime$1L");
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null && C0WRY.LIZ(networkConfigNetworkConfigOrNull.costTimeSampleRate)) {
            for (CostTimeLog costTimeLog : costTimeline.getCostTimeLogs()) {
                NetworkComponent networkComponent = NetworkComponent.INSTANCE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i);
                sbLIZ.append('_');
                sbLIZ.append(costTimeLog.label);
                networkComponent.reportPerf(C2188811AlT.LIZIZ(sbLIZ), costTimeLog.cost);
            }
        }
        C1C7U.LIZIZ("CostTimeUtil@62c9.reportCostTime$1L");
    }

    public ARunnableS2S1101000_13(int i, String str, Object obj, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
