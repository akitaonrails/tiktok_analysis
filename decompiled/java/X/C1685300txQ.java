package X;

import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* JADX INFO: renamed from: X.0txQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685300txQ {
    public static void LIZ(C19GS c19gs) {
        if (c19gs == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(c19gs.getWindow().getDecorView(), c19gs);
        ViewTreeViewModelStoreOwner.set(c19gs.getWindow().getDecorView(), c19gs);
        C1688560u2g.LIZIZ(c19gs.getWindow().getDecorView(), c19gs);
    }
}
