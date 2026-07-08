package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;

/* JADX INFO: renamed from: X.03br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C877703br {
    public static final OSPHalfDialogContainerFragment LIZ(Fragment fragment) {
        if (fragment != null && !(fragment instanceof OSPHalfDialogContainerFragment)) {
            return LIZ(fragment.getParentFragment());
        }
        if (fragment instanceof OSPHalfDialogContainerFragment) {
            return (OSPHalfDialogContainerFragment) fragment;
        }
        return null;
    }
}
