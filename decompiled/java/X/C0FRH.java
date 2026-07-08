package X;

import Y.ARunnableS105S0100000_5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FRH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRH {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS105S0100000_5(function0, (Function0<Unit>) 111));
        }
    }

    public static final void LIZIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJL(LIZ, new ARunnableS105S0100000_5(function0, (Function0<Unit>) 112));
        }
    }
}
