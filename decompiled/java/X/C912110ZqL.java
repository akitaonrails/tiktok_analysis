package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.feed.platform.cell.im.safety.SafetyViewModel;

/* JADX INFO: renamed from: X.0ZqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912110ZqL {
    public static SafetyViewModel LIZ(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        return (SafetyViewModel) ViewModelProviders.of(fragment).get(SafetyViewModel.class);
    }
}
