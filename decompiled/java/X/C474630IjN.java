package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474630IjN extends C09AY implements Function0<Handler> {
    public C474630IjN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        HandlerThread handlerThreadLJFF = C1BZJ.LJFF();
        handlerThreadLJFF.start();
        return new BPEAHandler(C786410Ut5.W2(handlerThreadLJFF));
    }
}
