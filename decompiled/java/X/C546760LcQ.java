package X;

import com.ss.android.ugc.aweme.aigc.AICreateServiceImpl;

/* JADX INFO: renamed from: X.0LcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AICreateServiceImpl", f = "AICreateServiceImpl.kt", l = {141, 146}, m = "observeWorkflowStateManul")
public final class C546760LcQ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AICreateServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546760LcQ(AICreateServiceImpl aICreateServiceImpl, InterfaceC1364105Vn<? super C546760LcQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aICreateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreateServiceImpl@9f29.observeWorkflowStateManul$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLw = this.LLILLL.lw(null, this);
        C1C7U.LIZIZ("AICreateServiceImpl@9f29.observeWorkflowStateManul$1");
        return objLw;
    }
}
