package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ugQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713200ugQ implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1713200ugQ)) {
            return false;
        }
        C1713200ugQ c1713200ugQ = (C1713200ugQ) obj;
        return Intrinsics.LJFF(this.LL, c1713200ugQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1713200ugQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1713200ugQ.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParentInboxBannerItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", actionString=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", actionUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1713200ugQ() {
        this("", "", "");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1713200ugQ(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
