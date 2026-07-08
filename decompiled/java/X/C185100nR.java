package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C185100nR {
    public static final C185100nR LIZ = new C185100nR();
    public static final BPEAHandler LIZIZ = C404501hj.LIZ;
    public static volatile C0VCC LIZJ;

    public static boolean LIZ() {
        return LIZJ != null;
    }

    public static void LJ(String str, String str2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportCertStatus: ");
        sbLIZ.append(str);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZ() && str != null) {
            C786410Ut5.LJJZZIII(LIZIZ, new RunnableC514201zQ(str, str2, 0));
        } else {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportCertStatus: not initialized or cert is null");
        }
    }

    public static void LJFF(String str, String str2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportConsentError: ");
        sbLIZ.append(str2);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportConsentError: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new RunnableC514201zQ(str2, str, 1));
        }
    }

    public static void LJI(final int i, final String str) {
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportGetRegionStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nM
                public final /* synthetic */ String LLILLL = "store_region";
                public final /* synthetic */ long LLILZ = 0;

                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i2 = i;
                    String str2 = str;
                    String str3 = this.LLILLL;
                    jSONObject.put("err_code", i2);
                    if (str2 == null) {
                        str2 = "Unknown";
                    }
                    jSONObject.put("err_msg", str2);
                    jSONObject.put("type", str3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cost", this.LLILZ);
                    C185100nR.LIZIZ(C185100nR.LIZ, "region_get_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportGetRegionStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportGetRegionStatus$1");
                }
            });
        }
    }

    public static void LJIIJJI(String str, String str2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportNetworkException ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportNetworkException: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new RunnableC514201zQ(str2, str, 2));
        }
    }

    public static void LJIILIIL(String str, String str2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportPermissionStatus: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportPermissionStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new RunnableC514201zQ(str, str2, 3));
        }
    }

    public static void LJIILLIIL(final int i, final String str) {
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportRegionInitStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nN
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportRegionInitStatus$1");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        int i2 = i;
                        String str2 = str;
                        jSONObject.put("err_code", i2);
                        if (str2 != null) {
                            jSONObject.put("err_msg", str2);
                        }
                        C185100nR.LIZIZ(C185100nR.LIZ, "region_init_status", jSONObject, null, 12);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportRegionInitStatus$1");
                }
            });
        }
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportNoCert: ");
        sbLIZ.append(str);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportNoCert: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new RunnableC514401zS(str, str2, str3, 3));
        }
    }

    public static void LJIIZILJ(final int i, final long j, final String str) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportStrategyStatus ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportStrategyStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nD
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str2 = str;
                    int i2 = i;
                    jSONObject.put("name", str2);
                    jSONObject.put("result", i2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cost", j);
                    C185100nR.LIZIZ(C185100nR.LIZ, "strategy_status2", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportStrategyStatus2$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportStrategyStatus2$1");
                }
            });
        }
    }

    public static void LJIJ(final Integer num, final long j, final String str) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportWifiStatus: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(j);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportWifiStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nG
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", str);
                    JSONObject jSONObject2 = new JSONObject();
                    long j2 = j;
                    Integer num2 = num;
                    jSONObject2.put("cost", j2);
                    if (num2 != null) {
                        num2.intValue();
                        jSONObject2.put("count", num2.intValue());
                    }
                    C185100nR.LIZIZ(C185100nR.LIZ, "wifi_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportWifiStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportWifiStatus$1");
                }
            });
        }
    }

    public static void LIZJ(final int i, final String str, final String str2, final Object obj) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportBpeaStatus ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportBpeaStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nE
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str3 = str;
                    int i2 = i;
                    String str4 = str2;
                    Object obj2 = obj;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str3);
                    sbLIZ2.append("-status");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(i2);
                    sbLIZ3.append('-');
                    sbLIZ3.append(str4);
                    jSONObject.put(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(i2);
                    sbLIZ4.append('-');
                    sbLIZ4.append(str4);
                    jSONObject.put("bpea_status", C2188811AlT.LIZIZ(sbLIZ4));
                    jSONObject.put("params_status", obj2 != null);
                    C185100nR.LIZIZ(C185100nR.LIZ, "bpea_status", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportBpeaStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportBpeaStatus$1");
                }
            });
        }
    }

    public static void LJIIIIZZ(long j, int i, String str, String str2) {
        LJII(i, j, null, null, null, "location_controller", str, str2, null);
    }

    public static void LJIJI(final Integer num, final Long l, final String str, final String str2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportWifiStatus: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(num);
        sbLIZ.append(' ');
        sbLIZ.append(l);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportWifiStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nH
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str3 = str;
                    String str4 = str2;
                    Integer num2 = num;
                    Long l2 = l;
                    jSONObject.put("type", str3);
                    jSONObject.put("msg", str4);
                    if (num2 != null) {
                        jSONObject.put("reason", num2.intValue());
                    }
                    if (l2 != null) {
                        jSONObject.put("city_id", l2.longValue());
                    }
                    C185100nR.LIZIZ(C185100nR.LIZ, "wifi_status", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportWifiStatus$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportWifiStatus$2");
                }
            });
        }
    }

    public static void LIZIZ(C185100nR c185100nR, String str, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            jSONObject2 = null;
        }
        c185100nR.getClass();
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorEvent ");
        sbLIZ.append(str);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        C0VCC c0vcc = LIZJ;
        if (c0vcc == null) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "monitorEvent: not initialized");
        } else {
            c0vcc.LJIIJ(str, jSONObject, jSONObject2, null);
        }
    }

    public static void LJIIL(final int i, final long j, final int i2, final String str, final String str2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportNetworkStatus: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportNetworkStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nU
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i3 = i2;
                    String str3 = str;
                    String str4 = str2;
                    jSONObject.put("err_code", i3);
                    jSONObject.put("path", str3);
                    if (str4 != null) {
                        jSONObject.put("err_msg", str4);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    long j2 = j;
                    int i4 = i;
                    jSONObject2.put("cost", j2);
                    jSONObject2.put("retry_count", i4);
                    C185100nR.LIZIZ(C185100nR.LIZ, "network_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportNetworkStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportNetworkStatus$1");
                }
            });
        }
    }

    public static void LJIIIZ(final int i, final long j, final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportLocationStatus: action=");
        sbLIZ.append(str);
        sbLIZ.append(" caller=");
        sbLIZ.append(str2);
        sbLIZ.append(" status=");
        sbLIZ.append(str3);
        sbLIZ.append(" cost=");
        sbLIZ.append(j);
        sbLIZ.append(" isCache=");
        sbLIZ.append(z);
        sbLIZ.append(" errMsg=");
        sbLIZ.append(str4);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportLocationStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nW
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str5 = str3;
                    String str6 = str2;
                    int i2 = i;
                    String str7 = str4;
                    String str8 = str;
                    boolean z3 = z;
                    boolean z4 = z2;
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str5);
                    if (str6 != null) {
                        jSONObject.put("caller", str6);
                    }
                    jSONObject.put("err_code", i2);
                    if (str7 != null) {
                        jSONObject.put("err_msg", str7);
                    }
                    jSONObject.put("action", str8);
                    jSONObject.put("is_cache", z3);
                    jSONObject.put("with_sensor", z4 ? 1 : 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cost", j);
                    C185100nR.LIZIZ(C185100nR.LIZ, "location_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportLocationStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportLocationStatus$1");
                }
            });
        }
    }

    public static void LJIILJJIL(final EnumC1207420hWe enumC1207420hWe, final EnumC1207930hXT enumC1207930hXT, final EnumC1208400hYE enumC1208400hYE, final Integer num, final Long l, final String str, final String str2, final String str3) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportPromoteStatus");
        if (!LIZ()) {
            C1798620wuC.LIZJ("SdkMonitorWrapper", "reportPromoteStatus, not initialized", null);
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nV
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    EnumC1208400hYE enumC1208400hYE2 = enumC1208400hYE;
                    EnumC1207930hXT enumC1207930hXT2 = enumC1207930hXT;
                    String str4 = str;
                    String str5 = str2;
                    EnumC1207420hWe enumC1207420hWe2 = enumC1207420hWe;
                    String str6 = str3;
                    jSONObject.put("target", enumC1208400hYE2.name());
                    jSONObject.put("result", enumC1207930hXT2.name());
                    jSONObject.put("cert", str4);
                    jSONObject.put("region", str5);
                    jSONObject.put("stage", enumC1207420hWe2.name());
                    if (str6 != null) {
                        jSONObject.put("message", str6);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    Integer num2 = num;
                    Long l2 = l;
                    if (num2 != null) {
                        jSONObject2.put("show_index", num2.intValue());
                    }
                    if (l2 != null) {
                        jSONObject2.put("duration", l2.longValue());
                    }
                    C185100nR.LIZIZ(C185100nR.LIZ, "location_popup_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportPromoteStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportPromoteStatus$1");
                }
            });
        }
    }

    public static void LJII(final int i, final long j, final Long l, final Long l2, final Long l3, final String str, final String str2, final String str3, final String str4) {
        if (!LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportInitializeStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.00nJ
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i2 = i;
                    String str5 = str2;
                    String str6 = str;
                    String str7 = str3;
                    String str8 = str4;
                    jSONObject.put("err_code", i2);
                    jSONObject.put("err_msg", str5);
                    jSONObject.put("type", str6);
                    if (str7 != null) {
                        jSONObject.put("source", str7);
                    }
                    if (str8 != null) {
                        jSONObject.put("init_trigger", str8);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    long j2 = j;
                    Long l4 = l;
                    Long l5 = l2;
                    Long l6 = l3;
                    jSONObject2.put("cost", j2);
                    if (l4 != null) {
                        jSONObject2.put("task_init_cost_since_cold_start", l4.longValue());
                    }
                    if (l5 != null) {
                        jSONObject2.put("settings_callback_cost_since_task_init", l5.longValue());
                    }
                    if (l6 != null) {
                        jSONObject2.put("start_init_cost_since_settings_callback", l6.longValue());
                    }
                    C185100nR.LIZIZ(C185100nR.LIZ, "init_cost", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportInitializeStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportInitializeStatus$1");
                }
            });
        }
    }
}
