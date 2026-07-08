package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C111700bb implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111700bb)) {
            return false;
        }
        C111700bb c111700bb = (C111700bb) obj;
        return Intrinsics.LJFF(this.LL, c111700bb.LL) && this.LLILLJJLI == c111700bb.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseFavoritePageData(mobKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lazyLoad=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C111700bb(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
