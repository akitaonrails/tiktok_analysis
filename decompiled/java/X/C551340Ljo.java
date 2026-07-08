package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ljo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551340Ljo {
    public final String LIZ;
    public final int LIZIZ;
    public final Function0<Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551340Ljo)) {
            return false;
        }
        C551340Ljo c551340Ljo = (C551340Ljo) obj;
        return Intrinsics.LJFF(this.LIZ, c551340Ljo.LIZ) && this.LIZIZ == c551340Ljo.LIZIZ && Intrinsics.LJFF(this.LIZJ, c551340Ljo.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EllipsisMenuItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551340Ljo(String str, int i, Function0<Unit> function0) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = function0;
    }
}
