package X;

import androidx.databinding.ViewDataBinding;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1DTS, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DTS<T> extends WeakReference<ViewDataBinding> {
    public final InterfaceC2256331DTb<T> LIZ;
    public final int LIZIZ;
    public T LIZJ;

    public final boolean LIZ() {
        boolean z;
        T t = this.LIZJ;
        if (t != null) {
            this.LIZ.LIZIZ(t);
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = null;
        return z;
    }

    public C1DTS(ViewDataBinding viewDataBinding, int i, InterfaceC2256331DTb<T> interfaceC2256331DTb, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.LIZIZ = i;
        this.LIZ = interfaceC2256331DTb;
    }
}
