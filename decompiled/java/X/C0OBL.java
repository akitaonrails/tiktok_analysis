package X;

import Y.AgS101S1100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OBL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.iap.infra.legacy.utils.IAPLegacyAppEventStream$observeEvent$1$job$1", f = "IAPLegacyAppEventStream.kt", l = {29}, m = "invokeSuspend")
public final class C0OBL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0OBM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C094D<C1882807Za> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0OBL(C0OBM c0obm, String str, C094D<? super C1882807Za> c094d, InterfaceC1364105Vn<? super C0OBL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0obm;
        this.LLILLL = str;
        this.LLILZ = c094d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OBL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPLegacyAppEventStream@b34c.observeEvent$1$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LL;
            AgS101S1100000_9 agS101S1100000_9 = new AgS101S1100000_9(this.LLILZ, this.LLILLL, 6);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS101S1100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("IAPLegacyAppEventStream@b34c.observeEvent$1$job$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
