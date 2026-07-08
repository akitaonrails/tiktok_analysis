package X;

import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem$lynxLoadCallback$1$onFirstScreen$2", f = "ShopMallMixAssem.kt", l = {823}, m = "invokeSuspend")
public final class C0CRJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0CRJ(InterfaceC1364105Vn<? super C0CRJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRJ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixAssem@a45d.lynxLoadCallback$1$onFirstScreen$2");
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
            C0BAV.LIZ.getClass();
            long jIntValue = ((long) ((Number) C0BAV.LIZIZ.getValue()).intValue()) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("ShopMallMixAssem@a45d.lynxLoadCallback$1$onFirstScreen$2");
                return objLJFF;
            }
        }
        ((IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class)).LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixAssem@a45d.lynxLoadCallback$1$onFirstScreen$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CRJ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
