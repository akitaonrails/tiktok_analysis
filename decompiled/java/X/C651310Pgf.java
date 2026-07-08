package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0Pgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651310Pgf {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZ(Fragment fragment) {
        if (fragment instanceof InterfaceC214902198i) {
            return SAFExtensionKt.LJIIZILJ((InterfaceC214902198i) fragment);
        }
        if (fragment instanceof InterfaceC651320Pgg) {
            if (((InterfaceC651320Pgg) fragment).T0()) {
                return true;
            }
            return false;
        }
        C19EG activity = fragment.getActivity();
        if (activity != null && !activity.isFinishing()) {
            return true;
        }
        return false;
    }
}
