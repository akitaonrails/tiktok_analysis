package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C385701eh {
    public final int LIZ;
    public final List<C385801ei> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385701eh)) {
            return false;
        }
        C385701eh c385701eh = (C385701eh) obj;
        return this.LIZ == c385701eh.LIZ && Intrinsics.LJFF(this.LIZIZ, c385701eh.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupUiModel(group=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C385701eh(int i, List<C385801ei> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
