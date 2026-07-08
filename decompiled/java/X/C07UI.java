package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07UI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UI {
    public final Function0<Unit> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07UI) && Intrinsics.LJFF(this.LIZ, ((C07UI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibilityPostButtonAction(onPostClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UI(AwS576S0100000_32 awS576S0100000_32) {
        this.LIZ = awS576S0100000_32;
    }
}
