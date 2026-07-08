package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.MixedRoundFloatingButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H97, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.MixedRoundFloatingButtonAssem$initListener$3", f = "MixedRoundFloatingButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C0H97 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MixedRoundFloatingButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H97(MixedRoundFloatingButtonAssem mixedRoundFloatingButtonAssem, InterfaceC1364105Vn<? super C0H97> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixedRoundFloatingButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H97(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixedRoundFloatingButtonAssem@59d2.initListener$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.kp();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixedRoundFloatingButtonAssem@59d2.initListener$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
