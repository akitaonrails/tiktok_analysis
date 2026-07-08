package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Ms4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581940Ms4 {
    public static WeakReference<C0RHF> LIZ;

    public static final C0RHF LIZ() {
        WeakReference<C0RHF> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
