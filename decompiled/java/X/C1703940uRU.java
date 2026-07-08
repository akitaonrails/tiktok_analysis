package X;

import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onStartSendLandingRequest$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1703940uRU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallLandingPerfTracker LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC1704040uRe LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703940uRU(MallLandingPerfTracker mallLandingPerfTracker, String str, EnumC1704040uRe enumC1704040uRe, Long l, long j, InterfaceC1364105Vn<? super C1703940uRU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mallLandingPerfTracker;
        this.LLILLJJLI = str;
        this.LLILLL = enumC1704040uRe;
        this.LLILZ = l;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703940uRU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1C7U.LIZ("MallLandingPerfTracker@76af.onStartSendLandingRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        String str = this.LLILLJJLI;
        mallLandingPerfTracker.getClass();
        if (!MallLandingPerfTracker.LJII(str, false, true)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onStartSendLandingRequest$1");
            return unit;
        }
        if (!this.LL.LJIIIIZZ(this.LLILLL)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MallLandingPerfTracker@76af.onStartSendLandingRequest$1");
            return unit2;
        }
        String str2 = C1704020uRc.LJIILIIL;
        if (str2 == null) {
            str2 = "";
        }
        Long l = this.LLILZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLILZIL;
        }
        C1704020uRc.LJI = jLongValue;
        this.LL.LJIIIZ(this.LLILLL, str2, null);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onStartSendLandingRequest$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
