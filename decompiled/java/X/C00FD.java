package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00FD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FD implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public C00FD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FD)) {
            return false;
        }
        C00FD c00fd = (C00FD) obj;
        return Intrinsics.LJFF(this.LL, c00fd.LL) && this.LLILLJJLI == c00fd.LLILLJJLI;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeCommentState(commentCountText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCommentCountVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C00FD(int i) {
        this("", true);
    }

    public C00FD(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
