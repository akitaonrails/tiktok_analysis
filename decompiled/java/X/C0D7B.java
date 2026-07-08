package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutApiService;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequestBody;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0D7B, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.ACPCheckoutGateway$executeCreateRequest$2", f = "ACPCheckoutGateway.kt", l = {119}, m = "invokeSuspend")
public final class C0D7B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0D7J>, Object> {
    public int LL;
    public final /* synthetic */ C0D79 LLILLJJLI;
    public final /* synthetic */ ACPCheckoutRequestBody LLILLL;
    public final /* synthetic */ C0D7D LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D7B(C0D79 c0d79, ACPCheckoutRequestBody aCPCheckoutRequestBody, C0D7D c0d7d, InterfaceC1364105Vn<? super C0D7B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d79;
        this.LLILLL = aCPCheckoutRequestBody;
        this.LLILZ = c0d7d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D7B(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0D7J c0d7k;
        C1C7U.LIZ("ACPCheckoutGateway@d280.executeCreateRequest$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ACPCheckoutApiService aCPCheckoutApiService = (ACPCheckoutApiService) this.LLILLJJLI.LIZLLL.getValue();
                this.LLILLJJLI.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(a0.LJJJLL("/", C334130D7z.LIZ));
                sbLIZ.append("/api/ad/v1/order/create_checkout");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LLILLJJLI.getClass();
                Map<String, String> mapLJI = C0D79.LJI();
                ACPCheckoutRequestBody aCPCheckoutRequestBody = this.LLILLL;
                this.LL = 1;
                obj = aCPCheckoutApiService.createOrder(strLIZIZ, mapLJI, aCPCheckoutRequestBody, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ACPCheckoutGateway@d280.executeCreateRequest$2");
                    return objLJFF;
                }
            }
            c0d7k = this.LLILLJJLI.LJIIIIZZ(this.LLILZ, this.LLILLL, (ACPCheckoutResponse) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0d7k = new C0D7K(th);
        }
        C1C7U.LIZIZ("ACPCheckoutGateway@d280.executeCreateRequest$2");
        return c0d7k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0D7J> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
