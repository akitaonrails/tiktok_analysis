package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5T, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5T {
    public final boolean LIZ;
    public final C1344390l5Z LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5T)) {
            return false;
        }
        C0S5T c0s5t = (C0S5T) obj;
        return this.LIZ == c0s5t.LIZ && Intrinsics.LJFF(this.LIZIZ, c0s5t.LIZIZ);
    }

    public C0S5T(boolean z, C1344390l5Z c1344390l5Z) {
        this.LIZ = z;
        this.LIZIZ = c1344390l5Z;
    }
}
