package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C185200nS {
    public static final void LIZIZ(final String str, final String str2, final Long l) {
        C185100nR c185100nR = C185100nR.LIZ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportPatternMatchStatus: ");
        sbLIZ.append(0);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(l);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportPatternMatchStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nK
                public final /* synthetic */ C185100nR LL = C185100nR.LIZ;
                public final /* synthetic */ int LLILLJJLI = 0;

                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i = this.LLILLJJLI;
                    String str3 = str;
                    String str4 = str2;
                    jSONObject.put("err_code", i);
                    jSONObject.put("err_msg", str3);
                    jSONObject.put("pattern_name", str4);
                    jSONObject.put("type", "match");
                    JSONObject jSONObject2 = new JSONObject();
                    Long l2 = l;
                    if (l2 != null) {
                        l2.longValue();
                        jSONObject2.put("cost", l2.longValue());
                    }
                    C185100nR.LIZIZ(this.LL, "pattern_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WifiClientMonitorKt@59e6.reportPatternMatchStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WifiClientMonitorKt@59e6.reportPatternMatchStatus$1");
                }
            });
        }
    }

    public static final void LIZ(final int i, final String str, final String str2, final Long l) {
        C185100nR c185100nR = C185100nR.LIZ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportPatternCompileStatus: ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(l);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportPatternCompileStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nL
                public final /* synthetic */ C185100nR LL = C185100nR.LIZ;

                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    jSONObject.put("err_code", i2);
                    jSONObject.put("err_msg", str3);
                    jSONObject.put("pattern_name", str4);
                    jSONObject.put("type", "compile");
                    JSONObject jSONObject2 = new JSONObject();
                    Long l2 = l;
                    if (l2 != null) {
                        l2.longValue();
                        jSONObject2.put("cost", l2.longValue());
                    }
                    C185100nR.LIZIZ(this.LL, "pattern_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WifiClientMonitorKt@59e6.reportPatternCompileStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WifiClientMonitorKt@59e6.reportPatternCompileStatus$1");
                }
            });
        }
    }
}
