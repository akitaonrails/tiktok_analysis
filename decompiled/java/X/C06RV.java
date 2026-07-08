package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06RV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.StreakShareMonitor$monitorSharePanelOpen$1", f = "StreakShareMonitor.kt", l = {}, m = "invokeSuspend")
public final class C06RV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ C06RR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06RV(InterfaceC1493105sv interfaceC1493105sv, C06RR c06rr, InterfaceC1364105Vn<? super C06RV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = c06rr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06RV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakShareMonitor@804a.monitorSharePanelOpen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.sendEvent("streak_share_panel_analytics", C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LLILLJJLI.LIZ), new Pair("preload_time", String.valueOf(this.LLILLJJLI.LIZJ)), new Pair("show_time", String.valueOf(this.LLILLJJLI.LIZLLL)), new Pair("is_first", String.valueOf(C06RW.LJ.compareAndSet(true, false))), new Pair("result", this.LLILLJJLI.LJ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakShareMonitor@804a.monitorSharePanelOpen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
