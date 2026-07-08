package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.settings.ECommerceMallTabExperiment$trackCanShowMallChanged$1", f = "ECommerceMallTabExperiment.kt", l = {}, m = "invokeSuspend")
public final class C2469709m3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2469709m3(boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C2469709m3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2469709m3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceMallTabExperiment@76c5.trackCanShowMallChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        boolean z = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLogin:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(",isMallTabDisplay:");
        sbLIZ.append(this.LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = this.LLILZ;
        c1767950w6j.getClass();
        HashMap map = new HashMap();
        map.put("result", Integer.valueOf(!z ? 1 : 0));
        map.put("message", strLIZIZ);
        map.put("is_changed", Integer.valueOf(z2 ? 1 : 0));
        C1767950w6j.LJIJ("rd_tiktokec_mall_entrance_force_disable", map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceMallTabExperiment@76c5.trackCanShowMallChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
