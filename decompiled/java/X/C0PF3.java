package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PF3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusRequestAnalytics$reportFetchSuccess$1", f = "ActivityStatusRequestAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C0PF3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PF3(int i, int i2, int i3, InterfaceC1364105Vn<? super C0PF3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PF3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusRequestAnalytics@e57a.reportFetchSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C689090R1f.LIZ.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, null, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusRequestAnalytics@e57a.reportFetchSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
