package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.083X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C083X extends C09AY implements Function0<Handler> {
    public C083X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        HandlerThread handlerThread = new HandlerThread("forest_handler_thread");
        handlerThread.start();
        return new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
