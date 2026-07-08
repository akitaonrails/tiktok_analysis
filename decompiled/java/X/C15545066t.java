package X;

import com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity$tryPlayMusic$1$1$1$2", f = "ScheduleDowntimeServerDrivenActivity.kt", l = {}, m = "invokeSuspend")
public final class C15545066t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ScheduleDowntimeServerDrivenActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15545066t(ScheduleDowntimeServerDrivenActivity scheduleDowntimeServerDrivenActivity, InterfaceC1364105Vn<? super C15545066t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = scheduleDowntimeServerDrivenActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15545066t(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScheduleDowntimeServerDrivenActivity@7a04.tryPlayMusic$1$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ScheduleDowntimeServerDrivenActivity scheduleDowntimeServerDrivenActivity = this.LL;
        C1485060okS c1485060okS = scheduleDowntimeServerDrivenActivity.LLJILJILJ;
        if (c1485060okS != null) {
            ((C20498815Ja) scheduleDowntimeServerDrivenActivity.LLJILJIL.getValue()).LIZIZ(c1485060okS);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScheduleDowntimeServerDrivenActivity@7a04.tryPlayMusic$1$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
