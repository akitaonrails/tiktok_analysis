package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03dP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C887303dP {
    public static void LIZ(FragmentManager fragmentManager, int i, PaymentMethod paymentMethod, EnterParams enterParams, AwS367S0200000_1 awS367S0200000_1) {
        CCDCFillCVVHalfFragment cCDCFillCVVHalfFragment = new CCDCFillCVVHalfFragment();
        cCDCFillCVVHalfFragment.LLIZLLLIL = paymentMethod;
        cCDCFillCVVHalfFragment.LLJ = enterParams;
        cCDCFillCVVHalfFragment.LLJI = null;
        cCDCFillCVVHalfFragment.LLJIJIL = awS367S0200000_1;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = cCDCFillCVVHalfFragment;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJL = i;
        c1390920mIc.LJ(1);
        c1390920mIc.LJI(16);
        c1390920mIc.LIZ.show(fragmentManager, "ccdc_card_fill_cvv");
    }
}
