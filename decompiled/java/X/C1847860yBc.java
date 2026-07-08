package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0yBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847860yBc implements Application.ActivityLifecycleCallbacks {
    public static final C1847860yBc LL = new C1847860yBc();
    public static final C1847950yBl LLILLJJLI = new C1847950yBl();

    public static void LIZ(final C1847620yBE c1847620yBE) {
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFragmentPaused: fragment = ");
            sbLIZ.append(c1847620yBE.LIZJ.getClass().getName());
            sbLIZ.append(", hashcode=");
            sbLIZ.append(c1847620yBE.LIZJ.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yCB
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LLZIL(c1847620yBE);
            }
        });
    }

    public static void LIZJ(final C1847620yBE c1847620yBE) {
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFragmentResumed: fragment = ");
            sbLIZ.append(c1847620yBE.LIZJ.getClass().getName());
            sbLIZ.append(", hashcode=");
            sbLIZ.append(c1847620yBE.LIZJ.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yCA
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LLLZZ(c1847620yBE);
            }
        });
    }

    public static void LIZLLL(final View view) {
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewAfterClick, view = ");
            sbLIZ.append(C1846620y9c.LJ(view));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1847950yBl c1847950yBl = LLILLJJLI;
        if (view == null) {
            c1847950yBl.getClass();
            return;
        }
        if (((HashSet) c1847950yBl.LIZLLL).contains(Integer.valueOf(view.hashCode()))) {
            return;
        }
        ((HashSet) c1847950yBl.LIZLLL).add(Integer.valueOf(view.hashCode()));
        C786410Ut5.LJJZZIII(c1847950yBl.LIZ, new RunnableC514501zT(view, c1847950yBl, 16));
        c1847950yBl.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yCI
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LLLZLZ(view);
            }
        });
    }

    public static void LJ(final View view) {
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewPreClick, view = ");
            sbLIZ.append(C1846620y9c.LJ(view));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1847950yBl c1847950yBl = LLILLJJLI;
        if (view == null) {
            c1847950yBl.getClass();
        } else {
            c1847950yBl.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yCH
                @Override // X.InterfaceC1489050oqt
                public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                    interfaceC1848190yC9.LLLZZIL(view);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        C1808610xAJ.LIZ.remove(activity);
        C1490500otE.LIZ.LIZ.remove(activity);
        C1490470otB c1490470otB = C1847820yBY.LIZJ;
        ((ReentrantReadWriteLock) c1490470otB.LIZIZ).writeLock().lock();
        try {
            c1490470otB.LIZ.remove(activity);
            ((ReentrantReadWriteLock) c1490470otB.LIZIZ).writeLock().unlock();
            if (activity != null) {
                C588030N4n.LIZ.remove(Integer.valueOf(activity.hashCode()));
            }
            LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>(activity) { // from class: X.0yC7
                @Override // X.InterfaceC1489050oqt
                public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                    interfaceC1848190yC9.LLLZLL();
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) c1490470otB.LIZIZ).writeLock().unlock();
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        C1847990yBp.LIZJ.remove(activity);
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>(activity) { // from class: X.0yCG
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LIZJ();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        Set<Activity> set = C1847990yBp.LIZJ;
        if (!set.contains(activity)) {
            set.add(activity);
        }
        C1847990yBp.LJ = new WeakReference<>(activity);
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yCF
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LLZL(activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        C1845200y7K.LIZ(activity);
        int i = C1847990yBp.LIZ;
        C1847990yBp.LIZ = i + 1;
        if (i == 0) {
            C1847990yBp.LIZIZ = true;
            C1848320yCM<InterfaceC1848420yCW> c1848320yCM = C1847990yBp.LIZLLL;
            new C1848380yCS();
            InterfaceC1848420yCW interfaceC1848420yCW = c1848320yCM.LIZ;
            if (interfaceC1848420yCW != null) {
                C1848380yCS.LIZ(interfaceC1848420yCW);
            }
        }
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>(activity) { // from class: X.0yCE
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LIZIZ();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        int i = C1847990yBp.LIZ - 1;
        C1847990yBp.LIZ = i;
        if (i == 0) {
            C1847990yBp.LIZIZ = false;
            C1848320yCM<InterfaceC1848420yCW> c1848320yCM = C1847990yBp.LIZLLL;
            new C1848390yCT();
            InterfaceC1848420yCW interfaceC1848420yCW = c1848320yCM.LIZ;
            if (interfaceC1848420yCW != null) {
                C1848390yCT.LIZ(interfaceC1848420yCW);
            }
        }
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>(activity) { // from class: X.0yC6
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LLLZL();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        Set<String> setKeySet;
        if (activity instanceof C19EG) {
            ((C19EG) activity).getSupportFragmentManager().LJZL(C1847880yBe.LL, true);
        }
        if (bundle != null) {
            C1490470otB c1490470otB = C1847820yBY.LIZJ;
            ConcurrentHashMap<Integer, String> concurrentHashMapLIZ = c1490470otB.LIZ(activity);
            if (concurrentHashMapLIZ == null) {
                concurrentHashMapLIZ = new ConcurrentHashMap<>();
                c1490470otB.LIZIZ(activity, concurrentHashMapLIZ);
            }
            Bundle bundle2 = bundle.getBundle("activity_refer_save_instance");
            if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                for (String str : setKeySet) {
                    String string = bundle2.getString(str);
                    if (string != null) {
                        concurrentHashMapLIZ.put(Integer.valueOf(CastIntegerProtector.parseInt(str)), string);
                    }
                }
            }
        }
        LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>(activity) { // from class: X.0yCD
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LIZLLL();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ConcurrentHashMap<Integer, String> concurrentHashMapLIZ = C1847820yBY.LIZJ.LIZ(activity);
        if (concurrentHashMapLIZ != null) {
            for (Map.Entry<Integer, String> entry : concurrentHashMapLIZ.entrySet()) {
                C786410Ut5.LJJJI(String.valueOf(entry.getKey().intValue()), entry.getValue(), bundle2);
            }
        }
        C786410Ut5.LJJIIZI(bundle, bundle2, "activity_refer_save_instance");
    }
}
