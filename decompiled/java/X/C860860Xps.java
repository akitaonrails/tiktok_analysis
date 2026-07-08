package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment$onViewCreated$2$1", f = "CreatorRankingSubPageFragment.kt", l = {104}, m = "invokeSuspend")
public final class C860860Xps extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreatorRankingSubPageFragment LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860860Xps(CreatorRankingSubPageFragment creatorRankingSubPageFragment, int i, InterfaceC1364105Vn<? super C860860Xps> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creatorRankingSubPageFragment;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C860860Xps c860860Xps = new C860860Xps(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c860860Xps.LLILLJJLI = obj;
        return c860860Xps;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1");
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
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI, null, null, new C860870Xpt(this.LLILLL, this.LLILZ, null), 3);
            CreatorRankingPageViewModel creatorRankingPageViewModelNR = this.LLILLL.NR();
            final int i2 = this.LLILZ;
            final AnonymousClass0951 anonymousClass0951 = creatorRankingPageViewModelNR.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C914070ZtV(new InterfaceC346201Wa<C1785320wYk>() { // from class: X.0Xpu
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C1785320wYk> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = anonymousClass0951.collect(new C861750XrJ(interfaceC346701Wf, i2), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            }, creatorRankingPageViewModelNR, 1));
            C1785850wZb c1785850wZb = new C1785850wZb(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C09IC.LJII(interfaceC346201WaLJIILL, this, c1785850wZb) == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
