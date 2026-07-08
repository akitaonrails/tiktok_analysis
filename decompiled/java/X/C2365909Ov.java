package X;

import android.app.Activity;
import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.09Ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2365909Ov extends C08K8 {
    public static final C2365909Ov LJFF = new C2365909Ov();
    public static final String LJI = "PageLeakReporter";
    public static final String LJII = "memory_crash_page_leak";
    public static final C01CW LJIIIIZZ = C01CW.PRE_CRASH;
    public static final List<WeakReference<Object>> LJIIIZ = new ArrayList();
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    @Override // X.C08K8
    public final Map<String, String> LIZ() {
        LJIIJ.set(true);
        HashMap map = new HashMap();
        if (MemoryPressureWatcher.getInstance().getJavaMemoryLevel().compareTo(C09Q3.HIGH) < 0) {
            return map;
        }
        try {
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (WeakReference weakReference : (ArrayList) LJIIIZ) {
                Object obj = weakReference.get();
                if (obj == null) {
                    arrayList.add(weakReference);
                } else {
                    i++;
                    String name = obj.getClass().getName();
                    Integer num = (Integer) map2.get(name);
                    map2.put(name, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            if (!arrayList.isEmpty()) {
                ((ArrayList) LJIIIZ).removeAll(arrayList);
            }
            if (i >= 5 && (true ^ map2.isEmpty())) {
                map.put("MemReport_leak", C13LP.LJJLIIIJ(map2.entrySet(), "\n", null, null, 0, null, AnonymousClass0207.get$arr$(102), 30));
                return map;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return map;
    }

    @Override // X.C08K8
    public final void LJ() {
        C1906580ziK.LIZJ().LJII().LJLLLLLL(new C09JN() { // from class: X.09Oy
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PageLeakReporter@74b7.onRegister$1");
                AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                if (!C2365909Ov.LJIIJ.get() && (abstractC1387200mCc instanceof C1844400y62)) {
                    ((ArrayList) C2365909Ov.LJIIIZ).add(new WeakReference(((C1844400y62) abstractC1387200mCc).LIZLLL));
                }
                C1C7U.LIZIZ("PageLeakReporter@74b7.onRegister$1");
            }
        });
        C1BWL.LIZ().registerActivityLifecycleCallbacks(new C09PC() { // from class: X.09P7
            @Override // X.C09PC, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                super.onActivityDestroyed(activity);
                if (C2365909Ov.LJIIJ.get()) {
                    return;
                }
                ((ArrayList) C2365909Ov.LJIIIZ).add(new WeakReference(activity));
            }
        });
    }

    @Override // X.C08K8
    public final String LIZIZ() {
        return LJI;
    }

    @Override // X.C08K8
    public final String LIZJ() {
        return LJII;
    }

    @Override // X.C08K8
    public final C01CW LIZLLL() {
        return LJIIIIZZ;
    }
}
