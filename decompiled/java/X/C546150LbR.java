package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;

/* JADX INFO: renamed from: X.0LbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl", f = "AITaskServiceImpl.kt", l = {360, 260, 269, 295}, m = "deleteCloudDraftByTaskId")
public final class C546150LbR extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1DEU LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AITaskServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546150LbR(AITaskServiceImpl aITaskServiceImpl, InterfaceC1364105Vn<? super C546150LbR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = aITaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.deleteCloudDraftByTaskId$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("AITaskServiceImpl@999e.deleteCloudDraftByTaskId$1");
        return objLIZLLL;
    }
}
