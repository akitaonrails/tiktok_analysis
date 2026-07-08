package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04CV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CV {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C04EU LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04CV)) {
            return false;
        }
        C04CV c04cv = (C04CV) obj;
        return this.LIZ == c04cv.LIZ && this.LIZIZ == c04cv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c04cv.LIZJ);
    }

    public final boolean LIZ() {
        return this.LIZ || this.LIZIZ;
    }

    public C04CV(boolean z, boolean z2, C04EU c04eu) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c04eu;
    }
}
