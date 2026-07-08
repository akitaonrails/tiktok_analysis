package X;

import com.bytedance.touchpoint.api.model.BottomTabBubble;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0sFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.touchpoint.core.bottomtabbubble.BottomTabBubbleView$showBubble$2$1", f = "BottomTabBubbleView.kt", l = {}, m = "invokeSuspend")
public final class C1619570sFP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BottomTabBubble LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619570sFP(BottomTabBubble bottomTabBubble, InterfaceC1364105Vn<? super C1619570sFP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bottomTabBubble;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1619570sFP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomTabBubbleView@25.showBubble$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01U6.LIZIZ(new AwS568S0100000_24(this.LL, 1676));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomTabBubbleView@25.showBubble$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
