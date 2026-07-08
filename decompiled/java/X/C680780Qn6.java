package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0Qn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680780Qn6 {
    public static C19EG LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return ((Fragment) lifecycleOwner).getActivity();
        }
        if (lifecycleOwner instanceof InterfaceC719640SKs) {
            return ((InterfaceC719640SKs) lifecycleOwner).getActivity();
        }
        if (lifecycleOwner instanceof C19EG) {
            return (C19EG) lifecycleOwner;
        }
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            return LIZ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static Fragment LIZIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (!(lifecycleOwner instanceof C19EG)) {
            if (lifecycleOwner instanceof AbstractC738140SxQ) {
                return LIZIZ(((AbstractC738140SxQ) lifecycleOwner).getParent());
            }
            if (lifecycleOwner instanceof InterfaceC719640SKs) {
                LifecycleOwner lifecycleOwnerE82 = ((InterfaceC719640SKs) lifecycleOwner).E82();
                if (lifecycleOwnerE82 != null) {
                    return LIZIZ(lifecycleOwnerE82);
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return null;
        }
        return null;
    }
}
