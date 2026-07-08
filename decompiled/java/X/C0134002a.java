package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0134002a {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;

    public C0134002a() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0134002a)) {
            return false;
        }
        C0134002a c0134002a = (C0134002a) obj;
        return Intrinsics.LJFF(this.LIZ, c0134002a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0134002a.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0134002a.LIZJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LIZJ;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceCallMetricModel(outgoingCallStartTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverSignalCreateTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clientPushReceivedTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0134002a(Long l, Long l2, Long l3, int i) {
        l = (i & 1) != 0 ? null : l;
        l2 = (i & 2) != 0 ? null : l2;
        l3 = (i & 4) != 0 ? null : l3;
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = l3;
    }
}
