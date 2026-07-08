package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176490gil implements InterfaceC0148002o {
    public final C1176430gif LL;
    public final C291001Au<Unit> LLILLJJLI;

    public C1176490gil() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176490gil)) {
            return false;
        }
        C1176490gil c1176490gil = (C1176490gil) obj;
        return Intrinsics.LJFF(this.LL, c1176490gil.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1176490gil.LLILLJJLI);
    }

    public final int hashCode() {
        C1176430gif c1176430gif = this.LL;
        int iHashCode = (c1176430gif == null ? 0 : c1176430gif.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailMapState(targetPoiData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", clearMapEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1176490gil(C1176430gif c1176430gif, C291001Au<Unit> c291001Au) {
        this.LL = c1176430gif;
        this.LLILLJJLI = c291001Au;
    }
}
