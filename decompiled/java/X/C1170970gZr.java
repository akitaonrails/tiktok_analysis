package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170970gZr implements InterfaceC111300bX {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    public C1170970gZr() {
        this(false, false, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170970gZr)) {
            return false;
        }
        C1170970gZr c1170970gZr = (C1170970gZr) obj;
        return this.LL == c1170970gZr.LL && this.LLILLJJLI == c1170970gZr.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1170970gZr.LLILLL) && this.LLILZ == c1170970gZr.LLILZ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        return ((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(hasMoreCollection=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isOwnerOfCollection=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFromContentFragment=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1170970gZr(boolean z, boolean z2, String str, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        str = (i & 4) != 0 ? null : str;
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = str;
        this.LLILZ = false;
    }
}
