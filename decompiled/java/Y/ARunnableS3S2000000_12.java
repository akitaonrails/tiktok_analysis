package Y;

import X.C0IJT;
import X.C0TEB;
import X.C0TU5;
import X.C1C7U;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C474500IjA;
import X.EnumC20654715s1;
import com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS3S2000000_12 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(this.s0);
        Iterator it2 = ((CopyOnWriteArrayList) GameLiveCrossPlatformSdk.LJ).iterator();
        while (it2.hasNext()) {
            ((C0TEB) it2.next()).LIZ(c474500IjALIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event:");
        sbLIZ.append(this.s0);
        sbLIZ.append(" content:");
        sbLIZ.append(this.s1);
        C20441214yg.LJIIIZ("VegaSDK", C2188811AlT.LIZIZ(sbLIZ));
        try {
            c474500IjALIZ.LJJIIJZLJL(new JSONObject(this.s1));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onMetric Exception:");
            sbLIZ2.append(e);
            C20441214yg.LJIIL("VegaSDK", C2188811AlT.LIZIZ(sbLIZ2));
        }
        c474500IjALIZ.LIZ();
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("outreach_type", EnumC20654715s1.PROFILE_BANNER.getTypeName());
        c2344009Gk.LJIIIIZZ("dynamic_reach_timing", this.s0);
        c2344009Gk.LJIIIIZZ("dynamic_reach_resp_json", this.s1);
        C20684815ws.LJIILLIIL("dynamic_reach_parse_fail", c2344009Gk.LIZ);
    }

    public final void LIZ$2() {
        C0TU5 c0tu5 = C0TU5.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c0tu5.getClass();
        C0TU5.LIZ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("schema", this.s0);
        c2344009Gk.LJIIIIZZ("quick_access_name", this.s1);
        C20684815ws.LJIILLIIL("click_quick_access_na", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS3S2000000_12 aRunnableS3S2000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameLiveCrossPlatformSdk@70af.sdkCallback$1$onMetricLog$1");
        try {
            aRunnableS3S2000000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameLiveCrossPlatformSdk@70af.sdkCallback$1$onMetricLog$1");
    }

    public static final void run$1(ARunnableS3S2000000_12 aRunnableS3S2000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileOutreachBannerTracker@e3d7.recordParseFail$1");
        try {
            aRunnableS3S2000000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileOutreachBannerTracker@e3d7.recordParseFail$1");
    }

    public static final void run$2(ARunnableS3S2000000_12 aRunnableS3S2000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackClickSupport$1");
        try {
            aRunnableS3S2000000_12.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackClickSupport$1");
    }

    public ARunnableS3S2000000_12(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
