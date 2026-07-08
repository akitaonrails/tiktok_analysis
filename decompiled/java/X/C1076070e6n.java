package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076070e6n implements InterfaceC1076060e6m {
    public final boolean LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public C1076070e6n() {
        this(false, null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1076070e6n)) {
            return false;
        }
        C1076070e6n c1076070e6n = (C1076070e6n) obj;
        return this.LL == c1076070e6n.LL && Intrinsics.LJFF(this.LLILLJJLI, c1076070e6n.LLILLJJLI) && this.LLILLL == c1076070e6n.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        return ((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitSortItem(selected=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textForSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isDefaultSortByDate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1076070e6n) || !areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C1076070e6n c1076070e6n = (C1076070e6n) interfaceC1891350zJl;
        if (this.LLILLL != c1076070e6n.LLILLL || this.LL != c1076070e6n.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1076070e6n) && interfaceC1891350zJl != null) {
            return true;
        }
        return false;
    }

    public C1076070e6n(boolean z, String str, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
    }
}
