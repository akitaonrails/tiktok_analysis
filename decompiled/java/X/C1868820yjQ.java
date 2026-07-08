package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868820yjQ extends AbstractC1868840yjS {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868820yjQ) && Intrinsics.LJFF(this.LIZ, ((C1868820yjQ) obj).LIZ);
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

    public C1868820yjQ(String str) {
        this.LIZ = str;
    }
}
