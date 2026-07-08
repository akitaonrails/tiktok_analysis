package X;

import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205850hU7 {
    public static final void LIZIZ(Lifecycle lifecycle, boolean z, DefaultLifecycleObserver defaultLifecycleObserver) {
        if (z) {
            ARunnableS87S0200000_18 aRunnableS87S0200000_18 = new ARunnableS87S0200000_18(new WeakReference(lifecycle), defaultLifecycleObserver, 22);
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                aRunnableS87S0200000_18.run();
            } else {
                C15O7.LJIIIIZZ.execute(aRunnableS87S0200000_18);
            }
        }
    }

    public static final void LIZ(Context context, boolean z, DefaultLifecycleObserver defaultLifecycleObserver, Function1<? super C19EG, ? extends Lifecycle> function1) {
        C19EG c19egLIZIZ;
        if (z && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            LIZIZ(function1.invoke(c19egLIZIZ), z, defaultLifecycleObserver);
        }
    }
}
