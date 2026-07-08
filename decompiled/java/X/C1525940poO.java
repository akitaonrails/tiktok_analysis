package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0poO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525940poO extends C09AY implements Function0<Handler> {
    public final /* synthetic */ C1525920poM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525940poO(C1525920poM c1525920poM) {
        super(0);
        this.LL = c1525920poM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get(), this.LL);
    }
}
