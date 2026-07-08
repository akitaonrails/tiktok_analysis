package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService$oneClickLoginNew$block$1$1", f = "OneClickLoginService.kt", l = {}, m = "invokeSuspend")
public final class C23110093s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<Throwable, EnumC23111093t, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23110093s(Function2<? super Throwable, ? super EnumC23111093t, Unit> function2, InterfaceC1364105Vn<? super C23110093s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23110093s(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.oneClickLoginNew$block$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(new C23112093u(-3), EnumC23111093t.NOT_STARTED);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneClickLoginService@601d.oneClickLoginNew$block$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
