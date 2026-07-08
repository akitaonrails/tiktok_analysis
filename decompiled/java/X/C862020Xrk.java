package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler$start$2", f = "SerialScheduler.kt", l = {215}, m = "invokeSuspend")
public final class C862020Xrk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1307280k7i LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862020Xrk(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C862020Xrk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1307280k7i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C862020Xrk c862020Xrk = new C862020Xrk(this.LLILLL, interfaceC1364105Vn);
        c862020Xrk.LLILLJJLI = obj;
        return c862020Xrk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.start$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1307280k7i c1307280k7i = this.LLILLL;
            this.LL = 1;
            if (c1307280k7i.LJIIIIZZ(interfaceC497601wk, this) == objLJFF) {
                C1C7U.LIZIZ("SerialScheduler@9e09.start$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SerialScheduler@9e09.start$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
