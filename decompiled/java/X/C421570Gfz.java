package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421570Gfz {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS106S0100000_6((Function0) function0, 1));
        }
    }
}
