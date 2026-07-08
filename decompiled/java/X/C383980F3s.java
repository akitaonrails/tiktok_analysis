package X;

import Y.ARunnableS105S0100000_5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383980F3s {
    public static final C377010EqJ LIZ = new C377010EqJ(new BPEAHandler(Looper.getMainLooper()));

    public static void LIZIZ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new RunnableC514801zW(function0, (Function0<Unit>) 143));
        }
    }

    public static final void LIZ(long j, Function0<Unit> function0) {
        if (j > 0) {
            C786410Ut5.LJLIIL(j, (Handler) LIZ.getValue(), new ARunnableS105S0100000_5(function0, (Function0<Unit>) 118));
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS105S0100000_5(function0, (Function0<Unit>) 119));
        }
    }
}
