package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.subpage.SeaPdpPaymentPanelFragment;
import java.util.Map;

/* JADX INFO: renamed from: X.042R, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C042R {
    public static void LIZ(FragmentManager fragmentManager, SeaPaymentPanelInfo seaPaymentPanelInfo, String str, Map map, int i) {
        int iLIZIZ;
        if ((i & 4) != 0) {
            iLIZIZ = (int) C958103op.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = new SeaPdpPaymentPanelFragment(seaPaymentPanelInfo, str, map);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "SeaPdpPaymentPanelFragment");
    }
}
