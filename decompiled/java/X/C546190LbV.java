package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;

/* JADX INFO: renamed from: X.0LbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl", f = "AITaskServiceImpl.kt", l = {329}, m = "queryServerTaskIdForOldArchFramework")
public final class C546190LbV extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AITaskServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546190LbV(AITaskServiceImpl aITaskServiceImpl, InterfaceC1364105Vn<? super C546190LbV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aITaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.queryServerTaskIdForOldArchFramework$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, null, this);
        C1C7U.LIZIZ("AITaskServiceImpl@999e.queryServerTaskIdForOldArchFramework$1");
        return objLJIIIIZZ;
    }
}
