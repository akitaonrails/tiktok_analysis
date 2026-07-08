package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891410zJr extends C09AY implements Function0<Executor> {
    public final /* synthetic */ C1891380zJo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891410zJr(C1891380zJo c1891380zJo) {
        super(0);
        this.LL = c1891380zJo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Executor invoke() {
        this.LL.LJ.LJLZ();
        return new Executor() { // from class: X.0T3r
            public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C786410Ut5.LJJZZIII(this.LL, runnable);
            }
        };
    }
}
