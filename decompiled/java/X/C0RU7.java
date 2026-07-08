package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RU7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RU7 extends C09AY implements Function0<Handler> {
    public C0RU7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new BPEAHandler(Looper.getMainLooper());
    }
}
