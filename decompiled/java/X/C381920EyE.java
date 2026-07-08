package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.BaseAIGCHandler$submitReport$1", f = "BaseAIGCHandler.kt", l = {326}, m = "invokeSuspend")
public final class C381920EyE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC381830Ey5 LLILLJJLI;
    public final /* synthetic */ C382210Eyh LLILLL;
    public final /* synthetic */ Function1<C07U7, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C381920EyE(AbstractC381830Ey5 abstractC381830Ey5, C382210Eyh c382210Eyh, Function1<? super C07U7, Unit> function1, InterfaceC1364105Vn<? super C381920EyE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC381830Ey5;
        this.LLILLL = c382210Eyh;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381920EyE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAIGCHandler@c43d.submitReport$1");
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
            InterfaceC381790Ey1 interfaceC381790Ey1 = this.LLILLJJLI.LIZJ;
            C382210Eyh c382210Eyh = this.LLILLL;
            this.LL = 1;
            obj = interfaceC381790Ey1.LJIIL(c382210Eyh, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseAIGCHandler@c43d.submitReport$1");
                return objLJFF;
            }
        }
        this.LLILZ.invoke((C07U7) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAIGCHandler@c43d.submitReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
