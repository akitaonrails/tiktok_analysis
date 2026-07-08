package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896990ZGv implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;

    public C896990ZGv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C896990ZGv)) {
            return false;
        }
        C896990ZGv c896990ZGv = (C896990ZGv) obj;
        return Intrinsics.LJFF(this.LL, c896990ZGv.LL) && this.LLILLJJLI == c896990ZGv.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteAssemState(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C896990ZGv(int i) {
        this("", false);
    }

    public C896990ZGv(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
