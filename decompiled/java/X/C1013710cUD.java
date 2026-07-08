package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013710cUD extends AbstractC2255531DPz {
    public final List<AbstractC1000340c8e> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1013710cUD) && Intrinsics.LJFF(this.LIZIZ, ((C1013710cUD) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewOverlap(overlapComponentIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1013710cUD(List<? extends AbstractC1000340c8e> list) {
        super("view_overlap");
        this.LIZIZ = list;
    }
}
