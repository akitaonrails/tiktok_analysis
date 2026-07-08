package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DFO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.fallback.CheckoutFallbackHandler$openFallbackCheckout$1", f = "CheckoutFallbackHandler.kt", l = {99}, m = "invokeSuspend")
public final class C0DFO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C336130DFr LLILLL;
    public final /* synthetic */ C0D8E LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ AwemeRawAd LLIZ;
    public final /* synthetic */ InterfaceC1036270d4b LLIZLLLIL;
    public final /* synthetic */ Function1<C0DFS, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DFO(C336130DFr c336130DFr, C0D8E c0d8e, C19EG c19eg, Aweme aweme, AwemeRawAd awemeRawAd, InterfaceC1036270d4b interfaceC1036270d4b, Function1<? super C0DFS, Unit> function1, InterfaceC1364105Vn<? super C0DFO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c336130DFr;
        this.LLILZ = c0d8e;
        this.LLILZIL = c19eg;
        this.LLILZLL = aweme;
        this.LLIZ = awemeRawAd;
        this.LLIZLLLIL = interfaceC1036270d4b;
        this.LLJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0DFO c0dfo = new C0DFO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0dfo.LLILLJJLI = obj;
        return c0dfo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("CheckoutFallbackHandler@8202.openFallbackCheckout$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            Object obj2 = this.LLILLJJLI;
            C336130DFr c336130DFr = this.LLILLL;
            C0D8E c0d8e = this.LLILZ;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            objLIZ = c336130DFr.LIZ(c0d8e, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CheckoutFallbackHandler@8202.openFallbackCheckout$1");
                return objLJFF;
            }
        }
        String str = (String) objLIZ;
        if (str == null) {
            Function1<C0DFS, Unit> function1 = this.LLJ;
            if (function1 != null) {
                function1.invoke(new C0DFN("Failed to build continue URL."));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CheckoutFallbackHandler@8202.openFallbackCheckout$1");
            return unit;
        }
        C336130DFr c336130DFr2 = this.LLILLL;
        C19EG c19eg = this.LLILZIL;
        Aweme aweme = this.LLILZLL;
        AwemeRawAd awemeRawAd = this.LLIZ;
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLIZLLLIL;
        Function1<C0DFS, Unit> function12 = this.LLJ;
        c336130DFr2.getClass();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Opening fallback checkout: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            e = e;
        }
        try {
            AdlpExtraModel adlpExtraModelLIZ = C1028090crP.LIZ(aweme, null, 0, "ad_ecp_shop_checkout", null, null, null, null);
            C1025720cna c1025720cna = new C1025720cna(0.7f, null, null, 3, Boolean.FALSE, -1, -1, Boolean.FALSE);
            c1025720cna.setDraggable(false);
            C1026310coX c1026310coX = new C1026310coX(str, awemeRawAd, adlpExtraModelLIZ, false, c1025720cna, new C1028100crQ(Boolean.TRUE, null, Boolean.FALSE, false, false, Boolean.TRUE, Boolean.TRUE, null, null, null, false, false, false, false, null, Boolean.FALSE));
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) PluggableExtentionKt.pluggableSpi$default(IAdLandingPagePopUpService.class, false, false, false, 14, null);
            if (iAdLandingPagePopUpService != null) {
                iAdLandingPagePopUpService.LJIIJ(-1, c19eg, interfaceC1036270d4b, c1026310coX, null);
                if (function12 != null) {
                    function12.invoke(C0DFU.LIZ);
                }
            } else if (function12 != null) {
                function12.invoke(new C0DFN("IAdLandingPagePopUpService is unavailable."));
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to open fallback checkout: ");
            sbLIZ2.append(e.getMessage());
            C0DAV.LIZ("FallbackHandler", C2188811AlT.LIZIZ(sbLIZ2), null);
            if (function12 != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                function12.invoke(new C0DFN(message));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CheckoutFallbackHandler@8202.openFallbackCheckout$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
