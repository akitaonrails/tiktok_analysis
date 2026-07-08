package X;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.0RTV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTV {
    public static final boolean LIZ(Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            return true;
        }
        return false;
    }
}
