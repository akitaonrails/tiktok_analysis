package X;

import android.telecom.DisconnectCause;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.core.telecom.CallsManager$addCall$2", f = "CallsManager.kt", l = {278}, m = "invokeSuspend")
public final class C324540Cns extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302860k0a LLILLJJLI;
    public final /* synthetic */ C1302880k0c LLILLL;
    public final /* synthetic */ Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLIZ;
    public final /* synthetic */ Function1<InterfaceC1302330jzj, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324540Cns(C1302860k0a c1302860k0a, C1302880k0c c1302880k0c, Function2<? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, Function2<? super DisconnectCause, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function22, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function12, Function1<? super InterfaceC1302330jzj, Unit> function13, InterfaceC1364105Vn<? super C324540Cns> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302860k0a;
        this.LLILLL = c1302880k0c;
        this.LLILZ = function2;
        this.LLILZIL = function22;
        this.LLILZLL = function1;
        this.LLIZ = function12;
        this.LLIZLLLIL = function13;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324540Cns(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C1302860k0a c1302860k0a = this.LLILLJJLI;
            C1302880k0c c1302880k0c = this.LLILLL;
            Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILZ;
            Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> function22 = this.LLILZIL;
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILZLL;
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function12 = this.LLIZ;
            C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
            C324530Cnr c324530Cnr = new C324530Cnr(null);
            Function1<InterfaceC1302330jzj, Unit> function13 = this.LLIZLLLIL;
            this.LL = 1;
            if (c1302860k0a.LIZ(c1302880k0c, function2, function22, function1, function12, c2252331DDrLIZIZ, c324530Cnr, function13, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
