package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.jsb.impl.PipoGetNonceMethod$handle$1$1$1", f = "PipoGetNonceMethod.kt", l = {}, m = "invokeSuspend")
public final class C2384809Wc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC2384709Wb> LL;
    public final /* synthetic */ C09WY LLILLJJLI;
    public final /* synthetic */ Cashier LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2384809Wc(CompletionBlock<InterfaceC2384709Wb> completionBlock, C09WY c09wy, Cashier cashier, InterfaceC1364105Vn<? super C2384809Wc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = c09wy;
        this.LLILLL = cashier;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2384809Wc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        C1C7U.LIZ("PipoGetNonceMethod@ac4a.handle$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CompletionBlock<InterfaceC2384709Wb> completionBlock = this.LL;
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2384709Wb.class, containerID);
        Cashier cashier = this.LLILLL;
        InterfaceC2384709Wb interfaceC2384709Wb = (InterfaceC2384709Wb) xBaseModelLIZJ;
        interfaceC2384709Wb.setNonce(cashier.nonce);
        interfaceC2384709Wb.setMerchantId(cashier.merchantId);
        interfaceC2384709Wb.setMerchantUserId(cashier.merchantUserId);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "Success");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoGetNonceMethod@ac4a.handle$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
