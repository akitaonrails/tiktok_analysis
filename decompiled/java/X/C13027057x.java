package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.action.EcMixMallDiversionAction$startLandingDeeplink$5", f = "EcMixMallDiversionAction.kt", l = {318}, m = "invokeSuspend")
public final class C13027057x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ C1740970vPD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13027057x(Fragment fragment, C1740970vPD c1740970vPD, InterfaceC1364105Vn<? super C13027057x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = c1740970vPD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13027057x(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallDiversionAction@fdbe.startLandingDeeplink$5");
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
            IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
            if (iEcUgPopupService != null) {
                Fragment fragment = this.LLILLJJLI;
                this.LL = 1;
                if (iEcUgPopupService.H8(fragment, "", true, false, null, null, false, this) == objLJFF) {
                    C1C7U.LIZIZ("EcMixMallDiversionAction@fdbe.startLandingDeeplink$5");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.LIZJ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallDiversionAction@fdbe.startLandingDeeplink$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
