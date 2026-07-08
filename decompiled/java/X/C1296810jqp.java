package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiview.SubscriberOnlyButtonKt$SubscriberOnlyButton$1$1", f = "SubscriberOnlyButton.kt", l = {}, m = "invokeSuspend")
public final class C1296810jqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1666540tTA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296810jqp(C1666540tTA c1666540tTA, InterfaceC1364105Vn<? super C1296810jqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1666540tTA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296810jqp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriberOnlyButtonKt@22d9.SubscriberOnlyButton$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILLIIL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriberOnlyButtonKt@22d9.SubscriberOnlyButton$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
