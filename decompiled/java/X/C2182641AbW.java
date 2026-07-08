package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182641AbW extends C09AY implements Function0<C1DFT> {
    public C2182641AbW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1DFT invoke() {
        return new C2232408os(C786410Ut5.i4(new ThreadFactory() { // from class: X.1AbX
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                BPEAThread bPEAThread = new BPEAThread(runnable, "LinkMicLayoutDslReader");
                bPEAThread.setDaemon(true);
                return bPEAThread;
            }
        }));
    }
}
