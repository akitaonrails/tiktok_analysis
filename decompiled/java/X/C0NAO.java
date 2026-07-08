package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NAO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAO extends C09AY implements Function0<Handler> {
    public C0NAO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        return new BPEAHandler(C786410Ut5.W2((HandlerThread) C0NBO.LIZIZ.getValue()));
    }
}
