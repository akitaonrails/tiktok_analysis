package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.01zQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514201zQ implements Runnable {
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(RunnableC514201zQ runnableC514201zQ) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportCertStatus$1");
        try {
            JSONObject jSONObject = new JSONObject();
            String str = runnableC514201zQ.s0;
            String str2 = runnableC514201zQ.s1;
            jSONObject.put("cert_name", str);
            jSONObject.put("cert_params", str2);
            C185100nR.LIZIZ(C185100nR.LIZ, "cert_status", jSONObject, null, 12);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportCertStatus$1");
    }

    public static final void run$1(RunnableC514201zQ runnableC514201zQ) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportConsentError$1");
        try {
            JSONObject jSONObject = new JSONObject();
            String str = runnableC514201zQ.s0;
            String str2 = runnableC514201zQ.s1;
            jSONObject.put("err_msg", str);
            if (str2 != null) {
                jSONObject.put("region", str2);
            }
            C185100nR.LIZIZ(C185100nR.LIZ, "consent_error", jSONObject, null, 12);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportConsentError$1");
    }

    public static final void run$2(RunnableC514201zQ runnableC514201zQ) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportNetworkException$1");
        try {
            JSONObject jSONObject = new JSONObject();
            String str = runnableC514201zQ.s0;
            String str2 = runnableC514201zQ.s1;
            jSONObject.put("err_code", -999);
            jSONObject.put("err_msg", str);
            jSONObject.put("path", str2);
            C185100nR.LIZIZ(C185100nR.LIZ, "network_status", jSONObject, null, 12);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportNetworkException$1");
    }

    public static final void run$3(RunnableC514201zQ runnableC514201zQ) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportPermissionStatus$1");
        try {
            JSONObject jSONObject = new JSONObject();
            String str = runnableC514201zQ.s0;
            String str2 = runnableC514201zQ.s1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_status");
            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), str2);
            C185100nR.LIZIZ(C185100nR.LIZ, "permission_status", jSONObject, null, 12);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportPermissionStatus$1");
    }

    public RunnableC514201zQ(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
