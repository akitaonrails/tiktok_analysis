package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186420gym implements InterfaceC1186470gyr {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186420gym)) {
            return false;
        }
        C1186420gym c1186420gym = (C1186420gym) obj;
        return Intrinsics.LJFF(this.LIZ, c1186420gym.LIZ) && this.LIZIZ == c1186420gym.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataParseDurationTrackAction(business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186420gym(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
