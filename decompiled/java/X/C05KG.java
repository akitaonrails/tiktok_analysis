package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05KG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.manager.EcProductAddShowManager$hideButtonIfConditionMet$1", f = "EcProductAddShowManager.kt", l = {85}, m = "invokeSuspend")
public final class C05KG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C05KG(InterfaceC1364105Vn<? super C05KG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KG(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean zBooleanValue = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05KH(null), 3);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C05KG(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
