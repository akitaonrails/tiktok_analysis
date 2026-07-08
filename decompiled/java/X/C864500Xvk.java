package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$markMsgAsFailAndNotify$2", f = "SendMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C864500Xvk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YC8 LL;
    public final /* synthetic */ C0YC5 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864500Xvk(C0YC8 c0yc8, C0YC5 c0yc5, int i, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C864500Xvk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yc8;
        this.LLILLJJLI = c0yc5;
        this.LLILLL = i;
        this.LLILZ = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864500Xvk(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase@4b94.markMsgAsFailAndNotify$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LJJIJIIJIL = new C0Y3I("SendMsgUseCase: notify message send fail");
        this.LLILLJJLI.LIZIZ.LJIIZILJ().getDomain().LIZ.LJJIII(this.LLILLL, this.LL.LIZIZ, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMsgUseCase@4b94.markMsgAsFailAndNotify$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
