package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224850hyl {
    public final EnumC992630bwD LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224850hyl)) {
            return false;
        }
        C1224850hyl c1224850hyl = (C1224850hyl) obj;
        return this.LIZ == c1224850hyl.LIZ && Intrinsics.LJFF(this.LIZIZ, c1224850hyl.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C1224850hyl(EnumC992630bwD enumC992630bwD, String str) {
        this.LIZ = enumC992630bwD;
        this.LIZIZ = str;
    }
}
