package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CheckoutApiService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0D85, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CheckoutNetworkServiceImpl$execute$2", f = "CheckoutNetworkServiceImpl.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0D85 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC333960D7i<? extends CheckoutSession>>, Object> {
    public int LL;
    public final /* synthetic */ C0D8B LLILLJJLI;
    public final /* synthetic */ C1255904vl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D85(C0D8B c0d8b, C1255904vl c1255904vl, InterfaceC1364105Vn<? super C0D85> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d8b;
        this.LLILLL = c1255904vl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D85(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c333940D7g;
        C1C7U.LIZ("CheckoutNetworkServiceImpl@e99.execute$2");
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
                CheckoutApiService checkoutApiService = (CheckoutApiService) this.LLILLJJLI.LIZ.getValue();
                C1255904vl c1255904vl = this.LLILLL;
                String str = c1255904vl.LIZ;
                Map<String, String> map = c1255904vl.LIZIZ;
                TypedByteArray typedByteArray = new TypedByteArray("application/json", c1255904vl.LIZJ.getBytes(Charsets.UTF_8), new String[0]);
                this.LL = 1;
                obj = checkoutApiService.getCheckout(str, map, typedByteArray, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CheckoutNetworkServiceImpl@e99.execute$2");
                    return objLJFF;
                }
            }
            c333940D7g = (AbstractC333960D7i) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c333940D7g = new C333940D7g(th);
        }
        C1C7U.LIZIZ("CheckoutNetworkServiceImpl@e99.execute$2");
        return c333940D7g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC333960D7i<? extends CheckoutSession>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
