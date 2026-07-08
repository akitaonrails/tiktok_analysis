package X;

import Y.ARunnableS82S0200000_13;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import dl3.h;
import im3.b;
import im3.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import jl3.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC801900Vcy implements Runnable {
    public static int LLILZIL = 100;
    public static int LLILZLL = 30;
    public static boolean LLIZ;
    public static boolean LLIZLLLIL;
    public static final CopyOnWriteArrayList<RunnableC801900Vcy> LLJ = new CopyOnWriteArrayList<>();
    public static final HashSet<String> LLJI = new HashSet<>();
    public C801910Vcz LL;
    public f LLILZ;
    public final ConcurrentLinkedQueue<g> LLILLL = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<g> LLILLJJLI = new ConcurrentLinkedQueue<>();

    public final void LIZ() {
        while (!this.LLILLJJLI.isEmpty()) {
            g gVarPoll = this.LLILLJJLI.poll();
            if (LIZJ(gVarPoll)) {
                this.LLILLL.add(gVarPoll);
            }
        }
    }

    public final void LJIIL() {
        Map<String, String> mapLJI;
        if (this.LLILLL.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (C802410Vdn.LJIJI) {
                mapLJI = null;
            } else {
                mapLJI = this.LLILZ.LIZJ.LJI();
                Map<String, String> map = C802400Vdm.LIZJ;
                if (map != null) {
                    HashMap map2 = new HashMap();
                    map2.putAll(mapLJI);
                    map2.putAll(map);
                    mapLJI = map2;
                }
            }
            for (int i = 0; !this.LLILLL.isEmpty() && i <= LLILZLL; i++) {
                g gVarPoll = this.LLILLL.poll();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("upload:message:");
                sbLIZ.append(gVarPoll.LIZJ);
                sbLIZ.append(" log_type:");
                sbLIZ.append(gVarPoll.LJFF);
                C2188811AlT.LIZIZ(sbLIZ);
                jSONArray.put(gVarPoll.LJFF(this.LLILZ, mapLJI));
            }
            jSONObject.put("data", jSONArray);
            int iMyPid = Process.myPid();
            JSONObject jSONObject2 = Header.LIZIZ(this.LLILZ, System.currentTimeMillis(), CrashType.ENSURE, iMyPid).LIZ;
            jSONObject.put("header", jSONObject2);
            if (LLIZLLLIL) {
                return;
            }
            String strLIZLLL = o.LIZLLL(h.LJIIJJI.LIZLLL, jSONObject2);
            boolean zLJI = b.LJI(strLIZLLL, jSONObject);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isSuccess:");
            sbLIZ2.append(zLJI);
            sbLIZ2.append("  upload:");
            sbLIZ2.append(strLIZLLL);
            C2188811AlT.LIZIZ(sbLIZ2);
            C0VXU.LIZIZ().LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EnsureDeliverer@171f.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EnsureDeliverer@171f.run");
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run:");
        C0VX9.LJ();
        sbLIZ.append(C802270VdZ.LIZ());
        sbLIZ.append(" ");
        sbLIZ.append(this.LLILZ.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        C802300Vdc.LIZ();
        LIZ();
        LJIIL();
        C0VXF.postDelayed(this, 30000L);
    }

    public RunnableC801900Vcy(f fVar) {
        this.LLILZ = fVar;
        LLJ.add(this);
    }

    public final boolean LIZJ(g gVar) {
        boolean z;
        String strLIZ;
        boolean zLIZ;
        boolean z2;
        JSONObject jSONObject;
        if (this.LL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isCanReport:config = null and event type");
            sbLIZ.append(gVar.LJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        String str = gVar.LJFF;
        boolean z3 = true;
        if (LLIZ) {
            z = !LLJI.contains(str);
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("the log_type = ");
            sbLIZ2.append(gVar.LJFF);
            sbLIZ2.append(" and message = ");
            sbLIZ2.append(gVar.LIZJ);
            sbLIZ2.append("is discard because the stop upload");
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
        if (!this.LL.LIZIZ(gVar.LJFF, gVar.LIZJ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("the log_type = ");
            sbLIZ3.append(gVar.LJFF);
            sbLIZ3.append(" and message = ");
            sbLIZ3.append(gVar.LIZJ);
            sbLIZ3.append("is discard because the config");
            sbLIZ3.append(this.LL.LIZ(gVar.LJFF));
            sbLIZ3.append(" ");
            C801910Vcz c801910Vcz = this.LL;
            String str2 = gVar.LIZJ;
            if (!c801910Vcz.LIZLLL && (jSONObject = c801910Vcz.LIZJ) != null) {
                if (Math.random() > jSONObject.optDouble(str2, 1.0d)) {
                    z3 = false;
                }
            }
            sbLIZ3.append(z3);
            C2188811AlT.LIZIZ(sbLIZ3);
            return false;
        }
        if (TextUtils.isEmpty(gVar.LIZJ)) {
            strLIZ = null;
        } else {
            strLIZ = C820840WHy.LIZ(gVar.LIZJ);
        }
        String strLIZLLL = gVar.LIZLLL();
        C0VXU c0vxuLIZIZ = C0VXU.LIZIZ();
        boolean zLIZ2 = c0vxuLIZIZ.LIZ(C0VXU.LJFF, strLIZLLL);
        if (strLIZ != null) {
            zLIZ = c0vxuLIZIZ.LIZ(C0VXU.LJI, strLIZ);
        } else {
            zLIZ = false;
        }
        boolean zLIZ3 = c0vxuLIZIZ.LIZ(C0VXU.LJ, "ensure_all");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("checkEnsureLimit:");
        sbLIZ4.append(strLIZLLL);
        sbLIZ4.append(" ");
        sbLIZ4.append(C0VXU.LJFF);
        sbLIZ4.append("=");
        sbLIZ4.append(zLIZ2);
        sbLIZ4.append(" ");
        sbLIZ4.append(strLIZ);
        sbLIZ4.append(" ");
        sbLIZ4.append(C0VXU.LJI);
        sbLIZ4.append("=");
        sbLIZ4.append(zLIZ);
        sbLIZ4.append(" totalExceed=");
        sbLIZ4.append(zLIZ3);
        C2188811AlT.LIZIZ(sbLIZ4);
        if (!zLIZ2 && !zLIZ && !zLIZ3) {
            z2 = false;
        } else {
            z2 = true;
            if (!C0VXU.LIZLLL) {
                C0VXU.LIZLLL = true;
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("the message ");
        sbLIZ5.append(gVar.LIZJ);
        sbLIZ5.append("  is exceed limit:");
        sbLIZ5.append(z2);
        C2188811AlT.LIZIZ(sbLIZ5);
        if (z2) {
            return false;
        }
        C0VXU c0vxuLIZIZ2 = C0VXU.LIZIZ();
        if (strLIZLLL != null) {
            c0vxuLIZIZ2.LIZJ(strLIZLLL);
        }
        if (strLIZ != null) {
            c0vxuLIZIZ2.LIZJ(strLIZ);
        }
        c0vxuLIZIZ2.LIZJ("ensure_all");
        return true;
    }

    public final void LJFF(int i) {
        if (LIZLLL("core_exception_monitor", null)) {
            return;
        }
        Thread threadU3 = C786410Ut5.u3();
        LJIIIZ(new g(null, ThreadMethodProxy.getStackTrace(threadU3), i, null, null, threadU3.getName(), "EnsureNotReachHere", "core_exception_monitor"));
    }

    public final void LJIIIZ(g gVar) {
        if (this.LL == null) {
            if (this.LLILLJJLI.size() >= LLILZIL) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache:");
            sbLIZ.append(gVar);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLJJLI.add(gVar);
            return;
        }
        C0VXF.post(new ARunnableS82S0200000_13(this, gVar, 63));
    }

    public final boolean LIZLLL(String str, String str2) {
        if (LLIZ && (!LLJI.contains(str))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isStopUpload：the logType = ");
            sbLIZ.append(str);
            sbLIZ.append(" message:");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            return true;
        }
        if (this.LL == null && this.LLILLJJLI.size() >= LLILZIL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("the logType = ");
            sbLIZ2.append(str);
            sbLIZ2.append("is discarded the cache exceed 100");
            C2188811AlT.LIZIZ(sbLIZ2);
            return true;
        }
        if (LLILZLL <= 0) {
            return true;
        }
        if (C0VXU.LJIIIIZZ && C0VXU.LIZIZ().LIZ(C0VXU.LJ, "ensure_all")) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("the logType = ");
            sbLIZ3.append(str);
            sbLIZ3.append("is discarded beacuse the report is exceed 100");
            C2188811AlT.LIZIZ(sbLIZ3);
            return true;
        }
        if (this.LL == null && this.LLILLJJLI.size() >= LLILZIL) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("the logType = ");
            sbLIZ4.append(str);
            sbLIZ4.append("is discarded the cache exceed 100");
            C2188811AlT.LIZIZ(sbLIZ4);
            return true;
        }
        if (this.LL == null) {
            return false;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("the logType = ");
        sbLIZ5.append(str);
        sbLIZ5.append("message = ");
        sbLIZ5.append(str2);
        sbLIZ5.append(" isSample = ");
        sbLIZ5.append(this.LL.LIZIZ(str, str2));
        C2188811AlT.LIZIZ(sbLIZ5);
        return !this.LL.LIZIZ(str, str2);
    }

    public final void LJII(int i, String str) {
        if (LIZLLL("core_exception_monitor", str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportMessage：isDrop:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Thread threadU3 = C786410Ut5.u3();
        LJIIIZ(new g(null, ThreadMethodProxy.getStackTrace(threadU3), i, str, null, threadU3.getName(), "EnsureNotReachHere", "core_exception_monitor"));
    }

    public final void LJIIJ(String str, Throwable th) {
        LJIIJJI(str, th, "core_exception_monitor", null);
    }

    public final void LJIIJJI(String str, Throwable th, String str2, Map map) {
        LJ(th, str, map, C786410Ut5.u3().getName(), "EnsureNotReachHere", str2);
    }

    public final void LJ(Throwable th, String str, Map map, String str2, String str3, String str4) {
        String str5 = str4;
        if (TextUtils.isEmpty(str5)) {
            str5 = "core_exception_monitor";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportJavaEnsure:message:");
        sbLIZ.append(str);
        sbLIZ.append(" ");
        sbLIZ.append(C802270VdZ.LIZJ());
        C2188811AlT.LIZIZ(sbLIZ);
        C802300Vdc.LIZ();
        if (LIZLLL(str5, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportJavaEnsure：isDrop:");
            sbLIZ2.append(str5);
            sbLIZ2.append(" ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        LJIIIZ(new g(th, null, 0, str, map, str2, str3, str5));
    }

    public final void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, Map map) {
        String str6 = str5;
        if (TextUtils.isEmpty(str6)) {
            str6 = "core_exception_monitor";
        }
        if (LIZLLL(str6, str4)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportNativeEnsure：isDrop:");
            sbLIZ.append(str6);
            sbLIZ.append(" ");
            sbLIZ.append(str4);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        LJIIIZ(new g(Process.myPid(), str2, str, str4, str3, str6, map));
    }
}
