package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttm.player.x;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468180oJE {
    public static volatile String LJJLL = "unknown";
    public static volatile String LJJZ = "unknown";
    public static C790010Uyt LJJZZI;
    public static String LJJZZIII;
    public InterfaceC1468020oIy LIZ;
    public C1468430oJd LIZIZ;
    public WeakReference<InterfaceC790020Uyu> LIZJ;
    public String LIZLLL;
    public ArrayList<String> LJII;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJLI;
    public String LJIL;
    public int LJJ;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public String LJJJIL;
    public String LJJJJ;
    public float LJJJJJ;
    public float LJJJJJL;
    public float LJJJJL;
    public Map LJJJJLL;
    public InterfaceC1467050oHP LJJJJZ;
    public final Context LJJJLIIL;
    public boolean LJJL;
    public boolean LJJLI;
    public boolean LJJLIIIIJ;
    public final C1468310oJR LJJLIIIJILLIZJL;
    public final C1468310oJR LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public boolean LJJLIL;
    public Map LJJLJ;
    public int LJJLJLI;
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public String LJIIL = "";
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public String LJIJJ = "";
    public String LJJI = "";
    public String LJJIFFI = "";
    public String LJJII = "";
    public int LJJIIZ = Integer.MIN_VALUE;
    public long LJJIIZI = -2147483648L;
    public String LJJIJ = "";
    public String LJJIJIIJI = "";
    public int LJJIJIIJIL = Integer.MIN_VALUE;
    public int LJJIJIL = Integer.MIN_VALUE;
    public int LJJIJL = Integer.MIN_VALUE;
    public String LJJIJLIJ = "";
    public String LJJIL = "";
    public String LJJIZ = "";
    public String LJJJ = "";
    public int LJJJI = Integer.MIN_VALUE;
    public int LJJJJI = Integer.MIN_VALUE;
    public String LJJJJIZL = "";
    public String LJJJJLI = "";
    public String LJJJJZI = "";
    public String LJJJLL = "";
    public String LJJJLZIJ = "";
    public String LJJJZ = "";
    public volatile int LJJLIIIJ = -1;

    public static String LIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "excellent" : "good" : "medium" : "weak";
    }

    public static String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "5G" : "3G" : "2G" : "4G" : "WIFI";
    }

    public static String LJIIIZ() {
        C790010Uyt c790010Uyt;
        if (LJJLL.equals("unknown") && (c790010Uyt = LJJZZI) != null) {
            LJJLL = LIZIZ(c790010Uyt.LIZ);
        }
        return LJJLL;
    }

    public final float LIZLLL() {
        float fFloatValue = -1.0f;
        if (!this.LJJLI) {
            return -1.0f;
        }
        Context context = this.LJJJLIIL;
        if (context != null) {
            try {
                if (C1468330oJT.LJI == null) {
                    C1468330oJT.LJI = Class.forName("duo.b");
                }
                if (C1468330oJT.LJII == null) {
                    C1468330oJT.LJII = C1468330oJT.LJI.getMethod("getGalvanicNow", Context.class);
                }
                fFloatValue = ((Float) C1468330oJT.LJII.invoke(null, context)).floatValue();
                return fFloatValue;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startThorMonitor failed:");
                sbLIZ.append(e);
                TTVideoEngineLog.d("DeviceMonitorUtils", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return fFloatValue;
    }

    public final double LJ() {
        Object objInvoke;
        Double dValueOf;
        double dDoubleValue = -1.0d;
        if (!this.LJJLI) {
            return -1.0d;
        }
        try {
            if (C1468330oJT.LIZ == null) {
                C1468330oJT.LIZ = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            }
            if (C1468330oJT.LIZJ == null) {
                C1468330oJT.LIZJ = C1468330oJT.LIZ.getMethod("getInstance", new Class[0]);
            }
            if (C1468330oJT.LJ == null) {
                C1468330oJT.LJ = C1468330oJT.LIZ.getMethod("getCpuRate", new Class[0]);
            }
            Object objInvoke2 = C1468330oJT.LIZJ.invoke(null, new Object[0]);
            if (objInvoke2 != null && (objInvoke = C1468330oJT.LJ.invoke(objInvoke2, new Object[0])) != null && (dValueOf = Double.valueOf(CastDoubleProtector.parseDouble(objInvoke.toString()))) != null) {
                dDoubleValue = dValueOf.doubleValue();
                return dDoubleValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCPURate:");
            sbLIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return dDoubleValue;
    }

    public final double LJFF() {
        Object objInvoke;
        Double dValueOf;
        double dDoubleValue = -1.0d;
        if (!this.LJJLI) {
            return -1.0d;
        }
        try {
            if (C1468330oJT.LIZ == null) {
                C1468330oJT.LIZ = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            }
            if (C1468330oJT.LIZJ == null) {
                C1468330oJT.LIZJ = C1468330oJT.LIZ.getMethod("getInstance", new Class[0]);
            }
            if (C1468330oJT.LJFF == null) {
                C1468330oJT.LJFF = C1468330oJT.LIZ.getMethod("getCpuSpeed", new Class[0]);
            }
            Object objInvoke2 = C1468330oJT.LIZJ.invoke(null, new Object[0]);
            if (objInvoke2 != null && (objInvoke = C1468330oJT.LJFF.invoke(objInvoke2, new Object[0])) != null && (dValueOf = Double.valueOf(CastDoubleProtector.parseDouble(objInvoke.toString()))) != null) {
                dDoubleValue = dValueOf.doubleValue();
                return dDoubleValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCPUSpeed:");
            sbLIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return dDoubleValue;
    }

    public final HashMap<String, Object> LJI() {
        Context context;
        Intent intentLJIJJ;
        if (!this.LJJLI || (context = this.LJJJLIIL) == null || (intentLJIJJ = C786410Ut5.LJIJJ(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return null;
        }
        int intExtra = intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
        int i = (intExtra == 2 || intExtra == 5) ? 1 : 0;
        int intExtra2 = intentLJIJJ.getIntExtra("plugged", -1);
        int intExtra3 = (intentLJIJJ.getIntExtra("level", -1) * 100) / intentLJIJJ.getIntExtra("scale", -1);
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("isCharging", Integer.valueOf(i));
        map.put("chargePlug", Integer.valueOf(intExtra2));
        map.put("power", Integer.valueOf(intExtra3));
        return map;
    }

    public final C1468440oJe LJII() {
        if (!this.LJJLI) {
            return null;
        }
        C1468440oJe c1468440oJe = new C1468440oJe();
        try {
            if (C1468330oJT.LIZ == null) {
                C1468330oJT.LIZ = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            }
            if (C1468330oJT.LIZJ == null) {
                C1468330oJT.LIZJ = C1468330oJT.LIZ.getMethod("getInstance", new Class[0]);
            }
            if (C1468330oJT.LIZLLL == null) {
                C1468330oJT.LIZLLL = C1468330oJT.LIZ.getMethod("getCurrentCpuRate", new Class[0]);
            }
            if (C1468330oJT.LIZIZ == null) {
                C1468330oJT.LIZIZ = Class.forName("aa3.a");
            }
            Object objInvoke = C1468330oJT.LIZJ.invoke(null, new Object[0]);
            if (objInvoke != null) {
                Object objInvoke2 = C1468330oJT.LIZLLL.invoke(objInvoke, new Object[0]);
                if (objInvoke2 == null || !C1468330oJT.LIZIZ.isInstance(objInvoke2)) {
                    int i = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DeviceMonitorUtils", "is not instance");
                    return c1468440oJe;
                }
                Field declaredField = C1468330oJT.LIZIZ.getDeclaredField("cpuAppRate");
                if (declaredField != null) {
                    c1468440oJe.LIZ = declaredField.getDouble(objInvoke2);
                }
                Field declaredField2 = C1468330oJT.LIZIZ.getDeclaredField("cpuAppSpeed");
                if (declaredField2 != null) {
                    c1468440oJe.LIZIZ = declaredField2.getDouble(objInvoke2);
                    return c1468440oJe;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCurrentCPUInfo:");
            sbLIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return c1468440oJe;
    }

    public final JSONObject LJIIIIZZ() {
        String strLIZLLL;
        if (this.LIZ != null) {
            synchronized (this) {
                try {
                    C1467030oHN c1467030oHN = (C1467030oHN) this.LIZ;
                    C1466990oHJ c1466990oHJ = c1467030oHN.LIZ.get();
                    InterfaceC1467680oIQ interfaceC1467680oIQ = c1467030oHN.LIZIZ.get();
                    strLIZLLL = (c1466990oHJ == null || c1466990oHJ.N == 0 || interfaceC1467680oIQ == null) ? null : interfaceC1467680oIQ.LIZLLL(c1466990oHJ.LJLIIL.LJIL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update mdl info: ");
            sbLIZ.append(strLIZLLL);
            TTVideoEngineLog.d("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ));
            if (!TextUtils.isEmpty(strLIZLLL)) {
                try {
                    return new JSONObject(strLIZLLL);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("VideoEventBase", e.toString());
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0oJd] */
    public final void LJIIJ() {
        if (this.LJJJLIIL != null) {
            synchronized ("VideoEventBase") {
                try {
                    if (LJJZZI == null) {
                        C790010Uyt c790010UytLJ = C790010Uyt.LJ();
                        LJJZZI = c790010UytLJ;
                        c790010UytLJ.LJII(this.LJJJLIIL);
                    }
                    if (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 64L)) {
                        this.LIZIZ = new InterfaceC790020Uyu() { // from class: X.0oJd
                            @Override // X.InterfaceC790020Uyu
                            public final void LIZ(int i, int i2, int i3) {
                                if (i != 0) {
                                    if (i == 1) {
                                        this.LIZ.getClass();
                                        String strLIZ = C1468180oJE.LIZ(i2);
                                        String strLIZ2 = C1468180oJE.LIZ(i3);
                                        int i4 = C2187451AjH.LIZ;
                                        TTVideoEngineLog.d("VideoEventBase", C786410Ut5.j4("receive signal strength changed, from:%s to:%s", new Object[]{strLIZ, strLIZ2}));
                                        C1468180oJE.LJJZ = strLIZ2;
                                        return;
                                    }
                                    return;
                                }
                                this.LIZ.getClass();
                                String strLIZIZ = C1468180oJE.LIZIZ(i2);
                                String strLIZIZ2 = C1468180oJE.LIZIZ(i3);
                                int i5 = C2187451AjH.LIZ;
                                TTVideoEngineLog.d("VideoEventBase", C786410Ut5.j4("receive network type changed, from:%s to:%s", new Object[]{strLIZIZ, strLIZIZ2}));
                                C1468180oJE.LJJLL = strLIZIZ2;
                            }
                        };
                        WeakReference<InterfaceC790020Uyu> weakReference = new WeakReference<>(this.LIZIZ);
                        this.LIZJ = weakReference;
                        LJJZZI.LJIIIIZZ(weakReference);
                        LJJLL = LIZIZ(LJJZZI.LIZ);
                        LJJZ = LIZ(LJJZZI.LIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIL() {
        boolean z;
        JSONObject jSONObjectLJIIIIZZ = LJIIIIZZ();
        if (jSONObjectLJIIIIZZ != null) {
            try {
                if (jSONObjectLJIIIIZZ.isNull("audio")) {
                    z = false;
                } else {
                    this.LJJLIIIJJI.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJIIIIZZ, "audio"));
                    z = true;
                }
                if (!jSONObjectLJIIIIZZ.isNull("video")) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("found video: ");
                    sbLIZ.append(C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJIIIIZZ, "video")));
                    TTVideoEngineLog.d("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJJLIIIJILLIZJL.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJIIIIZZ, "video"));
                } else if (!z) {
                    this.LJJLIIIJILLIZJL.LIZ(jSONObjectLJIIIIZZ);
                }
                if (!jSONObjectLJIIIIZZ.isNull("cur_task_num")) {
                    this.LJJLIIIJJIZ = ((Integer) jSONObjectLJIIIIZZ.get("cur_task_num")).intValue();
                }
                if (!jSONObjectLJIIIIZZ.isNull("conc_count")) {
                    this.LJJLIIIJL = ((Integer) jSONObjectLJIIIIZZ.get("conc_count")).intValue();
                }
                if (!jSONObjectLJIIIIZZ.isNull("mdl_preload_info")) {
                    this.LJJLIIIJLJLI = jSONObjectLJIIIIZZ.get("mdl_preload_info").toString();
                }
                if (!jSONObjectLJIIIIZZ.isNull("dns_type")) {
                    int iIntValue = ((Integer) jSONObjectLJIIIIZZ.get("dns_type")).intValue();
                    if (iIntValue == 0) {
                        this.LJIJJ = "localDNS";
                    } else if (iIntValue == 2) {
                        this.LJIJJ = "httpDNS_own";
                    } else if (iIntValue == 3) {
                        this.LJIJJ = "httpDNS_google";
                    } else if (iIntValue == 4) {
                        InterfaceC1468020oIy interfaceC1468020oIy = this.LIZ;
                        if (interfaceC1468020oIy == null || ((C1467030oHN) interfaceC1468020oIy).LIZJ(85) != 1) {
                            this.LJIJJ = "customDNS";
                        } else {
                            this.LJIJJ = "customDNSInnerByteDanceHTTPDNS";
                        }
                    }
                }
                if (jSONObjectLJIIIIZZ.isNull("mdl_features")) {
                    return;
                }
                LJIILIIL(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJIIIIZZ, "mdl_features"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(e);
            }
        }
    }

    public final void LJIILJJIL() {
        C1466990oHJ c1466990oHJ;
        Map map;
        Object obj;
        Object obj2;
        Map map2 = this.LJJJJLL;
        if (map2 != null) {
            if (this.LJJIIZ <= 0) {
                this.LJJIIZ = ((Integer) ((HashMap) map2).get("duration")).intValue() * LSPassThroughRecordSizeConfig.DEFAULT;
            }
            if (this.LJJIIZI <= 0) {
                Object obj3 = ((Map) ((HashMap) this.LJJJJLL).get("size")).get(this.LJJJ);
                long jLongValue = obj3 != null ? ((Number) obj3).longValue() : 0L;
                Map map3 = (Map) ((HashMap) this.LJJJJLL).get("audio_size");
                this.LJJIIZI = jLongValue + ((map3 == null || map3.size() <= 0 || this.LJJLIIIJ == -1 || (obj2 = map3.get(Integer.valueOf(this.LJJLIIIJ))) == null) ? 0L : ((Number) obj2).longValue());
            }
            if (TextUtils.isEmpty(this.LJJIJ)) {
                Map map4 = (Map) ((HashMap) this.LJJJJLL).get("codec");
                this.LJJIJ = (String) (map4.get(this.LJJJ) != null ? map4.get(this.LJJJ) : "");
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("brian codec_type:");
                sbLIZ.append(this.LJJIJ);
                sbLIZ.append(", for resolution:");
                sbLIZ.append(this.LJJJ);
                sbLIZ.append(", quality desc:");
                sbLIZ.append(this.LJJJZ);
                C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (TextUtils.isEmpty(this.LJJIJLIJ) && (map = (Map) ((HashMap) this.LJJJJLL).get("vtype")) != null && (obj = map.get(this.LJJJ)) != null) {
                this.LJJIJLIJ = (String) obj;
            }
        }
        if (this.LIZ != null) {
            String str = this.LJ;
            if ((str == null || str.isEmpty()) && (c1466990oHJ = ((C1467030oHN) this.LIZ).LIZ.get()) != null) {
                HashMap map5 = new HashMap();
                String strLIZLLL = x.LIZLLL(14, "");
                int i2 = c1466990oHJ.LJIIJ;
                if (i2 == 0 || i2 == 1) {
                    map5.put("sv", "5.6");
                    InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ;
                    if (interfaceC1467950oIr == null || !"ttmplayerbeta".equals(((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1095))) {
                        map5.put("pv", "3.0");
                    } else {
                        map5.put("pv", "3.0-beta");
                    }
                    map5.put("pc", strLIZLLL);
                    map5.put("sdk_version", "1.10.291.6-mt");
                } else if (i2 == 2) {
                    map5.put("sv", "5.6");
                    map5.put("pv", "1.0");
                    map5.put("pc", CardStruct.IStatusCode.DEFAULT);
                    map5.put("sdk_version", "1.10.291.6-mt");
                } else if (i2 == 5) {
                    map5.put("sv", "5.6");
                    map5.put("pv", "5.0");
                    map5.put("pc", "5");
                    map5.put("sdk_version", "1.10.291.6-mt");
                } else {
                    map5.put("sv", "5.6");
                    map5.put("pv", "4.0");
                    map5.put("pc", strLIZLLL);
                    map5.put("sdk_version", "1.10.291.6-mt");
                }
                try {
                    map5.put("ffv", (String) Class.forName("com.ss.ttffmpeg.FFmpegLibLoaderWrapper").getMethod("getFFmpegVersion", new Class[0]).invoke(null, new Object[0]));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                this.LJ = (String) map5.get("pv");
                this.LJFF = (String) map5.get("pc");
                this.LJI = (String) map5.get("sv");
                this.LJIIIIZZ = (String) map5.get("sdk_version");
                this.LJIIIZ = (String) map5.get("ffv");
                this.LJIIJ = (String) map5.get("vcnv");
                this.LJIIJJI = (String) map5.get("trv");
                this.LJIILIIL = (String) map5.get("abrv");
                this.LJIILJJIL = (String) map5.get("prdtv");
                this.LJIIL = (String) map5.get("prldv");
            }
            if (TextUtils.isEmpty(this.LJJIJ)) {
                this.LJJIJ = ((C1467030oHN) this.LIZ).LJ(0);
            }
            if (TextUtils.isEmpty(this.LJJIJIIJI)) {
                this.LJJIJIIJI = ((C1467030oHN) this.LIZ).LJ(146);
            }
            String strLJ = ((C1467030oHN) this.LIZ).LJ(37);
            if (!TextUtils.isEmpty(strLJ)) {
                this.LJJJLL = strLJ;
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("video_type:");
            sbLIZ2.append(this.LJJIJLIJ);
            C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ2));
            if (TextUtils.isEmpty(this.LJJIJLIJ)) {
                String strLJ2 = ((C1467030oHN) this.LIZ).LJ(65);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("get video_type from player:");
                sbLIZ3.append(strLJ2);
                C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ3));
                if (!TextUtils.isEmpty(strLJ2)) {
                    if (strLJ2.indexOf("mp4") > 0) {
                        this.LJJIJLIJ = "mp4";
                    } else {
                        int iIndexOf = strLJ2.indexOf(",");
                        if (iIndexOf < 0) {
                            this.LJJIJLIJ = strLJ2;
                        } else {
                            this.LJJIJLIJ = strLJ2.substring(0, iIndexOf);
                        }
                    }
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("video_size :");
            sbLIZ4.append(this.LJJIIZI);
            C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ4));
            if (this.LJJIIZI <= 0 && !C1474810oTv.LJJIIZ()) {
                this.LJJIIZI = ((C1467030oHN) this.LIZ).LIZLLL(66);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("get video_size from player:");
                sbLIZ5.append(this.LJJIIZI);
                C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ5));
            }
            this.LJJIJIL = ((C1467030oHN) this.LIZ).LIZJ(24);
            this.LJJIJIIJIL = ((C1467030oHN) this.LIZ).LIZJ(25);
            switch (this.LJJIJIL) {
                case 2:
                    this.LJJIII = 1;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    this.LJJIII = 0;
                    break;
            }
            this.LJJIJL = ((C1467030oHN) this.LIZ).LIZJ(49);
        }
    }

    public final void LJIIJJI(InterfaceC1467050oHP interfaceC1467050oHP) {
        Object obj;
        List<C1474520oTS> listLJIILL;
        if (interfaceC1467050oHP == null) {
            return;
        }
        this.LJJJJZ = interfaceC1467050oHP;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (interfaceC1467050oHP.LJIIL() && (listLJIILL = interfaceC1467050oHP.LJIILL()) != null && listLJIILL.size() > 0) {
            int i = 0;
            for (C1474520oTS c1474520oTS : listLJIILL) {
                int iLJFF = c1474520oTS.LJFF();
                long jLJIIIZ = c1474520oTS.LJIIIZ(12);
                String strLIZ = c1474520oTS.LIZ(8);
                int iLIZIZ = c1474520oTS.LIZIZ(3);
                String string = c1474520oTS.getResolution().toString(iLJFF);
                String strLIZ2 = c1474520oTS.LIZ(6);
                map.put(string, Long.valueOf(jLJIIIZ));
                map3.put(string, strLIZ);
                map4.put(string, Integer.valueOf(iLIZIZ));
                map5.put(Integer.valueOf(c1474520oTS.LIZIZ(3)), c1474520oTS.LIZ(15));
                map6.put(Integer.valueOf(c1474520oTS.LIZIZ(3)), Integer.valueOf(i));
                map7.put(string, strLIZ2);
                if (iLJFF == 1) {
                    arrayList.add(Integer.valueOf(c1474520oTS.LIZIZ(3)));
                } else {
                    arrayList2.add(Integer.valueOf(c1474520oTS.LIZIZ(3)));
                }
                if (this.LJJL) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setVideoInfo i:");
                    sbLIZ.append(i);
                    sbLIZ.append(", resolution:");
                    sbLIZ.append(string);
                    sbLIZ.append(", size:");
                    sbLIZ.append(jLJIIIZ);
                    sbLIZ.append(",codec_type:");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(", bitrate:");
                    sbLIZ.append(iLIZIZ);
                    C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ));
                }
                i++;
                int iLIZIZ2 = c1474520oTS.LIZIZ(42);
                if (iLJFF == 1 && ("dash".equals(strLIZ2) || "bash".equals(strLIZ2))) {
                    map2.put(Integer.valueOf(iLIZIZ2), Long.valueOf(jLJIIIZ));
                }
            }
        }
        HashMap map8 = new HashMap();
        String strLIZIZ = interfaceC1467050oHP.LIZIZ();
        map8.put("duration", Integer.valueOf(interfaceC1467050oHP.LJIIZILJ(3)));
        map8.put("size", map);
        map8.put("audio_size", map2);
        map8.put("codec", map3);
        map8.put("vtype", map7);
        map8.put("dynamic_type", strLIZIZ);
        map8.put("bitrate", map4);
        map8.put("fileKey", map5);
        map8.put("bitrateMapTable", map6);
        map8.put("audio_bitrate", arrayList);
        map8.put("video_bitrate", arrayList2);
        this.LJJJJLL = map8;
        if (!TextUtils.isEmpty(this.LJJJ) && (obj = map4.get(this.LJJJ)) != null) {
            this.LJJJI = ((Integer) obj).intValue();
        }
        this.LJJIL = strLIZIZ;
    }

    public final void LJIILIIL(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int i = JSONObjectProtectorUtils.getInt(jSONObject, next);
                map.put(next, Integer.valueOf(i));
                if (this.LJJLJLI == -1 && next.equals("mdl_p2p_loader")) {
                    this.LJJLJLI = i;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
        }
        if (!map.isEmpty()) {
            this.LJJLJ = map;
        }
    }

    public final void LIZJ(String str, String str2) {
        Map map;
        Object obj;
        this.LJJIZ = str2;
        this.LJJJ = str;
        Map map2 = this.LJJJJLL;
        if (map2 != null && (map = (Map) ((HashMap) map2).get("bitrate")) != null && (obj = map.get(this.LJJJ)) != null) {
            this.LJJJI = ((Integer) obj).intValue();
        }
    }

    public C1468180oJE(InterfaceC1468020oIy interfaceC1468020oIy, boolean z, Context context) {
        this.LJJ = Integer.MIN_VALUE;
        this.LJJIII = Integer.MIN_VALUE;
        this.LJJIIJ = Integer.MIN_VALUE;
        this.LJJIIJZLJL = Integer.MIN_VALUE;
        this.LJJJIL = "";
        this.LJJJJ = "";
        this.LJJJJJ = Float.MIN_VALUE;
        this.LJJJJJL = Float.MIN_VALUE;
        this.LJJJJL = Float.MIN_VALUE;
        C1468310oJR c1468310oJR = new C1468310oJR();
        this.LJJLIIIJILLIZJL = c1468310oJR;
        C1468310oJR c1468310oJR2 = new C1468310oJR();
        this.LJJLIIIJJI = c1468310oJR2;
        this.LJJLIIIJJIZ = Integer.MIN_VALUE;
        this.LJJLIIIJL = Integer.MIN_VALUE;
        this.LJJLIIIJLJLI = "";
        this.LJJLIIJ = Integer.MIN_VALUE;
        this.LJJLJ = null;
        this.LJJLJLI = -1;
        this.LIZ = interfaceC1468020oIy;
        this.LJIILL = C2094908Ip.LIZ(null);
        this.LJJLIL = z;
        this.LJJJLIIL = context;
        this.LJJ = 0;
        this.LJJIII = 0;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = 0;
        this.LJJJIL = "default";
        this.LJJJJ = "default";
        this.LJJJJJ = 1.0f;
        this.LJJJJJL = 1.0f;
        this.LJJJJL = 1.0f;
        c1468310oJR.LIZ = 0;
        c1468310oJR2.LIZ = 0;
    }
}
