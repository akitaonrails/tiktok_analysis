package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.01vU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C489801vU {
    public static final /* synthetic */ int LIZJ = 0;
    public final LayoutState LIZ;
    public final List<PosIdentity> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C489801vU)) {
            return false;
        }
        C489801vU c489801vU = (C489801vU) obj;
        return Intrinsics.LJFF(this.LIZ, c489801vU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c489801vU.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutUIState(layoutState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uiPositions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C489801vU(LayoutState layoutState, List<PosIdentity> list) {
        this.LIZ = layoutState;
        this.LIZIZ = list;
    }
}
