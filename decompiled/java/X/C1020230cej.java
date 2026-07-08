package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1020230cej {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF = new LinkedHashMap();
    public final Map<String, Object> LJI = new LinkedHashMap();

    public final void LJ() {
        if (TextUtils.isEmpty(this.LIZ) || TextUtils.isEmpty(this.LIZIZ) || TextUtils.isEmpty(this.LIZJ)) {
            return;
        }
        Callable callable = new Callable() { // from class: X.0cei
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                Unit unit;
                Context applicationContext;
                IAppLogDepend iAppLogDependLIZ;
                boolean z;
                k kVarLJJIIZ;
                String str;
                Object c098200Yq;
                Object c098200Yq2;
                JSONObject jSONObject;
                C1020230cej c1020230cej = this.LL;
                C1C7U.LIZ("RichLogHelper$InnerAdLog@f195.send$1L");
                IHostContextDepend iHostContextDependLIZIZ = C2214471Bll.LIZIZ();
                if (iHostContextDependLIZIZ == null || (applicationContext = iHostContextDependLIZIZ.getApplicationContext()) == null) {
                    unit = Unit.LIZ;
                } else {
                    c1020230cej.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    IHostContextDepend iHostContextDependLIZIZ2 = C2214471Bll.LIZIZ();
                    Context applicationContext2 = iHostContextDependLIZIZ2 != null ? iHostContextDependLIZIZ2.getApplicationContext() : null;
                    if (applicationContext2 != null) {
                        jSONObject2.put("log_extra", c1020230cej.LJ);
                        jSONObject2.put("is_ad_event", "1");
                        jSONObject2.put("nt", C786410Ut5.b3(applicationContext2));
                        for (Map.Entry entry : ((LinkedHashMap) c1020230cej.LJFF).entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                        if (TextUtils.equals(c1020230cej.LIZIZ, "click")) {
                            jSONObject2.put("has_v3", "1");
                        }
                        c1020230cej.LJI.put("system_start_timestamp", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                        if (jSONObject2.has("ad_extra_data")) {
                            try {
                                c098200Yq = jSONObject2.get("ad_extra_data");
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                                if (c098200Yq instanceof JSONObject) {
                                    jSONObject = (JSONObject) c098200Yq;
                                } else if (c098200Yq instanceof String) {
                                    try {
                                        c098200Yq2 = new JSONObject((String) c098200Yq);
                                        C189200o6.m2constructorimpl(c098200Yq2);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        c098200Yq2 = new C098200Yq(th2);
                                        C189200o6.m2constructorimpl(c098200Yq2);
                                    }
                                    jSONObject = (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
                                }
                                if (jSONObject != null) {
                                    Iterator<String> itKeys = jSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        c1020230cej.LJI.put(next, jSONObject.get(next));
                                    }
                                }
                            }
                        }
                        Map<String, Object> map = c1020230cej.LJI;
                        if (map != null && !map.isEmpty()) {
                            jSONObject2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), c1020230cej.LJI));
                        }
                    }
                    C1019240cd8.LIZ.LIZ(c1020230cej.LIZ, c1020230cej.LIZIZ, c1020230cej.LIZJ, jSONObject2);
                    try {
                        str = c1020230cej.LIZLLL;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    long j = str != null ? CastLongProtector.parseLong(str) : 0L;
                    if (TextUtils.equals(c1020230cej.LIZIZ, "click")) {
                        String str2 = c1020230cej.LIZ;
                        String str3 = c1020230cej.LIZJ;
                        JSONObject jSONObject3 = new JSONObject();
                        String strOptString = jSONObject2.optString("ad_extra_data");
                        if (strOptString == null || a0.LJJJIL(strOptString)) {
                            z = true;
                        } else {
                            try {
                                JSONObject jSONObject4 = new JSONObject(strOptString);
                                jSONObject4.put("system_start_timestamp", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                                jSONObject2.put("ad_extra_data", C786410Ut5.J3(jSONObject4));
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            z = false;
                        }
                        Iterator<String> itKeys2 = jSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            if (!Intrinsics.LJFF("has_v3", next2) && !Intrinsics.LJFF("category", next2)) {
                                try {
                                    jSONObject3.put(next2, jSONObject2.opt(next2));
                                } catch (JSONException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                        }
                        if (z) {
                            try {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("system_start_timestamp", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                                jSONObject3.put("ad_extra_data", C786410Ut5.J3(jSONObject5));
                            } catch (JSONException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                        }
                        jSONObject3.put("tag", str2);
                        jSONObject3.put("value", str3);
                        jSONObject3.put("group_id", j);
                        jSONObject3.put("category", "event_v3");
                        IAppLogDepend iAppLogDependLIZ2 = C2214471Bll.LIZ();
                        if (iAppLogDependLIZ2 != null) {
                            iAppLogDependLIZ2.onEventV3Json("realtime_click", jSONObject3);
                        }
                        String str4 = c1020230cej.LJ;
                        JSONObject jSONObject6 = new JSONObject();
                        if (str4 != null && (kVarLJJIIZ = GsonProtectorUtils.parse(new p(), str4).LJIILIIL().LJJIIZ("rit")) != null) {
                            jSONObject6.put("ctr_rit", kVarLJJIIZ.LJIL());
                        }
                        jSONObject6.put("service", "ctr_click");
                        IMonitorDepend iMonitorDependLIZJ = C2214471Bll.LIZJ();
                        if (iMonitorDependLIZJ != null) {
                            iMonitorDependLIZJ.monitorCommonLog("ctr_monitor", jSONObject6);
                        }
                        IAppLogDepend iAppLogDependLIZ3 = C2214471Bll.LIZ();
                        if (iAppLogDependLIZ3 != null) {
                            iAppLogDependLIZ3.onEventV1(applicationContext, c1020230cej.LIZ, null, c1020230cej.LIZIZ, c1020230cej.LIZJ, j, jSONObject2);
                        }
                        unit = Unit.LIZ;
                    } else {
                        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true);
                        if (strLJJ != null) {
                            int iHashCode = strLJJ.hashCode();
                            if (iHashCode != 3707) {
                                if (iHashCode != 3709) {
                                    if (iHashCode == 96673 && strLJJ.equals("all")) {
                                        jSONObject2.put("_ad_staging_flag", "1");
                                        IAppLogDepend iAppLogDependLIZ4 = C2214471Bll.LIZ();
                                        if (iAppLogDependLIZ4 != null) {
                                            iAppLogDependLIZ4.onEventV1(applicationContext, c1020230cej.LIZ, null, c1020230cej.LIZIZ, c1020230cej.LIZJ, j, jSONObject2);
                                        }
                                        jSONObject2.put("_ad_staging_flag", "3");
                                        jSONObject2.put("tag", c1020230cej.LIZ);
                                        jSONObject2.put("value", c1020230cej.LIZJ);
                                        jSONObject2.put("group_id", c1020230cej.LIZLLL);
                                        jSONObject2.put("category", "event_v3");
                                        IAppLogDepend iAppLogDependLIZ5 = C2214471Bll.LIZ();
                                        if (iAppLogDependLIZ5 != null) {
                                            iAppLogDependLIZ5.onEventV3Json(c1020230cej.LIZIZ, jSONObject2);
                                        }
                                    }
                                } else if (strLJJ.equals("v3")) {
                                    jSONObject2.put("tag", c1020230cej.LIZ);
                                    jSONObject2.put("value", c1020230cej.LIZJ);
                                    jSONObject2.put("group_id", c1020230cej.LIZLLL);
                                    jSONObject2.put("category", "event_v3");
                                    IAppLogDepend iAppLogDependLIZ6 = C2214471Bll.LIZ();
                                    if (iAppLogDependLIZ6 != null) {
                                        iAppLogDependLIZ6.onEventV3Json(c1020230cej.LIZIZ, jSONObject2);
                                    }
                                }
                            } else if (strLJJ.equals("v1") && (iAppLogDependLIZ = C2214471Bll.LIZ()) != null) {
                                iAppLogDependLIZ.onEventV1(applicationContext, c1020230cej.LIZ, null, c1020230cej.LIZIZ, c1020230cej.LIZJ, j, jSONObject2);
                            }
                        }
                        unit = Unit.LIZ;
                    }
                }
                C1C7U.LIZIZ("RichLogHelper$InnerAdLog@f195.send$1L");
                return unit;
            }
        };
        IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
        C15O7.LIZIZ(callable, iAppLogDependLIZ != null ? iAppLogDependLIZ.getLogThreadPool() : null, null);
    }

    public final void LIZ(Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    this.LJI.put((String) entry.getKey(), value);
                }
            }
        }
    }

    public final void LIZJ(Object obj) {
        if ("refer".length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJFF.put("refer", obj);
        }
    }

    public final void LIZLLL(Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    this.LJFF.put((String) entry.getKey(), value);
                }
            }
        }
    }

    public final void LIZIZ(Object obj, String str) {
        if (str.length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJI.put(str, obj);
        }
    }

    public C1020230cej(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
