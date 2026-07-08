package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HFR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFR implements InterfaceC111300bX {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HFR)) {
            return false;
        }
        C0HFR c0hfr = (C0HFR) obj;
        return this.LL == c0hfr.LL && Intrinsics.LJFF(this.LLILLJJLI, c0hfr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hfr.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarReviewData(isFirstEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HFR(boolean z, String str, String str2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
