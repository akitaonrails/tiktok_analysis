package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent$showBottomSkipWithAnimation$1$1$1", f = "BaseInterestSelectionComponent.kt", l = {}, m = "invokeSuspend")
public final class C1326505Hb extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C1326505Hb(InterfaceC1364105Vn<? super C1326505Hb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1326505Hb c1326505Hb = new C1326505Hb(interfaceC1364105Vn);
        c1326505Hb.LL = ((Boolean) obj).booleanValue();
        return c1326505Hb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feedReadyStatus: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1720306oT.LIZ;
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
