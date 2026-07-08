package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CFP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFP extends C09AY implements Function0<Handler> {
    public C0CFP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        C01GW c01gw = C799570VYd.LJIIJJI;
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2((HandlerThread) c01gw.getValue()));
        Process.setThreadPriority(((HandlerThread) c01gw.getValue()).getThreadId(), -20);
        return bPEAHandler;
    }
}
