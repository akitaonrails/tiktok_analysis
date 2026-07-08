package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787070Uu9 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static boolean LIZ() {
        return Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3());
    }
}
