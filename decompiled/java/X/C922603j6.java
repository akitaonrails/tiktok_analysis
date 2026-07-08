package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03j6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C922603j6 extends AbstractC922903j9 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC922803j8 interfaceC922803j8 = (InterfaceC922803j8) xBaseParamModel;
        try {
            PayPalProcess payPalProcess = PayPalProcess.LIZ;
            String deviceCollectionToken = interfaceC922803j8.getDeviceCollectionToken();
            payPalProcess.getClass();
            InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq = PayPalProcess.LIZIZ;
            if (interfaceC1631620sYq != null) {
                Boolean bool = Boolean.TRUE;
                PaymentInfo paymentInfo = PayPalProcess.LIZJ;
                if (paymentInfo != null) {
                    PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                    if (paymentMethod != null) {
                        paymentMethod.LJIIIIZZ = deviceCollectionToken;
                    }
                } else {
                    paymentInfo = null;
                }
                interfaceC1631620sYq.invoke(bool, paymentInfo, null);
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC923903jJ.class, null), "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PayPalProcess.LIZ.getClass();
            InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq2 = PayPalProcess.LIZIZ;
            if (interfaceC1631620sYq2 != null) {
                Boolean bool2 = Boolean.TRUE;
                PaymentInfo paymentInfo2 = PayPalProcess.LIZJ;
                if (paymentInfo2 != null) {
                    PaymentMethod paymentMethod2 = paymentInfo2.paymentMethod;
                    if (paymentMethod2 != null) {
                        paymentMethod2.LJIIIIZZ = null;
                    }
                } else {
                    paymentInfo2 = null;
                }
                interfaceC1631620sYq2.invoke(bool2, paymentInfo2, null);
            }
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e), null, 4);
        }
    }
}
