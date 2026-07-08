package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2001007se implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2001007se)) {
            return false;
        }
        C2001007se c2001007se = (C2001007se) obj;
        return Intrinsics.LJFF(this.LL, c2001007se.LL) && this.LLILLJJLI == c2001007se.LLILLJJLI && this.LLILLL == c2001007se.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostLikeState(uniqueId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLiked=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2001007se(String str, boolean z, int i) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }
}
