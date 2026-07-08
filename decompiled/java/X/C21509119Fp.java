package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.19Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21509119Fp implements LifecycleOwner {
    public final LifecycleRegistry LL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }

    public C21509119Fp(View view) {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LL = lifecycleRegistry;
        lifecycleRegistry.setCurrentState(Lifecycle.State.INITIALIZED);
        view.addOnAttachStateChangeListener(new C19LX(this, 2));
        if (view.isAttachedToWindow()) {
            lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
        }
    }
}
