package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$1$1", f = "CreatorRankingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C861000Xq6 extends C09AX implements Function2<C861060XqC, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861000Xq6(CreatorRankingPageViewModel creatorRankingPageViewModel, InterfaceC1364105Vn<? super C861000Xq6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C861000Xq6 c861000Xq6 = new C861000Xq6(this.LLILLJJLI, interfaceC1364105Vn);
        c861000Xq6.LL = obj;
        return c861000Xq6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C861060XqC c861060XqC = (C861060XqC) this.LL;
        this.LLILLJJLI.LLJJI.setValue(c861060XqC);
        CreatorRankingPageViewModel creatorRankingPageViewModel = this.LLILLJJLI;
        C2252321DDq c2252321DDq = creatorRankingPageViewModel.LL;
        c2252321DDq.setValue(creatorRankingPageViewModel.wQ2((C1785460wYy) c2252321DDq.getValue(), c861060XqC));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C861060XqC c861060XqC, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c861060XqC, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
