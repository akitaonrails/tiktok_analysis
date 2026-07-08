package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5N, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5N implements C164G {
    public final String LIZ;
    public final List<C0SME> LIZIZ;
    public final boolean LIZJ;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5N)) {
            return false;
        }
        C0S5N c0s5n = (C0S5N) obj;
        return Intrinsics.LJFF(this.LIZ, c0s5n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0s5n.LIZIZ) && this.LIZJ == c0s5n.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<C0SME> list = this.LIZIZ;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTextTranslationData(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", photoDataList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S5N(String str, boolean z, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
    }
}
