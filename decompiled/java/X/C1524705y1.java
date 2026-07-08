package X;

import Y.ACallableS410S0100000_2;
import Y.ARunnableS102S0100000_2;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05y1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524705y1 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static ARunnableS102S0100000_2 LIZJ;

    public static void LIZ(Function0 function0) {
        ExecutorService executorService = C15O7.LJI;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C15O7.LIZIZ(new ACallableS410S0100000_2(function0, 11), executorService, null);
        } else {
            function0.invoke();
        }
    }

    public static final void LIZJ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS102S0100000_2(function0, 74));
        }
    }

    public static final void LIZIZ(long j, Runnable runnable) {
        if (j > 0) {
            C786410Ut5.LJLIIL(j, LIZ, runnable);
        } else {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        }
    }
}
