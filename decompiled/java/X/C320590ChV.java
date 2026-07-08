package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ChV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$handleBotWaiting$1", f = "MessageOperatorHandler.kt", l = {418}, m = "invokeSuspend")
public final class C320590ChV extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C321020CiC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320590ChV(C321020CiC c321020CiC, InterfaceC1364105Vn<? super C320590ChV> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c321020CiC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320590ChV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@3dad.handleBotWaiting$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332260D0u interfaceC332260D0uLIZLLL = C320640Cha.LJIIJ.LIZLLL(C2286608xc.LJ(this.LLILLJJLI.LJIIIIZZ.LJ), C2286608xc.LJFF(this.LLILLJJLI.LJIIIIZZ.LIZLLL));
            if (interfaceC332260D0uLIZLLL != null) {
                this.LL = 1;
                if (interfaceC332260D0uLIZLLL.emit(true, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@3dad.handleBotWaiting$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@3dad.handleBotWaiting$1");
        return unit;
    }
}
