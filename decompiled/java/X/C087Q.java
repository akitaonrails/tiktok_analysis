package X;

import Y.ACallableS411S0100000_3;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.087Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C087Q {
    public static final void LIZ(Function0<Unit> function0) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            C15O7.LIZIZ(new ACallableS411S0100000_3((Function0) function0, 33), C15O7.LJI, null);
        } else {
            function0.invoke();
        }
    }
}
