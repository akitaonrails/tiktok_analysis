package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264130j07<T> {
    public WeakReference<T> LIZ;

    public C1264130j07(Function0<? extends T> function0) {
        this.LIZ = new WeakReference<>(function0.invoke());
    }
}
