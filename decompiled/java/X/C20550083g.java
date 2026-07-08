package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.083g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20550083g {
    public static final void LIZ(Function0<Unit> function0) {
        boolean z;
        C20551083h c20551083h = C20551083h.LIZJ;
        if (C786410Ut5.W2(c20551083h.LIZIZ) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.LJFF(C786410Ut5.W2(c20551083h.LIZIZ), Looper.myLooper())) {
            C20441214yg.LIZIZ("GameBackgroundHolderUtil", "runOnFire, run immediately");
            function0.invoke();
            return;
        }
        C20441214yg.LIZIZ("GameBackgroundHolderUtil", "runOnFire, post to background thread");
        ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3((Function0) function0, 125);
        if (!c20551083h.LIZIZ.isAlive()) {
            C1CC2.LIZ("thread not alive", new Throwable());
        }
        C786410Ut5.LJJZZIII(c20551083h.LIZ, aRunnableS103S0100000_3);
    }
}
