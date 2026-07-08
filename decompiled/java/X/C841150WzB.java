package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841150WzB extends AbstractC841440Wze {
    public final Object LIZ;
    public final boolean LIZIZ;

    public C841150WzB() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C841150WzB)) {
            return false;
        }
        C841150WzB c841150WzB = (C841150WzB) obj;
        return Intrinsics.LJFF(this.LIZ, c841150WzB.LIZ) && this.LIZIZ == c841150WzB.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        Object obj = this.LIZ;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        boolean z = this.LIZIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pass(resultOverride=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldIntercept=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841150WzB(Object obj, boolean z) {
        this.LIZ = obj;
        this.LIZIZ = z;
    }
}
