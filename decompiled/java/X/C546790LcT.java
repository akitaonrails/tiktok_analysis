package X;

import Y.AgS289S0100000_8;

/* JADX INFO: renamed from: X.0LcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AICreateServiceImpl$observeWorkflowStateManul$$inlined$map$1$2", f = "AICreateServiceImpl.kt", l = {224, 223}, m = "emit")
public final class C546790LcT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS289S0100000_8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546790LcT(AgS289S0100000_8 agS289S0100000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS289S0100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreateServiceImpl@9f29.observeWorkflowStateManul$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("AICreateServiceImpl@9f29.observeWorkflowStateManul$$inlined$map$1$2$1");
        return objEmit;
    }
}
