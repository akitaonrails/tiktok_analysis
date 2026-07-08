package X;

import com.bytedance.crash.Npth;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0y1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841740y1k extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C1841740y1k(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(108);
        c2153908cD.getClass();
        C2153908cD.LIZ("ExploreCustomTopicDataSource", aFwS216S0000000_27);
        Npth.reportBizException("explore", th, "ExploreCustomTopicDataSource fetch topic response error", C2097608Jq.LJ());
    }
}
