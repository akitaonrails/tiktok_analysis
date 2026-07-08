package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Czi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331880Czi {
    public final List<AbstractC331870Czh> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C331880Czi)) {
            return false;
        }
        C331880Czi c331880Czi = (C331880Czi) obj;
        return Intrinsics.LJFF(this.LIZ, c331880Czi.LIZ) && this.LIZIZ == c331880Czi.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolveResult(slots=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resolvedCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C331880Czi(List<? extends AbstractC331870Czh> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
