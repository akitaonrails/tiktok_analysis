package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0zNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893760zNe {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZ(Activity activity, boolean z) {
        if (activity != 0 && (activity instanceof InterfaceC1893770zNf)) {
            return ((InterfaceC1893770zNf) activity).isActive();
        }
        return z;
    }
}
