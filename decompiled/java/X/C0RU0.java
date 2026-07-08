package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RU0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem$captionToggleChangeListener$1$1", f = "AdPlayFunAssem.kt", l = {}, m = "invokeSuspend")
public final class C0RU0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdPlayFunAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RU0(AdPlayFunAssem adPlayFunAssem, InterfaceC1364105Vn<? super C0RU0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = adPlayFunAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0RU0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdPlayFunAssem@ff85.captionToggleChangeListener$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.ip().LJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdPlayFunAssem@ff85.captionToggleChangeListener$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
