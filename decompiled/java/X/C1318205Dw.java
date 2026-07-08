package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.StoryPublishServiceImpl$retryPublish$1$3", f = "StoryPublishServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1318205Dw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1318205Dw(Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1318205Dw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1318205Dw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryPublishServiceImpl@e66c.retryPublish$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
