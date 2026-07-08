package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;
import njp.a;

/* JADX INFO: renamed from: X.0pkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.router.MetricsTrackManager$reportMetricsAsync$1", f = "EcomNativePrefetchInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C1523450pkN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1523430pkL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523450pkN(C1523430pkL c1523430pkL, InterfaceC1364105Vn<? super C1523450pkN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1523430pkL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523450pkN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MetricsTrackManager@9690.reportMetricsAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ();
        C1523430pkL c1523430pkL = this.LL;
        String str = c1523430pkL.LIZIZ;
        if (str != null) {
            C1523590pkb c1523590pkb = C1523590pkb.LIZ;
            Uri uri = c1523430pkL.LIZ;
            String str2 = c1523430pkL.LJIIIZ;
            c1523590pkb.getClass();
            C1523590pkb.LIZLLL(uri, str, "update_type", false, str2, false);
            Uri uri2 = c1523430pkL.LIZ;
            Long lLJFF = C2286608xc.LJFF(c1523430pkL.LJII);
            c1523590pkb.getClass();
            C1523590pkb.LIZLLL(uri2, str, "update_data_time", false, lLJFF, false);
        }
        new AwS567S0100000_23(this.LL, 182);
        C1507560pKk.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MetricsTrackManager@9690.reportMetricsAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
