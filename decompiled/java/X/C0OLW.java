package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OLW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLW implements InterfaceC111300bX {
    public final boolean LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OLW)) {
            return false;
        }
        C0OLW c0olw = (C0OLW) obj;
        return this.LL == c0olw.LL && this.LLILLJJLI == c0olw.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0olw.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0olw.LLILZ) && this.LLILZIL == c0olw.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0olw.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0olw.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0olw.LLIZLLLIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31;
        String str3 = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinProfileEditParam(isCreateScene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bbId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fromScene=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showGuide=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enterFromConversationId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", enterFromMessageId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OLW(boolean z, long j, String str, String str2, boolean z2, String str3, String str4, String str5) {
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
    }
}
