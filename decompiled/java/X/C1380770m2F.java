package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380770m2F implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;

    public C1380770m2F() {
        this(null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380770m2F)) {
            return false;
        }
        C1380770m2F c1380770m2F = (C1380770m2F) obj;
        return Intrinsics.LJFF(this.LL, c1380770m2F.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1380770m2F.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1380770m2F.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1380770m2F.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1380770m2F.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1380770m2F.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1380770m2F.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SquareListMobConfigProperty(sourceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", followupSquareActionPosition=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFromFollowupSquareOriginalVideo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", followupSquareRecommendType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", followupSquareRecommendReason=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", metaSongId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", downloadID=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1380770m2F(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        if ((i & 1) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "" : str4;
        str5 = (i & 32) != 0 ? "" : str5;
        str6 = (i & 64) != 0 ? str7 : str6;
        this.LL = str7;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
    }
}
