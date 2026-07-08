package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07so, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2002007so implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2002007so)) {
            return false;
        }
        C2002007so c2002007so = (C2002007so) obj;
        return Intrinsics.LJFF(this.LL, c2002007so.LL) && this.LLILLJJLI == c2002007so.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposedCommentAvoidState(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needAvoid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2002007so(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
