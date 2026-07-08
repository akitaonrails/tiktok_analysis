package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobFollowSkylightShow$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C338001Sw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C338001Sw(InterfaceC1364105Vn<? super C338001Sw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338001Sw(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobFollowSkylightShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_follow");
        c2344009Gk.LJIIIIZZ("is_live", "1");
        C20684815ws.LJIILLIIL("enter_following_window_feed", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowSkylightShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C338001Sw(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
