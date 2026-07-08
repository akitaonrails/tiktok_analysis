package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$callbackResult$2", f = "CreateConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C863550XuD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C864440Xve LL;
    public final /* synthetic */ InterfaceC863600XuI<C0Y8T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863550XuD(C864440Xve c864440Xve, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI, InterfaceC1364105Vn<? super C863550XuD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c864440Xve;
        this.LLILLJJLI = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863550XuD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.callbackResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C864440Xve c864440Xve = this.LL;
        C0Y8T c0y8t = c864440Xve.LIZ;
        if (c0y8t != null) {
            InterfaceC863600XuI<C0Y8T> interfaceC863600XuI = this.LLILLJJLI;
            if (interfaceC863600XuI instanceof InterfaceC863560XuE) {
                ((InterfaceC863560XuE) interfaceC863600XuI).LJ(c0y8t, c864440Xve.LIZIZ);
            } else {
                interfaceC863600XuI.onSuccess(c0y8t);
            }
        } else {
            this.LLILLJJLI.LIZIZ(c864440Xve.LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.callbackResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
