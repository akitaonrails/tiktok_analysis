package X;

import com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01P4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel$initAudienceRankingEntranceData$1", f = "AudienceRankingEntranceViewModel.kt", l = {98}, m = "invokeSuspend")
public final class C01P4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AudienceRankingEntranceViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01P4(AudienceRankingEntranceViewModel audienceRankingEntranceViewModel, InterfaceC1364105Vn<? super C01P4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = audienceRankingEntranceViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01P4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceRankingEntranceViewModel@5276.initAudienceRankingEntranceData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C01PF c01pf = this.LLILLJJLI.LLILLJJLI;
                this.LL = 1;
                obj = c01pf.LIZJ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AudienceRankingEntranceViewModel@5276.initAudienceRankingEntranceData$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LLILZLL.setValue((C148100hT) obj);
            C20441214yg.LIZIZ("AudienceRankingEntranceViewModel", "init data success");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init data failure: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJFF("AudienceRankingEntranceViewModel", C2188811AlT.LIZIZ(sbLIZ), e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudienceRankingEntranceViewModel@5276.initAudienceRankingEntranceData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
