package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804090VgV {
    public static C804090VgV LIZIZ;
    public static final ConcurrentHashMap<String, HashSet<C804110VgX>> LIZJ = new ConcurrentHashMap<>();
    public boolean LIZ;

    public static C804090VgV LIZIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C804090VgV();
        }
        return LIZIZ;
    }

    public static final void LIZ(C804110VgX c804110VgX) {
        ArrayList<String> arrayList;
        Object obj;
        C804120VgY c804120VgY = c804110VgX.LIZ;
        if (c804120VgY != null && (arrayList = c804120VgY.LIZ) != null && !arrayList.isEmpty()) {
            if (c804120VgY.LIZ.size() > 1) {
                obj = ListProtector.get(c804120VgY.LIZ, new SecureRandom().nextInt(c804120VgY.LIZ.size()));
            } else {
                obj = ListProtector.get(c804120VgY.LIZ, 0);
            }
            ConcurrentHashMap<String, HashSet<C804110VgX>> concurrentHashMap = LIZJ;
            if (!concurrentHashMap.containsKey(obj)) {
                concurrentHashMap.put((String) obj, new HashSet<>());
            }
            concurrentHashMap.get(obj).add(c804110VgX);
        }
    }

    public final void LIZJ(Context context) {
        ConcurrentHashMap<String, HashSet<C804110VgX>> concurrentHashMap;
        if (this.LIZ && (concurrentHashMap = LIZJ) != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<String, HashSet<C804110VgX>> entry : concurrentHashMap.entrySet()) {
                String key = entry.getKey();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(key);
                sbLIZ.append(" : [ ");
                C2188811AlT.LIZIZ(sbLIZ);
                for (C804110VgX c804110VgX : entry.getValue()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c804110VgX.getClass().getSimpleName());
                    sbLIZ2.append(" ");
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        ((Application) C786410Ut5.N3(context)).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0VgW
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                this.LL.getClass();
                ConcurrentHashMap<String, HashSet<C804110VgX>> concurrentHashMap2 = C804090VgV.LIZJ;
                if (concurrentHashMap2 != null && concurrentHashMap2.keySet().contains(activity.getClass().getName())) {
                    C804090VgV c804090VgV = this.LL;
                    String name = activity.getClass().getName();
                    c804090VgV.getClass();
                    if (concurrentHashMap2.containsKey(name)) {
                        Iterator<C804110VgX> it2 = concurrentHashMap2.get(name).iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZIZ();
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                this.LL.getClass();
                ConcurrentHashMap<String, HashSet<C804110VgX>> concurrentHashMap2 = C804090VgV.LIZJ;
                if (concurrentHashMap2 != null && concurrentHashMap2.keySet().contains(activity.getClass().getName())) {
                    C804090VgV c804090VgV = this.LL;
                    String name = activity.getClass().getName();
                    c804090VgV.getClass();
                    if (concurrentHashMap2.containsKey(name)) {
                        Iterator<C804110VgX> it2 = concurrentHashMap2.get(name).iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ(name);
                        }
                    }
                }
            }
        });
    }
}
