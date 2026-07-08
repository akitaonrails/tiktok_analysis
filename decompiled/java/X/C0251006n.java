package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251006n implements InterfaceC1891350zJl {
    public final int LL;
    public final Integer LLILLJJLI = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0251006n)) {
            return false;
        }
        C0251006n c0251006n = (C0251006n) obj;
        return this.LL == c0251006n.LL && Intrinsics.LJFF(this.LLILLJJLI, c0251006n.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        Integer num = this.LLILLJJLI;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiTagDividerItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0251006n(int i) {
        this.LL = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
