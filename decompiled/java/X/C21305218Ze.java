package X;

import com.bytedance.applog.util.BlockHelper;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.18Ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21305218Ze extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C21305318Zf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21305218Ze(C2185208hG c2185208hG, C21305318Zf c21305318Zf) {
        super(c2185208hG);
        this.LL = c21305318Zf;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskExecutor#execute handler catch: ");
        sbLIZ.append(th);
        C20441214yg.LJ("LiveBroadcastLogBlockHelper", C2188811AlT.LIZIZ(sbLIZ));
        C21305318Zf c21305318Zf = this.LL;
        if (c21305318Zf.LJFF.get()) {
            c21305318Zf.LJFF.set(false);
            BlockHelper.endBlock();
            BlockHelper.setBlockInterval(c21305318Zf.LJI);
        }
    }
}
