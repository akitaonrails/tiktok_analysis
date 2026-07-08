package X;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.0I1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459880I1q {
    public static final boolean LIZ(AbstractC738140SxQ abstractC738140SxQ) {
        return abstractC738140SxQ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }
}
