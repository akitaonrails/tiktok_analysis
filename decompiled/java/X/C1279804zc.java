package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279804zc implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final InterfaceC1673306gt LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279804zc)) {
            return false;
        }
        C1279804zc c1279804zc = (C1279804zc) obj;
        return this.LL == c1279804zc.LL && Intrinsics.LJFF(this.LLILLJJLI, c1279804zc.LLILLJJLI) && this.LLILLL == c1279804zc.LLILLL && Intrinsics.LJFF(this.LLILZ, c1279804zc.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        String str = this.LLILLJJLI;
        return ((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DateViewHolderData(createdAt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", formattedTimestamp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLastUnread=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bottomPadding=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1279804zc;
    }

    public C1279804zc(long j, String str, boolean z, EnumC912210ZqV enumC912210ZqV) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = enumC912210ZqV;
    }
}
