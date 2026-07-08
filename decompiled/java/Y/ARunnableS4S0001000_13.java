package Y;

import X.C0VCC;
import X.C1C7U;
import X.C795800VJq;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS4S0001000_13 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f284i0;

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

    public static final void run$0(ARunnableS4S0001000_13 aRunnableS4S0001000_13) {
        boolean zLIZ;
        C1C7U.LIZ("CreativeToolsJatoHelper@e7e0.onEnterNewPage$3");
        try {
            JatoXL.resetPriority(aRunnableS4S0001000_13.f284i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativeToolsJatoHelper@e7e0.onEnterNewPage$3");
    }

    public static final void run$1(ARunnableS4S0001000_13 aRunnableS4S0001000_13) {
        C0VCC sDKMonitorUtils;
        int i = aRunnableS4S0001000_13.f284i0;
        C1C7U.LIZ("DeximageMonitor@45c3.monitorProfileCommit$1L");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commit_result", i);
            JSONObject jSONObject2 = new JSONObject();
            synchronized (C795800VJq.class) {
                sDKMonitorUtils = SDKMonitorUtils.getInstance("12468");
            }
            if (sDKMonitorUtils != null) {
                sDKMonitorUtils.LJIIJ("profile_commit", jSONObject, jSONObject2, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("DeximageMonitor@45c3.monitorProfileCommit$1L");
    }

    public ARunnableS4S0001000_13(int i, int i2) {
        this.$t = i2;
        if (i2 != 0) {
            this.f284i0 = i;
        } else {
            this.f284i0 = i;
        }
    }
}
