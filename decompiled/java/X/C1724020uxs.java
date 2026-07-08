package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0uxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724020uxs extends AbstractC813200VvC implements Application.ActivityLifecycleCallbacks {
    public static final C1724020uxs LL = new C1724020uxs();
    public static final Stack<WeakReference<Fragment>> LLILLJJLI = new Stack<>();
    public static final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public static WeakReference<Activity> LLILZ;

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
    public final void onActivityStarted(Activity activity) {
    }

    public final void LJJJZ() {
        if (LLILLL.compareAndSet(false, true)) {
            Activity topActivity = C1717770unn.LIZIZ().getTopActivity();
            if (topActivity != null) {
                LLILZ = new WeakReference<>(topActivity);
                LL.LIZ(topActivity);
            }
            C1717770unn.LIZJ().getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    public final void LIZ(Activity activity) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJZL(this, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (C1717770unn.LIZIZ().isAppBackGround()) {
            Stack<WeakReference<Fragment>> stack = LLILLJJLI;
            if (!stack.isEmpty()) {
                C128Y c128y = (Fragment) stack.peek().get();
                if (c128y instanceof InterfaceC1724030uxt) {
                    ((InterfaceC1724030uxt) c128y).bF();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C1717770unn.LIZIZ().isAppBackGround()) {
            if (bundle != null && bundle.getInt("IS_PIPO_PAGE") == 1) {
                LIZ(activity);
                return;
            }
            return;
        }
        LIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        if (C1717770unn.LIZIZ().isAppBackGround() && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof InterfaceC1724030uxt) {
                    bundle.putInt("IS_PIPO_PAGE", 1);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        Activity activity;
        FragmentManager supportFragmentManager;
        int iHashCode;
        int iHashCode2;
        super.onFragmentDestroyed(fragmentManager, fragment);
        if (fragment instanceof InterfaceC1724030uxt) {
            Stack<WeakReference<Fragment>> stack = LLILLJJLI;
            if (!stack.isEmpty()) {
                Fragment fragment2 = stack.peek().get();
                if (fragment2 != null) {
                    iHashCode2 = fragment2.hashCode();
                } else {
                    iHashCode2 = 0;
                }
                if (iHashCode2 == fragment.hashCode() && !C1717770unn.LIZIZ().isAppBackGround()) {
                    ((InterfaceC1724030uxt) fragment).cv();
                }
            }
            int i = -1;
            int i2 = 0;
            for (Object obj : stack) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Object obj2 = ((Reference) obj).get();
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == fragment.hashCode()) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i >= 0) {
                LLILLJJLI.removeElementAt(i);
            }
            if (!C1717770unn.LIZIZ().isAppBackGround() && LLILLJJLI.isEmpty()) {
                C1717770unn.LIZJ().getApplication().unregisterActivityLifecycleCallbacks(this);
                WeakReference<Activity> weakReference = LLILZ;
                if (weakReference != null && (activity = weakReference.get()) != null) {
                    C1724020uxs c1724020uxs = LL;
                    c1724020uxs.getClass();
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        supportFragmentManager.LLIILZL(c1724020uxs);
                    }
                }
                LLILLL.set(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC813200VvC
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        Fragment parentFragment = fragment.getParentFragment();
        if (!(fragment instanceof DialogFragment)) {
            if (parentFragment == null || (parentFragment instanceof TuxSheet)) {
                Stack<WeakReference<Fragment>> stack = LLILLJJLI;
                if (!stack.isEmpty()) {
                    C128Y c128y = (Fragment) stack.peek().get();
                    if (c128y instanceof InterfaceC1724030uxt) {
                        ((InterfaceC1724030uxt) c128y).vg();
                    }
                }
                if (fragment instanceof InterfaceC1724030uxt) {
                    ((InterfaceC1724030uxt) fragment).Hz();
                    stack.push(new WeakReference<>(fragment));
                }
            }
        }
    }
}
