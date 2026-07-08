package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I03, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I03 implements InterfaceC111300bX {
    public final C0I04 LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Function0<Boolean> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I03)) {
            return false;
        }
        C0I03 c0i03 = (C0I03) obj;
        return Intrinsics.LJFF(this.LL, c0i03.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0i03.LLILLJJLI) && this.LLILLL == c0i03.LLILLL && this.LLILZ == c0i03.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0i03.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentStickerData(inputService=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLandscapeMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isNonCommentRefactor=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isInputEmpty=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I03(C0I04 c0i04, String str, boolean z, boolean z2, Function0<Boolean> function0) {
        this.LL = c0i04;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = function0;
    }
}
