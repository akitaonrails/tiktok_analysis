package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350000Dnq {
    public final C350090Dnz LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C350000Dnq)) {
            return false;
        }
        C350000Dnq c350000Dnq = (C350000Dnq) obj;
        return Intrinsics.LJFF(this.LIZ, c350000Dnq.LIZ) && this.LIZIZ == c350000Dnq.LIZIZ && this.LIZJ == c350000Dnq.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OtherTrackData(maxTimeState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", trackPanelMuteState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackPanelMuteEnableState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C350000Dnq(C350090Dnz c350090Dnz, boolean z, boolean z2) {
        this.LIZ = c350090Dnz;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
