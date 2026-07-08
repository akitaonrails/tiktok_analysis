package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05JL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase$recallSentMessage$4", f = "RecallMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C05JL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC863600XuI<C869590Y9l> LL;
    public final /* synthetic */ C0YMW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05JL(C0YMW c0ymw, InterfaceC863600XuI interfaceC863600XuI, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC863600XuI;
        this.LLILLJJLI = c0ymw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05JL(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.recallSentMessage$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.recallSentMessage$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
