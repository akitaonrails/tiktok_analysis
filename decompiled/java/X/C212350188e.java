package X;

import android.os.Bundle;
import com.benchmark.runtime.nativePort.BXStrategyManagePort;
import com.benchmark.strategy.nativePort.ByteBenchStrategyPort;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.188e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212350188e {
    public static C212350188e LIZJ;
    public final BXStrategyManagePort LIZ = new BXStrategyManagePort();
    public final ConcurrentHashMap<Integer, C09GA> LIZIZ = new ConcurrentHashMap<>();

    public static C212350188e LIZJ() {
        if (LIZJ == null) {
            synchronized (C212350188e.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C212350188e();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final C09GA LIZ() {
        if (C21309718aN.LJIIZILJ.LIZIZ()) {
            return LIZIZ(C21309718aN.LJIIZILJ.LIZJ);
        }
        return null;
    }

    public final synchronized C09GA LIZIZ(final int i) {
        C09GA c09ga = null;
        if (!C21309718aN.LJIIZILJ.LIZIZ()) {
            return null;
        }
        if (i <= 0) {
            i = C21309718aN.LJIIZILJ.LIZJ;
        }
        if (this.LIZIZ.containsKey(Integer.valueOf(i))) {
            return this.LIZIZ.get(Integer.valueOf(i));
        }
        synchronized (C212350188e.class) {
            try {
                if (!this.LIZIZ.containsKey(Integer.valueOf(i))) {
                    if (C21309718aN.LJIIZILJ.LIZIZ()) {
                        c09ga = new C09GA(i) { // from class: X.18aD
                            public C21308918aF LIZ;
                            public final ConcurrentHashMap<String, InterfaceC21142817oY> LIZIZ = new ConcurrentHashMap<>();
                            public volatile boolean LIZJ = false;
                            public final int LIZLLL;
                            public final ByteBenchStrategyPort LJ;

                            @Override // X.C09GA
                            public final int LIZLLL() {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ("video_size_index")) != null) {
                                    return ((Integer) objLIZ).intValue();
                                }
                                if (C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return this.LJ.obtainStaticIntStrategy("video_size_index", 0);
                                }
                                return 0;
                            }

                            @Override // X.C09GA
                            public final String LJI() {
                                Object objLIZ;
                                return (!C21309718aN.LJIIZILJ.LJIIIZ || (objLIZ = C21310218aS.LIZ("t_record_output_size")) == null) ? !C21309718aN.LJIIZILJ.LIZIZ() ? "" : this.LJ.obtainStaticStrStrategy("t_record_output_size", "") : (String) objLIZ;
                            }

                            @Override // X.C09GA
                            public final int getRepoName() {
                                int i2 = this.LIZLLL;
                                if (i2 > 0) {
                                    return i2;
                                }
                                C21309718aN c21309718aN = C21309718aN.LJIIZILJ;
                                if (c21309718aN != null) {
                                    return c21309718aN.LIZJ;
                                }
                                return 0;
                            }

                            {
                                new Gson();
                                this.LIZLLL = i;
                                this.LJ = new ByteBenchStrategyPort(i);
                            }

                            @Override // X.C09GA
                            public final boolean LIZ(String str) {
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return false;
                                }
                                return this.LJ.contains(str);
                            }

                            @Override // X.C09GA
                            public final int LJ(C21308918aF c21308918aF) {
                                boolean zLJI = MethodIDManager.LJI(202547);
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                        return -105;
                                    }
                                    return -105;
                                }
                                if (this.LIZJ) {
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                    }
                                    return 0;
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                this.LIZ = c21308918aF;
                                this.LIZJ = true;
                                this.LJ.init(this.LIZ);
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("init cost: ");
                                sbLIZ.append(jCurrentTimeMillis2);
                                sbLIZ.append("  the app id is: ");
                                sbLIZ.append(this.LIZLLL);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C806930Vl5.LIZJ("ByteBenchStrategy");
                                if (C21309218aI.LIZ("bytebench_strategy_init_v2")) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("cost_time", jCurrentTimeMillis2);
                                        jSONObject.put("strategy_origin_id", this.LIZLLL);
                                        C21309418aK.LIZ("bytebench_strategy_init_v2", jSONObject);
                                    } catch (JSONException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } else {
                                    C806930Vl5.LIZ("AppLogOpt");
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                return 0;
                            }

                            @Override // X.C09GA
                            public final <T extends InterfaceC21142817oY> T LJII(Class<T> cls) {
                                T t;
                                InterfaceC21142817oY interfaceC21142817oY;
                                long jCurrentTimeMillis;
                                String strLIZIZ;
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return null;
                                }
                                String name = cls.getName();
                                T t2 = (T) this.LIZIZ.get(name);
                                if (t2 == null) {
                                    synchronized (cls.getName()) {
                                        try {
                                            t = (T) this.LIZIZ.get(name);
                                            new JSONObject();
                                            if (t == null) {
                                                try {
                                                    jCurrentTimeMillis = System.currentTimeMillis();
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(cls.getName());
                                                    sbLIZ.append("$$Imp");
                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("obtain class name: ");
                                                    sbLIZ2.append(strLIZIZ);
                                                    C2188811AlT.LIZIZ(sbLIZ2);
                                                    C806930Vl5.LIZ("ByteBenchStrategy");
                                                    Constructor<?> constructor = Class.forName(strLIZIZ, true, cls.getClassLoader()).getConstructor(new Class[0]);
                                                    constructor.setAccessible(true);
                                                    interfaceC21142817oY = (InterfaceC21142817oY) constructor.newInstance(new Object[0]);
                                                } catch (Exception e) {
                                                    e = e;
                                                    interfaceC21142817oY = t;
                                                }
                                                try {
                                                    interfaceC21142817oY.setByteBenchStrategy(this);
                                                    this.LIZIZ.put(strLIZIZ, interfaceC21142817oY);
                                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("create IBXStrategy instance cost: ");
                                                    sbLIZ3.append(jCurrentTimeMillis2);
                                                    C2188811AlT.LIZIZ(sbLIZ3);
                                                    C806930Vl5.LIZ("ByteBenchStrategy");
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    e.getMessage();
                                                }
                                                t = (T) interfaceC21142817oY;
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return t;
                                }
                                return t2;
                            }

                            @Override // X.C09GA
                            public final Boolean LJIILL(HashMap<String, String> map) {
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return Boolean.FALSE;
                                }
                                this.LJ.getDeviceFeatureForServer(map);
                                return Boolean.TRUE;
                            }

                            @Override // X.C09GA
                            public final float LIZIZ(float f, String str) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Float) objLIZ).floatValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return f;
                                }
                                return this.LJ.obtainFloatStrategy(str, f, "{}", "", false);
                            }

                            @Override // X.C09GA
                            public final float LIZJ(String str, float f) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Float) objLIZ).floatValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return f;
                                }
                                return this.LJ.obtainFloatStrategy(str, f, "{}", "", true);
                            }

                            @Override // X.C09GA
                            public final boolean LJFF(String str, boolean z) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Boolean) objLIZ).booleanValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return z;
                                }
                                return this.LJ.obtainBoolStrategy(str, z, "{}", "", false);
                            }

                            @Override // X.C09GA
                            public final String LJIIIIZZ(String str, String str2) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return (String) objLIZ;
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return str2;
                                }
                                return this.LJ.obtainStrStrategy(str, str2, "{}", "", false);
                            }

                            @Override // X.C09GA
                            public final String LJIIIZ(String str, String str2) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return (String) objLIZ;
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return str2;
                                }
                                return this.LJ.obtainStrStrategy(str, str2, "{}", "", true);
                            }

                            @Override // X.C09GA
                            public final int LJIIJ(String str, int i2) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Integer) objLIZ).intValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return i2;
                                }
                                return this.LJ.obtainIntStrategy(str, i2, "{}", "", true);
                            }

                            @Override // X.C09GA
                            public final boolean LJIIJJI(String str, boolean z) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Boolean) objLIZ).booleanValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return z;
                                }
                                return this.LJ.obtainBoolStrategy(str, z, "{}", "", true);
                            }

                            @Override // X.C09GA
                            public final int LJIIL(int i2, String str) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Integer) objLIZ).intValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return i2;
                                }
                                return this.LJ.obtainIntStrategy(str, i2, "{}", "", false);
                            }

                            @Override // X.C09GA
                            public final long LJIILIIL(long j, String str) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Long) objLIZ).longValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return j;
                                }
                                return this.LJ.obtainLongStrategy(str, j, "{}", "", false);
                            }

                            @Override // X.C09GA
                            public final Boolean LJIILJJIL(C1300610jwx[] c1300610jwxArr, Bundle bundle) {
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return Boolean.FALSE;
                                }
                                C21308818aE.LIZJ.LIZ.getDeviceFeature(C21309718aN.LJIIZILJ.LIZJ, c1300610jwxArr, bundle);
                                return Boolean.TRUE;
                            }

                            @Override // X.C09GA
                            public final long LJIILLIIL(String str, long j) {
                                Object objLIZ;
                                if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
                                    return ((Long) objLIZ).longValue();
                                }
                                if (!C21309718aN.LJIIZILJ.LIZIZ()) {
                                    return j;
                                }
                                return this.LJ.obtainLongStrategy(str, j, "{}", "", true);
                            }
                        };
                        this.LIZ.LIZ(i);
                        this.LIZIZ.put(Integer.valueOf(i), c09ga);
                    }
                } else {
                    c09ga = this.LIZIZ.get(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c09ga;
    }
}
