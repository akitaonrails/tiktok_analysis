package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$1", f = "CreatorRankingPageViewModel.kt", l = {158}, m = "invokeSuspend")
public final class C860990Xq5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860990Xq5(CreatorRankingPageViewModel creatorRankingPageViewModel, InterfaceC1364105Vn<? super C860990Xq5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860990Xq5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.<init>$1");
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
            CreatorRankingPageViewModel creatorRankingPageViewModel = this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951 = creatorRankingPageViewModel.LLJJIII.LIZLLL;
            C861000Xq6 c861000Xq6 = new C861000Xq6(creatorRankingPageViewModel, null);
            this.LL = 1;
            if (C09IC.LJII(anonymousClass0951, this, c861000Xq6) == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.<init>$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
