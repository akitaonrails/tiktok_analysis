package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526110pof extends C09AY implements Function0<Handler> {
    public C1526110pof() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get());
    }
}
