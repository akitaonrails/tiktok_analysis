package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525610pnr extends C09AY implements Function0<Handler> {
    public final /* synthetic */ C1525590pnp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525610pnr(C1525590pnp c1525590pnp) {
        super(0);
        this.LL = c1525590pnp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get(), this.LL);
    }
}
