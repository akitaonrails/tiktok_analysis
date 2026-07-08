package X;

import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536830L3p {
    public static final C377010EqJ LIZ = new C377010EqJ(new BPEAHandler(Looper.getMainLooper()));

    public static void LIZ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS106S0100000_6(function0, 273));
        }
    }
}
