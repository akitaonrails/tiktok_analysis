package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackTriggerAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem$createWallClockDelayIfNeeded$3$1", f = "EarlyFeedbackButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C2168708eb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EarlyFeedbackButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168708eb(EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, InterfaceC1364105Vn<? super C2168708eb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = earlyFeedbackButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2168708eb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = this.LL;
        if (earlyFeedbackButtonAssem.LLLII) {
            earlyFeedbackButtonAssem.LLLII = false;
            earlyFeedbackButtonAssem.LLLI = null;
            EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp = earlyFeedbackButtonAssem.Jp();
            if (earlyFeedbackTriggerAbilityJp != null) {
                earlyFeedbackTriggerAbilityJp.LLLLLL(true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
