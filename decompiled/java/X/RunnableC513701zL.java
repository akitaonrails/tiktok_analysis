package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01zL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC513701zL implements Runnable {
    public final int $t;
    public boolean z0;

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
        Object c098200Yq;
        boolean z = this.z0;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJ(Boolean.valueOf(z), "is_my_profile");
            C20684815ws.LJIILLIIL("my_profile_page_refresh_times", c2344009Gk.LIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public RunnableC513701zL(int i) {
        this.$t = i;
        this.z0 = true;
    }

    public static final void run$0(RunnableC513701zL runnableC513701zL) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportGmsStatus$1");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", runnableC513701zL.z0);
            C185100nR.LIZIZ(C185100nR.LIZ, "gms_available", jSONObject, null, 12);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportGmsStatus$1");
    }

    public static final void run$1(RunnableC513701zL runnableC513701zL) {
        boolean zLIZ;
        C1C7U.LIZ("ProfilePlatformStatistics@1051.statisticMyProfilePageRefreshTimes$1");
        try {
            runnableC513701zL.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.statisticMyProfilePageRefreshTimes$1");
    }

    public RunnableC513701zL(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
