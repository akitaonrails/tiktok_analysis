package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1575206Es extends C09AY implements Function0<Handler> {
    public final /* synthetic */ C1575106Er LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575206Es(C1575106Er c1575106Er) {
        super(0);
        this.LL = c1575106Er;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(Looper.getMainLooper(), this.LL);
    }
}
