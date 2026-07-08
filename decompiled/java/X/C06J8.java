package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06J8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06J8 implements InterfaceC111300bX {
    public final Long LL;
    public final String LLILLJJLI;
    public final Boolean LLILLL;
    public final Boolean LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06J8)) {
            return false;
        }
        C06J8 c06j8 = (C06J8) obj;
        return Intrinsics.LJFF(this.LL, c06j8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06j8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c06j8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c06j8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c06j8.LLILZIL);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPublishPanelData(bulletinBoardId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needMockSuccess=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isQuickFail=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", inspirationCardUniqueKey=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06J8(Long l, String str, Boolean bool, Boolean bool2, String str2) {
        this.LL = l;
        this.LLILLJJLI = str;
        this.LLILLL = bool;
        this.LLILZ = bool2;
        this.LLILZIL = str2;
    }
}
