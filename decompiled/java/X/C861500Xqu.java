package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Xqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861500Xqu {
    public final Fragment LIZ;
    public final InterfaceC861480Xqs LIZIZ;
    public AnonymousClass0956 LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(true);
    public final AtomicBoolean LJ = new AtomicBoolean(true);

    public final void LIZ(boolean z) {
        if (!this.LIZLLL.compareAndSet(!z, z)) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C861490Xqt(this, z, null), 2);
    }

    public final void LIZIZ(boolean z) {
        if (!this.LJ.compareAndSet(!z, z) || z) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C861470Xqr(this, null), 2);
    }

    public C861500Xqu(Fragment fragment, C2239651ClH c2239651ClH) {
        this.LIZ = fragment;
        this.LIZIZ = c2239651ClH;
    }
}
