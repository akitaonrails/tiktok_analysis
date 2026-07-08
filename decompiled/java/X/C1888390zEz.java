package X;

import com.bytedance.touchpoint.api.model.AgeGatePopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import njp.a;

/* JADX INFO: renamed from: X.0zEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.touchpoint.core.feedbanner.AgeGateUtils$createAgeGateSheet$1$1", f = "AgeGateUtils.kt", l = {}, m = "invokeSuspend")
public final class C1888390zEz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AgeGatePopup LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1888390zEz(AgeGatePopup ageGatePopup, InterfaceC1364105Vn<? super C1888390zEz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ageGatePopup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1888390zEz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AgeGateUtils@a07c.createAgeGateSheet$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01U6.LIZIZ(new AwS572S0100000_28(this.LL, 958));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AgeGateUtils@a07c.createAgeGateSheet$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
