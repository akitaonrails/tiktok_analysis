package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587100N0y extends AbstractC587110N0z {
    public final boolean LIZ;
    public final List<InterfaceC588530N6l> LIZIZ;

    public C587100N0y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C587100N0y)) {
            return false;
        }
        C587100N0y c587100N0y = (C587100N0y) obj;
        return this.LIZ == c587100N0y.LIZ && Intrinsics.LJFF(this.LIZIZ, c587100N0y.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        List<InterfaceC588530N6l> list = this.LIZIZ;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnableState(canPlay=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allEnableStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C587100N0y(int i) {
        this(false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C587100N0y(boolean z, List<? extends InterfaceC588530N6l> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}
