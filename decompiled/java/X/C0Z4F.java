package X;

import Y.ACListenerS149S0100000_14;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Z4F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4F {
    public final Fragment LIZ;
    public final PrivacySettingsFeature LIZIZ;
    public TuxSheet LIZJ;

    public final void LIZ() {
        FragmentManager fragmentManager = this.LIZ.getFragmentManager();
        if (fragmentManager != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ.requireContext()), R.layout.ch1, null, false);
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 53), viewTd.findViewById(R.id.yzf));
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 54), viewTd.findViewById(R.id.pc_));
            TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
            tuxSheet.LLJJIII = viewTd;
            tuxSheet.LLILLL = true;
            tuxSheet.LL = new DialogInterfaceOnCancelListenerC913890ZtD(this, 2);
            this.LIZJ = tuxSheet;
            tuxSheet.show(fragmentManager, "StrangerBottomSheetOptInDialog");
        }
        C885310YoD.LIZ.getClass();
        C885310YoD.LJJIIJZLJL("show");
    }

    public C0Z4F(Fragment fragment) {
        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
        this.LIZ = fragment;
        this.LIZIZ = imPrivacySettings;
    }

    public final void LIZIZ(int i) {
        TuxSheet tuxSheet = this.LIZJ;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        this.LIZIZ.LJFF("filtered_message", i, C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS558S0100000_14(this, 1247), new C0Z4G(C0Z4I.LIZ), true);
    }
}
