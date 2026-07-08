package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0rx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608220rx6 {
    public static final Looper LIZ;
    public static final BPEAHandler LIZIZ;

    static {
        Looper mainLooper = Looper.getMainLooper();
        LIZ = mainLooper;
        LIZIZ = new BPEAHandler(mainLooper);
    }
}
