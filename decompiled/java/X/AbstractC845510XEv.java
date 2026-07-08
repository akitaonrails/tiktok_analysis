package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0XEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC845510XEv<T> {
    public static final ExecutorService LIZ = C786410Ut5.h4();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public abstract T LIZ();

    public abstract void LIZIZ(T t);
}
