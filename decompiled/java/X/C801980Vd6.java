package X;

import com.bytedance.crash.monitor.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801980Vd6 implements InterfaceC802080VdG {
    public final f LIZ;
    public C1173804iW LIZIZ;
    public C801910Vcz LIZJ;
    public final RunnableC802050VdD LIZLLL;

    public RunnableC802050VdD LIZIZ() {
        return new RunnableC802050VdD(this.LIZ);
    }

    public final void LIZJ() {
        RunnableC802050VdD runnableC802050VdD = this.LIZLLL;
        synchronized (runnableC802050VdD) {
            if (runnableC802050VdD.LLILZIL) {
                return;
            }
            runnableC802050VdD.LLILZIL = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init：");
            sbLIZ.append(runnableC802050VdD.LLILZ.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            C0VXF.post(runnableC802050VdD);
        }
    }

    public C801980Vd6(f fVar) {
        this.LIZ = fVar;
        RunnableC802050VdD runnableC802050VdDLIZIZ = LIZIZ();
        this.LIZLLL = runnableC802050VdDLIZIZ;
        if (runnableC802050VdDLIZIZ.LLIZLLLIL == null) {
            runnableC802050VdDLIZIZ.LLIZLLLIL = new CopyOnWriteArrayList();
        }
        if (!((CopyOnWriteArrayList) runnableC802050VdDLIZIZ.LLIZLLLIL).contains(this)) {
            ((CopyOnWriteArrayList) runnableC802050VdDLIZIZ.LLIZLLLIL).add(this);
        }
        if (runnableC802050VdDLIZIZ.LLILZLL) {
            LIZ(runnableC802050VdDLIZIZ.LLILLJJLI);
        }
    }

    @Override // X.InterfaceC802080VdG
    public void LIZ(JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigChanged:");
        sbLIZ.append(this.LIZ.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        C802300Vdc.LIZ();
        if (jSONObject == null) {
            return;
        }
        LIZLLL(jSONObject);
        LJ(jSONObject);
        final RunnableC801900Vcy runnableC801900VcyLJ = this.LIZ.LJ();
        C801910Vcz c801910Vcz = this.LIZJ;
        runnableC801900VcyLJ.getClass();
        if (c801910Vcz != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateConfig :");
            sbLIZ2.append(runnableC801900VcyLJ.LLILZ.LIZ());
            sbLIZ2.append(" :");
            sbLIZ2.append(c801910Vcz);
            C2188811AlT.LIZIZ(sbLIZ2);
            runnableC801900VcyLJ.LL = c801910Vcz;
            C0VXF.removeCallbacks(runnableC801900VcyLJ);
            C0VXF.post(new Runnable() { // from class: X.0Vd0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EnsureDeliverer@171f.updateConfig$1");
                    try {
                        RunnableC801900Vcy runnableC801900Vcy = runnableC801900VcyLJ;
                        runnableC801900Vcy.LIZ();
                        if (runnableC801900Vcy.LLILLL.size() >= RunnableC801900Vcy.LLILZLL) {
                            runnableC801900Vcy.LJIIL();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EnsureDeliverer@171f.updateConfig$1");
                }
            });
            C0VXF.postDelayed(runnableC801900VcyLJ, 30000L);
        }
        f fVar = this.LIZ;
        if (fVar.LIZ == null) {
            synchronized (fVar) {
                try {
                    if (fVar.LIZ == null) {
                        fVar.LIZ = new C801970Vd5(fVar);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C801970Vd5 c801970Vd5 = fVar.LIZ;
        C1173804iW c1173804iW = this.LIZIZ;
        if (c1173804iW == null) {
            c801970Vd5.getClass();
            return;
        }
        while (!c801970Vd5.LIZJ.isEmpty()) {
            C0VXT c0vxtPoll = c801970Vd5.LIZJ.poll();
            C801970Vd5.LJII.decrementAndGet();
            if (c1173804iW.LIZ(c0vxtPoll.LIZJ)) {
                c801970Vd5.LIZIZ.add(c0vxtPoll);
                C801970Vd5.LJI.addAndGet(1);
            }
        }
        if (!C801970Vd5.LJIIIIZZ) {
            RunnableC801960Vd4 runnableC801960Vd4 = RunnableC801960Vd4.LLILLJJLI;
            if (!runnableC801960Vd4.LL) {
                runnableC801960Vd4.LL = true;
                C801970Vd5.LJIIIIZZ = true;
                C0VXF.removeCallbacks(runnableC801960Vd4);
                C0VXF.postDelayed(runnableC801960Vd4, 30000L);
            }
        }
        c801970Vd5.LIZ = c1173804iW;
    }

    public void LIZLLL(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (jSONObject == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("allow_log_type");
        } else {
            jSONObjectOptJSONObject = null;
        }
        boolean z = true;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.optInt(next) == 1) {
                    hashSet.add(next);
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("exception_modules");
        boolean z2 = false;
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("exception")) != null) {
            if (jSONObjectOptJSONObject2.optInt("enable_upload") != 1) {
                z = false;
            }
            jSONObject2 = jSONObjectOptJSONObject2.optJSONObject("metric_sampling");
            z2 = z;
        }
        this.LIZJ = new C801910Vcz(hashSet, jSONObject2, z2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseEnsureConfig:");
        sbLIZ.append(this.LIZ.LIZLLL);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C802300Vdc.LIZ();
    }

    public void LJ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("custom_event_settings");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("allow_service_name")) != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.optInt(next) == 1) {
                    hashSet.add(next);
                }
            }
        }
        this.LIZIZ = new C1173804iW(hashSet);
    }
}
