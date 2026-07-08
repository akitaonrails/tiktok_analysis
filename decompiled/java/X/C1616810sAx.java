package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.iap.component.IPgcPaymentService;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616810sAx implements IPgcPaymentService {
    public static final C1616810sAx LIZIZ = new C1616810sAx();
    public final /* synthetic */ IPgcPaymentService LIZ;

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZ(Map<String, String> map) {
        this.LIZ.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZIZ(int i) {
        this.LIZ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZJ(C1616880sB4 c1616880sB4) {
        this.LIZ.LIZJ(c1616880sB4);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LIZLLL(Object obj) {
        this.LIZ.LIZLLL(obj);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJ(C1616880sB4 c1616880sB4) {
        this.LIZ.LJ(c1616880sB4);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJFF(String str, String str2, String str3, Map<String, String> map, Map<String, ? extends Object> map2, Function0<Unit> function0) {
        this.LIZ.LJFF(str, str2, str3, map, map2, function0);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJI(String str) {
        this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJII(String str, PaymentComponentResponse paymentComponentResponse) {
        this.LIZ.LJII(str, paymentComponentResponse);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final AbstractC19484711Kz<PaymentComponentResponse> LJIIIIZZ(C1616880sB4 c1616880sB4) {
        return this.LIZ.LJIIIIZZ(c1616880sB4);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final List<C1616830sAz> LJIIIZ(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final Map LJIIJ(String str) {
        return this.LIZ.LJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final String LJIIJJI(EnumC1616780sAu enumC1616780sAu, EnumC1615550s8v enumC1615550s8v) {
        return this.LIZ.LJIIJJI(enumC1616780sAu, enumC1615550s8v);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final void LJIIL(int i, List list) {
        this.LIZ.LJIIL(i, list);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final Object LJIILIIL(C1616880sB4 c1616880sB4, C717310SBt c717310SBt, C717330SBv c717330SBv) {
        return this.LIZ.LJIILIIL(c1616880sB4, c717310SBt, c717330SBv);
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final boolean LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final String getPriceRegion() {
        return this.LIZ.getPriceRegion();
    }

    @Override // com.ss.android.ugc.aweme.iap.component.IPgcPaymentService
    public final List<Class<?>> provideXBridgetIDLMethodListForLynxPrefetch() {
        return this.LIZ.provideXBridgetIDLMethodListForLynxPrefetch();
    }

    public C1616810sAx() {
        IPgcPaymentService iPgcPaymentService = (IPgcPaymentService) PluggableExtentionKt.pluggableSpi$default(IPgcPaymentService.class, false, false, false, 14, null);
        if (iPgcPaymentService != null) {
            this.LIZ = iPgcPaymentService;
        } else {
            "no impl for IPgcPaymentService".toString();
            throw new IllegalStateException("no impl for IPgcPaymentService");
        }
    }
}
