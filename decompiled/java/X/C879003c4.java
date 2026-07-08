package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCSaveCardRetentionHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CashierSheetContent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03c4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C879003c4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(EnumC884003cs enumC884003cs) {
        Keva keva = C1257480ipO.LIZ;
        int i = keva.getInt("ccdc_local_retention_count", 0);
        int i2 = C879103c5.LIZ[enumC884003cs.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    keva.storeInt("ccdc_local_retention_count", 100);
                    return;
                }
                throw new C1954807lC();
            }
            keva.storeInt("ccdc_local_retention_count", i + 1);
        }
    }

    public static void LIZ(FragmentManager fragmentManager, CashierSheetContent cashierSheetContent, boolean z, String str, Function1 function1) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        CCDCSaveCardRetentionHalfFragment cCDCSaveCardRetentionHalfFragment = new CCDCSaveCardRetentionHalfFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("page_name", str, bundle);
        cCDCSaveCardRetentionHalfFragment.setArguments(bundle);
        cCDCSaveCardRetentionHalfFragment.LLILZIL = cashierSheetContent;
        cCDCSaveCardRetentionHalfFragment.LLILZLL = function1;
        cCDCSaveCardRetentionHalfFragment.LLIZ = z;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = cCDCSaveCardRetentionHalfFragment;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.03c6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        tuxSheet.LL = new C04JN(function1, 1);
        tuxSheet.show(fragmentManager, "save");
    }
}
