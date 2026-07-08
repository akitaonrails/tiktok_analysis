package X;

import android.animation.Animator;
import androidx.lifecycle.LifecycleCoroutineScope;

/* JADX INFO: renamed from: X.0I6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461190I6r {
    public final InterfaceC497601wk LIZ;
    public AnonymousClass0956 LIZIZ;
    public Animator LIZJ;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
    }

    public C461190I6r(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
    }
}
