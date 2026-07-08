package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05G8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMUserFeatureInfoHelper$initUserFeatures$1", f = "IMUserFeatureInfoHelper.kt", l = {115}, m = "invokeSuspend")
public final class C05G8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05G8(InterfaceC1364105Vn<? super C05G8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05G8(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("IMUserFeatureInfoHelper@a578.initUserFeatures$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String strLIZIZ = C461720I8s.LIZIZ();
                if (strLIZIZ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMUserFeatureInfoHelper@a578.initUserFeatures$1");
                    return unit;
                }
                C1725506pJ c1725506pJ = C1725506pJ.LIZ;
                this.LL = 1;
                if (c1725506pJ.LJI(strLIZIZ, null, this) == objLJFF) {
                    C1C7U.LIZIZ("IMUserFeatureInfoHelper@a578.initUserFeatures$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMUserFeatureInfoHelper@a578.initUserFeatures$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05G8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
