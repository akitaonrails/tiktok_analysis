package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0HDV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HDV {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public static final ConcurrentHashMap<Integer, Boolean> LIZJ = new ConcurrentHashMap<>();
}
