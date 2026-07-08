package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053460dWK extends AbstractC1053500dWO {
    public final String LIZ;

    @Override // X.AbstractC1053500dWO
    public final int LIZ() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1053460dWK) && Intrinsics.LJFF(this.LIZ, ((C1053460dWK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryTitleItemData(timeRange=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1053460dWK(String str) {
        this.LIZ = str;
    }
}
