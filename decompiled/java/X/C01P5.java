package X;

import com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01P5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel$subscribeToMessageFlows$1", f = "AudienceRankingEntranceViewModel.kt", l = {69}, m = "invokeSuspend")
public final class C01P5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AudienceRankingEntranceViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01P5(AudienceRankingEntranceViewModel audienceRankingEntranceViewModel, InterfaceC1364105Vn<? super C01P5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = audienceRankingEntranceViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01P5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceRankingEntranceViewModel@5276.subscribeToMessageFlows$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AudienceRankingEntranceViewModel audienceRankingEntranceViewModel = this.LLILLJJLI;
            C2252331DDr c2252331DDr = audienceRankingEntranceViewModel.LLILZIL.LLILZ;
            C517001zs c517001zs = new C517001zs(audienceRankingEntranceViewModel, 23);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("AudienceRankingEntranceViewModel@5276.subscribeToMessageFlows$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
