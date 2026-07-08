package X;

import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo$handleChunkResult$5", f = "BaseMixLoadMoreRepo.kt", l = {558}, m = "invokeSuspend")
public final class C677590Qhx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixPageViewModel LLILLJJLI;
    public final /* synthetic */ C1422405hW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677590Qhx(MixPageViewModel mixPageViewModel, C1422405hW c1422405hW, InterfaceC1364105Vn<? super C677590Qhx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixPageViewModel;
        this.LLILLL = c1422405hW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677590Qhx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixLoadMoreRepo@9cb2.handleChunkResult$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DEK c1dek = this.LLILLJJLI.LLILZLL;
            C1397005dQ c1397005dQ = new C1397005dQ(this.LLILLL);
            this.LL = 1;
            if (c1dek.LJIJI(c1397005dQ, this) == objLJFF) {
                C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.handleChunkResult$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.handleChunkResult$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
