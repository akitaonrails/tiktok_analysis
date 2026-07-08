package X;

import com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS415S0200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingMonitor$uploadSingleLocalData$2", f = "PublishStuckEventTrackingMonitor.kt", l = {}, m = "invokeSuspend")
public final class C862120Xru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<PublishStuckEventTrackingLocalBean.ProgressBean> LL;
    public final /* synthetic */ C2208891Bcl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862120Xru(C259800zU<PublishStuckEventTrackingLocalBean.ProgressBean> c259800zU, C2208891Bcl c2208891Bcl, InterfaceC1364105Vn<? super C862120Xru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c2208891Bcl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862120Xru(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishStuckEventTrackingMonitor@c98e.uploadSingleLocalData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS415S0200000_14((C259800zU) this.LL, (C259800zU<PublishStuckEventTrackingLocalBean.ProgressBean>) this.LLILLJJLI, (C2208891Bcl) 60));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublishStuckEventTrackingMonitor@c98e.uploadSingleLocalData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
