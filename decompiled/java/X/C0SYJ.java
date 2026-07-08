package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SYJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYJ implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Function0<Long> LLIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0SYJ() {
        String str = null;
        this(str, str, str, str, str, str, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SYJ)) {
            return false;
        }
        C0SYJ c0syj = (C0SYJ) obj;
        return Intrinsics.LJFF(this.LL, c0syj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0syj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0syj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0syj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0syj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0syj.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0syj.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Function0<Long> function0 = this.LLIZ;
        return iHashCode6 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoDiggHierarchyData(previousPage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fromGroupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", previousPagePosition=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", challengeId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", parentTagId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", infoProvider=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SYJ(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (Function0<Long>) null);
    }

    public C0SYJ(String str, String str2, String str3, String str4, String str5, String str6, Function0<Long> function0) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = function0;
    }
}
