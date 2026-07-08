package com.bytedance.als.extensions;

import X.C01GW;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import Y.ARunnableS17S0400000_8;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LifecycleOwnerExtensionsKt {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(40));
    public static final AFwS194S0000000_8 LIZIZ = AFwS194S0000000_8.get$arr$(39);

    public static final Function0<Unit> LIZ(LifecycleOwner lifecycleOwner, Runnable runnable) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return LIZIZ;
        }
        Pair<Runnable, Function0<Unit>> pairLIZLLL = LIZLLL(lifecycleOwner, runnable);
        C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), pairLIZLLL.getFirst());
        return pairLIZLLL.getSecond();
    }

    public static final Function0<Unit> LIZJ(LifecycleOwner lifecycleOwner, Runnable runnable) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                return LIZIZ;
            }
            runnable.run();
            return LIZIZ;
        }
        return LIZ(lifecycleOwner, runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlin.jvm.internal.AFwS194S0000000_8] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object, kotlin.jvm.internal.AwS552S0100000_8] */
    public static final Pair<Runnable, Function0<Unit>> LIZLLL(final LifecycleOwner lifecycleOwner, Runnable runnable) {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = LIZIZ;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.bytedance.als.extensions.LifecycleOwnerExtensionsKt$wrapRunnable$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    Function0<Unit> function0 = c259800zU.element;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        ARunnableS17S0400000_8 aRunnableS17S0400000_8 = new ARunnableS17S0400000_8(c259800zU, runnable, lifecycleOwner, lifecycleEventObserver, 0);
        ?? awS552S0100000_8 = new AwS552S0100000_8(aRunnableS17S0400000_8, 19);
        c259800zU.element = awS552S0100000_8;
        return new Pair<>(aRunnableS17S0400000_8, awS552S0100000_8);
    }

    public static final void LIZIZ(LifecycleOwner lifecycleOwner, long j, Runnable runnable) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        Pair<Runnable, Function0<Unit>> pairLIZLLL = LIZLLL(lifecycleOwner, runnable);
        C786410Ut5.LJLIIL(j, (Handler) LIZ.getValue(), pairLIZLLL.getFirst());
        pairLIZLLL.getSecond();
    }
}
