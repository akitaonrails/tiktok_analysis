package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O8N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8N {
    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends C0O8Q> E LIZ(C0O8Q c0o8q, C0O8V<E> c0o8v) {
        if (!Intrinsics.LJFF(c0o8q.getKey(), c0o8v)) {
            return null;
        }
        return c0o8q;
    }

    public static C0O8O LIZIZ(C0O8Q c0o8q, C0O8V<?> c0o8v) {
        if (Intrinsics.LJFF(c0o8q.getKey(), c0o8v)) {
            return C0O8R.LIZIZ;
        }
        return c0o8q;
    }
}
