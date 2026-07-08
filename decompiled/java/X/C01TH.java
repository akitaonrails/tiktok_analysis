package X;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01TH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.statistics.ProfilePlatformStatistics$sendCenterSearchStayTimeEvent$1", f = "ProfilePlatformStatistics.kt", l = {}, m = "invokeSuspend")
public final class C01TH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC395401gG LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TH(EnumC395401gG enumC395401gG, long j, InterfaceC1364105Vn<? super C01TH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC395401gG;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePlatformStatistics@1051.sendCenterSearchStayTimeEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", this.LL.toString().toLowerCase(Locale.ROOT));
        c2344009Gk.LIZLLL(this.LLILLJJLI, "duration");
        C20684815ws.LJIILLIIL("profile_center_search_stay_time", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.sendCenterSearchStayTimeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
