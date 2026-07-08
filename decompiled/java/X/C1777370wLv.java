package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777370wLv extends AbstractC1777330wLr {
    public final String LIZ;
    public final C1813220xHk LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777370wLv)) {
            return false;
        }
        C1777370wLv c1777370wLv = (C1777370wLv) obj;
        return Intrinsics.LJFF(this.LIZ, c1777370wLv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777370wLv.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1813220xHk c1813220xHk = this.LIZIZ;
        return iHashCode + (c1813220xHk == null ? 0 : c1813220xHk.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitData(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777370wLv(String str, C1813220xHk c1813220xHk) {
        this.LIZ = str;
        this.LIZIZ = c1813220xHk;
    }
}
