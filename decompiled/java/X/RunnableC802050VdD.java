package X;

import Y.ARunnableS113S0100000_13;
import android.text.TextUtils;
import com.bytedance.crash.monitor.f;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dl3.h;
import im3.b;
import im3.o;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC802050VdD implements Runnable {
    public static final ConcurrentHashMap<f, RunnableC802050VdD> LLJI = new ConcurrentHashMap<>();
    public C0VSJ LL;
    public JSONObject LLILLJJLI;
    public final f LLILZ;
    public volatile boolean LLILZIL;
    public boolean LLILZLL;
    public long LLILLL = 1200;
    public long LLIZ = -1;
    public long LLJ = 60000;
    public List<InterfaceC802080VdG> LLIZLLLIL = new CopyOnWriteArrayList();

    public final File LIZIZ() {
        C0VSJ c0vsj = this.LL;
        if (c0vsj != null) {
            return c0vsj;
        }
        C0VSJ c0vsj2 = new C0VSJ(C0VX9.LJFF(), "configs");
        if (!c0vsj2.exists()) {
            C2112008Pe.LIZJ(c0vsj2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZ.LIZ());
        sbLIZ.append(".config");
        C0VSJ c0vsj3 = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ));
        this.LL = c0vsj3;
        return c0vsj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ConfigManager@ed9c.run");
        try {
            if (!TextUtils.isEmpty(this.LLILZ.LIZ()) && !TextUtils.isEmpty(this.LLILZ.LIZLLL(""))) {
                C0VXF.removeCallbacks(this);
                LIZJ();
            } else if (this.LLILZ instanceof C802790VeP) {
                C0VXF.postDelayed(this, 200L);
            } else {
                C0VXF.postDelayed(this, 500L);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConfigManager@ed9c.run");
    }

    public void LIZJ() {
        LJIIJ();
        if (C802270VdZ.LJ()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
            long j = this.LLILLL * 1000;
            if (jCurrentTimeMillis > j || jCurrentTimeMillis < 0) {
                LJ();
                return;
            } else {
                C0VXF.postDelayed(new Runnable() { // from class: X.0VdE
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ConfigManager@ed9c.initConfig$1");
                        try {
                            this.LL.LJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ConfigManager@ed9c.initConfig$1");
                    }
                }, j - jCurrentTimeMillis);
                return;
            }
        }
        FileObserverC802070VdF fileObserverC802070VdF = new FileObserverC802070VdF(this, LIZIZ());
        if (!fileObserverC802070VdF.LIZ.exists()) {
            try {
                fileObserverC802070VdF.LIZ.createNewFile();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        fileObserverC802070VdF.startWatching();
    }

    public final void LJ() {
        long jMin;
        boolean zLJI = MethodIDManager.LJI(137840);
        if (!C802880VeY.LIZ()) {
            C0VXF.postDelayed(new ARunnableS113S0100000_13((Object) this, 144), 300000L);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (LJII()) {
            jMin = this.LLILLL;
        } else {
            jMin = Math.min(this.LLJ * 2, 600L);
            this.LLJ = jMin;
        }
        if (C802300Vdc.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("queryConfigFromRemote:");
            sbLIZ.append(jMin);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0VXF.postDelayed(new ARunnableS113S0100000_13((Object) this, 145), jMin * 1000);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final boolean LJII() {
        boolean zLJI = MethodIDManager.LJI(137787);
        try {
            String strLJ = o.LJ(h.LJIIJJI.LJIIIZ, this.LLILZ);
            if (C802300Vdc.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("queryFromNet:");
                sbLIZ.append(strLJ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            boolean zLJI2 = MethodIDManager.LJI(137788);
            byte[] bArr = b.LIZIZ(strLJ, null, "gzip", "GET", false, false).LIZLLL;
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (bArr == null || bArr.length <= 0) {
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return false;
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(new String(bArr)).optJSONObject("ret");
            if (jSONObjectOptJSONObject != null) {
                boolean zLJIIIIZZ = LJIIIIZZ(jSONObjectOptJSONObject);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return zLJIIIIZZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZJ(th);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void LJIIJ() {
        ?? r1;
        ?? LIZIZ = LIZIZ();
        try {
            LIZIZ = C08SE.LIZJ(LIZIZ);
            r1 = LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ.delete();
            r1 = 0;
        }
        if (TextUtils.isEmpty(r1)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) r1);
            this.LLIZ = jSONObject.optLong("monitor_configure_refresh_time");
            if (C802300Vdc.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateFromLocal:");
                sbLIZ.append(this.LLILZ.LIZ());
                sbLIZ.append(" ");
                sbLIZ.append(this.LLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            LJIIIZ(jSONObject);
            LIZLLL(jSONObject);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public RunnableC802050VdD(f fVar) {
        this.LLILZ = fVar;
        LLJI.put(fVar, this);
    }

    private void LIZLLL(JSONObject jSONObject) {
        this.LLILZLL = true;
        List<InterfaceC802080VdG> list = this.LLIZLLLIL;
        if (list != null) {
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC802080VdG) it2.next()).LIZ(jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    private void LJIIIZ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (C0VJO.LJI(jSONObject)) {
            return;
        }
        this.LLILLJJLI = jSONObject;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("general")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("slardar_api_settings")) != null) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("fetch_setting");
            if (jSONObjectOptJSONObject3 != null) {
                this.LLILLL = jSONObjectOptJSONObject3.optLong("fetch_setting_interval", 1200L);
            }
            if (this.LLILLL < 600) {
                this.LLILLL = 600L;
            }
            if (C802300Vdc.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCurrentConfig:");
                sbLIZ.append(this.LLILLL);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final boolean LJIIIIZZ(JSONObject jSONObject) {
        try {
            if (C802300Vdc.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveConfig :");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LLIZ = jCurrentTimeMillis;
            jSONObject.put("monitor_configure_refresh_time", jCurrentTimeMillis);
            C08SE.LJIIIZ(LIZIZ(), jSONObject);
            LJIIIZ(jSONObject);
            LIZLLL(jSONObject);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
