package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion$sendWithCallback$2", f = "SendMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C863530XuB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC863600XuI<C869590Y9l> LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863530XuB(InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C863530XuB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC863600XuI;
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863530XuB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase$Companion@d6fc.sendWithCallback$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onSuccess(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMsgUseCase$Companion@d6fc.sendWithCallback$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
