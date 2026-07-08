package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$showAddToCartResult$1", f = "SeaPdpViewModel.kt", l = {3441, 3442}, m = "invokeSuspend")
public final class C963203pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ExceptionUX LLILZLL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C963203pe(Context context, SeaPdpViewModel seaPdpViewModel, String str, String str2, ExceptionUX exceptionUX, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C963203pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = seaPdpViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = exceptionUX;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C963203pe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, Object> mapLJ;
        C1C7U.LIZ("SeaPdpViewModel@98e7.showAddToCartResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SeaPdpViewModel@98e7.showAddToCartResult$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C858603Xc c858603Xc = C858603Xc.LIZ;
            this.LL = 1;
            obj = c858603Xc.LJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.showAddToCartResult$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C858603Xc c858603Xc2 = C858603Xc.LIZ;
            Context context = this.LLILLJJLI;
            String productId = this.LLILLL.getProductId();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("request_data", C10345042t.LIZIZ(this.LLILLL));
            String str = this.LLILZ;
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("preload_cart_info", str);
            Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLL.LLIZ;
            if (pdpEnterParam == null || (mapLJ = pdpEnterParam.trackParams) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            HashMap map = new HashMap(mapLJ);
            this.LL = 2;
            if (c858603Xc2.LIZJ(context, productId, mapLJIIJ, map, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.showAddToCartResult$1");
                return objLJFF;
            }
        } else {
            this.LLILLL.zS2(this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.showAddToCartResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
