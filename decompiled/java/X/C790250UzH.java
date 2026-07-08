package X;

import Y.ARunnableS113S0100000_13;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790250UzH {
    public static final C377010EqJ LIZ = new C377010EqJ(new BPEAHandler(Looper.getMainLooper()));

    public static final void LIZ(long j, Function0<Unit> function0) {
        if (j > 0) {
            C786410Ut5.LJLIIL(j, (Handler) LIZ.getValue(), new ARunnableS113S0100000_13(function0, (Function0<Unit>) 37));
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS113S0100000_13(function0, (Function0<Unit>) 38));
        }
    }

    public static final void LIZIZ(long j, Function0<Unit> function0) {
        if (j > 0) {
            C786410Ut5.LJLIIL(j, (Handler) LIZ.getValue(), new ARunnableS113S0100000_13(function0, (Function0<Unit>) 39));
        } else if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS113S0100000_13(function0, (Function0<Unit>) 40));
        }
    }
}
