package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Hgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447550Hgn {
    public static final String LIZ(String str) {
        return u.LJJIFFI(u.LJJIFFI(str, "\n", "", false), "\t", " ", false);
    }

    public static final void LIZJ(Function0<Unit> function0) {
        C823050WQl.LIZJ().execute(new ARunnableS106S0100000_6((Function0) function0, 171));
    }

    public static final void LIZLLL(Function0<Unit> function0) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            function0.invoke();
        } else {
            C2487409ou.LIZJ(new ARunnableS106S0100000_6((Function0) function0, 171));
        }
    }

    public static final boolean LJ(LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        Boolean boolValueOf = null;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            boolValueOf = Boolean.valueOf(fragment.isHidden());
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return false;
        }
        return lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    public static final <T> C01GW<T> LJII(Function0<? extends T> function0) {
        return C452501pT.LIZ(EnumC452301pR.NONE, function0);
    }

    public static final void LIZIZ(View view, Function1<? super View, Boolean> function1) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            function1.invoke(view);
        } else {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            C786410Ut5.x3(viewTreeObserver, new ViewTreeObserverOnGlobalLayoutListenerC462860IDc(function1, view, viewTreeObserver, 0));
        }
    }

    public static final void LJFF(View view, Integer num, Integer num2) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        if (view.getLayoutParams() == null) {
            int iIntValue4 = -2;
            if (num != null) {
                iIntValue3 = num.intValue();
            } else {
                iIntValue3 = -2;
            }
            if (num2 != null) {
                iIntValue4 = num2.intValue();
            }
            C786410Ut5.W5(view, new ViewGroup.LayoutParams(iIntValue3, iIntValue4));
            return;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = view.getLayoutParams().width;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = view.getLayoutParams().height;
        }
        if (view.getLayoutParams().width == iIntValue && view.getLayoutParams().height == iIntValue2) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
