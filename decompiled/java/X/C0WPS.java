package X;

import Y.ARunnableS113S0100000_13;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WPS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPS {
    public static final /* synthetic */ C0WPS[] LLIZ;
    public static final C0WPS instance;
    public C0WPT LL;
    public C0WPR LLILZ;
    public JSONArray LLILLJJLI = new JSONArray();
    public JSONArray LLILLL = new JSONArray();
    public int LLILZIL = 2;
    public C0WPU LLILZLL = null;

    public int getLoggerVersion() {
        return com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion(this);
    }

    public synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        jSONArray = this.LLILLJJLI;
        this.LLILLJJLI = new JSONArray();
        return jSONArray;
    }

    static {
        C0WPS c0wps = new C0WPS();
        instance = c0wps;
        LLIZ = new C0WPS[]{c0wps};
    }

    public static C0WPS[] values() {
        return (C0WPS[]) LLIZ.clone();
    }

    public int com_ss_ttvideoengine_log_VideoEventManager__getLoggerVersion$___twin___() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLoggerVersion: ");
        sbLIZ.append(this.LLILZIL);
        C1471660oOq.LIZIZ("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ));
        return this.LLILZIL;
    }

    public JSONArray popAllEventsV2() {
        JSONArray jSONArray = this.LLILLL;
        synchronized (C0WPS.class) {
            try {
                this.LLILLL = new JSONArray();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONArray;
    }

    public static void LIZJ(JSONObject jSONObject) {
        if (((TTVideoEngineLog.getLogNotifyLevel() >> 1) & 1) == 1 || ((TTVideoEngineLog.getLogTurnOn() >> 1) & 1) == 1) {
            try {
                LJFF(C786410Ut5.J3(jSONObject));
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("VideoEventManager", e.toString());
            }
        }
    }

    public static void LJFF(String str) {
        if (str != null) {
            int iMin = 3900;
            if (str.length() > 3900) {
                int length = str.length();
                int i = 0;
                while (iMin < length) {
                    String strSubstring = str.substring(i, iMin);
                    int i2 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("VideoEventManager", strSubstring);
                    i += 3900;
                    iMin = Math.min(iMin + 3900, length);
                }
                String strSubstring2 = str.substring(i, iMin);
                int i3 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("VideoEventManager", strSubstring2);
                return;
            }
        }
        int i4 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("VideoEventManager", str);
    }

    public static int com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion(C0WPS c0wps) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "player_event_log_v2_open", true, true)) {
            return 1;
        }
        return 2;
    }

    public static C0WPS valueOf(String str) {
        return (C0WPS) C08FF.LIZ(C0WPS.class, str);
    }

    public synchronized void setEngineUploader(C0WPR c0wpr) {
        this.LLILZ = c0wpr;
    }

    public void setListener(C0WPT c0wpt) {
        this.LL = c0wpt;
    }

    public void setLoggerVersion(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLoggerVersion: ");
        sbLIZ.append(i);
        C1471660oOq.LIZIZ("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1 || i == 2) {
            this.LLILZIL = i;
        }
    }

    public synchronized void setMergeListener(C0WPU c0wpu) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set merge listener:");
        sbLIZ.append(c0wpu);
        TTVideoEngineLog.d("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = c0wpu;
    }

    public void addEventV2(boolean z, JSONObject jSONObject, String str) {
        synchronized (C0WPS.class) {
            try {
                if (jSONObject == null) {
                    return;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addEventV2  uploadLog = ");
                sbLIZ.append(z);
                sbLIZ.append(", listener:");
                sbLIZ.append(this.LL);
                TTVideoEngineLog.d("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ));
                C0WPR c0wpr = this.LLILZ;
                if (c0wpr != null) {
                    ((C0WPO) c0wpr).LIZJ(str, jSONObject);
                } else {
                    if (this.LL != null) {
                        this.LLILLL.put(jSONObject);
                        this.LL.onEventV2(str);
                    } else {
                        C1471660oOq.LIZIZ("VideoEventManager", "no listener set");
                    }
                    EngineThreadPool.addExecuteTask(new ARunnableS113S0100000_13(jSONObject, 222));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public synchronized void addMergeEvent(String str, JSONObject jSONObject, String str2, boolean z) {
        CopyOnWriteArrayList<String> businessLog;
        if (jSONObject == null) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("VideoEventManager", "null jsonObject");
            return;
        }
        if (z) {
            try {
                IAppConfig iAppConfig = C795730VJj.LIZIZ;
                if (iAppConfig != null) {
                    businessLog = iAppConfig.getBusinessLog(str2);
                } else {
                    businessLog = null;
                }
                jSONObject.put("trouble_log", businessLog);
                jSONObject.put("trouble_sourceid", str2);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("report extra in main thread");
                sbLIZ.append(str2);
                TTVideoEngineLog.d("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0WPU c0wpu = this.LLILZLL;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("callback merge oneplay, listener:");
        sbLIZ2.append(c0wpu);
        sbLIZ2.append(",sessionId:");
        sbLIZ2.append(str);
        TTVideoEngineLog.d("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (c0wpu != null && !TextUtils.isEmpty("video_playq")) {
            C1481610oet.LIZ().reportEngineOnePlay(str, jSONObject);
        }
        if (((TTVideoEngineLog.getLogNotifyLevel() >> 1) & 1) == 1 || ((TTVideoEngineLog.getLogTurnOn() >> 1) & 1) == 1) {
            EngineThreadPool.addExecuteTask(new ARunnableS113S0100000_13(jSONObject, 221));
        }
    }
}
