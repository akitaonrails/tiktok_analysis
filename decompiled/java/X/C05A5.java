package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05A5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.helper.ProfileApiAdvanceRequestHelper$statisticPageData$1", f = "ProfileApiAdvanceRequestHelper.kt", l = {}, m = "invokeSuspend")
public final class C05A5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1253180iiS LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05A5(C1253180iiS c1253180iiS, long j, InterfaceC1364105Vn<? super C05A5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1253180iiS;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05A5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileApiAdvanceRequestHelper@5c8a.statisticPageData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL(false, C2286608xc.LJFF(this.LLILLJJLI), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileApiAdvanceRequestHelper@5c8a.statisticPageData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
