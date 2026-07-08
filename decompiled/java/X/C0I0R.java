package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuDMAssem;
import com.bytedance.android.livesdkapi.host.IHostInputService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I0R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuDMAssem$injectDMPage$1$1", f = "PcsServiceSkuDMAssem.kt", l = {108}, m = "invokeSuspend")
public final class C0I0R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ PcsServiceSkuDMAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I0R(Fragment fragment, PcsServiceSkuDMAssem pcsServiceSkuDMAssem, InterfaceC1364105Vn<? super C0I0R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = pcsServiceSkuDMAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I0R(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsServiceSkuDMAssem@4e8.injectDMPage$1$1");
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
            IHostInputService iHostInputService = (IHostInputService) C1161920gLG.LIZJ(IHostInputService.class);
            Fragment fragment = this.LLILLJJLI;
            C0I0S c0i0s = new C0I0S(this.LLILLL);
            this.LL = 1;
            if (iHostInputService.rB0(fragment, c0i0s, this) == objLJFF) {
                C1C7U.LIZIZ("PcsServiceSkuDMAssem@4e8.injectDMPage$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsServiceSkuDMAssem@4e8.injectDMPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
