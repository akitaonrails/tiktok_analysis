package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868400yik implements InterfaceC111300bX {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868400yik)) {
            return false;
        }
        C1868400yik c1868400yik = (C1868400yik) obj;
        return this.LL == c1868400yik.LL && this.LLILLJJLI == c1868400yik.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1868400yik.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1868400yik.LLILZ) && this.LLILZIL == c1868400yik.LLILZIL;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Integer num = this.LLILLL;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationFragmentParams(isCreator=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isEmbeddedMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", collapsedListType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", groupFilter=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", landingTabId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868400yik(boolean z, boolean z2, Integer num, Integer num2, int i) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = i;
    }
}
