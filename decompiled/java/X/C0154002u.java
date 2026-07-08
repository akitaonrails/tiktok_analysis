package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0154002u implements InterfaceC0148002o {
    public final Unit LL;

    public C0154002u() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0154002u) && Intrinsics.LJFF(this.LL, ((C0154002u) obj).LL);
    }

    public final int hashCode() {
        Unit unit = this.LL;
        if (unit == null) {
            return 0;
        }
        return unit.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostCacheState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0154002u(int i) {
        this.LL = null;
    }
}
