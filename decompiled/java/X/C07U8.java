package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07U8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U8 {
    public final Function0<Unit> LIZ;

    public C07U8() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07U8) && Intrinsics.LJFF(this.LIZ, ((C07U8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoBackgroundUiAction(onSurfaceCreated=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07U8(Object obj) {
        this.LIZ = AFwS189S0000000_3.get$arr$(1543);
    }
}
