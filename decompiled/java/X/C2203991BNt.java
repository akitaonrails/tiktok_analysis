package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1BNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203991BNt implements InterfaceC1533190q05 {
    public static final C2203991BNt LIZ = new C2203991BNt();

    public static boolean LIZLLL(Uri uri) {
        String path;
        if (uri == null || !C1953107kv.LIZIZ(uri) || !C2203961BNq.LIZ().isPiaEnabled || !C2203961BNq.LIZ().LIZIZ(uri)) {
            return false;
        }
        Settings settingsLIZ = C2203961BNq.LIZ();
        settingsLIZ.getClass();
        if (Settings.LJIIIIZZ) {
            if (settingsLIZ.isPiaEnabled && C1953107kv.LIZIZ(uri)) {
                if (!((List) settingsLIZ.LJ.getValue()).isEmpty()) {
                    String host = uri.getHost();
                    if (host != null && (path = uri.getPath()) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(host);
                        sbLIZ.append(path);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        List list = (List) settingsLIZ.LJ.getValue();
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (a0.LJJIIZI(strLIZIZ, (String) it2.next(), false)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (uri.getBooleanQueryParameter("__pia_manifest__", false)) {
            return true;
        }
        if (C2203961BNq.LIZ().isPiaQueryDisable) {
            if (Settings.LJIIIIZZ && C2204081BOc.LIZ.LIZIZ(uri) == null) {
                C1545410qJn.LIZ.getClass();
                if (C1545410qJn.LJIIIIZZ) {
                    String strLIZJ = C1953107kv.LIZJ(uri, null);
                    if ((strLIZJ != null && (C1545410qJn.LJIIIZ.contains(strLIZJ) || C1545410qJn.LJIIJJI.contains(strLIZJ))) || uri.getBooleanQueryParameter("_pia_", false)) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else if (uri.getBooleanQueryParameter("_pia_", false)) {
            if (!Settings.LJIIIIZZ || C2204081BOc.LIZ.LIZIZ(uri) != null) {
                return true;
            }
            C1545410qJn.LIZ.getClass();
            if (!C1545410qJn.LJIIIIZZ) {
                return true;
            }
            String strLIZJ2 = C1953107kv.LIZJ(uri, null);
            if (strLIZJ2 != null && (C1545410qJn.LJIIIZ.contains(strLIZJ2) || C1545410qJn.LJIIJJI.contains(strLIZJ2))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1533190q05
    public final boolean LIZ(String str) {
        Object c098200Yq;
        if (str == null) {
            return false;
        }
        if (!C2203961BNq.LIZ().isPiaQueryDisable && !a0.LJJIIZI(str, "__pia_manifest__", false) && !a0.LJJIIZI(str, "_pia_", false)) {
            return false;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return LIZLLL((Uri) c098200Yq);
    }

    @Override // X.InterfaceC1533190q05
    public final C2204031BNx LIZJ(C1530150pvB c1530150pvB) {
        return new C2204031BNx(c1530150pvB);
    }

    @Override // X.InterfaceC1533190q05
    public final InterfaceC1542530qF9 LIZIZ(String str, C1530150pvB c1530150pvB, EnumC1533200q06 enumC1533200q06, boolean z) {
        C1BOK.LIZ.getClass();
        if (C2203961BNq.LIZ().isWarmupEnabled) {
            if (!((HashMap) C1BOL.LIZ.LIZ).containsKey("HybridKit")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Warmup] failed to warmup because there is no env for ");
                sbLIZ.append("HybridKit");
                C1BPP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                final C2204001BNu c2204001BNu = new C2204001BNu();
                c2204001BNu.LIZIZ = str;
                c2204001BNu.LIZ = "HybridKit";
                c2204001BNu.LIZJ = c1530150pvB;
                c2204001BNu.LIZLLL = true;
                final String strLIZIZ = c2204001BNu.LIZIZ();
                if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
                    if (EnumC1533200q06.Load == enumC1533200q06) {
                        synchronized (C1BP7.class) {
                            C2204041BNy c2204041BNyLIZ = c2204001BNu.LIZ();
                            if (c2204041BNyLIZ != null && c2204041BNyLIZ.LIZLLL.LIZJ()) {
                                Uri uri = UriProtector.parse(c2204041BNyLIZ.LIZLLL.streaming);
                                if (C1BP7.LJIIJ == null || !C1BP7.LJIIJ.LIZ.equals(uri)) {
                                    if (C1BP7.LJIIJ != null) {
                                        C1BP7.LJIIJ.LIZIZ.terminate();
                                    }
                                    try {
                                        C1BP7.LJIIJ = new C1BP7(c2204041BNyLIZ.LJIIIIZZ, uri);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C1BPP.LIZJ(4, "[Worker] try warmup failed!", th);
                                    }
                                }
                            }
                        }
                    } else {
                        final FutureTask<C2204041BNy> futureTask = new FutureTask<>(new Callable() { // from class: X.1BOA
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C2204001BNu c2204001BNu2 = c2204001BNu;
                                C1C7U.LIZ("PiaRuntimeFactory@5ff3.warmup$1L");
                                C2204041BNy c2204041BNyLIZ2 = c2204001BNu2.LIZ();
                                if (c2204041BNyLIZ2 != null) {
                                    C2201341BDo.LIZIZ.LIZ(c2204041BNyLIZ2);
                                    c2204041BNyLIZ2.LJII();
                                }
                                C1C7U.LIZIZ("PiaRuntimeFactory@5ff3.warmup$1L");
                                return c2204041BNyLIZ2;
                            }
                        });
                        if (C2204011BNv.LIZ.putIfAbsent(strLIZIZ, futureTask) == null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[Runtime] start to warmup, url=");
                            sbLIZ2.append(str);
                            C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                            boolean zBooleanValue = ((Boolean) C1542560qFC.LIZJ.LIZ("pia_build_task_leak", Boolean.class, Boolean.FALSE)).booleanValue();
                            final WeakReference weakReference = new WeakReference(futureTask);
                            final InterfaceC1542530qF9 interfaceC1542530qF9 = new InterfaceC1542530qF9() { // from class: X.1BOF
                                @Override // X.InterfaceC1542530qF9
                                public final void release() {
                                    final String str2 = strLIZIZ;
                                    final FutureTask futureTask2 = futureTask;
                                    C1287700jc8.LIZJ(new Runnable() { // from class: X.1BO4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            String str3 = str2;
                                            FutureTask<C2204041BNy> futureTask3 = futureTask2;
                                            C1C7U.LIZ("PiaRuntimeFactory@5ff3.lambda$warmup$2$1L");
                                            try {
                                                ConcurrentHashMap<String, FutureTask<C2204041BNy>> concurrentHashMap = C2204011BNv.LIZ;
                                                if (concurrentHashMap.get(str3) == futureTask3) {
                                                    concurrentHashMap.remove(str3);
                                                    C2204041BNy c2204041BNy = futureTask3.get();
                                                    if (c2204041BNy != null) {
                                                        c2204041BNy.release();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                            }
                                            C1C7U.LIZIZ("PiaRuntimeFactory@5ff3.lambda$warmup$2$1L");
                                        }
                                    });
                                }
                            };
                            InterfaceC1542530qF9 interfaceC1542530qF92 = new InterfaceC1542530qF9() { // from class: X.1BOG
                                @Override // X.InterfaceC1542530qF9
                                public final void release() {
                                    final WeakReference weakReference2 = weakReference;
                                    final String str2 = strLIZIZ;
                                    C1287700jc8.LIZJ(new Runnable() { // from class: X.1BO3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            WeakReference weakReference3 = weakReference2;
                                            String str3 = str2;
                                            C1C7U.LIZ("PiaRuntimeFactory@5ff3.lambda$warmup$4$1L");
                                            try {
                                                FutureTask<C2204041BNy> futureTask2 = (FutureTask) weakReference3.get();
                                                if (futureTask2 == null) {
                                                    C1C7U.LIZIZ("PiaRuntimeFactory@5ff3.lambda$warmup$4$1L");
                                                    return;
                                                }
                                                ConcurrentHashMap<String, FutureTask<C2204041BNy>> concurrentHashMap = C2204011BNv.LIZ;
                                                if (concurrentHashMap.get(str3) == futureTask2) {
                                                    concurrentHashMap.remove(str3);
                                                    C2204041BNy c2204041BNy = futureTask2.get();
                                                    if (c2204041BNy != null) {
                                                        c2204041BNy.release();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                            }
                                            C1C7U.LIZIZ("PiaRuntimeFactory@5ff3.lambda$warmup$4$1L");
                                        }
                                    });
                                }
                            };
                            if (zBooleanValue) {
                                interfaceC1542530qF9 = interfaceC1542530qF92;
                            }
                            C1287700jc8.LIZJ(futureTask);
                            if (z) {
                                return interfaceC1542530qF9;
                            }
                            C786410Ut5.LJLIIL(30000L, C1287700jc8.LIZ(), new Runnable() { // from class: X.1BNo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC1542530qF9 interfaceC1542530qF93 = interfaceC1542530qF9;
                                    C1C7U.LIZ("PiaRuntimeFactory@5ff3.warmup$2L");
                                    interfaceC1542530qF93.release();
                                    C1C7U.LIZIZ("PiaRuntimeFactory@5ff3.warmup$2L");
                                }
                            });
                            return interfaceC1542530qF9;
                        }
                    }
                }
            }
        }
        return null;
    }
}
