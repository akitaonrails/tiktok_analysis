package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;

/* JADX INFO: renamed from: X.0LbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl", f = "AITaskServiceImpl.kt", l = {342, 359}, m = "queryServerTaskIdForNewArchFramework")
public final class C546180LbU extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AITaskServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546180LbU(AITaskServiceImpl aITaskServiceImpl, InterfaceC1364105Vn<? super C546180LbU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = aITaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.queryServerTaskIdForNewArchFramework$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, null, this);
        C1C7U.LIZIZ("AITaskServiceImpl@999e.queryServerTaskIdForNewArchFramework$1");
        return objLJII;
    }
}
