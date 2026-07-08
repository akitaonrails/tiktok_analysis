package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636770OyJ implements InterfaceC111300bX {
    public final EnumC912680ZrG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C636770OyJ)) {
            return false;
        }
        C636770OyJ c636770OyJ = (C636770OyJ) obj;
        return this.LL == c636770OyJ.LL && Intrinsics.LJFF(this.LLILLJJLI, c636770OyJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c636770OyJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c636770OyJ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c636770OyJ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c636770OyJ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c636770OyJ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c636770OyJ.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        String str = this.LLILZLL;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedTopBarHierarchyData(feedScene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toUserSecUid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", feedId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", refreshTimeForSharedFeedAweme=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C636770OyJ(EnumC912680ZrG enumC912680ZrG, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LL = enumC912680ZrG;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
    }
}
