package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QVI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QVI implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QVI)) {
            return false;
        }
        C0QVI c0qvi = (C0QVI) obj;
        return Intrinsics.LJFF(this.LL, c0qvi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0qvi.LLILLJJLI) && this.LLILLL == c0qvi.LLILLL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECSearchBarState(hint=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", defaultKeyword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFeedBackShow=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QVI(String str, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }
}
