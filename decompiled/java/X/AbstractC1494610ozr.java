package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1494610ozr implements InterfaceC1494290ozL<C1494850p0F>, InterfaceC1494280ozK<C1494850p0F> {
    public abstract void LJI(long j, long j2, String str, String str2, String str3, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject);

    public abstract void LJII(long j, long j2, String str, String str2, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject);

    public abstract void LJIIIIZZ(long j, long j2, String str, String str2, C1494850p0F c1494850p0F, JSONObject jSONObject);

    public abstract void LJIIIZ(long j, long j2, String str, String str2, String str3, C1494850p0F c1494850p0F, JSONObject jSONObject);

    public AbstractC1494610ozr() {
        TTNetInit.setMonitorProcessHookV2(this);
        C1494600ozq.LJJJJZ = new C1493610oyF();
    }

    @Override // X.InterfaceC1494290ozL
    public final void LIZ(long j, long j2, String str, String str2, C1494600ozq c1494600ozq) {
        C1494850p0F c1494850p0F = (C1494850p0F) c1494600ozq;
        if (!new C0WST().LIZIZ(400201, "com/ss/android/ugc/aweme/net/cronet/AbsCronetMonitorProcessHook", "monitorApiOk", this, new Object[]{Long.valueOf(j), Long.valueOf(j2), str, str2, c1494850p0F}, "void", new C0WZW("(JJLjava/lang/String;Ljava/lang/String;Lcom/bytedance/ttnet/http/HttpRequestInfo;)V")).LIZ) {
            LJFF(j, j2, str, str2, c1494850p0F, null, false);
        }
    }

    public static final void LJIIJ(long j, String str, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject, boolean z) throws JSONException {
        long jLongValue;
        long j2;
        long j3;
        long j4;
        Object objOpt;
        JSONObject jSONObject2;
        Object objOpt2;
        JSONObject jSONObject3;
        Object objOpt3;
        JSONObject jSONObject4;
        if (z) {
            if (c1494850p0F != null) {
                C1494620ozs.LJIIZILJ(jSONObject);
                try {
                    String str2 = c1494850p0F.LJJIIZI;
                    if (str2 != null && str2.contains("x-tt-web-proxy")) {
                        jSONObject.put("webview_url", "webview://ttnet");
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else if (c1494850p0F != null) {
            C1494620ozs.LJIIZILJ(jSONObject);
            try {
                jSONObject.put("requestStart", c1494850p0F.LJI);
                jSONObject.put("responseBack", c1494850p0F.LJII);
                jSONObject.put("completeReadResponse", c1494850p0F.LJIIIIZZ);
                jSONObject.put("appLevelRequestStart", c1494850p0F.LJ);
                jSONObject.put("beforeAllInterceptors", c1494850p0F.LJFF);
                jSONObject.put("requestEnd", c1494850p0F.LJIIIZ);
                jSONObject.put("recycleCount", c1494850p0F.LJJ);
                jSONObject.put("timing_dns", c1494850p0F.LJIIJ);
                jSONObject.put("timing_connect", c1494850p0F.LJIIJJI);
                jSONObject.put("timing_ssl", c1494850p0F.LJIIL);
                jSONObject.put("timing_send", c1494850p0F.LJIILIIL);
                jSONObject.put("timing_waiting", c1494850p0F.LJIILJJIL);
                jSONObject.put("timing_receive", c1494850p0F.LJIILL);
                jSONObject.put("timing_total", c1494850p0F.LJIILLIIL);
                jSONObject.put("timing_isSocketReused", c1494850p0F.LJJI);
                jSONObject.put("timing_totalSendBytes", c1494850p0F.LJIJI);
                jSONObject.put("timing_totalReceivedBytes", c1494850p0F.LJIJJ);
                C1494570ozn c1494570ozn = c1494850p0F.LIZLLL;
                if (c1494570ozn != null) {
                    Long l = (Long) ((ConcurrentHashMap) c1494570ozn.LJJJ).get("CallServerInterceptor");
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    jSONObject.put("parse_time", jLongValue);
                    jSONObject.put("priority_level", c1494570ozn.LJJLIIIJJI);
                    jSONObject.put("req_priority_level", c1494570ozn.LJJLIIIJJIZ);
                    jSONObject.put("thread_priority", C786410Ut5.u3().getPriority());
                    long j5 = c1494570ozn.LJJLIIIJ;
                    if (j5 <= 0) {
                        long j6 = c1494570ozn.LJJLIIIJILLIZJL;
                        if (j6 > 0) {
                            jSONObject.put("biz_total_time", j6 - c1494570ozn.LJIJJ);
                        }
                    } else {
                        jSONObject.put("cb_time", j5 - c1494570ozn.LJJLIIIIJ);
                        jSONObject.put("biz_total_time", c1494570ozn.LJJLIIIJ - c1494570ozn.LJIJJ);
                    }
                    long j7 = c1494570ozn.LJJIIZI;
                    if (j7 > 0) {
                        long j8 = c1494570ozn.LJIJJLI;
                        if (j8 > 0) {
                            jSONObject.put("queue_time", j7 - j8);
                        }
                    }
                    long j9 = c1494570ozn.LJIJJLI;
                    if (j9 > 0) {
                        jSONObject.put("biz_before_time", j9 - c1494570ozn.LJIJJ);
                    }
                }
                jSONObject.put("timing_remoteIP", c1494850p0F.LJIJ);
                jSONObject.put("request_log", c1494850p0F.LJJIIJ);
                JSONObject jSONObject5 = c1494850p0F.LJJIIJZLJL;
                if (jSONObject5 != null) {
                    jSONObject.put("req_info", jSONObject5);
                }
                String str3 = c1494850p0F.LJJIIZI;
                if (str3 != null && str3.contains("x-tt-web-proxy")) {
                    jSONObject.put("webview_url", "webview://ttnet");
                }
                jSONObject.put("download", c1494850p0F.LJJIIZ);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        long jLongValue2 = C0XM1.LIZ().LJIIL.LIZ.LJIIJJI.invoke().longValue();
        if (c1494850p0F != null) {
            j2 = c1494850p0F.LJI - jLongValue2;
            j3 = c1494850p0F.LJIJJ;
        } else {
            j2 = 0;
            j3 = 0;
        }
        C0XPI c0xpiLIZJ = C0XM1.LIZJ();
        String str4 = str;
        if (c0xpiLIZJ != null) {
            if (c1494850p0F == null || (jSONObject4 = c1494850p0F.LJJIIJZLJL) == null || (objOpt3 = jSONObject4.opt("hc")) == null) {
                objOpt3 = "";
            }
            j4 = j2;
            str4 = str4;
            c0xpiLIZJ.LJ(str4, j, j2, j3, objOpt3.toString(), th);
        } else {
            j4 = j2;
        }
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dt=");
            sbLIZ.append(j);
            sbLIZ.append(" ts=");
            sbLIZ.append(j4);
            sbLIZ.append(" d_bytes=");
            sbLIZ.append(j3);
            sbLIZ.append(" hc=");
            if (c1494850p0F != null && (jSONObject3 = c1494850p0F.LJJIIJZLJL) != null) {
                objOpt2 = jSONObject3.opt("hc");
            } else {
                objOpt2 = null;
            }
            sbLIZ.append(objOpt2);
            sbLIZ.append(" th=");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append(" url=");
            sbLIZ.append(str4);
            sbLIZ.append(" error=");
            sbLIZ.append(th);
            C2188811AlT.LIZIZ(sbLIZ);
            jSONObject.put("errorDesc", th.toString());
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (SettingsManager.LIZ("enable_net_alog", true)) {
                String strJ3 = C786410Ut5.J3(jSONObject);
                int i = C0XM3.LIZ;
                C0XPI c0xpiLIZJ2 = C0XM1.LIZJ();
                if (c0xpiLIZJ2 != null) {
                    c0xpiLIZJ2.LIZLLL(6, strJ3);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dt=");
        sbLIZ2.append(j);
        sbLIZ2.append(" ts=");
        sbLIZ2.append(j4);
        sbLIZ2.append(" d_bytes=");
        sbLIZ2.append(j3);
        sbLIZ2.append(" hc=");
        if (c1494850p0F != null && (jSONObject2 = c1494850p0F.LJJIIJZLJL) != null) {
            objOpt = jSONObject2.opt("hc");
        } else {
            objOpt = null;
        }
        sbLIZ2.append(objOpt);
        sbLIZ2.append(" th=");
        sbLIZ2.append(C786410Ut5.u3().getName());
        sbLIZ2.append(" url=");
        sbLIZ2.append(str4);
        C2188811AlT.LIZIZ(sbLIZ2);
        try {
            SettingsManager.LIZLLL().getClass();
            try {
            } catch (Exception e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e5) {
            e = e5;
        }
        if (SettingsManager.LIZ("enable_net_alog", true)) {
            if (j > 3000) {
                jSONObject.put("errorDesc", "long request");
                String strJ32 = C786410Ut5.J3(jSONObject);
                int i2 = C0XM3.LIZ;
                C0XPI c0xpiLIZJ3 = C0XM1.LIZJ();
                if (c0xpiLIZJ3 != null) {
                    c0xpiLIZJ3.LIZLLL(4, strJ32);
                }
            }
        }
    }

    @Override // X.InterfaceC1494290ozL
    public final void LIZIZ(long j, long j2, String str, String str2, C1494600ozq c1494600ozq, Throwable th) {
        C1494850p0F c1494850p0F = (C1494850p0F) c1494600ozq;
        if (!new C0WST().LIZIZ(400202, "com/ss/android/ugc/aweme/net/cronet/AbsCronetMonitorProcessHook", "monitorApiError", this, new Object[]{Long.valueOf(j), Long.valueOf(j2), str, str2, c1494850p0F, th}, "void", new C0WZW("(JJLjava/lang/String;Ljava/lang/String;Lcom/bytedance/ttnet/http/HttpRequestInfo;Ljava/lang/Throwable;)V")).LIZ) {
            LJ(j, j2, str, str2, c1494850p0F, th, null, false);
        }
    }

    @Override // X.InterfaceC1494280ozK
    public final void LIZJ(long j, long j2, String str, String str2, C1494600ozq c1494600ozq, JSONObject jSONObject) {
        C1494850p0F c1494850p0F = (C1494850p0F) c1494600ozq;
        if (!new C0WST().LIZIZ(400201, "com/ss/android/ugc/aweme/net/cronet/AbsCronetMonitorProcessHook", "monitorApiOk", this, new Object[]{Long.valueOf(j), Long.valueOf(j2), str, str2, c1494850p0F}, "void", new C0WZW("(JJLjava/lang/String;Ljava/lang/String;Lcom/bytedance/ttnet/http/HttpRequestInfo;)V")).LIZ) {
            LJFF(j, j2, str, str2, c1494850p0F, jSONObject, true);
        }
    }

    @Override // X.InterfaceC1494280ozK
    public final void LIZLLL(long j, long j2, String str, String str2, C1494600ozq c1494600ozq, Throwable th, JSONObject jSONObject) {
        C1494850p0F c1494850p0F = (C1494850p0F) c1494600ozq;
        if (!new C0WST().LIZIZ(400202, "com/ss/android/ugc/aweme/net/cronet/AbsCronetMonitorProcessHook", "monitorApiError", this, new Object[]{Long.valueOf(j), Long.valueOf(j2), str, str2, c1494850p0F, th}, "void", new C0WZW("(JJLjava/lang/String;Ljava/lang/String;Lcom/bytedance/ttnet/http/HttpRequestInfo;Ljava/lang/Throwable;)V")).LIZ) {
            LJ(j, j2, str, str2, c1494850p0F, th, jSONObject, true);
        }
    }

    public final void LJFF(long j, long j2, String str, String str2, C1494850p0F c1494850p0F, JSONObject jSONObject, boolean z) {
        long j3;
        JSONObject jSONObject2 = jSONObject;
        try {
            String[] strArr = new String[1];
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (C0XM1.LJ.getValue(EnumC1495060p0a.ApmNetMonitorOptABIsEnable) && !C787960Uva.LIZ.LJIILL("api_all", str, jSONObject2)) {
                long j4 = 0;
                if (c1494850p0F == null) {
                    j3 = 0;
                } else {
                    j3 = c1494850p0F.LJIJI;
                    j4 = c1494850p0F.LJIJJ;
                }
                C0XPI c0xpiLIZJ = C0XM1.LIZJ();
                if (c0xpiLIZJ != null) {
                    c0xpiLIZJ.LIZIZ(j3 + j4, str);
                }
                LJIIJ(j, str, c1494850p0F, null, jSONObject2, false);
                return;
            }
            LJIIJ(j, str, c1494850p0F, null, jSONObject2, false);
            if (str != null && a0.LJJIIZI(str, "&config_retry=b", false)) {
                jSONObject2.put("log_config_retry", 1);
            }
            if (TextUtils.isEmpty(strArr[0]) && c1494850p0F != null) {
                strArr[0] = c1494850p0F.LJIJ;
                T t = c1494850p0F.LIZJ;
                if (t != 0) {
                    ((C1493620oyG) t).getClass();
                }
            }
            if (!z) {
                if (c1494850p0F != null && c1494850p0F.LJJIJIL) {
                    jSONObject2.put("hit_rules", 1);
                }
                LJIIIZ(j, j2, str, str2, strArr[0], c1494850p0F, jSONObject2);
                return;
            }
            LJIIIIZZ(j, j2, str, str2, c1494850p0F, jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJ(long j, long j2, String str, String str2, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject, boolean z) {
        long j3;
        JSONObject jSONObject2 = jSONObject;
        try {
            String[] strArr = new String[1];
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (TextUtils.isEmpty(strArr[0]) && c1494850p0F != null) {
                strArr[0] = c1494850p0F.LJIJ;
                T t = c1494850p0F.LIZJ;
                if (t != 0) {
                    ((C1493620oyG) t).getClass();
                }
            }
            C0W3T.LIZ(th, jSONObject2);
            if (C0XM1.LJ.getValue(EnumC1495060p0a.ApmNetMonitorOptABIsEnable) && !C787960Uva.LIZ.LJIILL("api_error", str, jSONObject2)) {
                long j4 = 0;
                if (c1494850p0F == null) {
                    j3 = 0;
                } else {
                    j3 = c1494850p0F.LJIJI;
                    j4 = c1494850p0F.LJIJJ;
                }
                C0XPI c0xpiLIZJ = C0XM1.LIZJ();
                if (c0xpiLIZJ != null) {
                    c0xpiLIZJ.LIZIZ(j3 + j4, str);
                }
                LJIIJ(j, str, c1494850p0F, th, jSONObject2, z);
                return;
            }
            LJIIJ(j, str, c1494850p0F, th, jSONObject2, false);
            if (z) {
                LJII(j, j2, str, str2, c1494850p0F, th, jSONObject2);
            } else {
                LJI(j, j2, str, str2, strArr[0], c1494850p0F, th, jSONObject2);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
