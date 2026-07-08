package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.dispersion.AppInstallPollingConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20336114hj {
    public static PthreadTimer LIZIZ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final String LJI;
    public static final Set<String> LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C20336114hj LIZ = new C20336114hj();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    static {
        long j = AppInstallPollingConfig.LIZ().pollingInterval;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        LJ = j * j2;
        LJFF = AppInstallPollingConfig.LIZ().pollingDuration * j2;
        LJI = "repo_feed_m2";
        LJII = C13LQ.LJLIIL(new String[]{"outreach_key", "outreach_type", "outreach_intention", "outreach_content", "outreach_landingpage_name", "outreach_extra_info"});
        LJIIIIZZ = C452501pT.LIZIZ(new C20336214hk());
        LJIIIZ = C452501pT.LIZIZ(new C20336314hl());
    }

    public static Keva LIZ() {
        return (Keva) LJIIIIZZ.getValue();
    }

    public static boolean LIZIZ() {
        JSONObject jSONObject;
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZ().getLong("timer_polling_start_time", 0L);
        if (jCurrentTimeMillis >= LJFF) {
            return false;
        }
        String string = LIZ().getString("timer_polling_app_name", "");
        String string2 = LIZ().getString("report_json_object", null);
        if (string2 != null) {
            try {
                jSONObject = new JSONObject(string2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        C20336514hn c20336514hn = C20336514hn.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coldStartResume : appname: ");
        sbLIZ.append(string);
        sbLIZ.append(" + params: ");
        sbLIZ.append(jSONObject);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20336514hn.getClass();
        C20336514hn.LIZ(strLIZIZ);
        LIZLLL(LJ, LJFF - jCurrentTimeMillis, string, jSONObject);
        return true;
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        if (LJ > 0 && LJFF > 0) {
            C20336514hn c20336514hn = C20336514hn.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("----------landing_page_show start : ");
            sbLIZ.append(str);
            sbLIZ.append(" + params: ");
            sbLIZ.append(jSONObject);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20336514hn.getClass();
            C20336514hn.LIZ(strLIZIZ);
            if (LIZIZ != null) {
                LIZLLL(LJ, LJFF, str, jSONObject);
                return;
            } else {
                if (LIZIZ()) {
                    return;
                }
                LIZLLL(LJ, LJFF, str, jSONObject);
                return;
            }
        }
        C20336514hn.LIZ.getClass();
        C20336514hn.LIZ("error-----------");
    }

    public static void LIZLLL(long j, final long j2, final String str, final JSONObject jSONObject) {
        LJ = j;
        LJFF = j2;
        PthreadTimer pthreadTimer = LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        LIZIZ = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZLLL = jCurrentTimeMillis;
        LIZ().storeLong("timer_polling_start_time", jCurrentTimeMillis);
        LIZ().storeString("timer_polling_app_name", str);
        LIZ().storeString("report_json_object", C786410Ut5.J3(jSONObject));
        PthreadTimer pthreadTimer2 = new PthreadTimer("M2InstallationPollingTool");
        LIZIZ = pthreadTimer2;
        pthreadTimer2.scheduleAtFixedRate(new C0W9W() { // from class: X.14hi
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("M2InstallationPollingTool@fd3e.startPolling$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    LIZ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("M2InstallationPollingTool@fd3e.startPolling$1");
            }

            public final void LIZ() {
                boolean zLIZLLL;
                if (System.currentTimeMillis() - C20336114hj.LIZLLL >= j2) {
                    C20336514hn.LIZ.getClass();
                    C20336514hn.LIZ("------------timer stop--------------");
                    C20336114hj.LIZ.getClass();
                    PthreadTimer pthreadTimer3 = C20336114hj.LIZIZ;
                    if (pthreadTimer3 != null) {
                        pthreadTimer3.cancel();
                    }
                    C20336114hj.LIZIZ = null;
                    return;
                }
                C20336114hj c20336114hj = C20336114hj.LIZ;
                final String str2 = str;
                final JSONObject jSONObject2 = jSONObject;
                c20336114hj.getClass();
                final C013C c013c = new C013C();
                OutreachOperationService outreachOperationService = (OutreachOperationService) C20336114hj.LJIIIZ.getValue();
                if (outreachOperationService != null) {
                    C844470XAv.LIZ.getClass();
                    zLIZLLL = outreachOperationService.LIZLLL(C844470XAv.LIZ(), str2);
                } else {
                    zLIZLLL = false;
                }
                c013c.element = zLIZLLL;
                final boolean z = C20336114hj.LIZ().getBoolean("m2_installed_status", false);
                if (C2519409u4.LIZ) {
                    C20336514hn c20336514hn = C20336514hn.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkM2Installation : ");
                    sbLIZ.append(str2);
                    sbLIZ.append(" + laststatus: ");
                    sbLIZ.append(z);
                    sbLIZ.append(" + curstatus: ");
                    sbLIZ.append(c013c.element);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c20336514hn.getClass();
                    C20336514hn.LIZ(strLIZIZ);
                }
                boolean z2 = c013c.element;
                if (z != z2) {
                    C20336114hj.LIZ().storeBoolean("m2_installed_status", z2);
                    if (c013c.element) {
                        C20336514hn c20336514hn2 = C20336514hn.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("appInstalledUpdate------- delay 30s : ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(" + laststatus: ");
                        sbLIZ2.append(z);
                        sbLIZ2.append(" + curstatus: ");
                        sbLIZ2.append(c013c.element);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c20336514hn2.getClass();
                        C20336514hn.LIZ(strLIZIZ2);
                        C786410Ut5.LJLIIL(AppInstallPollingConfig.LIZ().pollingDelay > 0 ? AppInstallPollingConfig.LIZ().pollingDelay * ((long) LSPassThroughRecordSizeConfig.DEFAULT) : 30000L, C20336114hj.LIZJ, new Runnable() { // from class: X.14hm
                            public final void LIZ() throws JSONException {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("app_key", str2);
                                Object objOpt = jSONObject2.opt("outreach_type");
                                if (objOpt != null) {
                                    jSONObject3.put("trigger_outreach_type", objOpt);
                                }
                                Object objOpt2 = jSONObject2.opt("outreach_key");
                                if (objOpt2 != null) {
                                    jSONObject3.put("trigger_outreach_key", objOpt2);
                                }
                                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("app_installed", jSONObject3, (ExecutorService) null);
                                C20336514hn c20336514hn3 = C20336514hn.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("nowTriggerPspTiming--app_installed : ");
                                sbLIZ3.append(str2);
                                sbLIZ3.append(" + laststatus: ");
                                sbLIZ3.append(z);
                                sbLIZ3.append(" + curstatus: ");
                                sbLIZ3.append(c013c.element);
                                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                c20336514hn3.getClass();
                                C20336514hn.LIZ(strLIZIZ3);
                                C20336114hj c20336114hj2 = C20336114hj.LIZ;
                                JSONObject jSONObject4 = jSONObject2;
                                c20336114hj2.getClass();
                                if (jSONObject4.isNull("outreach_key")) {
                                    return;
                                }
                                JSONObject jSONObject5 = new JSONObject();
                                Iterator<String> itKeys = jSONObject4.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    if (next != null && next.length() != 0 && (C20336114hj.LJII.contains(next) || u.LJJIIJZLJL(next, "outreach", false))) {
                                        jSONObject5.putOpt(next, jSONObject4.opt(next));
                                    }
                                }
                                C20684815ws.LJIJ("guide_user_download_ready", jSONObject5);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("M2InstallationPollingTool@fd3e.checkM2Installation$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("M2InstallationPollingTool@fd3e.checkM2Installation$1");
                            }
                        });
                    }
                }
            }
        }, 0L, j);
    }
}
