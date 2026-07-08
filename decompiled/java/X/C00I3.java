package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00I3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00I3 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00I3) && Intrinsics.LJFF(this.LIZ, ((C00I3) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiTryOnAvailability(skuId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00I3(String str) {
        this.LIZ = str;
    }
}
