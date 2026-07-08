package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995810c1L implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<String> LLILLJJLI;

    public C995810c1L() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995810c1L)) {
            return false;
        }
        C995810c1L c995810c1L = (C995810c1L) obj;
        return Intrinsics.LJFF(this.LL, c995810c1L.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995810c1L.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C291001Au<String> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailNavTabState(localServiceKeyCategory=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", clickTabEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995810c1L(C291001Au c291001Au, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
    }
}
