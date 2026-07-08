package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01TT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01TT {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final boolean LIZ() {
        return Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread());
    }

    public static final void LIZJ(Function0<Unit> function0) {
        C786410Ut5.LJJZZIII(LIZ, new RunnableC514801zW(function0, (Function0<Unit>) 104));
    }

    public static final void LIZLLL(Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new RunnableC514801zW(function0, (Function0<Unit>) 104));
        }
    }

    public static final void LIZIZ(long j, Function0<Unit> function0) {
        C786410Ut5.LJLIIL(j, LIZ, new RunnableC514801zW(function0, (Function0<Unit>) 104));
    }
}
