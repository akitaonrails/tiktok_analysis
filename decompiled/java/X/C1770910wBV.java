package X;

import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallPreloadOptConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0wBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.tools.MixMallUtils$preCreateContainer$2$1$2", f = "MixMallUtils.kt", l = {492, 494}, m = "invokeSuspend")
public final class C1770910wBV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1770910wBV(InterfaceC1364105Vn<? super C1770910wBV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1770910wBV(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("MixMallUtils@2261.preCreateContainer$2$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MixMallUtils@2261.preCreateContainer$2$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1770940wBY.LIZ.getClass();
            Integer num = ((EcMallPreloadOptConfigModel) C1770940wBY.LIZJ.getValue()).expiredTime;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(((long) iIntValue) * 1000, this) == objLJFF) {
                C1C7U.LIZIZ("MixMallUtils@2261.preCreateContainer$2$1$2");
                return objLJFF;
            }
        }
        C1770900wBU c1770900wBU = C1770900wBU.LIZ;
        AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(496);
        this.LL = 2;
        if (c1770900wBU.LIZIZ(aFwS215S0000000_26, this) == objLJFF) {
            C1C7U.LIZIZ("MixMallUtils@2261.preCreateContainer$2$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixMallUtils@2261.preCreateContainer$2$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1770910wBV(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
