package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$consumeMatchRecommendResult$3$1", f = "CreatorRankingPageViewModel.kt", l = {461, 466}, m = "invokeSuspend")
public final class C1783580wVw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;
    public final /* synthetic */ C1778060wN2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783580wVw(CreatorRankingPageViewModel creatorRankingPageViewModel, C1778060wN2 c1778060wN2, InterfaceC1364105Vn<? super C1783580wVw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
        this.LLILLL = c1778060wN2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783580wVw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1785460wYy c1785460wYyLIZLLL;
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.consumeMatchRecommendResult$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.consumeMatchRecommendResult$3$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1785350wYn c1785350wYnGQ2 = this.LLILLJJLI.GQ2();
            C1778060wN2 c1778060wN2 = this.LLILLL;
            this.LL = 1;
            obj = c1785350wYnGQ2.LIZ(c1778060wN2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.consumeMatchRecommendResult$3$1");
                return objLJFF;
            }
        }
        InterfaceC1778050wN1 interfaceC1778050wN1 = (InterfaceC1778050wN1) obj;
        CreatorRankingPageViewModel creatorRankingPageViewModel = this.LLILLJJLI;
        C2252321DDq c2252321DDq = creatorRankingPageViewModel.LL;
        creatorRankingPageViewModel.GQ2();
        C1785460wYy c1785460wYy = (C1785460wYy) this.LLILLJJLI.LL.getValue();
        if (interfaceC1778050wN1 instanceof C1778030wMz) {
            c1785460wYyLIZLLL = C1785350wYn.LIZLLL(c1785460wYy, ((C1778030wMz) interfaceC1778050wN1).LIZ, new AwS606S0100000_27(interfaceC1778050wN1, 579));
        } else if (interfaceC1778050wN1 instanceof C1778040wN0) {
            c1785460wYyLIZLLL = C1785350wYn.LIZLLL(c1785460wYy, ((C1778040wN0) interfaceC1778050wN1).LIZ, new AwS606S0100000_27(interfaceC1778050wN1, 580));
        } else {
            throw new C1954807lC();
        }
        c2252321DDq.setValue(c1785460wYyLIZLLL);
        CreatorRankingPageViewModel creatorRankingPageViewModel2 = this.LLILLJJLI;
        this.LL = 2;
        if (creatorRankingPageViewModel2.MQ2(interfaceC1778050wN1, this) == objLJFF) {
            C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.consumeMatchRecommendResult$3$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.consumeMatchRecommendResult$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
