package X;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08Ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2103608Ly {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;

    public static void LIZ(Application application, Activity activity, boolean z, final C08M0 c08m0) {
        boolean z2;
        if (LIZ.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LocalLeakWatcher start needWatchFragment:");
            sbLIZ.append(true);
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            synchronized (C2103208Lu.LIZ) {
                z2 = C2103208Lu.LIZJ.get();
            }
            if (z2) {
                System.out.println((Object) "LocalLeakWatcher start failed as already started");
                return;
            }
            C2103208Lu.LJIIJ = true;
            ((CopyOnWriteArrayList) C2103208Lu.LJIIIIZZ).add(new InterfaceC2103508Lx() { // from class: X.08Lz
                @Override // X.InterfaceC2103508Lx
                public final void LIZ(int i, int i2, String str, boolean z3) {
                    Throwable th;
                    C08M1 c08m1 = c08m0;
                    if (i2 == 3) {
                        if (c08m1 != null) {
                            Throwable thRemove = C20525082h.LIZIZ.remove(Integer.valueOf(i));
                            if (z3) {
                                C1AF0.LIZJ(str);
                                try {
                                    if (thRemove != null) {
                                        th = C20525082h.LIZ(str, thRemove);
                                    } else {
                                        th = new Throwable(str);
                                    }
                                    Npth.reportBizException("ChaosHybridViewLeak", th, str, C2097608Jq.LJ());
                                    return;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (z3) {
                        C2103608Ly.LIZJ++;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LocalLeakWatcher leak!! all:");
                        sbLIZ2.append(C2103608Ly.LIZJ);
                        sbLIZ2.append(" current:");
                        sbLIZ2.append(str);
                        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                        C2103608Ly.LIZLLL = true;
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("LocalLeakWatcher no leak:");
                    sbLIZ3.append(str);
                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
                }
            });
            C2103208Lu.LIZ(0, 60000L, 1, true, 3);
            if (z) {
                System.out.println((Object) "LocalLeakWatcher only Lynx Leak!!");
                return;
            } else {
                C20123213oU.LIZ(application, true, activity, 7, null, new InterfaceC20123613oY() { // from class: X.08Ls
                    @Override // X.InterfaceC20123613oY
                    public final void onActivityDestroyed(Activity activity2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LocalLeakWatcher onActivityDestroyed:");
                        sbLIZ2.append(activity2.getLocalClassName());
                        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                        C2103208Lu c2103208Lu = C2103208Lu.LIZ;
                        C2103208Lu.LIZIZ(activity2.getLocalClassName(), 1, 1, true, activity2);
                    }

                    @Override // X.InterfaceC20123613oY
                    public final void LIZ(Fragment fragment, String str) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LocalLeakWatcher onFragmentDestroyed activity:");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" fragment:");
                        sbLIZ2.append(fragment.getClass().getName());
                        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                        C2103208Lu c2103208Lu = C2103208Lu.LIZ;
                        C2103208Lu.LIZIZ(fragment.getClass().getName(), 5, 1, true, fragment);
                    }

                    @Override // X.InterfaceC20123613oY
                    public final void LIZIZ(androidx.fragment.app.Fragment fragment, String str) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LocalLeakWatcher onFragmentDestroyed activity:");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" x-fragment:");
                        sbLIZ2.append(fragment.getClass().getName());
                        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                        C2103208Lu c2103208Lu = C2103208Lu.LIZ;
                        C2103208Lu.LIZIZ(fragment.getClass().getName(), 5, 1, true, fragment);
                    }
                });
                return;
            }
        }
        System.out.println((Object) "LocalLeakWatcher failed as already started");
    }
}
