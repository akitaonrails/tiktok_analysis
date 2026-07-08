package X;

import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onStartJumpToMall$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1703960uRW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallLandingPerfTracker LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ EnumC1704040uRe LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703960uRW(long j, MallLandingPerfTracker mallLandingPerfTracker, EnumC1704040uRe enumC1704040uRe, Long l, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = mallLandingPerfTracker;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = enumC1704040uRe;
        this.LLILZIL = l;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        return new C1703960uRW(this.LLILZLL, mallLandingPerfTracker, this.LLILZ, this.LLILZIL, str, interfaceC1364105Vn, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        String strLIZIZ;
        C1C7U.LIZ("MallLandingPerfTracker@76af.onStartJumpToMall$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        mallLandingPerfTracker.getClass();
        if (!MallLandingPerfTracker.LJII(str, z, false)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onStartJumpToMall$1");
            return unit;
        }
        if (!this.LL.LJIIIIZZ(this.LLILZ)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onStartJumpToMall$1");
            return unit2;
        }
        String str2 = C1704020uRc.LJIILIIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Long l = this.LLILZIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLILZLL;
        }
        C1704020uRc.LIZLLL = jLongValue;
        String str4 = this.LLILLJJLI;
        if (str4 != null && (strLIZIZ = C1704080uRi.LIZIZ(str4)) != null) {
            str3 = strLIZIZ;
        }
        C1704020uRc.LJIILJJIL = str3;
        this.LL.LJIIIZ(this.LLILZ, str2, null);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onStartJumpToMall$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
