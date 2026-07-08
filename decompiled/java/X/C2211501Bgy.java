package X;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Bgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211501Bgy implements Application.ActivityLifecycleCallbacks {
    public static boolean LLILLJJLI;
    public static int LLILZ;
    public static WeakReference<Activity> LLILZIL;
    public static final C2211501Bgy LL = new C2211501Bgy();
    public static final HashMap<String, Boolean> LLILLL = new HashMap<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LJII.get(String.valueOf(activity.hashCode()));
        if (c2211641BhC != null) {
            C2211621BhA.LIZJ(c2211641BhC);
        }
        int iHashCode = activity.hashCode();
        Set<C2211761BhO> setRemove = C2211751BhN.LIZIZ.remove(Integer.valueOf(iHashCode));
        if (setRemove != null) {
            setRemove.clear();
        }
        Map<String, List<C2211821BhU>> mapRemove = C2211751BhN.LIZJ.remove(Integer.valueOf(iHashCode));
        if (mapRemove != null) {
            mapRemove.clear();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C2211751BhN.LJ(activity.hashCode(), false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws Throwable {
        ViewGroup viewGroup;
        if (!LLILLJJLI && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null && viewGroup.getChildCount() > 0 && !(viewGroup.getChildAt(0) instanceof GestureDetectorOnGestureListenerC1848660yCu)) {
            GestureDetectorOnGestureListenerC1848660yCu gestureDetectorOnGestureListenerC1848660yCu = new GestureDetectorOnGestureListenerC1848660yCu(activity);
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                C786410Ut5.LJJLIL(0, viewGroup);
                gestureDetectorOnGestureListenerC1848660yCu.addView(childAt, childAt.getLayoutParams());
            }
            viewGroup.addView(gestureDetectorOnGestureListenerC1848660yCu, new ViewGroup.LayoutParams(-1, -1));
        }
        LIZ(this, activity);
        LLILZIL = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = LLILZ;
        LLILZ = i + 1;
        if (i == 0) {
            C2211621BhA.LIZ.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C2211751BhN.LJ(activity.hashCode(), false);
        int i = LLILZ - 1;
        LLILZ = i;
        if (i == 0) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
            if (c2211641BhC != null) {
                C2211621BhA.LIZLLL = c2211641BhC;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C2211621BhA.LIZIZ);
                sbLIZ.append('.');
                sbLIZ.append(c2211641BhC.LIZIZ());
                sbLIZ.append(".c-1.d-1");
                c2211641BhC.LJII = C2188811AlT.LIZIZ(sbLIZ);
                C2211621BhA.LJIIJ(c2211641BhC);
                C2211621BhA.LIZJ = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C2211501Bgy c2211501Bgy, Activity activity) throws Throwable {
        c2211501Bgy.getClass();
        C10KC c10kc = C2211241BgY.LIZ;
        boolean z = true;
        if (c10kc != null && c10kc.LIZ(activity)) {
            return;
        }
        String strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(activity.getComponentName(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHWHhIKTtbB9z+PRGdVf+Ss8NLwm+wYUgLmNKNMGCVxaIWbKji0=", null));
        if (activity instanceof InterfaceC1740760vOs) {
            HashMap<String, Boolean> map = LLILLL;
            if (!map.containsKey(strLJJIJIIJIL)) {
                Method[] declaredMethods = activity.getClass().getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (Intrinsics.LJFF(declaredMethods[i].getName(), "getBtmPageCode")) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                map.put(strLJJIJIIJIL, Boolean.valueOf(z));
            }
            Boolean bool = LLILLL.get(strLJJIJIIJIL);
            if (bool != null && bool.booleanValue()) {
                C2211631BhB.LJIIL((InterfaceC1740760vOs) activity, null);
                return;
            }
        }
        C19IF<Activity> c19if = C19IG.LIZ;
        if (c19if == null) {
            return;
        }
        C2211631BhB.LJIIJJI(c19if.LIZ(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) throws Throwable {
        String string;
        ConcurrentHashMap<String, C2211641BhC> concurrentHashMap;
        C2211641BhC c2211641BhC;
        String str;
        List listLJJLIIIJILLIZJL;
        C2211621BhA.LIZ.getClass();
        if (bundle != null && (string = bundle.getString("btm:prID")) != null && (c2211641BhC = (concurrentHashMap = C2211621BhA.LJII).get(string)) != null) {
            c2211641BhC.LJJIJIIJI = true;
            activity.getWindow().getDecorView().setTag(-1843987113, c2211641BhC);
            String strValueOf = String.valueOf(activity.hashCode());
            c2211641BhC.LIZ = strValueOf;
            concurrentHashMap.put(strValueOf, c2211641BhC);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("restore  ");
            String strLIZ = c2211641BhC.LIZ();
            if (strLIZ != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZ, new String[]{e3.d}, 0, 6)) != null) {
                str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        new WeakReference(activity);
        LIZ(this, activity);
        C13E8<String> c13e8 = C1391850mK7.LIZ;
        final HashMap map = new HashMap();
        map.put("btm_activity", activity.getClass().getSimpleName());
        C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.09Zo
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DataCenter@88ac.monitorActivity$1");
                try {
                    Function2<? super String, ? super Map<String, String>, Unit> function2 = C1391850mK7.LIZIZ;
                    if (function2 != null) {
                        function2.invoke("activity", map);
                    }
                    Function1<? super Activity, Unit> function1 = C1391850mK7.LJI;
                    if (function1 != null) {
                        function1.invoke(activity);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DataCenter@88ac.monitorActivity$1");
            }
        });
        LLILZIL = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        String str;
        List listLJJLIIIJILLIZJL;
        C2211621BhA.LIZ.getClass();
        String strValueOf = String.valueOf(activity.hashCode());
        C2211641BhC c2211641BhC = C2211621BhA.LJII.get(strValueOf);
        if (c2211641BhC != null) {
            c2211641BhC.LJIILLIIL = AnonymousClass1962.SAVEINSTANCESTATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store  ");
            String strLIZ = c2211641BhC.LIZ();
            if (strLIZ != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZ, new String[]{e3.d}, 0, 6)) != null) {
                str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C786410Ut5.LJJJI("btm:prID", strValueOf, bundle);
    }
}
