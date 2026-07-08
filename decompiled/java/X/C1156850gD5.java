package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156850gD5 implements InterfaceC111300bX {
    public final String LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156850gD5)) {
            return false;
        }
        C1156850gD5 c1156850gD5 = (C1156850gD5) obj;
        return Intrinsics.LJFF(this.LL, c1156850gD5.LL) && this.LLILLJJLI == c1156850gD5.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1156850gD5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1156850gD5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1156850gD5.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupJoinPanelContentData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", convShortId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contentAvatar=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", contentTitle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", contentDesc=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156850gD5(String str, long j, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
