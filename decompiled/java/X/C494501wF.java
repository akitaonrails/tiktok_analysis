package X;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.01wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C494501wF {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(325));

    public static final boolean LIZ(Fragment fragment) {
        if (!fragment.isRemoving() && !fragment.isDetached() && fragment.getView() != null && fragment.getFragmentManager() != null) {
            return true;
        }
        return false;
    }
}
