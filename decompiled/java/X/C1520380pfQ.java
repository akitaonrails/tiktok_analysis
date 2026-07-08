package X;

import Y.ARunnableS18S0200100_23;
import android.app.Application;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520380pfQ {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static C789630UyH LIZLLL;
    public static List<InterfaceC1520330pfL> LJFF;
    public static InterfaceC1520310pfJ LJI;
    public static InterfaceC1491780ovI LJII;
    public static C1521920phu LJIIIIZZ;
    public static InterfaceC1514780pWO LJIIIZ;
    public static volatile Application LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIILJJIL;
    public static volatile boolean LJIILL;
    public static final C1520380pfQ LIZ = new C1520380pfQ();
    public static final C1520390pfR LJ = new C1520390pfR();
    public static int LJIIL = 4;
    public static int LJIILIIL = 8;

    public static InterfaceC1520310pfJ LIZJ() {
        InterfaceC1520310pfJ interfaceC1520310pfJ = LJI;
        if (interfaceC1520310pfJ != null) {
            return interfaceC1520310pfJ;
        }
        if (C1520300pfI.LIZLLL == null) {
            synchronized (C1520300pfI.class) {
                try {
                    if (C1520300pfI.LIZLLL == null) {
                        C1520300pfI.LIZLLL = new C1520300pfI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1520300pfI.LIZLLL;
    }

    public static void LJ() {
        InterfaceC1520310pfJ interfaceC1520310pfJ;
        HybridSettingInitConfig hybridSettingInitConfigLJ;
        if (LJIILL || (interfaceC1520310pfJ = LJI) == null || (hybridSettingInitConfigLJ = interfaceC1520310pfJ.LJ()) == null) {
            return;
        }
        LJIILL = true;
        C1491570oux c1491570oux = C1491570oux.LIZ;
        c1491570oux.getClass();
        C1491570oux.LIZ(Long.MAX_VALUE, "COMMON", true, false);
        c1491570oux.getClass();
        C1491570oux.LIZ(Long.MAX_VALUE, "LYNX_COMMON", true, false);
        c1491570oux.getClass();
        C1491570oux.LIZ(Long.MAX_VALUE, "WEB_COMMON", true, false);
        EnumC1491500ouq enumC1491500ouq = EnumC1491500ouq.EXTEND;
        C1491570oux.LJIJJ("WEB_COMMON", "COMMON", enumC1491500ouq);
        C1491570oux.LJIJJ("LYNX_COMMON", "COMMON", enumC1491500ouq);
        EnumC1521120pgc enumC1521120pgc = EnumC1521120pgc.VIEW_ENGINE_TYPE;
        C1491570oux.LJIJI(c1491570oux, "LYNX_COMMON", enumC1521120pgc.getKey(), "lynx");
        C1491570oux.LJIJI(c1491570oux, "WEB_COMMON", enumC1521120pgc.getKey(), "web");
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(EnumC1521120pgc.OS.getKey(), hybridSettingInitConfigLJ.LIZJ);
        pairArr[1] = new Pair(EnumC1521120pgc.OS_VERSION.getKey(), hybridSettingInitConfigLJ.LIZLLL);
        pairArr[2] = new Pair(EnumC1521120pgc.APP_ID.getKey(), hybridSettingInitConfigLJ.LIZ);
        pairArr[3] = new Pair(EnumC1521120pgc.APP_CHANNEL.getKey(), hybridSettingInitConfigLJ.LJFF);
        String key = EnumC1521120pgc.APP_VERSION_CODE.getKey();
        String str = hybridSettingInitConfigLJ.LJII;
        pairArr[4] = new Pair(key, str != null ? C2095008Iq.LJIILIIL(str) : null);
        pairArr[5] = new Pair(EnumC1521120pgc.DEVICE_TOTAL_MEMORY.getKey(), Long.valueOf(Runtime.getRuntime().maxMemory()));
        pairArr[6] = new Pair(EnumC1521120pgc.CPU_CORES.getKey(), Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        C1491570oux.LJIILLIIL(c1491570oux, "COMMON", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZ(C1520350pfN c1520350pfN) {
        C1491800ovK c1491800ovKLIZ;
        JSONObject jSONObject = C119800cu.LIZ;
        String str = c1520350pfN.LIZJ;
        C119800cu.LIZJ();
        if (str != null && C119800cu.LJFF.contains(str)) {
            return;
        }
        C1520340pfM c1520340pfMLIZ = C1520490pfb.LIZ(c1520350pfN);
        String str2 = c1520350pfN.LJIIIIZZ;
        if (str2 != null && (true ^ a0.LJJJIL(str2))) {
            AbstractC1514820pWS abstractC1514820pWSLIZJ = C1514790pWP.LIZJ(str2);
            if (abstractC1514820pWSLIZJ != null && (c1491800ovKLIZ = abstractC1514820pWSLIZJ.LIZ()) != null) {
                c1520340pfMLIZ.LJII = c1491800ovKLIZ;
                C1520730pfz.LIZJ(c1520340pfMLIZ, null);
                return;
            }
            C1491790ovJ c1491790ovJ = EnumC1521110pgb.Companion;
            String str3 = c1520350pfN.LJIIIIZZ;
            c1491790ovJ.getClass();
            c1520340pfMLIZ.LJII = C1491790ovJ.LIZ(str3);
            C1520730pfz.LIZJ(c1520340pfMLIZ, null);
            return;
        }
        C1520730pfz.LIZJ(c1520340pfMLIZ, null);
    }

    public static void LJFF(C1491520ous c1491520ous) {
        if (EnumC1520990pgP.SparkTracing.not()) {
            C1491570oux.LIZ.getClass();
            C1491570oux.LIZIZ = false;
            ((ArrayBlockingQueue) C1491570oux.LJFF).clear();
        } else {
            C824310WVh.LIZJ(new ARunnableS18S0200100_23(new C013C(), c1491520ous, System.currentTimeMillis(), 2));
        }
    }

    public static boolean LJI(String str) {
        HybridSettingInitConfig hybridSettingInitConfigLJ;
        HybridSettingInitConfig.IThirdConfig iThirdConfig;
        InterfaceC1520310pfJ interfaceC1520310pfJLIZJ = LIZJ();
        if (interfaceC1520310pfJLIZJ != null && (hybridSettingInitConfigLJ = interfaceC1520310pfJLIZJ.LJ()) != null && (iThirdConfig = hybridSettingInitConfigLJ.LJIIJ) != null) {
            return iThirdConfig.isThirdPartyUrl(str);
        }
        return false;
    }

    public static void LJII(C1535640q42 c1535640q42) {
        LJII = c1535640q42;
    }

    public static void LJIIIIZZ(C1529840pug c1529840pug) {
        LJIIIZ = c1529840pug;
    }

    public static void LJIIIZ(C1536310q57 c1536310q57) {
        LJIIIIZZ = c1536310q57;
    }

    public static void LIZLLL(C1520380pfQ c1520380pfQ, Application application) {
        c1520380pfQ.getClass();
        if (application != null && !LIZIZ) {
            LIZIZ = true;
            LJIIJ = application;
            try {
                if (LJIIJ != null && !LIZJ) {
                    LIZLLL = new C789630UyH();
                    Application application2 = LJIIJ;
                    if (application2 != null) {
                        application2.registerActivityLifecycleCallbacks(LIZLLL);
                    }
                    Application application3 = LJIIJ;
                    if (application3 != null) {
                        application3.registerActivityLifecycleCallbacks(C1522380pie.LL);
                    }
                    LIZJ = true;
                }
                C1520200pf8.LIZJ();
                C824310WVh.LIZJ(new Runnable() { // from class: X.0pWL
                    public static void LIZ() {
                        C1520380pfQ.LIZ.getClass();
                        try {
                            Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.NewWebOfflineMonitor");
                            C1958107lj.LIZIZ(cls, "beginMonitor", C1958107lj.LIZIZ(cls, "getInstance", new Object[0]));
                        } catch (ClassNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i = C2187451AjH.LIZ;
                            C1521730phb.LJFF("HybridMultiMonitor", "Not Found NewWebOfflineMonitor");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1520960pgM.LIZ("startup_handle", th);
                        }
                        C1520380pfQ.LIZ.getClass();
                        try {
                            Class<?> cls2 = Class.forName("com.bytedance.webx.monitor.falconx.NewFalconXMonitor");
                            C1958107lj.LIZIZ(cls2, "beginMonitor", C1958107lj.LIZIZ(cls2, "getInstance", new Object[0]));
                        } catch (ClassNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            int i2 = C2187451AjH.LIZ;
                            C1521730phb.LJFF("HybridMultiMonitor", "Not Found NewFalconXMonitor");
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1520960pgM.LIZ("startup_handle", th2);
                        }
                        C1520380pfQ.LIZ.getClass();
                        try {
                            Class<?> cls3 = Class.forName("com.bytedance.android.monitorV2.forest.ForestMonitorHelper");
                            Object obj = null;
                            try {
                                Field declaredField = cls3.getDeclaredField("INSTANCE");
                                declaredField.setAccessible(true);
                                obj = declaredField.get(null);
                            } catch (IllegalAccessException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            } catch (NoSuchFieldException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            C1958107lj.LIZIZ(cls3, "startMonitor", obj);
                        } catch (ClassNotFoundException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            int i3 = C2187451AjH.LIZ;
                            C1521730phb.LJFF("HybridMultiMonitor", "Not Found ForestMonitorHelper");
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            C1520960pgM.LIZ("startup_handle", th3);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("HybridMultiMonitor@a19f.injectDependencies$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("HybridMultiMonitor@a19f.injectDependencies$1");
                    }
                });
                C1520380pfQ c1520380pfQ2 = LIZ;
                C1520500pfc.LIZ.getClass();
                InterfaceC1520470pfZ interfaceC1520470pfZ = (InterfaceC1520470pfZ) C1520500pfc.LIZJ.getValue();
                c1520380pfQ2.getClass();
                if (interfaceC1520470pfZ != null) {
                    C1520450pfX.LIZIZ.add(interfaceC1520470pfZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZ("startup_handle", th);
            }
        }
    }

    @InterfaceC1294060jmO
    public static void LIZIZ(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        new JSONObject();
        C1520360pfO c1520360pfO = new C1520360pfO(str2);
        c1520360pfO.LIZ = str;
        c1520360pfO.LIZIZ = "";
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = jSONObject2;
        c1520360pfO.LJFF = null;
        c1520360pfO.LJII = jSONObject3;
        c1520360pfO.LIZIZ(2);
        LIZ(c1520360pfO.LIZ());
    }
}
