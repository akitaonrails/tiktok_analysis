package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.im.intercept.LowConsumptionData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZFA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.intercept.LowConsumptionUserRepository$clickInAppPush$1", f = "LowConsumptionInterceptStrategy.kt", l = {}, m = "invokeSuspend")
public final class C0ZFA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ZFD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZFA(C0ZFD c0zfd, InterfaceC1364105Vn<? super C0ZFA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0zfd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZFA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LowConsumptionUserRepository@7b6c.clickInAppPush$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LowConsumptionData lowConsumptionDataLIZIZ = this.LL.LIZIZ();
        if (lowConsumptionDataLIZIZ.lowConsumptionStrategyVersion <= 0) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LowConsumptionUserRepository@7b6c.clickInAppPush$1");
            return unit;
        }
        ArrayList arrayList = new ArrayList(lowConsumptionDataLIZIZ.clickTimestamps);
        this.LL.getClass();
        arrayList.add(C2286608xc.LJFF(C0ZFD.LIZ()));
        this.LL.LIZJ(LowConsumptionData.LIZ(lowConsumptionDataLIZIZ, null, C13LP.LJJJJI(arrayList), 13));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LowConsumptionUserRepository@7b6c.clickInAppPush$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
