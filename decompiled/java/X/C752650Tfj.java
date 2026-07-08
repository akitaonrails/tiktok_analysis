package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752650Tfj {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(353));

    public static boolean LIZ(Fragment fragment) {
        View view;
        if (fragment == null || !fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getActivity() == null || (view = fragment.getView()) == null || !view.isAttachedToWindow()) {
            return false;
        }
        return true;
    }
}
