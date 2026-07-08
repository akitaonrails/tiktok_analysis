package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00nT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C185300nT {
    public static final void LIZ(final String str, final String str2, final String str3) {
        C185100nR c185100nR = C185100nR.LIZ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportConfigError: ");
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(str3);
        C1798620wuC.LIZJ("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportConfigError: not initialized");
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nP
                public final /* synthetic */ C185100nR LL = C185100nR.LIZ;

                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str4 = str2;
                    String str5 = str3;
                    String str6 = str;
                    if (str4 != null) {
                        jSONObject.put("message", str4);
                    }
                    if (str5 != null) {
                        jSONObject.put("json", str5);
                    }
                    jSONObject.put("type", str6);
                    C185100nR.LIZIZ(this.LL, "config_error", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ConfigInitializerKt@515f.reportConfigError$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ConfigInitializerKt@515f.reportConfigError$1");
                }
            });
        }
    }
}
