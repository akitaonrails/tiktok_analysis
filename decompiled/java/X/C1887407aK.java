package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07aK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887407aK {
    public final List<C869590Y9l> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1887407aK)) {
            return false;
        }
        C1887407aK c1887407aK = (C1887407aK) obj;
        return Intrinsics.LJFF(this.LIZ, c1887407aK.LIZ) && this.LIZIZ == c1887407aK.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaGridFlowData(messages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadOlderCompleted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1887407aK(List<? extends C869590Y9l> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
