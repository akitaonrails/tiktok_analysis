package X;

import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onClickMallEntry$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1704000uRa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallLandingPerfTracker LL;
    public final /* synthetic */ EnumC1704040uRe LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704000uRa(long j, MallLandingPerfTracker mallLandingPerfTracker, EnumC1704040uRe enumC1704040uRe, Long l, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = mallLandingPerfTracker;
        this.LLILLJJLI = enumC1704040uRe;
        this.LLILLL = l;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        EnumC1704040uRe enumC1704040uRe = this.LLILLJJLI;
        Long l = this.LLILLL;
        return new C1704000uRa(this.LLILZ, mallLandingPerfTracker, enumC1704040uRe, l, this.LLILZLL, interfaceC1364105Vn, this.LLILZIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        boolean zLJIJ;
        C1C7U.LIZ("MallLandingPerfTracker@76af.onClickMallEntry$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        boolean inMallTab = false;
        if (!MallLandingPerfTracker.LJII(null, false, false)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onClickMallEntry$1");
            return unit;
        }
        if (!this.LL.LJIIIIZZ(this.LLILLJJLI)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onClickMallEntry$1");
            return unit2;
        }
        C1704020uRc c1704020uRc = C1704020uRc.LIZ;
        Long l = this.LLILLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLILZ;
        }
        if (jLongValue != -1) {
            c1704020uRc.LIZ();
        }
        C1704020uRc.LIZJ = jLongValue;
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        if (iEcUgBackButtonServiceOfficial != null) {
            inMallTab = iEcUgBackButtonServiceOfficial.getInMallTab();
        }
        C1704020uRc.LJIIJ = inMallTab;
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null) {
            zLJIJ = iECommerceMallService.LJIJ();
        } else {
            zLJIJ = true;
        }
        C1704020uRc.LJIIJJI = zLJIJ;
        C1704020uRc.LJIIL = this.LLILZIL;
        C1704020uRc.LJIILIIL = this.LLILZLL;
        this.LL.LJIIIZ(this.LLILLJJLI, this.LLILZLL, null);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onClickMallEntry$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
