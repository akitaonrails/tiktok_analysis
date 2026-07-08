package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.loadmore.LoadMoreTriggerGuard$scheduleStuckRecovery$1", f = "LoadMoreTriggerGuard.kt", l = {59}, m = "invokeSuspend")
public final class C2369509Qf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2369609Qg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2369509Qf(C2369609Qg c2369609Qg, InterfaceC1364105Vn<? super C2369509Qf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2369609Qg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2369509Qf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadMoreTriggerGuard@2cbc.scheduleStuckRecovery$1");
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
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("LoadMoreTriggerGuard@2cbc.scheduleStuckRecovery$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LIZIZ.LIZ(true, false)) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI(this.LLILLJJLI.LIZ, "recover trigger after 5000ms");
        }
        this.LLILLJJLI.LIZJ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoadMoreTriggerGuard@2cbc.scheduleStuckRecovery$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
