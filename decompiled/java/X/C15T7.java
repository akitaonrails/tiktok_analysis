package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15T7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15T7 implements InterfaceC111300bX {
    public final C15V2 LL;
    public final C20521215Rq LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15T7)) {
            return false;
        }
        C15T7 c15t7 = (C15T7) obj;
        return Intrinsics.LJFF(this.LL, c15t7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15t7.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFeedFragmentContextData(pageContext=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mobContext=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15T7(C15V2 c15v2, C20521215Rq c20521215Rq) {
        this.LL = c15v2;
        this.LLILLJJLI = c20521215Rq;
    }
}
