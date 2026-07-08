package X;

import android.view.Window;

/* JADX INFO: renamed from: X.19Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21517719Ix {
    public static boolean LIZ(Window window) {
        if (window != null && window.getAttributes() != null && (window.getAttributes().flags & 1024) == 1024) {
            return true;
        }
        return false;
    }
}
