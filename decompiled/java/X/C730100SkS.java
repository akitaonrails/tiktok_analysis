package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730100SkS implements InterfaceC360001aY {
    public final String LL;
    public final long LLILLJJLI;
    public final long LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C730100SkS)) {
            return false;
        }
        C730100SkS c730100SkS = (C730100SkS) obj;
        return Intrinsics.LJFF(this.LL, c730100SkS.LL) && this.LLILLJJLI == c730100SkS.LLILLJJLI && this.LLILLL == c730100SkS.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryAnalyticsItem(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", accountReached=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", followersReached=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C730100SkS(String str, long j, long j2) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }
}
