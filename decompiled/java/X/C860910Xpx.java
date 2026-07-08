package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$guideCoordinator$2$1$1", f = "CreatorRankingPageViewModel.kt", l = {171}, m = "invokeSuspend")
public final class C860910Xpx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;
    public final /* synthetic */ InterfaceC1785530wZ5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860910Xpx(CreatorRankingPageViewModel creatorRankingPageViewModel, InterfaceC1785530wZ5 interfaceC1785530wZ5, InterfaceC1364105Vn<? super C860910Xpx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
        this.LLILLL = interfaceC1785530wZ5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860910Xpx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.guideCoordinator$2$1$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLIZLLLIL;
            InterfaceC1785530wZ5 interfaceC1785530wZ5 = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(interfaceC1785530wZ5, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.guideCoordinator$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.guideCoordinator$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
