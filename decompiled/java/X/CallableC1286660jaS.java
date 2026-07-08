package X;

import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdk.settings.LivePlayerLoggerTaskScheduleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class CallableC1286660jaS implements Callable {
    public static final C588320N5q LLIZLLLIL = new HashMap<String, Integer>() { // from class: X.0N5q
        {
            put("first_frame", Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        }
    };
    public final JSONObject LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final HashMap<String, Object> LLIZ;

    public final void LIZIZ() {
        String strLJ;
        JSONObject jSONObject = this.LL;
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("event_key");
        try {
            if (TextUtils.equals(strOptString, "play_stop")) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_play_sr_support", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJJII(Integer.valueOf(this.LL.optInt("sr_used", -1)), "sr_used");
                c474500IjALIZIZ.LIZ();
            }
            if (!LIZ(strOptString)) {
                boolean zEquals = TextUtils.equals(strOptString, "playing");
                if ((TextUtils.equals(strOptString, "first_frame") || TextUtils.equals(strOptString, "render_stall") || TextUtils.equals(strOptString, "decode_stall") || zEquals) && ((Boolean) C1338270kvh.LIZ(Boolean.FALSE, "live_setting_applog_key")).booleanValue()) {
                    C1163660gO4.LIZ.getClass();
                    Map mapLIZ = C1163660gO4.LIZ("livesdk_live_playing");
                    if (mapLIZ != null && mapLIZ.size() > 0) {
                        this.LL.put("cpu_speed_rate", mapLIZ.get("cpu_speed"));
                        this.LL.put("cpu", mapLIZ.get("cpu_rate"));
                    }
                    Map mapLIZLLL = C1163660gO4.LIZLLL("livesdk_live_playing");
                    Long l = (Long) mapLIZLLL.get("mem_pss_dalvik");
                    if (l != null && l.longValue() > 0) {
                        this.LL.put("dalvik_pss", l);
                    }
                    this.LL.put("memory", (int) (((Long) mapLIZLLL.get("mem_pss_total")) != null ? (r0.longValue() / 1024.0f) / 1024.0f : -1.0f));
                }
                Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
                this.LL.put("channel", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel());
                this.LL.put("device_name", Build.MODEL);
                this.LL.put("did", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
                this.LL.put("uid", UserService.getInstance().user().getCurrentUserId());
                this.LL.put("net_type", C786410Ut5.b3(context));
                JSONObject jSONObject2 = this.LL;
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
                    AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                    strLJ = C1300840jxK.LJ(telephonyManager);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLJ = "unkown";
                }
                jSONObject2.put("net_des", strLJ);
                if (!LiveLogFilterSwitchAbSetting.INSTANCE.printLogSwitch()) {
                    int iLIZIZ = C1286680jaU.LIZIZ(context);
                    if (iLIZIZ > 0) {
                        this.LL.put("app_version_four", iLIZIZ);
                    }
                } else if (C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                    this.LL.put("app_version_four", C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE"));
                }
                this.LL.put("ttlive_sdk_version", C465680INy.LIZ());
                this.LL.put("screen_height", this.LLILLJJLI);
                this.LL.put("screen_width", this.LLILLL);
                HashMap<String, Object> map = this.LLIZ;
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        this.LL.put(entry.getKey(), entry.getValue());
                    }
                }
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                JSONObject jSONObject3 = this.LL;
                if (str != null) {
                    jSONObject3.put("cpu_soc", str);
                }
                if (str2 != null) {
                    jSONObject3.put("gpu_name", str2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("LivePlayerLog", th);
            C1286680jaU.LIZJ(1, th);
        }
        try {
            if (LIZ(strOptString)) {
                if (C1474810oTv.LJJJLIIL() == 1) {
                    AppLogNewUtils.onEventV3(strOptString.equals("live_webrtc_monitor_log") ? "livesdk_live_client_applog_webrtc_monitor_log" : "livesdk_live_client_applog_monitor_log", this.LL);
                }
            } else {
                String str3 = this.LLILZLL;
                JSONObject jSONObject4 = this.LL;
                C1CC3 c1cc3 = C1CC2.LIZ;
                if (c1cc3 != null) {
                    c1cc3.monitorCommonLog(str3, null, jSONObject4);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(th2, 19));
            } else {
                C1286680jaU.LIZJ(2, th2);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("LivePlayerLog$SendLiveLogTaskV2@6266.call");
        String strOptString = this.LL.optString("event_key");
        if (LivePlayerLoggerTaskScheduleSetting.INSTANCE.isEventKeyScheduleEnable(strOptString)) {
            ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).commitPTFTask("live_player_log_task", strOptString, new ARunnableS109S0100000_9(this, 20));
        } else {
            LIZIZ();
        }
        C1C7U.LIZIZ("LivePlayerLog$SendLiveLogTaskV2@6266.call");
        return null;
    }

    public static boolean LIZ(String str) {
        Integer num;
        int iIntValue = ((Integer) C1338270kvh.LIZ(0, "live_setting_enable_applog_event_key")).intValue();
        if (iIntValue != 0 && (num = LLIZLLLIL.get(str)) != null && (num.intValue() & iIntValue) == 0) {
            return false;
        }
        return true;
    }

    public CallableC1286660jaS(int i, int i2, String str, String str2, JSONObject jSONObject, String str3, HashMap map) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LL = jSONObject;
        this.LLILZLL = str3;
        this.LLIZ = map;
    }
}
