package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693790uB7 {
    public static final C1693790uB7 LIZJ = new C1693790uB7(false, 2);
    public static final C1693790uB7 LIZLLL = new C1693790uB7(true, 1);
    public final int LIZ;
    public final boolean LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        return Intrinsics.LJFF(this, LIZJ) ? "TextMotion.Static" : Intrinsics.LJFF(this, LIZLLL) ? "TextMotion.Animated" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693790uB7)) {
            return false;
        }
        C1693790uB7 c1693790uB7 = (C1693790uB7) obj;
        if (this.LIZ == c1693790uB7.LIZ && this.LIZIZ == c1693790uB7.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1693790uB7(boolean z, int i) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
