package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2119308Rz extends C09AY implements Function0<Handler> {
    public C2119308Rz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        HandlerThread handlerThread = new HandlerThread("HybridMonitorThread");
        handlerThread.start();
        return new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
