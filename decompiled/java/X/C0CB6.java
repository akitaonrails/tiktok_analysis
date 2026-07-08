package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CB6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CB6 extends C09AY implements Function0<Handler> {
    public C0CB6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        HandlerThread handlerThread = new HandlerThread("pschedulerHandler");
        handlerThread.start();
        return new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
