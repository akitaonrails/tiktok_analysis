package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
public final class C05YU extends C09AX implements Function2<C05YY, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ C05YC<Object> LLILZ;
    public final /* synthetic */ Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YU(InterfaceC346201Wa<Object> interfaceC346201Wa, C05YC<Object> c05yc, Object obj, InterfaceC1364105Vn<? super C05YU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c05yc;
        this.LLILZIL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05YU c05yu = new C05YU(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05yu.LLILLJJLI = obj;
        return c05yu;
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
            int i2 = C05YX.LIZ[((C05YY) this.LLILLJJLI).ordinal()];
            if (i2 != 1) {
                if (i2 == 3) {
                    Object obj2 = this.LLILZIL;
                    if (obj2 == C09IR.LIZ) {
                        this.LLILZ.LIZIZ();
                    } else {
                        this.LLILZ.LIZJ(obj2);
                    }
                }
            } else {
                InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILLL;
                C05YC<Object> c05yc = this.LLILZ;
                this.LL = 1;
                if (interfaceC346201Wa.collect(c05yc, this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05YY c05yy, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05yy, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
