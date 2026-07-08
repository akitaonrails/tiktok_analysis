package X;

import com.bytedance.apm6.cpu.ApmCpuManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7D implements C0V6L {
    public C0V9P LIZ;
    public C0V9K LIZIZ;

    public C0V7D() {
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V9I
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                JSONObject jSONObjectOptJSONObject;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                C0V7D c0v7d = this.LIZ;
                c0v7d.getClass();
                if (jSONObject != null) {
                    try {
                        jSONObjectOptJSONObject = jSONObject.optJSONObject("performance_modules").optJSONObject("cpu");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        jSONObjectOptJSONObject = null;
                    }
                    if (jSONObjectOptJSONObject != null) {
                        c0v7d.LIZ = new C0V9P();
                        boolean z5 = false;
                        if (jSONObjectOptJSONObject.optInt("enable_upload", 0) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c0v7d.LIZ.LIZ = z;
                        if (jSONObjectOptJSONObject.optInt("enable_collect_all_process", 0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c0v7d.LIZ.LIZIZ = z2;
                        long jOptLong = jSONObjectOptJSONObject.optLong("front_collect_interval", 0L);
                        if (jOptLong > 0) {
                            c0v7d.LIZ.LIZJ = jOptLong;
                        }
                        long jOptLong2 = jSONObjectOptJSONObject.optLong("back_collect_interval", 0L);
                        if (jOptLong2 > 0) {
                            c0v7d.LIZ.LIZLLL = jOptLong2;
                        }
                        long jOptLong3 = jSONObjectOptJSONObject.optLong("monitor_interval", 0L);
                        if (jOptLong3 > 0) {
                            c0v7d.LIZ.LJ = jOptLong3;
                        }
                        long jOptLong4 = jSONObjectOptJSONObject.optLong("front_thread_collect_interval", 0L);
                        if (jOptLong4 > 0) {
                            c0v7d.LIZ.LJFF = jOptLong4;
                        }
                        long jOptLong5 = jSONObjectOptJSONObject.optLong("back_thread_collect_interval", 0L);
                        if (jOptLong5 > 0) {
                            c0v7d.LIZ.LJI = jOptLong5;
                        }
                        c0v7d.LIZIZ = new C0V9K();
                        if (jSONObjectOptJSONObject.optInt("exception_switch", 0) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c0v7d.LIZIZ.LIZ = z3;
                        double dOptDouble = jSONObjectOptJSONObject.optDouble("exception_process_back_max_speed", 0.0d);
                        if (dOptDouble > 0.0d) {
                            c0v7d.LIZIZ.LIZJ = dOptDouble;
                        }
                        double dOptDouble2 = jSONObjectOptJSONObject.optDouble("exception_process_fore_max_speed", 0.0d);
                        if (dOptDouble2 > 0.0d) {
                            c0v7d.LIZIZ.LIZLLL = dOptDouble2;
                        }
                        if (jSONObjectOptJSONObject.optInt("main_thread_collect_enabled", 0) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c0v7d.LIZIZ.LIZIZ = z4;
                        if (jSONObjectOptJSONObject.optInt("exception_collect_all_process", 0) == 1) {
                            z5 = true;
                        }
                        c0v7d.LIZIZ.LJFF = z5;
                        double dOptDouble3 = jSONObjectOptJSONObject.optDouble("exception_thread_max_usage", 0.0d);
                        if (dOptDouble3 > 0.0d) {
                            c0v7d.LIZIZ.LJ = dOptDouble3;
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("exception_fore_max_speed_scene");
                        HashMap map = new HashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble(next, 0.0d);
                                if (dOptDouble4 > 0.0d) {
                                    map.put(next, Double.valueOf(dOptDouble4));
                                }
                            }
                        }
                        c0v7d.LIZIZ.LJII = map;
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("exception_back_max_speed_scene");
                        HashMap map2 = new HashMap();
                        if (jSONObjectOptJSONObject3 != null) {
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                double dOptDouble5 = jSONObjectOptJSONObject3.optDouble(next2, 0.0d);
                                if (dOptDouble5 > 0.0d) {
                                    map2.put(next2, Double.valueOf(dOptDouble5));
                                }
                            }
                        }
                        c0v7d.LIZIZ.LJI = map2;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0v7d.LIZ);
                    sbLIZ.append(" ");
                    sbLIZ.append(c0v7d.LIZIZ);
                    C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
                    C0V9C c0v9c = C0V7T.LIZ;
                    C0V9P c0v9p = c0v7d.LIZ;
                    c0v9c.getClass();
                    if (c0v9p != null) {
                        synchronized (C0V9U.class) {
                            C0V9U.LIZJ = true;
                            List<C0V9L> list = C0V9U.LIZIZ;
                            if (!list.isEmpty()) {
                                Iterator<C0V9L> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C0VBB.LIZ(it2.next());
                                }
                                ((LinkedList) C0V9U.LIZIZ).clear();
                            }
                        }
                        if (!ApmCpuManager.isPowerOpt()) {
                            c0v9c.LIZIZ.LJI(c0v9p);
                            if (c0v9p.LIZ) {
                                c0v9c.LIZJ.LJIIIZ(c0v9p);
                            }
                        } else if ((C792400V6o.LJIIIZ() || c0v9p.LIZIZ) && c0v9p.LIZ) {
                            c0v9c.LIZIZ.LJI(c0v9p);
                            c0v9c.LIZJ.LJIIIZ(c0v9p);
                        }
                    }
                    C0V9Y.LIZ.LIZIZ(c0v7d.LIZIZ);
                }
            }
        });
    }
}
