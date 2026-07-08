package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0qCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541190qCz {
    public static final /* synthetic */ int LIZIZ = 0;
    public final AtomicInteger LIZ = new AtomicInteger(0);

    public static boolean LIZIZ(C1541190qCz c1541190qCz) {
        while (true) {
            int i = c1541190qCz.LIZ.get();
            if (i >= 0) {
                if (i != 64256) {
                    if ((i & 255) <= 0) {
                        if (c1541190qCz.LIZ.compareAndSet(i, 64256)) {
                            return true;
                        }
                    } else if (c1541190qCz.LIZ.compareAndSet(i, i - 1)) {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public final boolean LIZ(int i) {
        while (true) {
            int i2 = this.LIZ.get();
            if (i2 < 0) {
                return false;
            }
            if ((i2 & 255) <= i) {
                if (this.LIZ.compareAndSet(i2, -1)) {
                    return true;
                }
            } else if (this.LIZ.compareAndSet(i2, i2 - 1)) {
                return false;
            }
        }
    }

    public final void LIZJ(int i) {
        int i2;
        if (i >= 0) {
            if (i <= 255) {
                int i3 = i << 8;
                do {
                    i2 = this.LIZ.get();
                    if (i2 < 0) {
                        return;
                    }
                } while (!this.LIZ.compareAndSet(i2, (i2 & 255) + i3));
                return;
            }
            throw new IllegalArgumentException("New status must be less than 255.");
        }
        throw new IllegalArgumentException("New status must be a positive number.");
    }

    public final boolean LIZLLL(int i, int i2) {
        int i3;
        if (i2 >= 0) {
            if (i2 <= 255) {
                int i4 = i2 << 8;
                do {
                    i3 = this.LIZ.get();
                    if (i3 < 0 || ((65280 & i3) >> 8) != i) {
                        return false;
                    }
                } while (!this.LIZ.compareAndSet(i3, (i3 & 255) + i4));
                return true;
            }
            throw new IllegalArgumentException("New status must be less than 255.");
        }
        throw new IllegalArgumentException("New status must be a positive number.");
    }
}
