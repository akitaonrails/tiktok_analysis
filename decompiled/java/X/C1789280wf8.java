package X;

import android.app.Activity;
import com.bytedance.iap.core.model.IAPRedirectRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.jsb.impl.MpOpenChannelPageMethod$handle$1", f = "MpOpenChannelPageMethod.kt", l = {37}, m = "invokeSuspend")
public final class C1789280wf8 extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<String>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1791390wiX LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789280wf8(InterfaceC1791390wiX interfaceC1791390wiX, Activity activity, InterfaceC1364105Vn<? super C1789280wf8> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1791390wiX;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789280wf8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1780570wR5 enumC1780570wR5;
        C1C7U.LIZ("MpOpenChannelPageMethod@6a0d.handle$1");
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
            C1789140weu c1789140weuLIZIZ = InterfaceC1789300wfA.LIZ.LIZIZ();
            String merchantId = this.LLILLJJLI.getMerchantId();
            final String scenario = this.LLILLJJLI.getScenario();
            AbstractC1789340wfE abstractC1789340wfE = new AbstractC1789340wfE(scenario) { // from class: X.0wfF
            };
            Number paymentChannel = this.LLILLJJLI.getPaymentChannel();
            if (Intrinsics.LJFF(paymentChannel, C2286608xc.LJ(3))) {
                enumC1780570wR5 = EnumC1780570wR5.GOOGLE_PAY;
            } else if (Intrinsics.LJFF(paymentChannel, C2286608xc.LJ(2))) {
                enumC1780570wR5 = EnumC1780570wR5.APPLE_PAY;
            } else {
                enumC1780570wR5 = EnumC1780570wR5.UNKNOWN;
            }
            IAPRedirectRequest iAPRedirectRequest = new IAPRedirectRequest(this.LLILLL, abstractC1789340wfE, enumC1780570wR5, this.LLILLJJLI.getId(), merchantId);
            this.LL = 1;
            obj = c1789140weuLIZIZ.LJIIIZ(iAPRedirectRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MpOpenChannelPageMethod@6a0d.handle$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MpOpenChannelPageMethod@6a0d.handle$1");
        return obj;
    }
}
