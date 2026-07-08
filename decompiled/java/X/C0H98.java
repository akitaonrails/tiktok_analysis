package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H98, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem$initListener$2", f = "BaseTakoFloatingButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C0H98 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseTakoFloatingButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H98(BaseTakoFloatingButtonAssem baseTakoFloatingButtonAssem, InterfaceC1364105Vn<? super C0H98> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseTakoFloatingButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H98(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseTakoFloatingButtonAssem@f3a0.initListener$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.kp();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseTakoFloatingButtonAssem@f3a0.initListener$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
