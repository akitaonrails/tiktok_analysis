package X;

import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem$createWallClockDelayIfNeeded$3", f = "EarlyFeedbackButtonAssem.kt", l = {488, 489}, m = "invokeSuspend")
public final class C2168608ea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ EarlyFeedbackButtonAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168608ea(long j, EarlyFeedbackButtonAssem earlyFeedbackButtonAssem, InterfaceC1364105Vn<? super C2168608ea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = earlyFeedbackButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2168608ea(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2168708eb c2168708eb = new C2168708eb(this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2168708eb) == objLJFF) {
            C1C7U.LIZIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EarlyFeedbackButtonAssem@a5ce.createWallClockDelayIfNeeded$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
