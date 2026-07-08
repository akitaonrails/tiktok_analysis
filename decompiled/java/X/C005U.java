package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005U implements InterfaceC1891350zJl {
    public final Integer LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C005U)) {
            return false;
        }
        C005U c005u = (C005U) obj;
        return Intrinsics.LJFF(this.LL, c005u.LL) && Intrinsics.LJFF(this.LLILLJJLI, c005u.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategoryNameItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", name=");
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

    public C005U(Integer num, String str) {
        this.LL = num;
        this.LLILLJJLI = str;
    }
}
