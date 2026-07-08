package X;

import Y.AgS162S0300000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05W7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {340}, m = "invokeSuspend")
public final class C05W7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ C05XL<C05YD<Object>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05W7(InterfaceC346201Wa<Object> interfaceC346201Wa, C05XL<C05YD<Object>> c05xl, InterfaceC1364105Vn<? super C05W7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05W7 c05w7 = new C05W7(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05w7.LLILLJJLI = obj;
        return c05w7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C259800zU c259800zU = new C259800zU();
                InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILLL;
                AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(c259800zU, interfaceC497601wk, this.LLILZ, 5);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS162S0300000_2, this) == objLJFF) {
                    return objLJFF;
                }
            }
            return Unit.LIZ;
        } catch (Throwable th) {
            this.LLILZ.LJJJJJ(th);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
