package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;

/* JADX INFO: renamed from: X.03cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C882703cf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FragmentManager fragmentManager, Fragment fragment, String str, EnumC865603Zu enumC865603Zu, boolean z, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            enumC865603Zu = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        OSPHalfDialogContainerFragment oSPHalfDialogContainerFragment = new OSPHalfDialogContainerFragment();
        oSPHalfDialogContainerFragment.LLJI = fragment;
        oSPHalfDialogContainerFragment.LLJIJIL = enumC865603Zu;
        oSPHalfDialogContainerFragment.LLJILJIL = z;
        oSPHalfDialogContainerFragment.show(fragmentManager, str);
    }
}
