package X;

import Y.ARunnableS134S0100000_34;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.LruCache;
import android.view.FrameMetrics;
import android.view.Window;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BCZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Application application, final InterfaceC2201061BCm interfaceC2201061BCm) {
        if (C289600BWs.LIZ() && C2162308dZ.LJI(application)) {
            C1BCY c1bcy = new C1BCY();
            c1bcy.LJII = C289600BWs.LIZ();
            c1bcy.LJ = false;
            c1bcy.LJI = false;
            c1bcy.LJIILL = ((Boolean) C265070Aa9.LIZ.getValue()).booleanValue();
            c1bcy.LJIIIZ = ((Boolean) C265170AaJ.LIZ.getValue()).booleanValue();
            c1bcy.LJFF = false;
            c1bcy.LJIJ = ((Boolean) C077B.LIZ.getValue()).booleanValue();
            c1bcy.LJIILIIL = ((Boolean) AnonymousClass0774.LIZ.getValue()).booleanValue();
            c1bcy.LJIILLIIL = ((Boolean) AnonymousClass0772.LIZ.getValue()).booleanValue();
            c1bcy.LJIJI = new C1BDO() { // from class: X.1BDJ
                @Override // X.C1BDO
                public final void LIZ(C1BDL c1bdl) throws JSONException {
                    if (C1BDM.LIZ <= ((Number) C07DI.LIZ.getValue()).floatValue()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("task_name", c1bdl.LIZ);
                        jSONObject.put("task_wait_time", c1bdl.LIZIZ);
                        jSONObject.put("task_execute_time", c1bdl.LIZJ);
                        jSONObject.put("task_priority", c1bdl.LIZLLL);
                        jSONObject.put("task_is_ensure", false);
                        jSONObject.put("task_relate_Scene", c1bdl.LJ);
                        C20684815ws.LJIJ("milo_task_event", jSONObject);
                    }
                }
            };
            c1bcy.LIZ = application;
            c1bcy.LIZJ = new InterfaceC2201071BCn() { // from class: X.1BCc
                @Override // X.InterfaceC2201071BCn
                public final EnumC1016770cZ9 getDeviceType() {
                    C0CF8.LIZ.getClass();
                    float fLIZ = C0CF8.LIZ();
                    if (fLIZ == -1.0f) {
                        return EnumC1016770cZ9.UNKNOWN;
                    }
                    double d = fLIZ;
                    return d < 5.1d ? EnumC1016770cZ9.EXTREMELY_LOW_END : d < 5.9d ? EnumC1016770cZ9.ULTRA_LOW_END : d < 6.6d ? EnumC1016770cZ9.LOW_END : d < 8.3d ? EnumC1016770cZ9.MIDDLE_END : EnumC1016770cZ9.HIGH_END;
                }
            };
            c1bcy.LJIIJ = ((Boolean) C265010Aa3.LIZ.getValue()).booleanValue();
            c1bcy.LJIIJJI = ((Boolean) C265110AaD.LIZ.getValue()).booleanValue();
            c1bcy.LJIIL = ((Boolean) C265030Aa5.LIZ.getValue()).booleanValue();
            c1bcy.LJIIIIZZ = ((Boolean) C265090AaB.LIZ.getValue()).booleanValue();
            c1bcy.LJIJJ = ((Boolean) C265130AaF.LIZ.getValue()).booleanValue();
            c1bcy.LJIILJJIL = new InterfaceC2201061BCm() { // from class: X.1BD2
                @Override // X.InterfaceC2201061BCm
                public final void LIZIZ() {
                    if (((Boolean) AnonymousClass0777.LIZ.getValue()).booleanValue()) {
                        C1BDQ c1bdq = C1BDQ.LIZ;
                        C1BDW c1bdw = new C1BDW() { // from class: X.1BD1
                            public EnumC1016770cZ9 LIZ = EnumC1016770cZ9.UNKNOWN;

                            @Override // X.C1BDW
                            public final boolean LIZIZ() {
                                if (C1BD3.LIZ || !C1BD3.LIZIZ) {
                                    return false;
                                }
                                long j = C1BD4.LIZ;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                PrintStream printStream = System.out;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("BootFinishMiloTrigger: canSchedulerBySubmit lastTaskExecuteTime: ");
                                sbLIZ.append(j);
                                sbLIZ.append(", dividerTime: ");
                                long j2 = jCurrentTimeMillis - j;
                                sbLIZ.append(j2);
                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                                int i = C1016800cZC.LIZ[LIZLLL().ordinal()];
                                return i != 1 ? i != 2 ? i != 3 ? j2 > ((long) ((Number) AnonymousClass0775.LIZ.getValue()).intValue()) : j2 > ((long) ((Number) AnonymousClass0779.LIZ.getValue()).intValue()) : j2 > ((long) ((Number) C077C.LIZ.getValue()).intValue()) : j2 > ((long) ((Number) AnonymousClass0778.LIZ.getValue()).intValue());
                            }

                            public final EnumC1016770cZ9 LIZLLL() {
                                C2201251BDf c2201251BDf;
                                EnumC1016770cZ9 enumC1016770cZ9;
                                EnumC1016770cZ9 enumC1016770cZ92 = this.LIZ;
                                EnumC1016770cZ9 enumC1016770cZ93 = EnumC1016770cZ9.UNKNOWN;
                                if (enumC1016770cZ92 == enumC1016770cZ93) {
                                    C2200821BBo.LIZ.getClass();
                                    if (!C2200821BBo.LIZ() && (c2201251BDf = (C2201251BDf) C2201101BCq.LJI(EnumC1702060uOS.DeviceInfo, null)) != null && (enumC1016770cZ9 = (EnumC1016770cZ9) c2201251BDf.LJII.getValue()) != null) {
                                        enumC1016770cZ93 = enumC1016770cZ9;
                                    }
                                    this.LIZ = enumC1016770cZ93;
                                }
                                return this.LIZ;
                            }

                            @Override // X.C1BDW
                            public final boolean LIZ(C1BCC c1bcc) {
                                c1bcc.getClass();
                                if (!Intrinsics.LJFF("", "task_tag_boot_finish")) {
                                    return false;
                                }
                                if ((c1bcc.LLIZLLLIL != EnumC1781560wSg.PRELOADER && !Intrinsics.LJFF(c1bcc.LLIZ, "preload")) || LIZLLL() != EnumC1016770cZ9.EXTREMELY_LOW_END) {
                                    return false;
                                }
                                return true;
                            }

                            @Override // X.C1BDW
                            public final List<C1BDK> LIZJ(List<C1BDK> list) {
                                if (!C1BD3.LIZ && C1BD3.LIZIZ) {
                                    long j = C1BD4.LIZ;
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    PrintStream printStream = System.out;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("BootFinishMiloTrigger: filterCanExecuteTaskList lastTaskExecuteTime: ");
                                    sbLIZ.append(j);
                                    sbLIZ.append(", dividerTime: ");
                                    long j2 = jCurrentTimeMillis - j;
                                    sbLIZ.append(j2);
                                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                                    int i = C1016800cZC.LIZ[LIZLLL().ordinal()];
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                if (j2 < ((Number) AnonymousClass0775.LIZ.getValue()).intValue()) {
                                                    return list;
                                                }
                                                return C13BV.INSTANCE;
                                            }
                                            if (j2 < ((Number) AnonymousClass0779.LIZ.getValue()).intValue()) {
                                                return list;
                                            }
                                            return C13BV.INSTANCE;
                                        }
                                        if (j2 < ((Number) C077C.LIZ.getValue()).intValue()) {
                                            System.out.println("BootFinishMiloTrigger: filterCanExecuteTaskList, in ULTRA_LOW_END, return empty list");
                                            return list;
                                        }
                                        System.out.println("BootFinishMiloTrigger: filterCanExecuteTaskList, in ULTRA_LOW_END, return origin list ");
                                        return C13BV.INSTANCE;
                                    }
                                    if (j2 < ((Number) AnonymousClass0778.LIZ.getValue()).intValue()) {
                                        ArrayList arrayList = new ArrayList();
                                        for (C1BDK c1bdk : list) {
                                            C1BCC c1bcc = c1bdk.LL;
                                            if (c1bcc.LLIZLLLIL == EnumC1781560wSg.PRELOADER || Intrinsics.LJFF(c1bcc.LLIZ, "preload")) {
                                                arrayList.add(c1bdk);
                                            }
                                        }
                                        return arrayList;
                                    }
                                    return C13BV.INSTANCE;
                                }
                                return list;
                            }
                        };
                        ConcurrentHashMap<String, Set<C1BDW>> concurrentHashMap = C1BDQ.LJ;
                        synchronized (concurrentHashMap) {
                            try {
                                Set<C1BDW> linkedHashSet = concurrentHashMap.get("task_tag_boot_finish");
                                if (linkedHashSet == null) {
                                    linkedHashSet = new LinkedHashSet<>();
                                }
                                linkedHashSet.add(c1bdw);
                                concurrentHashMap.put("task_tag_boot_finish", linkedHashSet);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        InterfaceC1702040uOQ interfaceC1702040uOQ = new InterfaceC1702040uOQ() { // from class: X.1BD7
                            @Override // X.InterfaceC1702040uOQ
                            public final boolean LIZ() {
                                return !C1BD3.LIZ && C1BD3.LIZIZ;
                            }
                        };
                        C1BDQ.LJI().getClass();
                        C1702010uON.LIZJ = interfaceC1702040uOQ;
                        C1BDQ.LJFF(new C1BD4());
                    }
                    interfaceC2201061BCm.LIZIZ();
                    C2200821BBo.LIZ.getClass();
                    if (C2200821BBo.LJI) {
                        C20339414iG.LIZIZ.put(WidgetManager.class, Boolean.TRUE);
                    }
                    if (((Boolean) C0BOI.LIZ.getValue()).booleanValue()) {
                        C1BCA.LJJIFFI(new AbstractC1519950pej() { // from class: X.0pei
                            @Override // X.InterfaceC1519960pek
                            public final EnumC1154690g9b LIZ() {
                                return EnumC1154690g9b.GECKO;
                            }
                        });
                    }
                    C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.1BD6
                        @Override // X.InterfaceC1006670cIr
                        public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                            if (c1602200rnO2.LIZJ()) {
                                C1BD3.LIZIZ = true;
                            }
                        }
                    });
                    C1BD3.LIZ(true);
                }

                @Override // X.InterfaceC2201061BCm
                public final void LIZ(Throwable th) {
                    interfaceC2201061BCm.LIZ(th);
                }
            };
            if (((Boolean) C265150AaH.LIZ.getValue()).booleanValue()) {
                c1bcy.LIZIZ.add(new AbstractC2201091BCp<C2200691BBb>() { // from class: X.1BBc
                    @Override // X.AbstractC2201091BCp
                    public final C2200691BBb LJIILIIL() {
                        return new C2200691BBb();
                    }

                    @Override // X.AbstractC2201091BCp
                    public final C2200691BBb LJIILJJIL() {
                        C2200691BBb c2200691BBb;
                        LruCache<Integer, C2310851Fcp> lruCache = C991020btc.LIZ;
                        int size = lruCache.size();
                        if (size == 0) {
                            c2200691BBb = new C2200691BBb();
                        } else {
                            for (Map.Entry<Integer, C2310851Fcp> entry : lruCache.snapshot().entrySet()) {
                                entry.getValue().getClass();
                                entry.getValue().getClass();
                            }
                            c2200691BBb = new C2200691BBb();
                            c2200691BBb.LIZIZ = 0.0f / size;
                        }
                        float f = c2200691BBb.LIZIZ;
                        if (f > 55.0f) {
                            c2200691BBb.LIZ = EnumC1006810cJ5.Low;
                            return c2200691BBb;
                        }
                        if (f > 48.0f) {
                            c2200691BBb.LIZ = EnumC1006810cJ5.Medium;
                            return c2200691BBb;
                        }
                        if (f > 38.0f) {
                            c2200691BBb.LIZ = EnumC1006810cJ5.High;
                            return c2200691BBb;
                        }
                        c2200691BBb.LIZ = EnumC1006810cJ5.Critical;
                        return c2200691BBb;
                    }

                    @Override // X.AbstractC2201091BCp
                    public final InterfaceC1702080uOU LJIIJJI() {
                        return EnumC312610CNf.FLUENCY;
                    }

                    @Override // X.AbstractC2201091BCp
                    public final boolean LJIILLIIL(C2200691BBb c2200691BBb, C2200691BBb c2200691BBb2) {
                        if (c2200691BBb.LIZ != c2200691BBb2.LIZ) {
                            return true;
                        }
                        return false;
                    }
                });
            }
            c1bcy.LIZIZ.add(C1602210rnP.LJJIFFI());
            Application application2 = c1bcy.LIZ;
            C798140VSq.LIZIZ = application2;
            C798140VSq.LIZ = application2;
            C1702210uOh.LIZ = c1bcy.LJ;
            if (c1bcy.LJII) {
                Application application3 = C798140VSq.LIZIZ;
                if (application3 != null) {
                    application3.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.15Wf
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                            Object c098200Yq;
                            Window window;
                            Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListenerRemove;
                            try {
                                if (activity instanceof C19EG) {
                                    C2200821BBo.LIZ.getClass();
                                    if (C2200821BBo.LJI) {
                                        ((C19EG) activity).getSupportFragmentManager().LLIILZL(C20533215Wg.LJII);
                                    }
                                }
                                C2200821BBo.LIZ.getClass();
                                if (C2200821BBo.LJIJ && Build.VERSION.SDK_INT >= 24 && (window = activity.getWindow()) != null && (onFrameMetricsAvailableListenerRemove = C20533215Wg.LJFF.remove(window)) != null) {
                                    window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListenerRemove);
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                            Object c098200Yq;
                            try {
                                C2200821BBo.LIZ.getClass();
                                if (!C2200821BBo.LJI) {
                                    return;
                                }
                                if (C20339414iG.LIZIZ.contains(activity.getClass())) {
                                    return;
                                }
                                String simpleName = C20339414iG.LIZ.get(activity.getClass());
                                if (simpleName == null) {
                                    simpleName = activity.getClass().getSimpleName();
                                }
                                Iterator it2 = ((ArrayList) C20533215Wg.LJ).iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC1593780rZo) it2.next()).LIZLLL(simpleName);
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                            Object c098200Yq;
                            try {
                                int i = C20533215Wg.LIZ + 1;
                                C20533215Wg.LIZ = i;
                                if (i == 1 && !C20533215Wg.LIZIZ) {
                                    Iterator<InterfaceC20533415Wi> it2 = C20533215Wg.LIZJ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().LIZJ();
                                    }
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                            Object c098200Yq;
                            try {
                                C20533215Wg.LIZIZ = activity.isChangingConfigurations();
                                int i = C20533215Wg.LIZ - 1;
                                C20533215Wg.LIZ = i;
                                if (i == 0 && !C20533215Wg.LIZIZ) {
                                    Iterator<InterfaceC20533415Wi> it2 = C20533215Wg.LIZJ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().LIZIZ();
                                    }
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                            Object c098200Yq;
                            try {
                                if (activity instanceof C19EG) {
                                    C2200821BBo.LIZ.getClass();
                                    if (C2200821BBo.LJI) {
                                        ((C19EG) activity).getSupportFragmentManager().LJZL(C20533215Wg.LJII, true);
                                    }
                                }
                                C2200821BBo.LIZ.getClass();
                                if (C2200821BBo.LJIJ && Build.VERSION.SDK_INT >= 24) {
                                    Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: X.15Dv
                                        @Override // android.view.Window.OnFrameMetricsAvailableListener
                                        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                                            Object c098200Yq2;
                                            try {
                                                Iterator it2 = ((ArrayList) C20533215Wg.LJI).iterator();
                                                while (it2.hasNext()) {
                                                    ((InterfaceC20485415Dw) it2.next()).LJ(frameMetrics);
                                                }
                                                c098200Yq2 = Unit.LIZ;
                                                C189200o6.m2constructorimpl(c098200Yq2);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq2 = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq2);
                                            }
                                            C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                                        }
                                    };
                                    Window window = activity.getWindow();
                                    if (window != null) {
                                        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, C0NBO.LIZIZ());
                                        C20533215Wg.LJFF.put(window, onFrameMetricsAvailableListener);
                                    }
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }
                    });
                }
                C0NBO.LIZLLL(new ARunnableS134S0100000_34(c1bcy, 87));
            }
        }
    }
}
