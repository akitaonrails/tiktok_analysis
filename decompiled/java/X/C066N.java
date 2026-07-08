package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.StreakInviteSentLatencyMonitor$delayReportStreakInviteSentLatency$1", f = "StreakInviteSentLatencyMonitor.kt", l = {54}, m = "invokeSuspend")
public final class C066N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066N(String str, InterfaceC1364105Vn<? super C066N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066N(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInviteSentLatencyMonitor@dff5.delayReportStreakInviteSentLatency$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(20000L, this) == objLJFF) {
                C1C7U.LIZIZ("StreakInviteSentLatencyMonitor@dff5.delayReportStreakInviteSentLatency$1");
                return objLJFF;
            }
        }
        C066M c066mRemove = C066L.LJ.remove(this.LLILLJJLI);
        if (c066mRemove != null) {
            C066L.LIZIZ.getClass();
            C066L.LIZ(c066mRemove);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInviteSentLatencyMonitor@dff5.delayReportStreakInviteSentLatency$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
