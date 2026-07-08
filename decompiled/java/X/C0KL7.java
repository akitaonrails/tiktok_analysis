package X;

import Y.AfS103S0300000_7;
import Y.AfS1S0300100_7;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.pgc_sub.PGCRecoverContractInAppResponse;

/* JADX INFO: renamed from: X.0KL7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$2$recoverContract$1", f = "ResubscribeStrategy.kt", l = {173}, m = "invokeSuspend")
public final class C0KL7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataResponse<PGCRecoverContractInAppResponse.RecoverContractInAppResult>>, Object> {
    public int LL;
    public final /* synthetic */ C0KMZ LLILLJJLI;
    public final /* synthetic */ C0KLA LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KL7(C0KMZ c0kmz, C0KLA c0kla, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C0KL7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kmz;
        this.LLILLL = c0kla;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KL7(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("ResubscribeStrategy@155b.resubscribe$2$recoverContract$1");
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
            C0KMZ c0kmz = this.LLILLJJLI;
            C0KLA c0kla = this.LLILLL;
            String str = c0kmz.LIZIZ;
            String strValueOf = String.valueOf(this.LLILZ.element);
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            long jCurrentTimeMillis = System.currentTimeMillis();
            C11NZ<DataResponse<PGCRecoverContractInAppResponse.RecoverContractInAppResult>> c11nzResubscribeOrder = C0KLQ.LIZ().resubscribeOrder(c0kla.LIZ, str, strValueOf);
            if (c11nzResubscribeOrder != null) {
                C0JCK.LIZ(c11nzResubscribeOrder, EnumC499440JiI.GENERAL, C0KMZ.class.getSimpleName(), "/tiktok/sub/contract/recover_in_app/", null, 8).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S0300100_7(jCurrentTimeMillis, c23260099m, c0kla, c0kmz, 5), new AfS103S0300000_7(c23260099m, c0kla, c0kmz, 8));
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$recoverContract$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$recoverContract$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataResponse<PGCRecoverContractInAppResponse.RecoverContractInAppResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
