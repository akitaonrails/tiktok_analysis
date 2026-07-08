package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.06oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721206oc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LifecycleOwner lifecycleOwner, Throwable th, String str) {
        if (th instanceof C738130SxP) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" submitNewMessageList AssemIllegalStateException");
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (th instanceof IllegalStateException) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" submitNewMessageList IllegalStateException");
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (th instanceof C1721306od) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(" submitNewMessageList AbilityIsNullException");
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (th instanceof C0RTZ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(" submitNewMessageList AssemHierarchyDataNotFoundException");
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        if (lifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) lifecycleOwner;
            if (fragment.getFragmentManager() == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str);
                sbLIZ5.append(" submitNewMessageList Exception post fragment detach");
                C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            throw th;
        }
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(str);
            sbLIZ6.append(" submitNewMessageList Exception post lifecycle destroyed");
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        throw th;
    }
}
