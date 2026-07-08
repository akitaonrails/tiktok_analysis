package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeStatDelta;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel$submitFeedStat$1", f = "VibeFeedConsumeViewModel.kt", l = {414}, m = "invokeSuspend")
public final class C05HB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VibeFeedConsumeViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HB(VibeFeedConsumeViewModel vibeFeedConsumeViewModel, boolean z, long j, InterfaceC1364105Vn<? super C05HB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedConsumeViewModel;
        this.LLILLL = z;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("VibeFeedConsumeViewModel@bb27.submitFeedStat$1");
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
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel = this.LLILLJJLI;
            VibeStatDelta[] vibeStatDeltaArr = new VibeStatDelta[2];
            Integer numLJ = C2286608xc.LJ(C05HC.SUMMARY_STATS_TYPE_HISTORY_DAYS_TOGETHER.getValue());
            if (this.LLILLL) {
                j = 1;
            } else {
                j = 0;
            }
            vibeStatDeltaArr[0] = new VibeStatDelta(numLJ, C2286608xc.LJFF(j));
            vibeStatDeltaArr[1] = new VibeStatDelta(C2286608xc.LJ(C05HC.SUMMARY_STATS_TYPE_HISTORY_TIME_SPEND_SECONDS.getValue()), C2286608xc.LJFF(this.LLILZ));
            List<VibeStatDelta> listLJIIJJI = C1697810uHb.LJIIJJI(vibeStatDeltaArr);
            this.LL = 1;
            if (vibeFeedConsumeViewModel.wQ2(listLJIIJJI, this) == objLJFF) {
                C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.submitFeedStat$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.submitFeedStat$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
