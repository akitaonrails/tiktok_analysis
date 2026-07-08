package X;

import android.app.Dialog;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubSpaceEditorDialogFragment;

/* JADX INFO: renamed from: X.0K8W, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K8W {
    public static void LIZ(FragmentManager fragmentManager, C0JCO c0jco, int i) {
        boolean z;
        PGCSubSpaceEditorDialogFragment pGCSubSpaceEditorDialogFragment = new PGCSubSpaceEditorDialogFragment();
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        pGCSubSpaceEditorDialogFragment.LLJ = z;
        pGCSubSpaceEditorDialogFragment.LLJI = i;
        pGCSubSpaceEditorDialogFragment.LLILZLL = c0jco;
        pGCSubSpaceEditorDialogFragment.LL = true;
        Dialog dialog = pGCSubSpaceEditorDialogFragment.getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        pGCSubSpaceEditorDialogFragment.show(fragmentManager, "SubSpaceEditorDialogFragment");
    }
}
