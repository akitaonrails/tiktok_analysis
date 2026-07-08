package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382060EyS {
    public final List<Long> LIZ = null;
    public final EnumC377680ErO LIZIZ;
    public final EnumC377820Erc LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382060EyS)) {
            return false;
        }
        C382060EyS c382060EyS = (C382060EyS) obj;
        return Intrinsics.LJFF(this.LIZ, c382060EyS.LIZ) && this.LIZIZ == c382060EyS.LIZIZ && this.LIZJ == c382060EyS.LIZJ;
    }

    public final int hashCode() {
        List<Long> list = this.LIZ;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyQuotaRequest(aigcIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382060EyS(EnumC377680ErO enumC377680ErO, EnumC377820Erc enumC377820Erc) {
        this.LIZIZ = enumC377680ErO;
        this.LIZJ = enumC377820Erc;
    }
}
