package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877950YcL {
    public final String LIZ = "rd_tiktokec_network_category_changed";
    public final Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C877950YcL)) {
            return false;
        }
        C877950YcL c877950YcL = (C877950YcL) obj;
        return Intrinsics.LJFF(this.LIZ, c877950YcL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c877950YcL.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackEvent(eventName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C877950YcL(Map map) {
        this.LIZIZ = map;
    }
}
