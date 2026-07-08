package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Imz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.skylight.SkylightContainerManager$updateNotificationState$1$1", f = "SkylightContainerManager.kt", l = {}, m = "invokeSuspend")
public final class C476870Imz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC476820Imu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476870Imz(AbstractC476820Imu abstractC476820Imu, InterfaceC1364105Vn<? super C476870Imz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC476820Imu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C476870Imz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SkylightContainerManager@b223.updateNotificationState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C477430Int c477430Int = this.LL.LJIJJ;
        if (c477430Int != null) {
            C339190DRl.LIZLLL(((C477400Inq) c477430Int.LIZIZ.getValue()).getAlertDot());
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SkylightContainerManager@b223.updateNotificationState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
