package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DT0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem$showAdDisclaimer$1$1", f = "AdFeeDeductionBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C0DT0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdFeeDeductionBottomBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DT0(AdFeeDeductionBottomBarAssem adFeeDeductionBottomBarAssem, InterfaceC1364105Vn<? super C0DT0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = adFeeDeductionBottomBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DT0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFeeDeductionBottomBarAssem@a65b.showAdDisclaimer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Runnable runnable = (Runnable) C13LP.LJJJLL(this.LL.LLJZIJLIL);
        if (runnable != null) {
            runnable.run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFeeDeductionBottomBarAssem@a65b.showAdDisclaimer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
