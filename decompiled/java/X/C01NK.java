package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01NK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobFollowAssemDestroy$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C01NK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01NK(InterfaceC1364105Vn<? super C01NK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01NK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobFollowAssemDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.onEventV3("follow_feed_assem_destroyed");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowAssemDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01NK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
