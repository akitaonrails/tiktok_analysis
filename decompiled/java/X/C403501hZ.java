package X;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C403501hZ {
    public static final void LIZ(Function0<Unit> function0) {
        C405101hp c405101hp = C405101hp.LIZJ;
        if (C786410Ut5.W2(c405101hp.LIZIZ) != null && Intrinsics.LJFF(C786410Ut5.W2(c405101hp.LIZIZ), Looper.myLooper())) {
            function0.invoke();
            return;
        }
        RunnableC514801zW runnableC514801zW = new RunnableC514801zW(function0, (Function0<Unit>) 183);
        if (!c405101hp.LIZIZ.isAlive()) {
            C1CC2.LIZ("Link-Mic-Play-Thread not alive", new Throwable());
        }
        C786410Ut5.LJJZZIII(c405101hp.LIZ, runnableC514801zW);
    }
}
