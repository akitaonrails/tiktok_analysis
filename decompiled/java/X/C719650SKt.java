package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0SKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719650SKt {
    public static final /* synthetic */ int LIZ = 0;

    public static Context LIZ(InterfaceC719640SKs interfaceC719640SKs, C19EG c19eg) {
        Context context;
        Context contextMk2 = interfaceC719640SKs.Mk2();
        if (contextMk2 != null) {
            return contextMk2;
        }
        LifecycleOwner lifecycleOwnerE82 = interfaceC719640SKs.E82();
        if (lifecycleOwnerE82 == null) {
            return c19eg;
        }
        if (lifecycleOwnerE82 instanceof AbstractC738140SxQ) {
            Context context2 = ((AbstractC738140SxQ) lifecycleOwnerE82).getContext();
            context = c19eg;
            if (context2 != null) {
                return context2;
            }
        } else if (lifecycleOwnerE82 instanceof Fragment) {
            Fragment fragment = (Fragment) lifecycleOwnerE82;
            Context context3 = fragment.getContext();
            context = context3;
            if (context3 == null) {
                return fragment.getActivity();
            }
        } else {
            context = c19eg;
            if (lifecycleOwnerE82 instanceof InterfaceC719640SKs) {
                return LIZ((InterfaceC719640SKs) lifecycleOwnerE82, c19eg);
            }
        }
        return context;
    }
}
