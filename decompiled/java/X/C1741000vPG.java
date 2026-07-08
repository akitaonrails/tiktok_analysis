package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.LandingPopupOptExperiment;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0vPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.action.EcMixMallDiversionAction$startLandingDeeplink$2$1", f = "EcMixMallDiversionAction.kt", l = {175}, m = "invokeSuspend")
public final class C1741000vPG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1740970vPD LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;
    public final /* synthetic */ C1741560vQA LLIZLLLIL;
    public final /* synthetic */ InterfaceC1741020vPI LLJ;
    public final /* synthetic */ C1767790w6T LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1741000vPG(Fragment fragment, String str, int i, C1740970vPD c1740970vPD, Map<String, Object> map, Function1<? super Boolean, Unit> function1, C1741560vQA c1741560vQA, InterfaceC1741020vPI interfaceC1741020vPI, C1767790w6T c1767790w6T, InterfaceC1364105Vn<? super C1741000vPG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = c1740970vPD;
        this.LLILZLL = map;
        this.LLIZ = function1;
        this.LLIZLLLIL = c1741560vQA;
        this.LLJ = interfaceC1741020vPI;
        this.LLJI = c1767790w6T;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741000vPG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        boolean z;
        Object objH8 = obj;
        C1C7U.LIZ("EcMixMallDiversionAction@fdbe.startLandingDeeplink$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objH8);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objH8);
            IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
            if (iEcUgPopupService != null) {
                Fragment fragment = this.LLILLJJLI;
                String str = this.LLILLL;
                if (this.LLILZ != 0) {
                    z = true;
                } else {
                    z = false;
                }
                C1740970vPD c1740970vPD = this.LLILZIL;
                boolean z2 = c1740970vPD.LIZIZ.LJ;
                C1740980vPE c1740980vPE = new C1740980vPE(this.LLIZ, c1740970vPD, this.LLIZLLLIL, this.LLJ, this.LLJI, str);
                final C1740970vPD c1740970vPD2 = this.LLILZIL;
                InterfaceC824510WWb interfaceC824510WWb = new InterfaceC824510WWb() { // from class: X.0vPH
                    @Override // X.InterfaceC824510WWb
                    public final void LIZIZ() {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "open_overlay_route", null, null, null, null, 30);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LJI() {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "overlay_route_open_success", null, null, null, null, 30);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LIZ(boolean z3) {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "popup_route_open_success", null, null, null, Boolean.valueOf(z3), 14);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LIZJ(String str2) {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "overlay_destroy", null, str2, null, null, 26);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LJ(boolean z3) {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "open_popup_route", null, null, null, Boolean.valueOf(z3), 14);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LJII(String str2) {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "overlay_create", str2, null, null, null, 28);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LIZLLL(String str2, String str3, boolean z3) {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "popup_create", str2, null, str3, Boolean.valueOf(z3), 4);
                    }

                    @Override // X.InterfaceC824510WWb
                    public final void LJFF(String str2, String str3, boolean z3) {
                        C1767950w6j.LJJIJ(C1767950w6j.LIZ, "popup_destroy", null, str2, str3, Boolean.valueOf(z3), 2);
                        c1740970vPD2.LIZIZ.LJI = 0;
                    }
                };
                boolean z3 = LandingPopupOptExperiment.LIZ().enableAwaitFinishOpt;
                this.LL = 1;
                objH8 = iEcUgPopupService.H8(fragment, str, z, z2, c1740980vPE, interfaceC824510WWb, z3, this);
                if (objH8 == objLJFF) {
                    C1C7U.LIZIZ("EcMixMallDiversionAction@fdbe.startLandingDeeplink$2$1");
                    return objLJFF;
                }
            } else {
                objH8 = null;
            }
        }
        this.LLILZIL.LIZJ = null;
        if (Intrinsics.LJFF(objH8, true)) {
            C1741530vQ7.LIZ("half_screen", "close", 0L, this.LLILZLL, 4).LIZ("close_success", true, null, null, null, null);
            C1767950w6j.LJJIJ(C1767950w6j.LIZ, "close_success", null, null, null, null, 30);
            C0NOF.LIZ.getClass();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallDiversionAction@fdbe.startLandingDeeplink$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
