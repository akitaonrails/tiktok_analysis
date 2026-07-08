package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891400zJq extends C09AY implements Function0<Handler> {
    public C1891400zJq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(Looper.getMainLooper());
    }
}
