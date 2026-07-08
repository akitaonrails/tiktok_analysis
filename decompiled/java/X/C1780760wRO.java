package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780760wRO {
    public Integer LIZ;
    public Integer LIZIZ;
    public String LIZJ;

    public C1780760wRO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780760wRO)) {
            return false;
        }
        C1780760wRO c1780760wRO = (C1780760wRO) obj;
        return Intrinsics.LJFF(this.LIZ, c1780760wRO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1780760wRO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1780760wRO.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChannelTracking(purchaseResultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", purchaseResultSubCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", purchaseResultMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780760wRO(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
