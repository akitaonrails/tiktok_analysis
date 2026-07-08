package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961220b7Y extends AbstractC961730b8N {
    public final C961030b7F LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C961220b7Y) && Intrinsics.LJFF(this.LIZ, ((C961220b7Y) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hit(entry=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961220b7Y(C961030b7F c961030b7F) {
        this.LIZ = c961030b7F;
    }
}
