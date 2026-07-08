package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741960vQo {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";

    public final void LIZ(int i, int i2, String str, String str2) {
        String str3;
        if (i != -1) {
            if (i != 0) {
                if (i != 1000) {
                    if (i != 1001) {
                        if (i != 1100) {
                            if (i != 1200) {
                                if (i != 1400) {
                                    if (i != 1202) {
                                        if (i != 1203) {
                                            switch (i) {
                                                case 2010:
                                                    str3 = "speech_sdk_voiceclone_get_task";
                                                    break;
                                                case 2011:
                                                    str3 = "speech_sdk_voiceclone_check_env";
                                                    break;
                                                case 2012:
                                                    str3 = "speech_sdk_voiceclone_record_voice";
                                                    break;
                                                case 2013:
                                                    str3 = "speech_sdk_voiceclone_query_status";
                                                    break;
                                                case 2014:
                                                    str3 = "speech_sdk_voiceclone_submit_task";
                                                    break;
                                                case 2015:
                                                    str3 = "speech_sdk_voiceclone_delete_data";
                                                    break;
                                                default:
                                                    str3 = "";
                                                    break;
                                            }
                                        } else {
                                            str3 = "speech_sdk_update_wakeup_words_params";
                                        }
                                    } else {
                                        str3 = "speech_sdk_trigger_wakeup_query";
                                    }
                                } else {
                                    str3 = "speech_sdk_directive_synthesis";
                                }
                            } else {
                                str3 = "speech_sdk_trigger_wakeup";
                            }
                        } else {
                            str3 = "speech_sdk_finish_talking";
                        }
                    } else {
                        str3 = "speech_sdk_stop_engine";
                    }
                } else {
                    str3 = "speech_sdk_start_engine";
                }
            } else {
                str3 = "speech_sdk_init_engine";
            }
        } else {
            str3 = "speech_sdk_destroy_engine";
        }
        if (str3.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("engine_name", str);
            jSONObject.put("error_code", i2);
            jSONObject.put("host_aid", this.LIZ);
            jSONObject.put("timestamp", Long.toString(System.currentTimeMillis()));
            if (str2 != null && !str2.isEmpty()) {
                jSONObject.put("directive_data", str2);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        SDKMonitorUtils.getInstance("4060").LJIIJ(str3, jSONObject, null, null);
    }

    public final void LIZIZ(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (!str6.isEmpty() && !str7.isEmpty()) {
            SDKMonitorUtils.setConfigUrl("4060", Collections.singletonList(str6));
            SDKMonitorUtils.setDefaultReportUrl("4060", Collections.singletonList(str7));
            this.LIZ = str2;
            this.LIZIZ = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", this.LIZIZ);
                jSONObject.put("host_aid", this.LIZ);
                jSONObject.put("sdk_version", str3);
                jSONObject.put("app_version", str4);
                jSONObject.put("update_version_code", str5);
                jSONObject.put("channel", str8);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            SDKMonitorUtils.initMonitor(C786410Ut5.N3(context), "4060", jSONObject, new C0VCZ() { // from class: X.0vQp
                @Override // X.C0VCZ
                public final String getSessionId() {
                    return null;
                }

                @Override // X.C0VCZ
                public final Map<String, String> getCommonParams() {
                    HashMap map = new HashMap();
                    map.put("host_aid", this.LIZ.LIZ);
                    return map;
                }
            });
        }
    }
}
