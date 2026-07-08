package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VZT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZT {
    public static Application LIZ;
    public static boolean LIZIZ;
    public static int LJFF;
    public static volatile String LJI;
    public static final Object LIZJ = new Object();
    public static final List<AbstractC813200VvC> LIZLLL = new ArrayList();
    public static final HashMap<Integer, String> LJ = new HashMap<>();
    public static final ArrayList<C2007307tf> LJII = new ArrayList<>();
    public static final C0VZU LJIIIIZZ = new Application.ActivityLifecycleCallbacks() { // from class: X.0VZU
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            try {
                synchronized (C0VZT.LIZJ) {
                    try {
                        String string = activity.toString();
                        int size = C0VZT.LJII.size() - 1;
                        while (true) {
                            if (-1 < size) {
                                ArrayList<C2007307tf> arrayList = C0VZT.LJII;
                                if (Intrinsics.LJFF(arrayList.get(size).LIZ, string)) {
                                    arrayList.remove(size);
                                    C0VZT.LJI = activity.getClass().getName();
                                    break;
                                }
                                size--;
                            } else {
                                C0VZT.LJI = activity.getClass().getName();
                                break;
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
            }
            C0VZT.LIZIZ(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C0VZT.LJ(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C0VZT.LJ(activity, Lifecycle.Event.ON_RESUME);
            C0VZT.LIZJ(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C0VZT.LJ(activity, Lifecycle.Event.ON_START);
            C0VZT.LIZJ(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C0VZT.LJ(activity, Lifecycle.Event.ON_STOP);
            C0VZT.LIZIZ(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            List listLLIIII;
            C0VZT.LJ(activity, Lifecycle.Event.ON_CREATE);
            C0VZT.LIZJ(activity);
            if (activity instanceof C19EG) {
                synchronized (C0VZT.LIZJ) {
                    try {
                        listLLIIII = C13LP.LLIIII(C0VZT.LIZLLL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                FragmentManager supportFragmentManager = ((C19EG) activity).getSupportFragmentManager();
                Iterator it2 = listLLIIII.iterator();
                while (it2.hasNext()) {
                    supportFragmentManager.LJZL((AbstractC813200VvC) it2.next(), true);
                }
            }
        }
    };

    public static String LIZ() {
        String string;
        synchronized (LIZJ) {
            try {
                string = LJII.toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return string;
    }

    public static String LIZLLL() {
        String str;
        synchronized (LIZJ) {
            try {
                int i = LJFF;
                str = i == 0 ? null : LJ.get(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (str == null || Intrinsics.LJFF(str, "null")) ? LJI : str;
    }

    public static void LIZIZ(Activity activity) {
        synchronized (LIZJ) {
            try {
                LJ.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(Activity activity) {
        int iHashCode = activity.hashCode();
        synchronized (LIZJ) {
            try {
                LJ.put(Integer.valueOf(iHashCode), activity.getClass().getName());
                LJFF = iHashCode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJ(Activity activity, Lifecycle.Event event) {
        try {
            synchronized (LIZJ) {
                try {
                    String string = activity.toString();
                    Iterator<C2007307tf> it2 = LJII.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C2007307tf next = it2.next();
                            if (Intrinsics.LJFF(next.LIZ, string)) {
                                if (event != Lifecycle.Event.ON_CREATE && event != Lifecycle.Event.ON_START && event != Lifecycle.Event.ON_RESUME) {
                                    next.LIZIZ = event;
                                } else {
                                    ArrayList<C2007307tf> arrayList = LJII;
                                    arrayList.remove(next);
                                    next.LIZIZ = event;
                                    arrayList.add(next);
                                }
                            }
                        } else {
                            ArrayList<C2007307tf> arrayList2 = LJII;
                            arrayList2.add(new C2007307tf(activity, event));
                            if (arrayList2.size() > 10) {
                                arrayList2.remove(0);
                            }
                        }
                    }
                    LJI = activity.getClass().getName();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }
}
