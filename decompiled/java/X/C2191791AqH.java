package X;

import com.bytedance.applog.priority.PriorityCallback;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.1AqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191791AqH extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ RunnableC2191761AqE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191791AqH(C2185208hG c2185208hG, RunnableC2191761AqE runnableC2191761AqE) {
        super(c2185208hG);
        this.LL = runnableC2191761AqE;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        RunnableC2191761AqE runnableC2191761AqE = this.LL;
        runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZJ.LIZIZ("Worker:coroutineScope", th, new AwS404S0200000_3(runnableC2191761AqE, th, 75));
        PriorityCallback priorityCallback = this.LL.LLILLJJLI.LIZIZ.LIZIZ.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Worker ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" CoroutineScope error");
        priorityCallback.monitorError(C2188811AlT.LIZIZ(sbLIZ), th.toString());
    }
}
