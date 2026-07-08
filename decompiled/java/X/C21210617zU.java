package X;

import Y.ARunnableS132S0100000_32;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.17zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21210617zU extends AbstractC1911210zpn {
    public final WeakReference<C21212117zj> LL;

    public C21210617zU(WeakReference<C21212117zj> weakReference) {
        this.LL = weakReference;
    }

    @Override // X.AbstractC1911210zpn
    public final void LJJIJL(ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.withStartAction(new ARunnableS132S0100000_32(this, 103));
    }
}
