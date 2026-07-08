package X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2086008Fe {
    public final File LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2086008Fe)) {
            return false;
        }
        C2086008Fe c2086008Fe = (C2086008Fe) obj;
        return Intrinsics.LJFF(this.LIZ, c2086008Fe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2086008Fe.LIZIZ);
    }

    public final int hashCode() {
        File file = this.LIZ;
        return ((file == null ? 0 : file.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SplitLibDexRecoveryResult(file=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", steps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2086008Fe(C0VSJ c0vsj, List list) {
        this.LIZ = c0vsj;
        this.LIZIZ = list;
    }
}
