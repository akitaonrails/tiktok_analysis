package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001V {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C001V)) {
            return false;
        }
        C001V c001v = (C001V) obj;
        return Intrinsics.LJFF(this.LIZ, c001v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c001v.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSchemaValidationReport(missingCompulsory=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", missingImportant=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C001V() {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv);
    }

    public C001V(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
