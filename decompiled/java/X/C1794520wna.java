package X;

import android.app.Activity;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* JADX INFO: renamed from: X.0wna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794520wna implements InterfaceC1792450wkF {
    public static final AbstractC1794360wnK LIZIZ(EnumC1791830wjF enumC1791830wjF, Object... objArr) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().getGoogleState((InterfaceC1794400wnO) objArr[0], (Activity) objArr[1]);
        }
        if (enumC1791830wjF == EnumC1791830wjF.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().getAmazonState((InterfaceC1794400wnO) objArr[0], (Activity) objArr[1]);
        }
        return null;
    }

    public static final void LIZJ(EnumC1791830wjF enumC1791830wjF, InterfaceC1794730wnv interfaceC1794730wnv) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryHasSubscriptionProducts(interfaceC1794730wnv);
            return;
        }
        C1792840wks c1792840wks = new C1792840wks(1, -1, "query has subscription not support amazon!");
        InterfaceC1794450wnT interfaceC1794450wnTLIZIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ();
        EnumC1791830wjF enumC1791830wjF2 = EnumC1791830wjF.AMAZON;
        ((C1794650wnn) interfaceC1794450wnTLIZIZ).LJFF(c1792840wks, interfaceC1794730wnv, enumC1791830wjF2, null);
        ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIJJI(enumC1791830wjF2, c1792840wks, null);
    }

    public static final void LJ(EnumC1791830wjF enumC1791830wjF, InterfaceC1794840wo6 interfaceC1794840wo6, String str) {
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        if (C1795410wp1.LIZJ("iap_exp_optimize_restore_2", 0) == 2) {
            return;
        }
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(interfaceC1794840wo6, str);
            return;
        }
        if (enumC1791830wjF == EnumC1791830wjF.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryUnAckEdOrderFromChannel(interfaceC1794840wo6, str);
            return;
        }
        C1792220wjs c1792220wjs = new C1792220wjs();
        c1792220wjs.LIZ = 1;
        c1792220wjs.LJ = "invalid payment_method";
        interfaceC1794840wo6.onQueryFinished(enumC1791830wjF, c1792220wjs, null, str);
    }

    public static final void LIZ(EnumC1791830wjF enumC1791830wjF, boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().consumeProduct(z, str, consumeIapProductListener);
        } else {
            if (enumC1791830wjF != EnumC1791830wjF.AMAZON) {
                return;
            }
            PaymentServiceManager.get().getAmazonIapExternalService().consumeProduct(str, consumeIapProductListener);
        }
    }

    public static final void LIZLLL(EnumC1791830wjF enumC1791830wjF, List<String> list, boolean z, InterfaceC1792890wkx<AbstractC1791620wiu> interfaceC1792890wkx) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, z, interfaceC1792890wkx);
        } else {
            if (enumC1791830wjF != EnumC1791830wjF.AMAZON) {
                return;
            }
            PaymentServiceManager.get().getAmazonIapExternalService().queryProductDetails(list, z, interfaceC1792890wkx);
        }
    }
}
