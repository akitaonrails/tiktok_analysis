package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514420pVo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514420pVo)) {
            return false;
        }
        C1514420pVo c1514420pVo = (C1514420pVo) obj;
        return Intrinsics.LJFF(this.LIZ, c1514420pVo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1514420pVo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1514420pVo.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RiskSignalPayload(entrance=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", domain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fpSessionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1514420pVo(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
