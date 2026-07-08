package X;

import Y.AgS76S1200000_8;

/* JADX INFO: renamed from: X.0LcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AICreateServiceImpl$observeWorkflowState$$inlined$map$1$2", f = "AICreateServiceImpl.kt", l = {224, 223}, m = "emit")
public final class C546800LcU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS76S1200000_8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546800LcU(AgS76S1200000_8 agS76S1200000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS76S1200000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreateServiceImpl@9f29.observeWorkflowState$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("AICreateServiceImpl@9f29.observeWorkflowState$$inlined$map$1$2$1");
        return objEmit;
    }
}
