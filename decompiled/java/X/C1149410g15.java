package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarExemptionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveIapMonitorWhiteListSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0g15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149410g15 implements C1CC3 {
    public static IHostMonitorAndLog LJJII() {
        return (IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class);
    }

    public static JSONObject LJJI(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static JSONObject LJJIFFI(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", C465680INy.LIZ());
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
                return jSONObject2;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("LiveSlardarMonitor", e.getMessage());
        }
        return jSONObject2;
    }

    @Override // X.C1CC3
    public final void LIZIZ(float f) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
            C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorDirectOnTimer$1L");
            LJJII().monitorDirectOnTimer("hotsoon_image_load", "load_time", f);
            C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorDirectOnTimer$1L");
        }
    }

    @Override // X.C1CC3
    public final void LJIJ(final JSONObject jSONObject) {
        if (LJJII() == null) {
            return;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0g17
            public final /* synthetic */ String LLILLJJLI = "ttlive_settings_manager_monitor";
            public final /* synthetic */ int LLILZ = 0;

            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                String strLIZIZ = this.LLILLJJLI;
                JSONObject jSONObject2 = jSONObject;
                int i = this.LLILZ;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.mustMonitorStatus$1L");
                if (!strLIZIZ.startsWith("ttlive_")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ttlive_");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C1149410g15.LJJII().monitorStatusRate(strLIZIZ, i, C1149410g15.LJJIFFI(jSONObject2));
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.mustMonitorStatus$1L");
            }
        });
    }

    @Override // X.C1CC3
    public final void LIZLLL(long j, String str) {
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationWithDegrade$1L");
        if (!C1078850eBH.LIZIZ(0, str)) {
            LJIILJJIL(0, j, str);
        }
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationWithDegrade$1L");
    }

    @Override // X.C1CC3
    public final void LJII(final int i, final JSONObject jSONObject) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable("bd_hybrid_monitor_service_all_in_one")) {
            C486790J7d.LIZ(new Runnable() { // from class: X.0g1E
                public final /* synthetic */ String LLILLJJLI = "bd_hybrid_monitor_service_all_in_one";
                public final /* synthetic */ JSONObject LLILZ = null;

                @Override // java.lang.Runnable
                public final void run() {
                    C1149410g15 c1149410g15 = this;
                    String str = this.LLILLJJLI;
                    int i2 = i;
                    JSONObject jSONObject2 = this.LLILZ;
                    JSONObject jSONObject3 = jSONObject;
                    c1149410g15.getClass();
                    C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationDirect$1L");
                    C1149410g15.LJJII().monitorStatusAndDuration(str, i2, jSONObject2, jSONObject3);
                    C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationDirect$1L");
                }
            });
        }
    }

    @Override // X.C1CC3
    public final void LJIIJ(int i, JSONObject jSONObject) {
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusRateWithDegrade$1L");
        if (!C1078850eBH.LIZIZ(0, "hotsoon_image_load_error_rate")) {
            monitorStatusRate("hotsoon_image_load_error_rate", i, jSONObject);
        }
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusRateWithDegrade$1L");
    }

    @Override // X.C1CC3
    public final void LJIILLIIL(final String str, final Throwable th) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
            C486790J7d.LIZ(new Runnable() { // from class: X.0g1G
                @Override // java.lang.Runnable
                public final void run() {
                    C1149410g15 c1149410g15 = this.LL;
                    Throwable th2 = th;
                    String str2 = str;
                    c1149410g15.getClass();
                    C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.exceptionMonitor$1L");
                    C1149410g15.LJJII().ensureNotReachHere(th2, str2);
                    C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.exceptionMonitor$1L");
                }
            });
        }
    }

    public static void LJJIIJ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("LiveSlardarMonitor", e.getMessage());
        }
    }

    @Override // X.C1CC3
    public final void LIZ(final int i, final String str, final Map map) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            C486790J7d.LIZ(new Runnable() { // from class: X.0g1B
                @Override // java.lang.Runnable
                public final void run() {
                    C1149410g15 c1149410g15 = this.LL;
                    Map map2 = map;
                    String str2 = str;
                    int i2 = i;
                    c1149410g15.getClass();
                    C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatus$1L");
                    c1149410g15.monitorStatus(str2, i2, C2348809Ig.LIZLLL(map2));
                    C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatus$1L");
                }
            });
        }
    }

    @Override // X.C1CC3
    public final void LJFF(final int i, final String str, final JSONObject jSONObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0g1J
            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this;
                String str2 = str;
                int i2 = i;
                JSONObject jSONObject2 = jSONObject;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$2L");
                c1149410g15.monitorStatusAndDuration(str2, i2, null, jSONObject2);
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$2L");
            }
        });
    }

    @Override // X.C1CC3
    public final void LJIIJJI(final String str, final long j, final JSONObject jSONObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0g18
            @Override // java.lang.Runnable
            public final void run() {
                final C1149410g15 c1149410g15 = this.LL;
                long j2 = j;
                JSONObject jSONObject2 = jSONObject;
                final String str2 = str;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorDuration$1L");
                final JSONObject jSONObjectLJJI = C1149410g15.LJJI(j2);
                final JSONObject jSONObjectLJJIFFI = C1149410g15.LJJIFFI(jSONObject2);
                if (C1149410g15.LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str2)) {
                    C486790J7d.LIZ(new Runnable() { // from class: X.0g1F
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1149410g15 c1149410g152 = c1149410g15;
                            String str3 = str2;
                            JSONObject jSONObject3 = jSONObjectLJJI;
                            JSONObject jSONObject4 = jSONObjectLJJIFFI;
                            c1149410g152.getClass();
                            C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorDuration$2L");
                            C1149410g15.LJJII().monitorDuration(str3, jSONObject3, jSONObject4);
                            C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorDuration$2L");
                        }
                    });
                }
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorDuration$1L");
            }
        });
    }

    @Override // X.C1CC3
    public final void LJIILIIL(final String str, final Throwable th, final Map map) {
        if (map != null && !map.isEmpty()) {
            if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
                C486790J7d.LIZ(new Runnable() { // from class: X.0g1C
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1149410g15 c1149410g15 = this.LL;
                        Throwable th2 = th;
                        String str2 = str;
                        Map<String, String> map2 = map;
                        c1149410g15.getClass();
                        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.exceptionMonitor$2L");
                        C1149410g15.LJJII().ensureNotReachHere(th2, str2, map2);
                        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.exceptionMonitor$2L");
                    }
                });
                return;
            }
            return;
        }
        LJIILLIIL(str, th);
    }

    @Override // X.C1CC3
    public final void LJIILJJIL(final int i, final long j, final String str) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0g1H
            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                long j2 = j;
                String str2 = str;
                int i2 = i;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$1L");
                c1149410g15.monitorStatusAndDuration(str2, i2, C1149410g15.LJJI(j2), null);
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$1L");
            }
        });
    }

    @Override // X.C1CC3
    public final void LJIJJLI(long j, String str, JSONObject jSONObject) {
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationWithDegrade$4L");
        if (!C1078850eBH.LIZIZ(0, str)) {
            LJIJJ(0, j, str, jSONObject);
        }
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationWithDegrade$4L");
    }

    @Override // X.C1CC3
    public final void LJJ(final int i, final String str, final Map map) {
        C486790J7d.LIZ(new Runnable() { // from class: X.0g13
            public final /* synthetic */ String LLILLL = "wallet";

            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                Map map2 = map;
                String str2 = this.LLILLL;
                String str3 = str;
                int i2 = i;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatus$1L");
                C486790J7d.LIZ(new Runnable(str2, C2348809Ig.LIZLLL(map2), str3, i2) { // from class: X.0ekr
                    public final /* synthetic */ String LL;
                    public final /* synthetic */ int LLILLJJLI;
                    public final /* synthetic */ JSONObject LLILLL;

                    {
                        this.LL = str3;
                        this.LLILLJJLI = i2;
                        this.LLILLL = jSONObject;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str4 = this.LL;
                        int i3 = this.LLILLJJLI;
                        JSONObject jSONObject = this.LLILLL;
                        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatus$2L");
                        if (!LiveEnableSlardarSetting.INSTANCE.isDisable(str4) && C1305200k4M.LIZ()) {
                            try {
                                C0VCC c0vcc = C1305200k4M.LIZIZ;
                                if (c0vcc != null) {
                                    c0vcc.LJIILIIL(str4, i3, null, jSONObject);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("monitorStatusRate ");
                                sbLIZ.append(str4);
                                sbLIZ.append(" encounter error");
                                C20441214yg.LJFF("LiveSlardarSdkMonitor", C2188811AlT.LIZIZ(sbLIZ), e);
                            }
                        }
                        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatus$2L");
                    }
                });
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatus$1L");
            }
        });
    }

    @Override // X.C1CC3
    public final void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        if (LJJII() == null) {
            return;
        }
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorCommonLog$1L");
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("service", str2);
        }
        LJJII().monitorCommonLog(str, jSONObject);
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorCommonLog$1L");
    }

    @Override // X.C1CC3
    public final void monitorStatus(final String str, final int i, final JSONObject jSONObject) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            C486790J7d.LIZ(new Runnable() { // from class: X.0g16
                @Override // java.lang.Runnable
                public final void run() {
                    C1149410g15 c1149410g15 = this;
                    String strLIZIZ = str;
                    JSONObject jSONObject2 = jSONObject;
                    int i2 = i;
                    c1149410g15.getClass();
                    C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatus$2L");
                    if (!strLIZIZ.startsWith("ttlive_")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ttlive_");
                        sbLIZ.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C1149410g15.LJJII().monitorStatusRate(strLIZIZ, i2, C1149410g15.LJJIFFI(jSONObject2));
                    C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatus$2L");
                }
            });
        }
    }

    @Override // X.C1CC3
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusRate$1L");
            LJJII().monitorStatusRate(str, i, jSONObject);
            C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusRate$1L");
        }
    }

    @Override // X.C1CC3
    public final void LIZJ(final String str, final Map<String, Object> map, final Map<String, Object> map2, final Map<String, Object> map3) {
        new Runnable() { // from class: X.0g1A
            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                Map map4 = map;
                Map map5 = map2;
                Map map6 = map3;
                String str2 = str;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorEvent$1L");
                c1149410g15.LJJIII(str2, C2348809Ig.LIZLLL(map4), C2348809Ig.LIZLLL(map5), C2348809Ig.LIZLLL(map6));
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorEvent$1L");
            }
        }.run();
    }

    @Override // X.C1CC3
    public final void LJ(final int i, final String str, final Map map, final long j) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0g19
            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                long j2 = j;
                Map map2 = map;
                String str2 = str;
                int i2 = i;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$3L");
                c1149410g15.monitorStatusAndDuration(str2, i2, C1149410g15.LJJI(j2), C2348809Ig.LIZLLL(map2));
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$3L");
            }
        });
    }

    @Override // X.C1CC3
    public final void LJI(int i, int i2, String str, Map map) {
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusWithDegrade$1L");
        if (!C1078850eBH.LIZIZ(i2, str)) {
            LIZ(i, str, map);
        }
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusWithDegrade$1L");
    }

    @Override // X.C1CC3
    public final void LJIIIIZZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (!str.startsWith("ttlive_")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttlive_");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            LJJIIJ("tag", "ttlive_sdk", jSONObject3);
            LJJIIJ("ttlive_sdk_version", C465680INy.LIZ(), jSONObject3);
            LJJII().vn(str, jSONObject, jSONObject2, LJJIFFI(jSONObject3));
        }
    }

    @Override // X.C1CC3
    public final void LJIIIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJJIII(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // X.C1CC3
    public final void LJIIL(int i, long j, String str, Map map) {
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationWithDegrade$3L");
        if (!C1078850eBH.LIZIZ(0, str)) {
            LJ(i, str, map, j);
        }
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDurationWithDegrade$3L");
    }

    @Override // X.C1CC3
    public final void LJIILL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (!str.startsWith("ttlive_")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttlive_");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            LJJIIJ("tag", "ttlive_sdk", jSONObject3);
            LJJIIJ("ttlive_sdk_version", C465680INy.LIZ(), jSONObject3);
            LJJII().vn(str, jSONObject, jSONObject2, LJJIFFI(jSONObject3));
        }
    }

    @Override // X.C1CC3
    public final void LJIIZILJ(final long j, final Map map, final int i, final String str) {
        C486790J7d.LIZ(new Runnable() { // from class: X.0g14
            public final /* synthetic */ String LLILZ = "wallet";

            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                long j2 = j;
                Map map2 = map;
                String str2 = this.LLILZ;
                String str3 = str;
                int i2 = i;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatusAndDuration$1L");
                C486790J7d.LIZ(new Runnable(i2, str2, str3, C1149410g15.LJJI(j2), C2348809Ig.LIZLLL(map2)) { // from class: X.0eks
                    public final /* synthetic */ String LL;
                    public final /* synthetic */ int LLILLJJLI;
                    public final /* synthetic */ JSONObject LLILLL;
                    public final /* synthetic */ JSONObject LLILZ;

                    {
                        this.LL = str3;
                        this.LLILLL = jSONObject;
                        this.LLILZ = jSONObject;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str4 = this.LL;
                        int i3 = this.LLILLJJLI;
                        JSONObject jSONObject = this.LLILLL;
                        JSONObject jSONObject2 = this.LLILZ;
                        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatusAndDuration$2L");
                        if (!LiveEnableSlardarSetting.INSTANCE.isDisable(str4) && C1305200k4M.LIZ()) {
                            try {
                                C0VCC c0vcc = C1305200k4M.LIZIZ;
                                if (c0vcc != null) {
                                    c0vcc.LJIILIIL(str4, i3, jSONObject, jSONObject2);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("monitorStatusAndDuration ");
                                sbLIZ.append(str4);
                                sbLIZ.append(" encounter error");
                                C20441214yg.LJFF("LiveSlardarSdkMonitor", C2188811AlT.LIZIZ(sbLIZ), e);
                            }
                        }
                        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatusAndDuration$2L");
                    }
                });
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorStatusAndDuration$1L");
            }
        });
    }

    @Override // X.C1CC3
    public final void LJIJI(int i, int i2, String str, JSONObject jSONObject) {
        C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusWithDegrade$2L");
        if (!C1078850eBH.LIZIZ(i2, str)) {
            monitorStatus(str, i, jSONObject);
        }
        C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusWithDegrade$2L");
    }

    @Override // X.C1CC3
    public final void LJIJJ(final int i, final long j, final String str, final JSONObject jSONObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C486790J7d.LIZ(new Runnable() { // from class: X.0g1I
            @Override // java.lang.Runnable
            public final void run() {
                C1149410g15 c1149410g15 = this.LL;
                long j2 = j;
                String str2 = str;
                int i2 = i;
                JSONObject jSONObject2 = jSONObject;
                c1149410g15.getClass();
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$4L");
                c1149410g15.monitorStatusAndDuration(str2, i2, C1149410g15.LJJI(j2), jSONObject2);
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$4L");
            }
        });
    }

    public final void LJJIII(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            new Runnable() { // from class: X.0g12
                @Override // java.lang.Runnable
                public final void run() {
                    C1149410g15 c1149410g15 = this.LL;
                    JSONObject jSONObject4 = jSONObject3;
                    JSONObject jSONObject5 = jSONObject;
                    String strLIZIZ = str;
                    JSONObject jSONObject6 = jSONObject2;
                    c1149410g15.getClass();
                    C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorEvent$2L");
                    C1149410g15.LJJIIJ("tag", "ttlive_sdk", jSONObject4);
                    C1149410g15.LJJIIJ("ttlive_sdk_version", String.valueOf(4510), jSONObject4);
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
                    if (c0ir5 != null) {
                        try {
                            jSONObject5.put("is_anchor", C500260Jjc.LJIJ(dataChannelGlobal) ? 1 : 0);
                            jSONObject4.put("anchor_id", c0ir5.LIZLLL);
                            C0IXL c0ixl = c0ir5.LJFF;
                            if (c0ixl != null) {
                                jSONObject5.put("enter_method", c0ixl.LIZ);
                                jSONObject5.put("enter_from_merge", c0ir5.LJFF.LIZIZ);
                            }
                            Room room = c0ir5.LIZIZ;
                            if (room != null) {
                                jSONObject4.put("room_id", room.getId());
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (!strLIZIZ.startsWith("ttlive_")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ttlive_");
                        sbLIZ.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C1149410g15.LJJII().vn(strLIZIZ, jSONObject5, jSONObject6, jSONObject4);
                    C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorEvent$2L");
                }
            }.run();
        }
    }

    @Override // X.C1CC3
    public final void monitorStatusAndDuration(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (LJJII() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            if ("bd_hybrid_monitor_service_all_in_one".equals(str)) {
                C501590Jll.LJFF(jSONObject2);
            }
            C486790J7d.LIZ(new Runnable() { // from class: X.0g1D
                @Override // java.lang.Runnable
                public final void run() {
                    C1149410g15 c1149410g15 = this;
                    JSONObject jSONObject3 = jSONObject2;
                    String str2 = str;
                    int i2 = i;
                    JSONObject jSONObject4 = jSONObject;
                    c1149410g15.getClass();
                    C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$5L");
                    C1149410g15.LJJII().monitorStatusAndDuration(str2, i2, jSONObject4, C1149410g15.LJJIFFI(jSONObject3));
                    C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.monitorStatusAndDuration$5L");
                }
            });
        }
    }

    @Override // X.C1CC3
    public final void vn(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJJIII(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // X.C1CC3
    public final void LJIL(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        C486790J7d.LIZ(new Runnable(str, str2, jSONObject, jSONObject2, jSONObject3) { // from class: X.0ekq
            public final /* synthetic */ String LL;
            public final /* synthetic */ JSONObject LLILLJJLI;
            public final /* synthetic */ JSONObject LLILLL;
            public final /* synthetic */ JSONObject LLILZ;

            {
                this.LL = str2;
                this.LLILLJJLI = jSONObject;
                this.LLILLL = jSONObject2;
                this.LLILZ = jSONObject3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str3 = this.LL;
                JSONObject jSONObject4 = this.LLILLJJLI;
                JSONObject jSONObject5 = this.LLILLL;
                JSONObject jSONObject6 = this.LLILZ;
                C1C7U.LIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorEvent$1L");
                if ((LiveIapMonitorWhiteListSetting.INSTANCE.isEnable(str3) || LiveEnableSlardarExemptionSetting.INSTANCE.isExempted(str3) || !LiveEnableSlardarSetting.INSTANCE.isDisable(str3)) && C1305200k4M.LIZ()) {
                    try {
                        C0VCC c0vcc = C1305200k4M.LIZIZ;
                        if (c0vcc != null) {
                            c0vcc.LJIIJ(str3, jSONObject4, jSONObject5, jSONObject6);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("monitorEvent ");
                        sbLIZ.append(str3);
                        sbLIZ.append(" encounter error");
                        C20441214yg.LJFF("LiveSlardarSdkMonitor", C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                }
                C1C7U.LIZIZ("SlardarMonitorServiceImpl@2d4d.sdkMonitorEvent$1L");
            }
        });
    }
}
