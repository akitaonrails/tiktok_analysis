package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652560t6c extends AbstractC1652550t6b {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1652560t6c) && Intrinsics.LJFF(this.LIZ, ((C1652560t6c) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(filePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1652560t6c(String str) {
        this.LIZ = str;
    }
}
