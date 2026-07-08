package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01NL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestMonitor$monitorNotInterestedToastShow$1", f = "FollowingSuggestMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01NL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01NL(InterfaceC1364105Vn<? super C01NL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01NL(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingSuggestMonitor@395.monitorNotInterestedToastShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.onEventV3("not_interested_toast_show");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingSuggestMonitor@395.monitorNotInterestedToastShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01NL(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
