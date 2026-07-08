package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0txg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem$NewFollowerBanner$2$1", f = "UserMatchedAssem.kt", l = {}, m = "invokeSuspend")
public final class C1685460txg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1685460txg(InterfaceC1364105Vn<? super C1685460txg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1685460txg(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserMatchedAssem@efc1.NewFollowerBanner$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1685530txn.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "show");
        C20684815ws.LJIILLIIL("follower_notice_banner", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserMatchedAssem@efc1.NewFollowerBanner$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1685460txg(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
