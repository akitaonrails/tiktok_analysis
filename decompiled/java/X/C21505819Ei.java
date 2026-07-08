package X;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: renamed from: X.19Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21505819Ei implements C0TSA {
    public final Lifecycle LIZ;
    public final C0TSA LIZIZ;
    public final LifecycleEventObserver LIZJ;

    @Override // X.C0TSA
    public final void LIZ(Bundle bundle, String str) {
        this.LIZIZ.LIZ(bundle, str);
    }

    public C21505819Ei(Lifecycle lifecycle, C0TSA c0tsa, LifecycleEventObserver lifecycleEventObserver) {
        this.LIZ = lifecycle;
        this.LIZIZ = c0tsa;
        this.LIZJ = lifecycleEventObserver;
    }
}
