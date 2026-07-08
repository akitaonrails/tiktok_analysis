package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420160Gdi<T> {
    public final WeakReference<T> LIZ;

    public final int hashCode() {
        T t = this.LIZ.get();
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public C420160Gdi(C417420GYi c417420GYi) {
        this.LIZ = new WeakReference<>(c417420GYi);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(C420160Gdi.class, cls) && Intrinsics.LJFF(this.LIZ.get(), ((C420160Gdi) obj).LIZ.get())) {
            return true;
        }
        return false;
    }
}
