package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935540aS8 implements InterfaceC0148002o {
    public boolean LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C935540aS8)) {
            return false;
        }
        C935540aS8 c935540aS8 = (C935540aS8) obj;
        return this.LL == c935540aS8.LL && this.LLILLJJLI == c935540aS8.LLILLJJLI && this.LLILLL == c935540aS8.LLILLL && Intrinsics.LJFF(this.LLILZ, c935540aS8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c935540aS8.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c935540aS8.LLILZLL) && this.LLIZ == c935540aS8.LLIZ;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        String str = this.LLILZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorSharedBg(anchorEntranceEnable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", anchorEntranceRedDotEnable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", imageFilePath=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isLayoutSupportSharedBg=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C935540aS8(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = z4;
    }

    public static C935540aS8 LIZ(C935540aS8 c935540aS8, boolean z, boolean z2, String str, String str2, String str3, boolean z3, int i) {
        boolean z4;
        boolean z5 = z3;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z6 = z2;
        boolean z7 = z;
        if ((i & 1) != 0) {
            z7 = c935540aS8.LL;
        }
        if ((i & 2) != 0) {
            z4 = c935540aS8.LLILLJJLI;
        } else {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z6 = c935540aS8.LLILLL;
        }
        if ((i & 8) != 0) {
            str6 = c935540aS8.LLILZ;
        }
        if ((i & 16) != 0) {
            str5 = c935540aS8.LLILZIL;
        }
        if ((i & 32) != 0) {
            str4 = c935540aS8.LLILZLL;
        }
        if ((i & 64) != 0) {
            z5 = c935540aS8.LLIZ;
        }
        c935540aS8.getClass();
        return new C935540aS8(str6, str5, str4, z7, z4, z6, z5);
    }
}
