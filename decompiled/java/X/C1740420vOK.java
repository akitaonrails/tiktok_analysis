package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallLandingDeeplinkFallbackModel;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS312S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vOK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity$onCreate$4", f = "ShopTabOverlayActivity.kt", l = {84}, m = "invokeSuspend")
public final class C1740420vOK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EcUgMallLandingDeeplinkFallbackModel LLILLL;
    public final /* synthetic */ ShopTabOverlayActivity LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740420vOK(EcUgMallLandingDeeplinkFallbackModel ecUgMallLandingDeeplinkFallbackModel, ShopTabOverlayActivity shopTabOverlayActivity, String str, boolean z, InterfaceC1364105Vn<? super C1740420vOK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecUgMallLandingDeeplinkFallbackModel;
        this.LLILZ = shopTabOverlayActivity;
        this.LLILZIL = str;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1740420vOK c1740420vOK = new C1740420vOK(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1740420vOK.LLILLJJLI = obj;
        return c1740420vOK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("ShopTabOverlayActivity@ed6a.onCreate$4");
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
            ShopTabOverlayActivity shopTabOverlayActivity = this.LLILZ;
            String str = this.LLILZIL;
            boolean z = this.LLILZLL;
            AwS312S0000000_26 awS312S0000000_26 = new AwS312S0000000_26(0);
            C0WWR c0wwr = new C0WWR() { // from class: X.0vOL
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
            if (c1740300vO8.LIZIZ(smartRouteBuildRoute, shopTabOverlayActivity, str, true, z, -1, i, awS312S0000000_26, c0wwr, false, false, this) == objLJFF) {
                C1C7U.LIZIZ("ShopTabOverlayActivity@ed6a.onCreate$4");
                return objLJFF;
            }
        }
        if (!this.LLILZ.isFinishing()) {
            this.LLILZ.finish();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopTabOverlayActivity@ed6a.onCreate$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
