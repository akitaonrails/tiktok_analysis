package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122130fJ5 extends AbstractC1122140fJ6 {
    public final C1122100fJ2 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1122130fJ5) && Intrinsics.LJFF(this.LIZ, ((C1122130fJ5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1122130fJ5(C1122100fJ2 c1122100fJ2) {
        this.LIZ = c1122100fJ2;
    }
}
