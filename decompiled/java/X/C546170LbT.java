package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;

/* JADX INFO: renamed from: X.0LbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl", f = "AITaskServiceImpl.kt", l = {201}, m = "checkDraftAndCameoPermissions")
public final class C546170LbT extends AbstractC23140094w {
    public InterfaceC546090LbL LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AITaskServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546170LbT(AITaskServiceImpl aITaskServiceImpl, InterfaceC1364105Vn<? super C546170LbT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aITaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, null, null, null, false, this);
        C1C7U.LIZIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$1");
        return objLJI;
    }
}
