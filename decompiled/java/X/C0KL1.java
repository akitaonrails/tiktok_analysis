package X;

import Y.AfS2S0200100_7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KL1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$2$templateInfoJob$1", f = "ResubscribeStrategy.kt", l = {108}, m = "invokeSuspend")
public final class C0KL1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PGCTemplateListData>, Object> {
    public int LL;
    public final /* synthetic */ C0KLA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KL1(C0KLA c0kla, InterfaceC1364105Vn<? super C0KL1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kla;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KL1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("ResubscribeStrategy@155b.resubscribe$2$templateInfoJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0KL2 c0kl2 = new C0KL2(this.LLILLJJLI);
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            long jCurrentTimeMillis = System.currentTimeMillis();
            C11O8 c11o8LIZJ = c0kl2.LJ.LIZJ();
            if (c11o8LIZJ != null) {
                c11o8LIZJ.LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, c0kl2, c23260099m, 4), new AfS2S0200100_7(jCurrentTimeMillis, c0kl2, c23260099m, 5));
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$templateInfoJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$templateInfoJob$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PGCTemplateListData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
