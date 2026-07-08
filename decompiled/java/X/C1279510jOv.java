package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279510jOv {
    public final EnumC1279500jOu LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public C1279510jOv() {
        this(null, 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279510jOv)) {
            return false;
        }
        C1279510jOv c1279510jOv = (C1279510jOv) obj;
        return this.LIZ == c1279510jOv.LIZ && this.LIZIZ == c1279510jOv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1279510jOv.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxPlayerError(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1279510jOv(EnumC1279500jOu enumC1279500jOu, int i, int i2) {
        enumC1279500jOu = (i2 & 1) != 0 ? EnumC1279500jOu.GENERAL_ERROR : enumC1279500jOu;
        i = (i2 & 2) != 0 ? 0 : i;
        this.LIZ = enumC1279500jOu;
        this.LIZIZ = i;
        this.LIZJ = null;
    }
}
