package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841160WzC extends AbstractC841440Wze {
    public final Object LIZ;

    public C841160WzC() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C841160WzC) && Intrinsics.LJFF(this.LIZ, ((C841160WzC) obj).LIZ);
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
        sbLIZ.append("Drop(resultOverride=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841160WzC(Object obj) {
        this.LIZ = obj;
    }
}
