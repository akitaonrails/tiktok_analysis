package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.064x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15497064x extends AbstractC15499064z {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15497064x) && Intrinsics.LJFF(this.LIZ, ((C15497064x) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(targetUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15497064x(String str) {
        this.LIZ = str;
    }
}
