package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* JADX INFO: renamed from: X.0JSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492400JSs {
    public static final void LIZ(LiveDialogFragment liveDialogFragment, FragmentManager fragmentManager, String str) {
        if (!liveDialogFragment.isShowing()) {
            liveDialogFragment.show(fragmentManager, str);
        }
    }
}
