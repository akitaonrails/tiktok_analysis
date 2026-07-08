package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309730CCd extends C09AY implements Function0<Handler> {
    public C309730CCd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(Looper.getMainLooper());
    }
}
