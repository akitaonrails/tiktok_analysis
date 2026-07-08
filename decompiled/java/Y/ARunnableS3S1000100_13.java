package Y;

import X.C0V8O;
import X.C0V8S;
import X.C0VZK;
import X.C0WRY;
import X.C0X4T;
import X.C1471660oOq;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C790230UzF;
import X.C792400V6o;
import X.C792910V8n;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS3S1000100_13 implements Runnable {
    public final int $t;
    public long j1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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

    public final void LIZ$0() {
        try {
            String str = this.s0;
            if (str.contains("!")) {
                str = str.split("!")[1];
            }
            String strReplaceAll = str.replaceAll("\\(.*\\)", "").replaceAll(" ", "");
            if (strReplaceAll.length() == 0 && C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("traceId is empty, bytes=");
                sbLIZ.append(this.j1);
                C792910V8n.LIZLLL("JniDelegate", C2188811AlT.LIZIZ(sbLIZ));
            }
            C0V8O c0v8o = C0V8S.LIZ;
            long j = this.j1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sk__");
            sbLIZ2.append(strReplaceAll);
            c0v8o.LJFF(j, strReplaceAll, C2188811AlT.LIZIZ(sbLIZ2), null, null, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void run$0(ARunnableS3S1000100_13 aRunnableS3S1000100_13) {
        String str = aRunnableS3S1000100_13.s0;
        long j = aRunnableS3S1000100_13.j1;
        C1C7U.LIZ("ApiVodNetController@80f0.receiveMessage$1L");
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("timestamp", j);
            C790230UzF.LIZ.LIZJ().businessEvent(11005, jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendMessage: Error putting value to JSONObject:");
            sbLIZ.append(e.getMessage());
            C1471660oOq.LIZIZ("ApiVodNetController", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("ApiVodNetController@80f0.receiveMessage$1L");
    }

    public static final void run$1(ARunnableS3S1000100_13 aRunnableS3S1000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("JniDelegate@518d.appendTrafficData$1");
        try {
            aRunnableS3S1000100_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JniDelegate@518d.appendTrafficData$1");
    }

    public static final void run$2(ARunnableS3S1000100_13 aRunnableS3S1000100_13) throws JSONException {
        String str = aRunnableS3S1000100_13.s0;
        long j = aRunnableS3S1000100_13.j1;
        C1C7U.LIZ("PerfUtilsKt@f090.monitorPerf$1L");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aspect", str);
        jSONObject.put("cost", j);
        C0VZK.LIZJ("rasp_time_monitor", jSONObject);
        C1C7U.LIZIZ("PerfUtilsKt@f090.monitorPerf$1L");
    }

    public static final void run$3(ARunnableS3S1000100_13 aRunnableS3S1000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("TrafficPerfMonitor@6bb0.setTTNetTrafficBytes$1");
        try {
            C0X4T.LIZ(aRunnableS3S1000100_13.j1, aRunnableS3S1000100_13.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrafficPerfMonitor@6bb0.setTTNetTrafficBytes$1");
    }

    public static final void run$4(ARunnableS3S1000100_13 aRunnableS3S1000100_13) {
        String str = aRunnableS3S1000100_13.s0;
        long j = aRunnableS3S1000100_13.j1;
        C1C7U.LIZ("CostTimeUtil@62c9.reportCostTime$2L");
        NetworkComponent networkComponent = NetworkComponent.INSTANCE;
        NetworkConfig networkConfigNetworkConfigOrNull = networkComponent.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null && C0WRY.LIZ(networkConfigNetworkConfigOrNull.costTimeSampleRate)) {
            networkComponent.reportPerf(str, j);
        }
        C1C7U.LIZIZ("CostTimeUtil@62c9.reportCostTime$2L");
    }

    public ARunnableS3S1000100_13(String str, long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 4:
                this.s0 = str;
                this.j1 = j;
                break;
            case 1:
            case 3:
            default:
                this.s0 = str;
                this.j1 = j;
                break;
        }
    }

    public ARunnableS3S1000100_13(long j, String str, int i) {
        this.$t = i;
        this.j1 = j;
        this.s0 = str;
    }
}
