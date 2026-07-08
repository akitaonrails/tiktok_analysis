package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.03Rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C843803Rk {
    /* JADX WARN: Multi-variable type inference failed */
    public static final LifecycleOwner LIZ(Context context) {
        if (context instanceof C19FO) {
            return (LifecycleOwner) context;
        }
        if (context instanceof Fragment) {
            return (LifecycleOwner) context;
        }
        return null;
    }
}
