package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0meB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404290meB {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404290meB)) {
            return false;
        }
        C1404290meB c1404290meB = (C1404290meB) obj;
        return Intrinsics.LJFF(this.LIZ, c1404290meB.LIZ) && this.LIZIZ == c1404290meB.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampaignInfo(campaignId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1404290meB(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
