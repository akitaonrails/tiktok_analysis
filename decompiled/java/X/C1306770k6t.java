package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.service.StarShipInitService$registerInitListener$job$1", f = "StarShipInitService.kt", l = {44}, m = "invokeSuspend")
public final class C1306770k6t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306770k6t(Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1306770k6t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306770k6t(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StarShipInitService@2e29.registerInitListener$job$1");
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
            C1306510k6T.LIZ.getClass();
            C1339310kxN c1339310kxN = new C1339310kxN(C1306510k6T.LIZIZ, 0);
            this.LL = 1;
            if (C09IC.LJIIZILJ(c1339310kxN, this) == objLJFF) {
                C1C7U.LIZIZ("StarShipInitService@2e29.registerInitListener$job$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.invoke(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StarShipInitService@2e29.registerInitListener$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
