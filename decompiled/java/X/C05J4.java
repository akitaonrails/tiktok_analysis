package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05J4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.service.PublishGuideDraftServiceImpl$getSocialAffinityUserInfo$7$2$1", f = "PublishGuideDraftServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05J4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<List<C1345005Oe>, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05J4(Function1<? super List<C1345005Oe>, Unit> function1, InterfaceC1364105Vn<? super C05J4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05J4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishGuideDraftServiceImpl@4ca.getSocialAffinityUserInfo$7$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(C13BV.INSTANCE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublishGuideDraftServiceImpl@4ca.getSocialAffinityUserInfo$7$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
