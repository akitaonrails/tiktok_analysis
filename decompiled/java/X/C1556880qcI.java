package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556880qcI extends AbstractC1556890qcJ {
    public final EnumC2215421BnI LIZ;
    public final List<AbstractC1556890qcJ> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556880qcI)) {
            return false;
        }
        C1556880qcI c1556880qcI = (C1556880qcI) obj;
        return this.LIZ == c1556880qcI.LIZ && Intrinsics.LJFF(this.LIZIZ, c1556880qcI.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositeFilterNode(operator=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", elements=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1556880qcI(EnumC2215421BnI enumC2215421BnI, List<? extends AbstractC1556890qcJ> list) {
        this.LIZ = enumC2215421BnI;
        this.LIZIZ = list;
    }
}
