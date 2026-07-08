package X;

import com.bytedance.android.live.network.response.BaseListResponse;

/* JADX INFO: renamed from: X.0Ivl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toplive.repo.ToplivePageDataManager", f = "ToplivePageDataManager.kt", l = {170}, m = "doRequestPage")
public final class C482310Ivl extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public BaseListResponse LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C482300Ivk LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482310Ivl(C482300Ivk c482300Ivk, InterfaceC1364105Vn<? super C482310Ivl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c482300Ivk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToplivePageDataManager@4bca.doRequestPage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, null, this);
        C1C7U.LIZIZ("ToplivePageDataManager@4bca.doRequestPage$1");
        return objLIZJ;
    }
}
