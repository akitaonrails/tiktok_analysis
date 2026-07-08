package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem$onViewCreated$6$1", f = "AdFeeDeductionBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C339590DSz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdFeeDeductionBottomBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339590DSz(AdFeeDeductionBottomBarAssem adFeeDeductionBottomBarAssem, InterfaceC1364105Vn<? super C339590DSz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = adFeeDeductionBottomBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339590DSz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Runnable runnable;
        C1C7U.LIZ("AdFeeDeductionBottomBarAssem@a65b.onViewCreated$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getContentView().getVisibility() == 0 && (runnable = (Runnable) C13LP.LJJJLL(this.LL.LLJZIJLIL)) != null) {
            runnable.run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFeeDeductionBottomBarAssem@a65b.onViewCreated$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
