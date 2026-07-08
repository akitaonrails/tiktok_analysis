package X;

import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571760Mbe {
    public static final void LIZ(LifecycleOwner lifecycleOwner, GenericLifecycleObserver genericLifecycleObserver) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(lifecycleOwner, genericLifecycleObserver, 129));
        } else {
            C0R1H.LIZIZ(lifecycleOwner, genericLifecycleObserver);
        }
    }
}
