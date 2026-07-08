package X;

import com.bytedance.android.live.network.response.BaseListResponse;

/* JADX INFO: renamed from: X.0Ivm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toplive.repo.ToplivePageDataManager", f = "ToplivePageDataManager.kt", l = {208}, m = "requestFeed")
public final class C482320Ivm extends AbstractC23140094w {
    public BaseListResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C482300Ivk LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482320Ivm(C482300Ivk c482300Ivk, InterfaceC1364105Vn<? super C482320Ivm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c482300Ivk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToplivePageDataManager@4bca.requestFeed$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(this);
        C1C7U.LIZIZ("ToplivePageDataManager@4bca.requestFeed$1");
        return objLIZLLL;
    }
}
