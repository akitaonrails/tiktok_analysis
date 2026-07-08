package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Icb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel$syncWhenEnterRoom$1", f = "MatchItemViewModel.kt", l = {289}, m = "invokeSuspend")
public final class C470430Icb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ MatchItemViewModel LLILZ;
    public final /* synthetic */ BattleInfoResponse LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C470430Icb(long j, long j2, MatchItemViewModel matchItemViewModel, BattleInfoResponse battleInfoResponse, InterfaceC1364105Vn<? super C470430Icb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = matchItemViewModel;
        this.LLILZIL = battleInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C470430Icb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchItemViewModel@5b2b.syncWhenEnterRoom$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MatchItemViewModel@5b2b.syncWhenEnterRoom$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> MatchItemViewModel.syncWhenEnterRoom is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.LLILLL);
        C20441214yg.LIZIZ("MatchItemViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.yQ2(this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchItemViewModel@5b2b.syncWhenEnterRoom$1");
        return unit;
    }
}
