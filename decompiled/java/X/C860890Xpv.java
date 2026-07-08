package X;

import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment$onViewCreated$2$1$1$1", f = "CreatorRankingSubPageFragment.kt", l = {}, m = "invokeSuspend")
public final class C860890Xpv extends C09AX implements Function2<InterfaceC1785530wZ5, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingSubPageFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860890Xpv(CreatorRankingSubPageFragment creatorRankingSubPageFragment, int i, InterfaceC1364105Vn<? super C860890Xpv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingSubPageFragment;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C860890Xpv c860890Xpv = new C860890Xpv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c860890Xpv.LL = obj;
        return c860890Xpv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1785530wZ5 interfaceC1785530wZ5 = (InterfaceC1785530wZ5) this.LL;
        if (interfaceC1785530wZ5 instanceof C860900Xpw) {
            CreatorRankingSubPageFragment creatorRankingSubPageFragment = this.LLILLJJLI;
            C860900Xpw c860900Xpw = (C860900Xpw) interfaceC1785530wZ5;
            int i = this.LLILLL;
            creatorRankingSubPageFragment.getClass();
            creatorRankingSubPageFragment.PR(c860900Xpw.LIZ, c860900Xpw.LIZIZ, i, new AwS558S0100000_14(creatorRankingSubPageFragment, 1798), AFwS201S0000000_14.get$arr$(617), AFwS201S0000000_14.get$arr$(616));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1785530wZ5 interfaceC1785530wZ5, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1785530wZ5, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
