package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS95S1300000_13;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.01du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C380801du extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ Function2 LL;
    public final /* synthetic */ C259800zU LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, final Throwable th) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        final Function2 function2 = this.LL;
        final C259800zU c259800zU = this.LLILLJJLI;
        C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.00zA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OneClickLoginService@601d.oneClickLoginNew$exceptionHandler$1$1");
                try {
                    function2.invoke(th, c259800zU.element);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OneClickLoginService@601d.oneClickLoginNew$exceptionHandler$1$1");
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380801du(C2185208hG c2185208hG, AwS95S1300000_13 awS95S1300000_13, C259800zU c259800zU) {
        super(c2185208hG);
        this.LL = awS95S1300000_13;
        this.LLILLJJLI = c259800zU;
    }
}
