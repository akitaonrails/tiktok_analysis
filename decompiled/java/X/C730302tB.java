package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C730302tB implements InterfaceC729102sz {
    public final Object LIZ;

    public C730302tB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C730302tB) && Intrinsics.LJFF(this.LIZ, ((C730302tB) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaCombinedSkuPlatformPromotionCompState(dummy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C730302tB(int i) {
        this.LIZ = null;
    }
}
