package X;

import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;

/* JADX INFO: renamed from: X.0Vjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl", f = "TraceLogImpl.kt", l = {253, 255, 270}, m = "uploadRightNowWith10kbLimit")
public final class C806140Vjo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TraceLogImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806140Vjo(TraceLogImpl traceLogImpl, InterfaceC1364105Vn<? super C806140Vjo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = traceLogImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(this);
        C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$1");
        return objLJII;
    }
}
