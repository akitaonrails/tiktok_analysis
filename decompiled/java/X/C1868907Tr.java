package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1868907Tr extends AbstractC1868807Tq {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868907Tr) && Intrinsics.LJFF(this.LIZ, ((C1868907Tr) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868907Tr(String str) {
        this.LIZ = str;
    }
}
