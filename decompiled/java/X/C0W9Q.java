package X;

/* JADX INFO: renamed from: X.0W9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9Q {
    public static final C0W9T LIZIZ() {
        return new C0W9T();
    }

    public static final boolean LIZ(double d) {
        if (d <= 0.0d) {
            return false;
        }
        if (d < 1.0d && System.nanoTime() % ((long) 10000) >= d * ((double) 10000)) {
            return false;
        }
        return true;
    }
}
