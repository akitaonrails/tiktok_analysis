package X;

import Y.ARunnableS22S0110000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07zG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2042007zG {
    public static final C2042007zG LIZ = new C2042007zG();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ(Function1 function1, boolean z) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function1.invoke(Boolean.valueOf(z));
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new ARunnableS22S0110000_3(function1, z, 1));
        }
    }
}
