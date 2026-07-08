package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0PHF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHF {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LIZ(C0PE2 c0pe2) {
        if (c0pe2 instanceof Fragment) {
            return (Fragment) c0pe2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LIZIZ(InterfaceC651320Pgg interfaceC651320Pgg) {
        if (interfaceC651320Pgg instanceof Fragment) {
            return (Fragment) interfaceC651320Pgg;
        }
        return null;
    }

    public static final InterfaceC651320Pgg LIZJ(View view) {
        Context context;
        C488690JEl c488690JElLJI;
        C128Y c128y;
        InterfaceC651320Pgg interfaceC651320Pgg;
        if (C1210904oV.LIZ() || !C1209904oL.LIZ()) {
            return null;
        }
        if (view != null && (context = view.getContext()) != null && (c488690JElLJI = LJI(context)) != null) {
            WeakReference<Fragment> weakReference = c488690JElLJI.LLIZ;
            if (weakReference != null) {
                c128y = (Fragment) weakReference.get();
            } else {
                c128y = null;
            }
            if ((c128y instanceof InterfaceC651320Pgg) && (interfaceC651320Pgg = (InterfaceC651320Pgg) c128y) != null) {
                return interfaceC651320Pgg;
            }
        }
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ == null) {
            return null;
        }
        return LIZLLL(fragmentLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC651320Pgg LIZLLL(Fragment fragment) {
        if (!C1210904oV.LIZ()) {
            if (!C1209904oL.LIZ()) {
                return null;
            }
            for (Fragment parentFragment = fragment; parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof InterfaceC651320Pgg) {
                    return (InterfaceC651320Pgg) parentFragment;
                }
            }
            return null;
        }
        return null;
    }

    public static final C0PE2 LJ(View view) {
        Context context;
        C488690JEl c488690JElLJI;
        C128Y c128y;
        C0PE2 c0pe2;
        if (C1210904oV.LIZ() || !C1209904oL.LIZ()) {
            return null;
        }
        if (view != null && (context = view.getContext()) != null && (c488690JElLJI = LJI(context)) != null) {
            WeakReference<Fragment> weakReference = c488690JElLJI.LLIZ;
            if (weakReference != null) {
                c128y = (Fragment) weakReference.get();
            } else {
                c128y = null;
            }
            if ((c128y instanceof C0PE2) && (c0pe2 = (C0PE2) c128y) != null) {
                return c0pe2;
            }
        }
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ == null) {
            return null;
        }
        return LJFF(fragmentLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0PE2 LJFF(Fragment fragment) {
        if (C1210904oV.LIZ()) {
            return null;
        }
        if (!C1209904oL.LIZ()) {
            return null;
        }
        for (Fragment parentFragment = fragment; parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof C0PE2) {
                return (C0PE2) parentFragment;
            }
        }
        return null;
    }

    public static final C488690JEl LJI(Context context) {
        if (context instanceof C488690JEl) {
            return (C488690JEl) context;
        }
        if (context instanceof ContextWrapper) {
            return LJI(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
