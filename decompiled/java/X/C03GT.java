package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import java.util.HashMap;

/* JADX INFO: renamed from: X.03GT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GT {
    public static void LIZ(FragmentManager fragmentManager, UserRight userRight, String str, HashMap map, String str2, String str3) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJL = (int) C958103op.LIZIZ();
        UserRightFragment userRightFragment = new UserRightFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "data", userRight);
        C786410Ut5.LJJJI("title", str, bundle);
        if (map != null) {
            C786410Ut5.LJJIZ(bundle, "track_params", map);
        }
        if (str2 != null) {
            C960603pE.LJIIJ(bundle, str2);
        }
        if (str3 != null) {
            C786410Ut5.LJJJI("source_btm_token", str3, bundle);
        }
        userRightFragment.setArguments(bundle);
        C1756030vnV.LIZIZ(userRightFragment, null, null, null, 7);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = userRightFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "CommerceUserRightFragment");
    }
}
