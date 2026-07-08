package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555590qaD<T> {
    public WeakReference<T> LIZ;

    public C1555590qaD(Function0<? extends T> function0) {
        this.LIZ = new WeakReference<>(function0.invoke());
    }
}
