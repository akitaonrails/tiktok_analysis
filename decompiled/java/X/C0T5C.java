package X;

/* JADX INFO: renamed from: X.0T5C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T5C {
    public static Runnable LIZ(Runnable runnable) {
        C0W9T c0w9tLIZIZ = C0W9U.LIZIZ();
        if (c0w9tLIZIZ != null && !(runnable instanceof C0T5B)) {
            return new C0T5B(runnable, c0w9tLIZIZ);
        }
        return runnable;
    }
}
