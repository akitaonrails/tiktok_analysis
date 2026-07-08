package X;

import android.os.Process;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.lynx.hybrid.service.ISSPService;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ptu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529360ptu {
    public static C1529370ptv LIZIZ;
    public static volatile Function0<Unit> LJ;
    public static volatile Function0<Unit> LJII;
    public static final Integer LJIIIZ;
    public static volatile Integer LJIIJ;
    public static volatile Integer LJIIJJI;
    public static final C1529360ptu LIZ = new C1529360ptu();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    public static void LIZIZ() {
        LIZIZ = null;
        LJIIIIZZ.set(false);
        LJ = null;
        LIZJ.set(false);
        LJFF.set(false);
        LJII = null;
        LJI.set(false);
    }

    public final synchronized void LIZ() {
        C1529370ptv c1529370ptv;
        C1529410ptz c1529410ptz;
        C1529410ptz c1529410ptz2;
        C1529510pu9 c1529510pu9;
        C1529470pu5 c1529470pu5;
        C1533560q0g c1533560q0g;
        InterfaceC1529430pu1 interfaceC1529430pu1;
        InterfaceC1529450pu3 interfaceC1529450pu3;
        InterfaceC1529480pu6 interfaceC1529480pu6;
        if (!LJIIIIZZ.compareAndSet(false, true)) {
            JSONArray jSONArray = C1533710q0v.LIZ;
            if (C1533710q0v.LIZIZ(null, false) == null) {
                C1491570oux.LJIJI(C1491570oux.LIZ, "COMMON", "_illegal_resource_state", Boolean.TRUE);
                if (EnumC1520990pgP.SparkPerfMonitorOpt.not()) {
                    C1520080pew.LIZLLL("hybrid_log_report", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "hybrid_resource_null")));
                }
            }
            return;
        }
        C1529370ptv c1529370ptv2 = LIZIZ;
        if (c1529370ptv2 != null && (interfaceC1529480pu6 = c1529370ptv2.LJFF) != null) {
            C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
            C1075530e5v.LIZIZ().LIZ("hybridkit_default_bid", InterfaceC1075390e5h.class, new C1529400pty(interfaceC1529480pu6));
        }
        C1529370ptv c1529370ptv3 = LIZIZ;
        if (c1529370ptv3 != null && (interfaceC1529450pu3 = c1529370ptv3.LJII) != null) {
            C01GW<C1075480e5q> c01gw2 = C1075480e5q.LIZIZ;
            C1075530e5v.LIZIZ().LIZ("hybridkit_default_bid", InterfaceC1529460pu4.class, new C1529380ptw(interfaceC1529450pu3));
        }
        C1529370ptv c1529370ptv4 = LIZIZ;
        if (c1529370ptv4 != null && (interfaceC1529430pu1 = c1529370ptv4.LJIIIIZZ) != null) {
            C01GW<C1075480e5q> c01gw3 = C1075480e5q.LIZIZ;
            C1075530e5v.LIZIZ().LIZ("hybridkit_default_bid", ISSPService.class, new C1529390ptx(interfaceC1529430pu1));
        }
        C1529370ptv c1529370ptv5 = LIZIZ;
        if (c1529370ptv5 != null && (c1533560q0g = c1529370ptv5.LIZLLL) != null) {
            C01GW<C1075480e5q> c01gw4 = C1075480e5q.LIZIZ;
            C1075480e5q c1075480e5qLIZIZ = C1075530e5v.LIZIZ();
            C01GW<C1537410q6t> c01gw5 = C1537410q6t.LJIIIZ;
            c1075480e5qLIZIZ.LIZ("hybridkit_default_bid", C1533850q19.class, new C1533850q19(C1161970gLL.LIZIZ().LIZJ(), c1533560q0g));
        }
        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
        C01GW<C1537410q6t> c01gw6 = C1537410q6t.LJIIIZ;
        C1520380pfQ.LIZLLL(c1520380pfQ, C1161970gLL.LIZIZ().LIZJ());
        C1529410ptz c1529410ptz3 = C1161970gLL.LIZIZ().LJII;
        if ((c1529410ptz3 == null || !c1529410ptz3.LIZ) && (c1529370ptv = LIZIZ) != null && (c1529410ptz = c1529370ptv.LIZIZ) != null) {
            C1520420pfU c1520420pfU = new C1520420pfU();
            c1520420pfU.LIZIZ = "https://mon-va.byteoversea.com";
            C1538050q7v c1538050q7v = c1529370ptv.LIZ;
            if (c1538050q7v != null) {
                c1520420pfU.LIZLLL = (String) c1538050q7v.get((Object) "channel");
                c1520420pfU.LIZ = c1538050q7v.getAppId();
                c1520420pfU.LIZJ = c1538050q7v.getDid();
                c1520420pfU.LJ = (String) c1538050q7v.get((Object) "appVersion");
                c1520420pfU.LJFF = (String) c1538050q7v.get((Object) "updateVersionCode");
                c1520420pfU.LJI = c1538050q7v.getRegion();
                c1520420pfU.LJII = (String) c1538050q7v.get((Object) "language");
                c1520420pfU.LJIIIIZZ = c1529410ptz.LIZIZ;
            }
            HybridSettingInitConfig hybridSettingInitConfigLIZ = c1520420pfU.LIZ();
            C1529370ptv c1529370ptv6 = LIZIZ;
            long j = (c1529370ptv6 == null || (c1529410ptz2 = c1529370ptv6.LIZIZ) == null) ? 0L : c1529410ptz2.LIZLLL;
            boolean z = j > 0;
            C1520770pg3 c1520770pg3 = new C1520770pg3(hybridSettingInitConfigLIZ);
            C1520380pfQ.LJI = c1520770pg3;
            try {
                c1520770pg3.LIZIZ(C1520380pfQ.LJIIJ, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZ("startup_handle", th);
            }
            C1520380pfQ.LJ();
            if (j > 0) {
                C086F c086f = C086F.LIZ;
                RunnableC1522360pic runnableC1522360pic = new Runnable() { // from class: X.0pic
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("HybridCommon@7a4f.initCommon$5$1");
                        try {
                            C1520380pfQ.LIZ.getClass();
                            InterfaceC1520310pfJ interfaceC1520310pfJ = C1520380pfQ.LJI;
                            if (interfaceC1520310pfJ != null) {
                                interfaceC1520310pfJ.LJI();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("HybridCommon@7a4f.initCommon$5$1");
                    }
                };
                c086f.getClass();
                C086F.LIZIZ(j, runnableC1522360pic);
            }
            C1521730phb.LIZ = c1529410ptz.LIZJ;
        }
        C1529370ptv c1529370ptv7 = LIZIZ;
        if (c1529370ptv7 != null && (c1529470pu5 = c1529370ptv7.LJI) != null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            InterfaceC1490720ota interfaceC1490720ota = c1529470pu5.LIZ;
            c1490740otc.getClass();
            C1490740otc.LIZIZ = interfaceC1490720ota;
        }
        C1529370ptv c1529370ptv8 = LIZIZ;
        if (c1529370ptv8 != null && (c1529510pu9 = c1529370ptv8.LJIIJ) != null) {
            c1529510pu9.LIZ.invoke();
        }
    }

    public final synchronized void LIZJ() {
        if (LJFF.compareAndSet(false, true)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    static {
        /*
            X.0ptu r0 = new X.0ptu
            r0.<init>()
            X.C1529360ptu.LIZ = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            X.C1529360ptu.LIZJ = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            X.C1529360ptu.LIZLLL = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            X.C1529360ptu.LJFF = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            X.C1529360ptu.LJI = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            X.C1529360ptu.LJIIIIZZ = r0
            java.lang.String r0 = "hybrid_kit_init_increase_priority"
            java.lang.Object r3 = X.C1535630q41.LIZIZ(r0)
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L4d
            r2 = r3
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            r0 = -20
            if (r1 < r0) goto L4d
            int r1 = r2.intValue()
            r0 = 19
            if (r1 > r0) goto L4d
            java.lang.Integer r3 = (java.lang.Integer) r3
        L4a:
            X.C1529360ptu.LJIIIZ = r3
            return
        L4d:
            r3 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529360ptu.<clinit>():void");
    }

    public final boolean LIZLLL(C1537480q70 c1537480q70) {
        boolean z;
        String strLJIJI;
        Integer num = LJIIIZ;
        if (num != null) {
            return LJ(c1537480q70, num.intValue());
        }
        synchronized (this) {
            if (!LIZJ.compareAndSet(false, true)) {
                return true;
            }
            try {
                Function0<Unit> function0 = LJ;
                if (function0 != null) {
                    function0.invoke();
                }
                JSONObject jSONObject = new JSONObject();
                String str = null;
                if (c1537480q70 != null) {
                    strLJIJI = c1537480q70.LJIJI();
                } else {
                    strLJIJI = null;
                }
                jSONObject.put("schema", strLJIJI);
                if (c1537480q70 != null) {
                    str = c1537480q70.bid;
                }
                jSONObject.put("bid", str);
                C1520360pfO c1520360pfO = new C1520360pfO("hybrid_call_prepare_block");
                c1520360pfO.LIZIZ = "hybridkit_default_bid";
                c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
                c1520360pfO.LIZLLL = jSONObject;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                C1520380pfQ.LIZ.getClass();
                C1520380pfQ.LIZ(c1520350pfNLIZ);
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1490740otc.LIZ.LIZ("Call PrepareBlock failed, please check your code.", EnumC1490770otf.E, "HybridCommon");
                LIZIZ();
                z = false;
            }
            return z;
        }
    }

    public final boolean LJ(C1537480q70 c1537480q70, int i) {
        boolean z;
        Integer num;
        Object c098200Yq;
        String strLJIJI;
        Integer num2;
        Object c098200Yq2;
        Integer num3;
        Object c098200Yq3;
        Integer num4;
        Object c098200Yq4;
        boolean z2 = true;
        if (!LIZLLL.get() && (num4 = LJIIJ) != null) {
            try {
                Process.setThreadPriority(num4.intValue(), i);
                try {
                    c098200Yq4 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq4);
                    z = true;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq4 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            C189200o6.m1boximpl(c098200Yq4);
        } else {
            z = false;
        }
        synchronized (this) {
            try {
                try {
                    try {
                    } finally {
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1490740otc.LIZ.LIZ("Call PrepareBlock failed, please check your code.", EnumC1490770otf.E, "HybridCommon");
                    LIZIZ();
                    if (z && (num = LJIIJ) != null) {
                        int iIntValue = num.intValue();
                        Integer num5 = LJIIJJI;
                        if (num5 != null) {
                            try {
                                Process.setThreadPriority(iIntValue, num5.intValue());
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                c098200Yq = new C098200Yq(th3);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m1boximpl(c098200Yq);
                        }
                    }
                    z2 = false;
                }
                if (!LIZJ.compareAndSet(false, true)) {
                    if (z && (num3 = LJIIJ) != null) {
                        int iIntValue2 = num3.intValue();
                        Integer num6 = LJIIJJI;
                        if (num6 != null) {
                            try {
                                Process.setThreadPriority(iIntValue2, num6.intValue());
                                c098200Yq3 = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq3);
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                c098200Yq3 = new C098200Yq(th4);
                                C189200o6.m2constructorimpl(c098200Yq3);
                            }
                            C189200o6.m1boximpl(c098200Yq3);
                        }
                    }
                    return true;
                }
                try {
                    LJIIJ = Integer.valueOf(Process.myTid());
                    LJIIJJI = Integer.valueOf(Process.getThreadPriority(Process.myTid()));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C189200o6.m2constructorimpl(new C098200Yq(th5));
                }
                Function0<Unit> function0 = LJ;
                if (function0 != null) {
                    function0.invoke();
                }
                LIZLLL.compareAndSet(false, true);
                JSONObject jSONObject = new JSONObject();
                String str = null;
                if (c1537480q70 != null) {
                    strLJIJI = c1537480q70.LJIJI();
                } else {
                    strLJIJI = null;
                }
                jSONObject.put("schema", strLJIJI);
                if (c1537480q70 != null) {
                    str = c1537480q70.bid;
                }
                jSONObject.put("bid", str);
                C1520360pfO c1520360pfO = new C1520360pfO("hybrid_call_prepare_block");
                c1520360pfO.LIZIZ = "hybridkit_default_bid";
                c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
                c1520360pfO.LIZLLL = jSONObject;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                C1520380pfQ.LIZ.getClass();
                C1520380pfQ.LIZ(c1520350pfNLIZ);
                if (z && (num2 = LJIIJ) != null) {
                    int iIntValue3 = num2.intValue();
                    Integer num7 = LJIIJJI;
                    if (num7 != null) {
                        try {
                            Process.setThreadPriority(iIntValue3, num7.intValue());
                            c098200Yq2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th6) {
                            TryCatchGuardChecker.doCheck(th6);
                            c098200Yq2 = new C098200Yq(th6);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        C189200o6.m1boximpl(c098200Yq2);
                    }
                }
                return z2;
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
                throw th7;
            }
            TryCatchGuardChecker.doCheck(th7);
            throw th7;
        }
    }
}
