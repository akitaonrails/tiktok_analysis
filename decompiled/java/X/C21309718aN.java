package X;

import android.content.Context;
import com.benchmark.bytemonitor.BatteryMonitor;
import com.benchmark.bytemonitor.nativePort.ByteMonitorPort;
import com.benchmark.db.BXDBHelper;
import com.benchmark.network.BXNetWorkController;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.benchmark.runtime.nativePort.ByteBenchContextPort;
import com.benchmark.strategy.BXPitayaHandler;
import com.benchmark.strategy.BXVmsdkHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18aN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21309718aN {
    public static volatile C21309718aN LJIIZILJ;
    public Context LIZ;
    public String LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public String LJI;
    public String LJII;
    public Map<String, String> LJIIIIZZ;
    public boolean LJIIIZ = true;
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final ByteBenchContextPort LJIIJJI = new ByteBenchContextPort();
    public boolean LJIIL;
    public byte LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public BXDBHelper LJIILLIIL;

    static {
        C2079408Cq.LIZ();
        if (!C2079408Cq.LIZIZ) {
            C2079408Cq.LIZ();
        }
        LJIIZILJ = new C21309718aN();
    }

    public C21309718aN() {
        new AtomicBoolean(false);
        this.LJIIL = true;
        this.LJIILIIL = (byte) 7;
    }

    public final boolean LIZIZ() {
        if (!C21310118aR.LIZ()) {
            return false;
        }
        if (this.LJIIJ.get()) {
            return true;
        }
        synchronized (this) {
            try {
                if (!this.LJIIJ.get()) {
                    C21309818aO c21309818aO = C21310118aR.LIZIZ;
                    if (c21309818aO == null) {
                        return false;
                    }
                    LIZ(c21309818aO);
                    this.LJIIJ.set(true);
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(C21309818aO c21309818aO) throws Throwable {
        this.LIZ = c21309818aO.LIZ;
        this.LIZIZ = c21309818aO.LIZJ;
        this.LIZJ = c21309818aO.LIZLLL;
        this.LIZLLL = c21309818aO.LJ;
        this.LJ = c21309818aO.LJFF;
        this.LJFF = c21309818aO.LJI;
        this.LJI = c21309818aO.LJII;
        this.LJII = c21309818aO.LJIIIIZZ;
        this.LJIILIIL = c21309818aO.LJIIIZ;
        this.LJIIL = c21309818aO.LJIIJ;
        this.LJIILJJIL = c21309818aO.LJIIJJI;
        this.LJIILL = c21309818aO.LIZIZ;
        this.LJIIIIZZ = c21309818aO.LJIIL;
        this.LJIIIZ = c21309818aO.LJIILIIL;
        this.LJIIJJI.LIZ(this);
        KevaBuilder.getInstance().setContext(this.LIZ);
        Keva.forceInit();
        C21309618aM c21309618aMLIZIZ = C21309618aM.LIZIZ();
        String str = this.LJIILL;
        c21309618aMLIZIZ.getClass();
        c21309618aMLIZIZ.LIZ = C1515120pWw.LJIILIIL(str);
        C1495510p1J c1495510p1J = new C1495510p1J();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1495510p1J.connectTimeout(60000L, timeUnit);
        c1495510p1J.readTimeout(60000L, timeUnit);
        c1495510p1J.retryOnConnectionFailure(true);
        c1495510p1J.addNetworkInterceptor(new OkHttp3SecurityFactorInterceptor());
        c1495510p1J.protocols(Collections.singletonList(EnumC847200XLi.HTTP_1_1));
        C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEgA/UcnUWFYzTlyKY6NuLGjSH8BbjO6z+kPQgeOo6FwrPg==", null));
        BXVmsdkHandler.LIZ();
        C806930Vl5.LIZLLL("ByteBench", this.LJIILIIL);
        LogcatInvoker.LIZ(this.LJIILIIL);
        BXNetWorkController.init();
        ApplogUtilsInvoker.Init();
        Context context = this.LIZ;
        if (C21310418aU.LIZ == null) {
            synchronized (C21310418aU.class) {
                try {
                    if (C21310418aU.LIZ == null) {
                        C21310418aU.LIZ = new BatteryMonitor(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        BatteryMonitor batteryMonitor = C21310418aU.LIZ;
        if (batteryMonitor != null) {
            ByteMonitorPort.LIZ(batteryMonitor);
        }
        BXPitayaHandler.InitPitayaHandler();
        C2341709Fn.LIZ = C786410Ut5.h4();
        C2341709Fn.LIZIZ = new HashSet<>();
        C2341709Fn.LIZ.execute(new Runnable() { // from class: X.09Fm
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ByteBenchFeatureCenter@ab20.init$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ByteBenchFeatureCenter@ab20.init$1");
            }

            public static void LIZ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bytebench_");
                sbLIZ.append(C21309718aN.LJIIZILJ.LIZJ);
                String string = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getString("LocalAggregationProtocol", "");
                if (string == null || string.isEmpty()) {
                    C806930Vl5.LIZIZ("ByteBenchFeatureCenter");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        JSONArray jSONArrayOptJSONArray = JSONObjectProtectorUtils.getJSONObject(jSONObject, itKeys.next()).optJSONArray("need_event_list");
                        if (jSONArrayOptJSONArray != null) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                String strOptString = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i).optString("origin_event");
                                if (!strOptString.isEmpty()) {
                                    C2341709Fn.LIZIZ.add(strOptString);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("need event: ");
                                    sbLIZ2.append(strOptString);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    C806930Vl5.LIZ("ByteBenchFeatureCenter");
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        new BPEAThread(new Runnable() { // from class: X.0Vl4
            public final void LIZ() {
                C21309718aN c21309718aN = this.LL;
                if (c21309718aN.LJIIL) {
                    try {
                        c21309718aN.LJIILLIIL = new BXDBHelper(this.LL.LIZ);
                        this.LL.LJIILLIIL.getWritableDatabase();
                        BXDBHelper.setHander(this.LL.LJIILLIIL);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        BXDBHelper.setHander(null);
                        C806930Vl5.LIZIZ("ByteBench");
                    }
                }
                this.LL.LJIIJJI.LIZIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ByteBenchContext@cf82.initAllModules$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ByteBenchContext@cf82.initAllModules$1");
            }
        }).start();
        C806930Vl5.LIZJ("ByteBench");
    }
}
