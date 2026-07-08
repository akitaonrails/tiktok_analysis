package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0D6C, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6C extends C09AY implements Function1<List<LocalOrderWrapper>, Unit> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ C259800zU<CheckoutSession> LLILLJJLI;
    public final /* synthetic */ C0D6A LLILLL;
    public final /* synthetic */ CheckoutSession LLILZ;
    public final /* synthetic */ CheckoutIntent LLILZIL;
    public final /* synthetic */ C259800zU<CheckoutIntent> LLILZLL;
    public final /* synthetic */ OrderState LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6C(Long l, C259800zU<CheckoutSession> c259800zU, C0D6A c0d6a, CheckoutSession checkoutSession, CheckoutIntent checkoutIntent, C259800zU<CheckoutIntent> c259800zU2, OrderState orderState) {
        super(1);
        this.LL = l;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c0d6a;
        this.LLILZ = checkoutSession;
        this.LLILZIL = checkoutIntent;
        this.LLILZLL = c259800zU2;
        this.LLIZ = orderState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r33) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6C.invoke(java.lang.Object):java.lang.Object");
    }
}
