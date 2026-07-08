package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652290PiF implements InterfaceC655790Pnt {
    public final EnumC655550PnV LIZ;
    public final String LIZIZ;

    public C652290PiF() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C652290PiF)) {
            return false;
        }
        C652290PiF c652290PiF = (C652290PiF) obj;
        return this.LIZ == c652290PiF.LIZ && Intrinsics.LJFF(this.LIZIZ, c652290PiF.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Live(style=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customViewerCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C652290PiF(EnumC655550PnV enumC655550PnV, int i) {
        this.LIZ = (i & 1) != 0 ? EnumC655550PnV.ICON_COUNT : enumC655550PnV;
        this.LIZIZ = null;
    }
}
