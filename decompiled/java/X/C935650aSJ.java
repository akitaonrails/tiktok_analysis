package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935650aSJ implements InterfaceC0148002o {
    public boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C935650aSJ)) {
            return false;
        }
        C935650aSJ c935650aSJ = (C935650aSJ) obj;
        return this.LL == c935650aSJ.LL && Intrinsics.LJFF(this.LLILLJJLI, c935650aSJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c935650aSJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c935650aSJ.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuestSharedBg(enable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", imageFilePath=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C935650aSJ(boolean z, String str, String str2, String str3) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
