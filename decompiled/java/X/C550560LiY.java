package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550560LiY {
    public final boolean LIZ;
    public final C550570LiZ LIZIZ;

    public C550560LiY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C550560LiY)) {
            return false;
        }
        C550560LiY c550560LiY = (C550560LiY) obj;
        return this.LIZ == c550560LiY.LIZ && Intrinsics.LJFF(this.LIZIZ, c550560LiY.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadOptions(polling=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C550560LiY(int i) {
        this(false, new C550570LiZ(false, 0));
    }

    public C550560LiY(boolean z, C550570LiZ c550570LiZ) {
        this.LIZ = z;
        this.LIZIZ = c550570LiZ;
    }
}
