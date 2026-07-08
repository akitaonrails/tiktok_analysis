package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409400mmQ extends AbstractC1409420mmS {
    public final C1409380mmO LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1409400mmQ) && Intrinsics.LJFF(this.LIZ, ((C1409400mmQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409400mmQ(C1409380mmO c1409380mmO) {
        this.LIZ = c1409380mmO;
    }
}
