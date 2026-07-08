package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822240WNi extends C0WO5 {
    public final C0WO8 LIZ;
    public final List<C0WO5> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C822240WNi)) {
            return false;
        }
        C822240WNi c822240WNi = (C822240WNi) obj;
        return this.LIZ == c822240WNi.LIZ && Intrinsics.LJFF(this.LIZIZ, c822240WNi.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositeCondition(logic=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conditions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C822240WNi(C0WO8 c0wo8, List<? extends C0WO5> list) {
        this.LIZ = c0wo8;
        this.LIZIZ = list;
    }
}
