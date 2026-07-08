package X;

import com.ss.android.ugc.aweme.lemon.feed.component.LemonGuideCardComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.feed.component.LemonGuideCardComponent$doAdaption$1", f = "LemonGuideCardComponent.kt", l = {}, m = "invokeSuspend")
public final class C0CSN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LemonGuideCardComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CSN(LemonGuideCardComponent lemonGuideCardComponent, InterfaceC1364105Vn<? super C0CSN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lemonGuideCardComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LemonGuideCardComponent@265f.doAdaption$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.ep();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LemonGuideCardComponent@265f.doAdaption$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
