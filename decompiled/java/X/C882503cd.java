package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.SecurePaymentDetailDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.HashMap;

/* JADX INFO: renamed from: X.03cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C882503cd {
    public static void LIZ(FragmentManager fragmentManager, Bundle bundle, PaymentMethodsData paymentMethodsData, HashMap map, EnumC865603Zu enumC865603Zu, boolean z, boolean z2) {
        float fLIZJ;
        if (C865803Zw.LIZ[enumC865603Zu.ordinal()] == 1) {
            fLIZJ = C958103op.LIZ();
        } else {
            fLIZJ = C958103op.LIZJ() * 0.9f;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJL = (int) fLIZJ;
        SecurePaymentDetailDialogFragment securePaymentDetailDialogFragment = new SecurePaymentDetailDialogFragment();
        securePaymentDetailDialogFragment.setArguments(bundle);
        securePaymentDetailDialogFragment.LLJILJIL = paymentMethodsData;
        securePaymentDetailDialogFragment.LLJILJILJ = map;
        securePaymentDetailDialogFragment.LLJJIJI = z;
        securePaymentDetailDialogFragment.LLJJIJIIJIL = z2;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = securePaymentDetailDialogFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "SecurePaymentDetailDialogFragment");
    }
}
