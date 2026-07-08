package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614740O9g implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public C614740O9g() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614740O9g)) {
            return false;
        }
        C614740O9g c614740O9g = (C614740O9g) obj;
        return Intrinsics.LJFF(this.LL, c614740O9g.LL) && this.LLILLJJLI == c614740O9g.LLILLJJLI;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitlePanelBottomBarFavoriteState(favoriteCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C614740O9g(int i) {
        this(null, false);
    }

    public C614740O9g(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
