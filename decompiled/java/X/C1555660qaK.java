package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555660qaK<T> {
    public WeakReference<T> LIZ;

    public C1555660qaK(Function0<? extends T> function0) {
        this.LIZ = new WeakReference<>(function0.invoke());
    }
}
