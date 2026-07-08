package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0ZIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897460ZIq {
    public static final /* synthetic */ int LIZ = 0;

    public static Fragment LIZ(View view) {
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null && !fragmentLIZ.isRemoving() && !fragmentLIZ.isDetached() && fragmentLIZ.getFragmentManager() != null) {
            return fragmentLIZ;
        }
        return null;
    }

    public static Fragment LIZIZ(View view) {
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ == null || fragmentLIZ.getFragmentManager() == null || fragmentLIZ == null || fragmentLIZ.isRemoving() || fragmentLIZ.isDetached()) {
            return null;
        }
        return fragmentLIZ;
    }
}
