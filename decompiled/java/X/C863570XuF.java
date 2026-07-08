package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$callbackGroupResult$2$1", f = "CreateConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C863570XuF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C864440Xve LL;
    public final /* synthetic */ InterfaceC863580XuG LLILLJJLI;
    public final /* synthetic */ C867350Y0v LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863570XuF(C864440Xve c864440Xve, InterfaceC863580XuG interfaceC863580XuG, C867350Y0v c867350Y0v, InterfaceC1364105Vn<? super C863570XuF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c864440Xve;
        this.LLILLJJLI = interfaceC863580XuG;
        this.LLILLL = c867350Y0v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863570XuF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.callbackGroupResult$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C864440Xve c864440Xve = this.LL;
        C0Y8T c0y8t = c864440Xve.LIZ;
        if (c0y8t != null) {
            this.LLILLJJLI.LIZLLL(c0y8t, c864440Xve.LIZIZ, this.LLILLL.LIZ());
        } else {
            this.LLILLJJLI.LJI(c864440Xve.LIZIZ, this.LLILLL.LIZ());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.callbackGroupResult$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
