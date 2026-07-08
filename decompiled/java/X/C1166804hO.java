package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1166804hO {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1166804hO) && Intrinsics.LJFF(this.LIZ, ((C1166804hO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcResubscribeSuccessData(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1166804hO(String str) {
        this.LIZ = str;
    }
}
