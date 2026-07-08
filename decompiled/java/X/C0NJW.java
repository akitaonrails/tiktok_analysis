package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.reactive.UserCanceledReactiveAccountImpl$handleReactiveClick$4$onSuccess$1", f = "UserCanceledReactiveAccountImpl.kt", l = {}, m = "invokeSuspend")
public final class C0NJW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ C0XYI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJW(Runnable runnable, C0XYI c0xyi, InterfaceC1364105Vn<? super C0NJW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
        this.LLILLJJLI = c0xyi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$4$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Runnable runnable = this.LL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLILLJJLI.LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$4$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
