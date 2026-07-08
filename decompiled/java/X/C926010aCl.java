package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926010aCl extends AbstractC926030aCn {
    public final List<AbstractC926030aCn> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C926010aCl) && Intrinsics.LJFF(this.LIZLLL, ((C926010aCl) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Composite(commands=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C926010aCl(List<? extends AbstractC926030aCn> list) {
        this.LIZLLL = list;
    }
}
