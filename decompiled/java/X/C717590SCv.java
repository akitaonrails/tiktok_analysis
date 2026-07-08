package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717590SCv<T> {
    public WeakReference<T> LIZ;

    public final Object LIZ() {
        return this.LIZ.get();
    }

    public C717590SCv(Function0<? extends T> function0) {
        this.LIZ = new WeakReference<>(function0.invoke());
    }

    public final void LIZIZ(Object obj) {
        this.LIZ = new WeakReference<>(obj);
    }
}
