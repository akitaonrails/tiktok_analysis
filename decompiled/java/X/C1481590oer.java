package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0oer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481590oer {
    public static final Object LIZ = new Object();
    public static volatile C1481640oew LIZIZ = null;
    public static final C603840NmI<String, String> LIZJ = new C603840NmI<>(5);

    public static InterfaceC1482100ofg LIZ() {
        if (LIZIZ == null) {
            synchronized (LIZ) {
                try {
                    if (LIZIZ == null) {
                        String path = C2354809Ko.LJFF(C1475000oUE.LIZ).getPath();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(path);
                        sbLIZ.append("/data_middleware_v3/tracking/");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                            strLIZIZ = null;
                        }
                        LIZIZ = C1481640oew.LIZJ(strLIZIZ);
                        C1475000oUE.LIZ.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0oUJ
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityCreated(Activity activity, Bundle bundle) {
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
                            public final void onActivityDestroyed(Activity activity) {
                                C1475000oUE.LJI().execute(new Runnable() { // from class: X.0oeu
                                    @Override // java.lang.Runnable
                                    public final void run() throws JSONException {
                                        C1C7U.LIZ("SimConvergeServiceManager@e29b.registerActivityLifecycleCallbacks4ConvergeService$1$onActivityDestroyed$1L");
                                        C1481590oer.LIZIZ();
                                        C1481640oew c1481640oew = (C1481640oew) C1481590oer.LIZ();
                                        for (String str : c1481640oew.LJ.keySet()) {
                                            if (!TextUtils.isEmpty(str)) {
                                                c1481640oew.LIZIZ.addLast(str);
                                            }
                                        }
                                        C1481630oev.LIZLLL(true);
                                        C1C7U.LIZIZ("SimConvergeServiceManager@e29b.registerActivityLifecycleCallbacks4ConvergeService$1$onActivityDestroyed$1L");
                                    }
                                });
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityPaused(Activity activity) {
                                if (!((Boolean) C1474810oTv.q0.getValue()).booleanValue()) {
                                    C1475000oUE.LJI().execute(new RunnableC1481650oex());
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStopped(Activity activity) {
                                if (((Boolean) C1474810oTv.q0.getValue()).booleanValue()) {
                                    C1475000oUE.LJI().execute(new RunnableC1481650oex());
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZIZ() {
        String next;
        if (C1474810oTv.LJJJJ()) {
            Iterator<String> it2 = LIZJ.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (!TextUtils.isEmpty(next)) {
                    String str = LIZJ.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        ((C1481640oew) LIZ()).LJ(EnumC1481810ofD.VIDEO_REQUEST, next, str);
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(next)) {
                return;
            }
            LIZJ.remove(next);
        }
    }
}
