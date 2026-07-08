package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868880yjW extends AbstractC1868910yjZ {
    public final AbstractC2255531DPz LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868880yjW) && Intrinsics.LJFF(this.LIZ, ((C1868880yjW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868880yjW(AbstractC2255531DPz abstractC2255531DPz) {
        this.LIZ = abstractC2255531DPz;
    }
}
