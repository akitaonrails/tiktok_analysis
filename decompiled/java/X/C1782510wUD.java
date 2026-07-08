package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782510wUD implements C1DWC {
    public final int LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782510wUD)) {
            return false;
        }
        C1782510wUD c1782510wUD = (C1782510wUD) obj;
        return this.LIZ == c1782510wUD.LIZ && Intrinsics.LJFF(this.LIZIZ, c1782510wUD.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneButton(textRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1782510wUD(int i, Function0<Unit> function0) {
        this.LIZ = i;
        this.LIZIZ = function0;
    }
}
