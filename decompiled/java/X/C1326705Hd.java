package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent$showBottomSkipWithAnimation$1$1", f = "BaseInterestSelectionComponent.kt", l = {1131}, m = "invokeSuspend")
public final class C1326705Hd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C1326705Hd(InterfaceC1364105Vn<? super C1326705Hd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326705Hd(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1913090zsp.LIZ.getClass();
            C2252321DDq c2252321DDq = C1913090zsp.LJIIIZ;
            C1326505Hb c1326505Hb = new C1326505Hb(null);
            this.LL = 1;
            obj = C09IC.LJIJJ(c2252321DDq, this, c1326505Hb);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C1326705Hd(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
