package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03HE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HE implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;

    public C03HE() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03HE)) {
            return false;
        }
        C03HE c03he = (C03HE) obj;
        return Intrinsics.LJFF(this.LL, c03he.LL) && Intrinsics.LJFF(this.LLILLJJLI, c03he.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCInfoItem(icon=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
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

    public C03HE(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
