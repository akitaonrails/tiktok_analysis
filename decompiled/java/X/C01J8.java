package X;

import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionViewModel;
import com.bytedance.android.livesdk.livesetting.grouplive.GroupLiveConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01J8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionViewModel$onCountdownEndWithoutEndMessage$2$2", f = "TimedCompetitionViewModel.kt", l = {162}, m = "invokeSuspend")
public final class C01J8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TimedCompetitionViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01J8(TimedCompetitionViewModel timedCompetitionViewModel, long j, long j2, int i, InterfaceC1364105Vn<? super C01J8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = timedCompetitionViewModel;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01J8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$2$2");
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
            long j = ((long) GroupLiveConfig.INSTANCE.getGetValue().matchConfig.checkResultRetryInterval) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$2$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.vQ2(this.LLILZIL - 1, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TimedCompetitionViewModel@f986.onCountdownEndWithoutEndMessage$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
