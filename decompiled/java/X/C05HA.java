package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeStatDelta;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel$submitAndFetchSummaryStat$1", f = "VibeFeedConsumeViewModel.kt", l = {365, 371}, m = "invokeSuspend")
public final class C05HA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VibeFeedConsumeViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HA(VibeFeedConsumeViewModel vibeFeedConsumeViewModel, long j, InterfaceC1364105Vn<? super C05HA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedConsumeViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedConsumeViewModel@bb27.submitAndFetchSummaryStat$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.submitAndFetchSummaryStat$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel = this.LLILLJJLI;
            List<VibeStatDelta> listLJIIJJI = C1697810uHb.LJIIJJI(new VibeStatDelta(C2286608xc.LJ(C05HC.SUMMARY_STATS_TYPE_HISTORY_DAYS_TOGETHER.getValue()), C2286608xc.LJFF(1L)), new VibeStatDelta(C2286608xc.LJ(C05HC.SUMMARY_STATS_TYPE_HISTORY_TIME_SPEND_SECONDS.getValue()), C2286608xc.LJFF(this.LLILLL)));
            this.LL = 1;
            if (vibeFeedConsumeViewModel.wQ2(listLJIIJJI, this) == objLJFF) {
                C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.submitAndFetchSummaryStat$1");
                return objLJFF;
            }
        }
        VibeFeedConsumeViewModel vibeFeedConsumeViewModel2 = this.LLILLJJLI;
        this.LL = 2;
        if (vibeFeedConsumeViewModel2.vQ2(this) == objLJFF) {
            C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.submitAndFetchSummaryStat$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.submitAndFetchSummaryStat$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
