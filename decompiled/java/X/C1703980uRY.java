package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onSearchMixLandingFinished$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1703980uRY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallLandingPerfTracker LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC1704040uRe LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703980uRY(MallLandingPerfTracker mallLandingPerfTracker, String str, EnumC1704040uRe enumC1704040uRe, String str2, long j, InterfaceC1364105Vn<? super C1703980uRY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mallLandingPerfTracker;
        this.LLILLJJLI = str;
        this.LLILLL = enumC1704040uRe;
        this.LLILZ = str2;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703980uRY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Long lLJIILIIL;
        C1C7U.LIZ("MallLandingPerfTracker@76af.onSearchMixLandingFinished$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        String str = this.LLILLJJLI;
        mallLandingPerfTracker.getClass();
        if (!MallLandingPerfTracker.LJII(str, false, true)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onSearchMixLandingFinished$1");
            return unit;
        }
        if (!this.LL.LJIIIIZZ(this.LLILLL)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onSearchMixLandingFinished$1");
            return unit2;
        }
        if (!((List) C1704070uRh.LJ.getValue()).contains(this.LLILZ)) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onSearchMixLandingFinished$1");
            return unit3;
        }
        MallLandingPerfTracker mallLandingPerfTracker2 = this.LL;
        EnumC1704040uRe enumC1704040uRe = this.LLILLL;
        String str2 = this.LLILLJJLI;
        long j = this.LLILZIL;
        String str3 = this.LLILZ;
        mallLandingPerfTracker2.getClass();
        C1704020uRc c1704020uRc = C1704020uRc.LIZ;
        String str4 = C1704020uRc.LJIILIIL;
        if (str4 == null) {
            str4 = "";
        }
        C1704020uRc.LJIIIZ = j;
        C1704020uRc.LJIILJJIL = str3;
        if (str2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str2), "init_time")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            jCurrentTimeMillis = lLJIILIIL.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("total_duration", Long.valueOf(j - C1704020uRc.LIZJ));
        linkedHashMap.put("landing_duration", Long.valueOf(j - jCurrentTimeMillis));
        mallLandingPerfTracker2.LJIIIZ(enumC1704040uRe, str4, linkedHashMap);
        c1704020uRc.LIZ();
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onSearchMixLandingFinished$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
