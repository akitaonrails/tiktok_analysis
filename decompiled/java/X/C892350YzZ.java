package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892350YzZ implements InterfaceC111300bX {
    public final String LL;
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
        if (!(obj instanceof C892350YzZ)) {
            return false;
        }
        C892350YzZ c892350YzZ = (C892350YzZ) obj;
        return Intrinsics.LJFF(this.LL, c892350YzZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c892350YzZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c892350YzZ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c892350YzZ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c892350YzZ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c892350YzZ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c892350YzZ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c892350YzZ.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionBarHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", chatTypeForET=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", trafficType=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", extrasInfoMobParams=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C892350YzZ(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        str6 = (i & 32) != 0 ? "" : str6;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }
}
