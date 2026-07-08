package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel$dismissDizzinessEffect$2", f = "MatchHammerViewModel.kt", l = {1089}, m = "invokeSuspend")
public final class C755820Tkq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MatchHammerViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C755820Tkq(MatchHammerViewModel matchHammerViewModel, InterfaceC1364105Vn<? super C755820Tkq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = matchHammerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C755820Tkq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchHammerViewModel@6ded.dismissDizzinessEffect$2");
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
            MatchHammerViewModel matchHammerViewModel = this.LLILLJJLI;
            this.LL = 1;
            if (matchHammerViewModel.DQ2(this) == objLJFF) {
                C1C7U.LIZIZ("MatchHammerViewModel@6ded.dismissDizzinessEffect$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchHammerViewModel@6ded.dismissDizzinessEffect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
