package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10K9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10K9 extends C09AY implements Function0<Handler> {
    public C10K9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler();
    }
}
