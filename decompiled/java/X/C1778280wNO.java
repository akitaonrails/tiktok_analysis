package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778280wNO implements InterfaceC1778290wNP {
    public final String LIZ;
    public final Object LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778280wNO)) {
            return false;
        }
        C1778280wNO c1778280wNO = (C1778280wNO) obj;
        return Intrinsics.LJFF(this.LIZ, c1778280wNO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1778280wNO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1778280wNO.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Long l = this.LIZJ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogData(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", realSendTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778280wNO(String str, Object obj, Long l) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = l;
    }
}
