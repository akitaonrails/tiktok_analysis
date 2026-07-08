package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457680Hx8 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C457680Hx8)) {
            return false;
        }
        C457680Hx8 c457680Hx8 = (C457680Hx8) obj;
        return Intrinsics.LJFF(this.LL, c457680Hx8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c457680Hx8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c457680Hx8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c457680Hx8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c457680Hx8.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILZ;
        return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedDMCameraHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", receiverNickname=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", viewModelKey=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C457680Hx8(String str, String str2, String str3, Integer num, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = num;
        this.LLILZIL = str4;
    }
}
