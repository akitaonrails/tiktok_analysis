package X;

import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Vjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl", f = "TraceLogImpl.kt", l = {337, 339, 342}, m = "retryWithBackoff")
public final class C806120Vjm<T> extends AbstractC23140094w {
    public Function1 LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ TraceLogImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806120Vjm(TraceLogImpl traceLogImpl, InterfaceC1364105Vn<? super C806120Vjm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = traceLogImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceLogImpl@8707.retryWithBackoff$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(0, this, null);
        C1C7U.LIZIZ("TraceLogImpl@8707.retryWithBackoff$1");
        return objLJ;
    }
}
