package X;

import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;

/* JADX INFO: renamed from: X.0Vjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl", f = "TraceLogImpl.kt", l = {276, 284, 289}, m = "uploadRightNowWith4kbLimit")
public final class C806130Vjn extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TraceLogImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806130Vjn(TraceLogImpl traceLogImpl, InterfaceC1364105Vn<? super C806130Vjn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = traceLogImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceLogImpl@8707.uploadRightNowWith4kbLimit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(this);
        C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith4kbLimit$1");
        return objLJIIIIZZ;
    }
}
