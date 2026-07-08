package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Bxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305190Bxl {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS104S0100000_4(function0, 128));
        }
    }
}
