package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallLandingDeeplinkFallbackModel;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayFragment$onViewCreated$3", f = "ShopTabOverlayFragment.kt", l = {107}, m = "invokeSuspend")
public final class C1740450vON extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EcUgMallLandingDeeplinkFallbackModel LLILLL;
    public final /* synthetic */ ShopTabOverlayFragment LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740450vON(EcUgMallLandingDeeplinkFallbackModel ecUgMallLandingDeeplinkFallbackModel, ShopTabOverlayFragment shopTabOverlayFragment, String str, InterfaceC1364105Vn<? super C1740450vON> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecUgMallLandingDeeplinkFallbackModel;
        this.LLILZ = shopTabOverlayFragment;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1740450vON c1740450vON = new C1740450vON(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1740450vON.LLILLJJLI = obj;
        return c1740450vON;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("ShopTabOverlayFragment@dd02.onViewCreated$3");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1740440vOM interfaceC1740440vOM = ShopTabOverlayActivity.LLILLJJLI;
            if (interfaceC1740440vOM != null) {
                interfaceC1740440vOM.LIZIZ();
            }
            if (!C1435305jb.LIZ.get()) {
                i = this.LLILLL.monitorLifecycleCallbackTimeout;
            } else {
                i = 0;
            }
            C1740300vO8 c1740300vO8 = C1740300vO8.LIZ;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILZ, this.LLILZIL);
            C19EG activity = this.LLILZ.getActivity();
            String str = this.LLILZIL;
            AFwS313S0000000_26 aFwS313S0000000_26 = AFwS313S0000000_26.get$arr$(13);
            C0WWR c0wwr = new C0WWR() { // from class: X.0vOO
                @Override // X.C0WWR
                public final void LIZIZ(Fragment fragment) {
                }

                @Override // X.C0WWR
                public final void LIZLLL() {
                }

                @Override // X.C0WWR
                public final void LJ(Fragment fragment) {
                }

                @Override // X.C0WWR
                public final void LIZ(String str2, String str3) {
                    InterfaceC1740440vOM interfaceC1740440vOM2 = ShopTabOverlayActivity.LLILLJJLI;
                    if (interfaceC1740440vOM2 != null) {
                        interfaceC1740440vOM2.LIZJ(str2, str3);
                    }
                    ShopTabOverlayActivity.LLILLJJLI = null;
                }

                @Override // X.C0WWR
                public final void LIZJ(String str2, String str3) {
                    InterfaceC1740440vOM interfaceC1740440vOM2 = ShopTabOverlayActivity.LLILLJJLI;
                    if (interfaceC1740440vOM2 != null) {
                        interfaceC1740440vOM2.LIZLLL(str2, str3);
                    }
                }
            };
            this.LL = 1;
            if (c1740300vO8.LIZIZ(smartRouteBuildRoute, activity, str, true, false, -1, i, aFwS313S0000000_26, c0wwr, false, true, this) == objLJFF) {
                C1C7U.LIZIZ("ShopTabOverlayFragment@dd02.onViewCreated$3");
                return objLJFF;
            }
        }
        this.LLILZ.finish();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopTabOverlayFragment@dd02.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
