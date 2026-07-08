package X;

import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;

/* JADX INFO: renamed from: X.0Qi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo", f = "BaseMixLoadMoreRepo.kt", l = {166, 219, 221}, m = "doLoadMoreNoChunkRequest")
public final class C677620Qi0 extends AbstractC23140094w {
    public C675270QeD LL;
    public MixPageViewModel LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC677510Qhp LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677620Qi0(AbstractC677510Qhp abstractC677510Qhp, InterfaceC1364105Vn<? super C677620Qi0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC677510Qhp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreNoChunkRequest$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZIL.LJFF(null, null, null, null, null, this);
        C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreNoChunkRequest$1");
        return objLJFF;
    }
}
