package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.performance.EcMallPerfCollector$enterMall$1$job$1", f = "EcMallPerfCollector.kt", l = {68}, m = "invokeSuspend")
public final class C0NTD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTD(int i, InterfaceC1364105Vn<? super C0NTD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMallPerfCollector@65a1.enterMall$1$job$1");
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
            long j = ((long) this.LLILLJJLI) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcMallPerfCollector@65a1.enterMall$1$job$1");
                return objLJFF;
            }
        }
        C054G c054g = C0NTE.LIZ;
        C0NWX c0nwx = C0NWX.IN_PROGRESS;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter_mall_");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('s');
        C0NTE.LIZ("mall", c0nwx, C0NWR.LIZ(null, C2188811AlT.LIZIZ(sbLIZ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMallPerfCollector@65a1.enterMall$1$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
