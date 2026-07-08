package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153410g7X {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public C1153410g7X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153410g7X)) {
            return false;
        }
        C1153410g7X c1153410g7X = (C1153410g7X) obj;
        return Intrinsics.LJFF(this.LIZ, c1153410g7X.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153410g7X.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CertSignalRule(include=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exclude=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1153410g7X(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv);
    }

    public C1153410g7X(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
