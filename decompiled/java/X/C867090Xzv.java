package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.leaveconversation.LeaveConversationUseCase$callbackResult$2", f = "LeaveConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C867090Xzv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C867100Xzw LL;
    public final /* synthetic */ InterfaceC867020Xzo<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867090Xzv(C867100Xzw c867100Xzw, InterfaceC867020Xzo<String> interfaceC867020Xzo, InterfaceC1364105Vn<? super C867090Xzv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c867100Xzw;
        this.LLILLJJLI = interfaceC867020Xzo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C867090Xzv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeaveConversationUseCase@f268.callbackResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C867100Xzw c867100Xzw = this.LL;
        String str = c867100Xzw.LIZ;
        if (str != null) {
            this.LLILLJJLI.LIZ(new C868810Y6l<>(str, c867100Xzw.LIZIZ, c867100Xzw.LIZJ.LIZ()));
        } else {
            C0YMW c0ymw = c867100Xzw.LIZIZ;
            if (c0ymw != null) {
                this.LLILLJJLI.LIZIZ(new C0Y00(c0ymw, c867100Xzw.LIZJ.LIZ()));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeaveConversationUseCase@f268.callbackResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
