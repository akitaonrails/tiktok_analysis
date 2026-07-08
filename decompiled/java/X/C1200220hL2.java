package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200220hL2 implements InterfaceC1891350zJl {
    public final boolean LL;
    public final C1200260hL6 LLILLJJLI;

    public C1200220hL2() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200220hL2)) {
            return false;
        }
        C1200220hL2 c1200220hL2 = (C1200220hL2) obj;
        return this.LL == c1200220hL2.LL && Intrinsics.LJFF(this.LLILLJJLI, c1200220hL2.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C1200260hL6 c1200260hL6 = this.LLILLJJLI;
        return iZ2 + (c1200260hL6 == null ? 0 : c1200260hL6.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPublishRcmdListHeaderCellData(holder=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extensionMiscData=");
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

    public C1200220hL2(C1200260hL6 c1200260hL6, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        c1200260hL6 = (i & 2) != 0 ? null : c1200260hL6;
        this.LL = z;
        this.LLILLJJLI = c1200260hL6;
    }
}
