package X;

import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;

/* JADX INFO: renamed from: X.0Qhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixRefreshRepo", f = "BaseMixRefreshRepo.kt", l = {1100, 1212, 1237, 1247, 1250}, m = "realDoContentListRefreshWork")
public final class C677600Qhy extends AbstractC23140094w {
    public Object LL;
    public C677540Qhs LLILLJJLI;
    public MixPageViewModel LLILLL;
    public C675150Qe1 LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AbstractC677500Qho LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677600Qhy(AbstractC677500Qho abstractC677500Qho, InterfaceC1364105Vn<? super C677600Qhy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = abstractC677500Qho;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixRefreshRepo@8c91.realDoContentListRefreshWork$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLIZ.LJIILLIIL(null, null, null, this);
        C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.realDoContentListRefreshWork$1");
        return objLJIILLIIL;
    }
}
