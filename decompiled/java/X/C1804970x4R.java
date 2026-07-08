package X;

import com.bytedance.tracking.TrackingEventV3Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804970x4R {
    public final int LIZ;
    public final C1804420x3Y LIZIZ;
    public final String LIZJ;
    public final TrackingEventV3Data LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1804970x4R)) {
            return false;
        }
        C1804970x4R c1804970x4R = (C1804970x4R) obj;
        return this.LIZ == c1804970x4R.LIZ && Intrinsics.LJFF(this.LIZIZ, c1804970x4R.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1804970x4R.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1804970x4R.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        TrackingEventV3Data trackingEventV3Data = this.LIZLLL;
        return iHashCode + (trackingEventV3Data == null ? 0 : trackingEventV3Data.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomPackageInput(customPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fullPackageInput=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelChannel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackingV3Data=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1804970x4R(int i, C1804420x3Y c1804420x3Y, String str, TrackingEventV3Data trackingEventV3Data) {
        this.LIZ = i;
        this.LIZIZ = c1804420x3Y;
        this.LIZJ = str;
        this.LIZLLL = trackingEventV3Data;
    }
}
