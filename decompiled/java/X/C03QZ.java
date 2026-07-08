package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayService$handlePaymentUnavailable$1$1$1", f = "OneClickPayService.kt", l = {1447, 1449}, m = "invokeSuspend")
public final class C03QZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C043B<?> LLILLJJLI;
    public final /* synthetic */ C03QL LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QZ(C043B<?> c043b, C03QL c03ql, String str, InterfaceC1364105Vn<? super C03QZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c043b;
        this.LLILLL = c03ql;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03QZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickPayService@2466.handlePaymentUnavailable$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OneClickPayService@2466.handlePaymentUnavailable$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("OneClickPayService@2466.handlePaymentUnavailable$1$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.OG(true);
        C03QL c03ql = this.LLILLL;
        BillInfoData billInfoData = c03ql.LLJJJJLIIL;
        if (billInfoData != null) {
            C043B<?> c043b = this.LLILLJJLI;
            String str = this.LLILZ;
            this.LL = 2;
            if (c03ql.LJIIJ(c043b, billInfoData, str) == objLJFF) {
                C1C7U.LIZIZ("OneClickPayService@2466.handlePaymentUnavailable$1$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OneClickPayService@2466.handlePaymentUnavailable$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
