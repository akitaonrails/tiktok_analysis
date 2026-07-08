package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158190gFF {
    public final List<InterfaceC1204490hRv> LIZ;
    public final boolean LIZIZ;
    public final C1203960hR4 LIZJ;

    public C1158190gFF() {
        this((List) null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158190gFF)) {
            return false;
        }
        C1158190gFF c1158190gFF = (C1158190gFF) obj;
        return Intrinsics.LJFF(this.LIZ, c1158190gFF.LIZ) && this.LIZIZ == c1158190gFF.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1158190gFF.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        C1203960hR4 c1203960hR4 = this.LIZJ;
        return iHashCode + (c1203960hR4 == null ? 0 : c1203960hR4.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkPatchData(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needRemovePreviewData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadTracker=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158190gFF(List list, boolean z, int i) {
        this((List<? extends InterfaceC1204490hRv>) ((i & 1) != 0 ? C13BV.INSTANCE : list), (i & 2) != 0 ? false : z, (C1203960hR4) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158190gFF(List<? extends InterfaceC1204490hRv> list, boolean z, C1203960hR4 c1203960hR4) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = c1203960hR4;
    }
}
