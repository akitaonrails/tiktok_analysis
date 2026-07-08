package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1167004hQ extends AbstractC1167104hR {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1167004hQ) && Intrinsics.LJFF(this.LIZ, ((C1167004hQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfficialSample(coverId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1167004hQ(String str) {
        this.LIZ = str;
    }
}
