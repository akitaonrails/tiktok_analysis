package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1879607Xu {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879607Xu)) {
            return false;
        }
        C1879607Xu c1879607Xu = (C1879607Xu) obj;
        return Intrinsics.LJFF(this.LIZ, c1879607Xu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1879607Xu.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompiledSegment(rawKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", funcs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1879607Xu(String str, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
