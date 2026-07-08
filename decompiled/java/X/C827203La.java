package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.03La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C827203La {
    public static final C19EG LIZ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return (C19EG) ((ContextWrapper) context).getBaseContext();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not convert ");
        sbLIZ.append(context);
        sbLIZ.append(" to activity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Fragment LIZIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            Fragment fragmentLJI = C724240Sb0.LJI(lifecycleOwner);
            if (fragmentLJI != null) {
                return fragmentLJI;
            }
            throw new IllegalStateException("can not find fragment.");
        }
        throw new IllegalStateException("can not find fragment.");
    }
}
