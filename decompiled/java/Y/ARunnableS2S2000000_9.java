package Y;

import X.C036E;
import X.C1C7U;
import X.C20684815ws;
import X.C2241008qG;
import X.C591500NHw;
import X.C794240VDq;
import X.C844470XAv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS2S2000000_9 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

    public final void LIZ$1() {
        C20684815ws.LJIJ("feed_data_change", C591500NHw.LIZ(new Pair("enter_from", "homepage_hot"), new Pair("rule", "insert"), new Pair("count", 1), new Pair("diff_type", this.s0), new Pair("request_id", this.s1)));
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        boolean zLIZIZ;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("message", this.s0);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        c2241008qG.LIZ.put("network_connected", Boolean.valueOf(zLIZIZ));
        c2241008qG.LIZ.put("mainCreate2ResumeDuration", Long.valueOf(Feed0VVManager.LJ));
        c2241008qG.LIZ.put("sMainActivityCreate2FeedRequestDuration", Long.valueOf(Feed0VVManager.LJFF));
        c2241008qG.LIZ.put("requestId", this.s1);
        C794240VDq.LIZJ("aweme_feed_0vv", c2241008qG.LJ());
    }

    public static final void run$0(ARunnableS2S2000000_9 aRunnableS2S2000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("Feed0VVManager@569f.monitorLog$2");
        try {
            aRunnableS2S2000000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Feed0VVManager@569f.monitorLog$2");
    }

    public static final void run$1(ARunnableS2S2000000_9 aRunnableS2S2000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FeedRequestResponseMonitor@435d.recordInsertItem$1");
        try {
            aRunnableS2S2000000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedRequestResponseMonitor@435d.recordInsertItem$1");
    }

    public ARunnableS2S2000000_9(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
