package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xrz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingMonitor$onFailed$1", f = "PublishStuckEventTrackingMonitor.kt", l = {101}, m = "invokeSuspend")
public final class C862170Xrz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2208891Bcl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862170Xrz(C2208891Bcl c2208891Bcl, InterfaceC1364105Vn<? super C862170Xrz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2208891Bcl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862170Xrz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishStuckEventTrackingMonitor@c98e.onFailed$1");
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
            C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "onFailed");
            C2208891Bcl c2208891Bcl = this.LLILLJJLI;
            this.LL = 1;
            if (c2208891Bcl.LJIILIIL(this) == objLJFF) {
                C1C7U.LIZIZ("PublishStuckEventTrackingMonitor@c98e.onFailed$1");
                return objLJFF;
            }
        }
        C2208891Bcl c2208891Bcl2 = this.LLILLJJLI;
        c2208891Bcl2.LJIILLIIL(new AbstractC862160Xry() { // from class: X.0Xs1
        }, c2208891Bcl2.LJIIJ());
        C2208891Bcl.LJIIL(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublishStuckEventTrackingMonitor@c98e.onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
