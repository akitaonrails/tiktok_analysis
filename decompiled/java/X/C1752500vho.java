package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.recommend.PdpProductRecommendationMgr$triggerRequest$1$2", f = "PdpProductRecommendationMgr.kt", l = {}, m = "invokeSuspend")
public final class C1752500vho extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1752480vhm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752500vho(C1752480vhm c1752480vhm, InterfaceC1364105Vn<? super C1752500vho> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1752480vhm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752500vho(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpProductRecommendationMgr@bb0e.triggerRequest$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1752480vhm c1752480vhm = this.LL;
        c1752480vhm.LIZ.setState(new AwS605S0100000_26(c1752480vhm, 564));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpProductRecommendationMgr@bb0e.triggerRequest$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
