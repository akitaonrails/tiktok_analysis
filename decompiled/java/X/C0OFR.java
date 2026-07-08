package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OFR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OFR implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public C0OFR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OFR)) {
            return false;
        }
        C0OFR c0ofr = (C0OFR) obj;
        return Intrinsics.LJFF(this.LL, c0ofr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0ofr.LLILLJJLI) && this.LLILLL == c0ofr.LLILLL && this.LLILZ == c0ofr.LLILZ;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeFavoriteState(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", favoriteCountText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFavoriteCountVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OFR(int i) {
        this("", "", true, false);
    }

    public C0OFR(String str, String str2, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    public static C0OFR LIZ(C0OFR c0ofr, String str, String str2, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            str = c0ofr.LL;
        }
        if ((i & 2) != 0) {
            str2 = c0ofr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c0ofr.LLILLL;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z = c0ofr.LLILZ;
        }
        c0ofr.getClass();
        return new C0OFR(str, str2, z2, z);
    }
}
