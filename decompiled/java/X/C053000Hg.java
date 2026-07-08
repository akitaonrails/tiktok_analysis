package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C053000Hg implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C053000Hg)) {
            return false;
        }
        C053000Hg c053000Hg = (C053000Hg) obj;
        return this.LL == c053000Hg.LL && Intrinsics.LJFF(this.LLILLJJLI, c053000Hg.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkbenchMiddleBannerMoreItem(count=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C053000Hg(long j, String str) {
        this.LL = j;
        this.LLILLJJLI = str;
    }
}
