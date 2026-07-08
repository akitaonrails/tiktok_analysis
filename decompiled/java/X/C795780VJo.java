package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0VJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795780VJo {
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public final Object LIZIZ = new Object();
    public final HandlerThread LIZJ;
    public volatile BPEAHandler LIZLLL;

    public C795780VJo() {
        HandlerThread handlerThread = new HandlerThread("NewLego-HandlerThread");
        this.LIZJ = handlerThread;
        handlerThread.start();
    }
}
