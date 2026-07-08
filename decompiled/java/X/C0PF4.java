package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PF4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusRequestAnalytics$reportReportError$1", f = "ActivityStatusRequestAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C0PF4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PF4(int i, int i2, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PF4(this.LLILLJJLI, this.LLILLL, this.LL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusRequestAnalytics@e57a.reportReportError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C689090R1f.LIZ.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LL, this.LLILZ, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusRequestAnalytics@e57a.reportReportError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
