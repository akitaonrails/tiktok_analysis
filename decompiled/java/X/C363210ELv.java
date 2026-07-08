package X;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ELv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363210ELv {
    public final String LIZ;
    public final String LIZIZ;
    public final Size LIZJ;
    public final Integer LIZLLL;

    public C363210ELv() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C363210ELv)) {
            return false;
        }
        C363210ELv c363210ELv = (C363210ELv) obj;
        return Intrinsics.LJFF(this.LIZ, c363210ELv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c363210ELv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c363210ELv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c363210ELv.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Size size = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UIConfig(loadingTip=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadingSubTip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lottieViewSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tipsGravity=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C363210ELv(String str, String str2, Size size, Integer num, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        size = (i & 4) != 0 ? null : size;
        num = (i & 8) != 0 ? null : num;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = size;
        this.LIZLLL = num;
    }
}
