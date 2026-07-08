package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.installmentbreakdown.InstallmentBreakdownFragment;
import java.util.Map;

/* JADX INFO: renamed from: X.03Dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C808903Dz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, InstallmentBreakdown installmentBreakdown, Map map) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (installmentBreakdown != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            InstallmentBreakdownFragment installmentBreakdownFragment = new InstallmentBreakdownFragment();
            installmentBreakdownFragment.LLILZIL = installmentBreakdown;
            installmentBreakdownFragment.LLILZLL = map;
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = installmentBreakdownFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            int iLIZ = (int) (((double) C497820Jfg.LIZ(context)) * 0.72d);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLIZ;
            tuxSheet2.show(supportFragmentManager, "InstallmentBreakdownFragment");
        }
    }
}
