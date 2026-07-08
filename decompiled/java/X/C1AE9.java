package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AE9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AE9 extends C09AY implements Function0<Handler> {
    public C1AE9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        C1AE5.LIZ.getClass();
        return new BPEAHandler(C786410Ut5.W2((HandlerThread) C1AE5.LIZJ.getValue()));
    }
}
