package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360200lV4 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C453740Hqm LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360200lV4)) {
            return false;
        }
        C1360200lV4 c1360200lV4 = (C1360200lV4) obj;
        return Intrinsics.LJFF(this.LL, c1360200lV4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1360200lV4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1360200lV4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1360200lV4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1360200lV4.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C453740Hqm c453740Hqm = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c453740Hqm == null ? 0 : c453740Hqm.hashCode())) * 31;
        String str4 = this.LLILZIL;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostStickerData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cacheSticker=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", draftCacheKey=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1360200lV4(String str, String str2, String str3, C453740Hqm c453740Hqm, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c453740Hqm;
        this.LLILZIL = str4;
    }
}
