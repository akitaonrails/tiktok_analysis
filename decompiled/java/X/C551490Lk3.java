package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551490Lk3 {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551490Lk3)) {
            return false;
        }
        C551490Lk3 c551490Lk3 = (C551490Lk3) obj;
        return Intrinsics.LJFF(this.LIZ, c551490Lk3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551490Lk3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewActions(temp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickXonPreview=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551490Lk3(AFwS194S0000000_8 aFwS194S0000000_8, AwS552S0100000_8 awS552S0100000_8) {
        this.LIZ = aFwS194S0000000_8;
        this.LIZIZ = awS552S0100000_8;
    }
}
