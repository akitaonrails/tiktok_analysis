package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050H implements C050G {
    public final boolean LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C050H)) {
            return false;
        }
        C050H c050h = (C050H) obj;
        return this.LL == c050h.LL && Intrinsics.LJFF(this.LLILLJJLI, c050h.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorRecordHeaderUiItem(showMoreLink=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", headerTitle=");
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
        if (interfaceC1891350zJl instanceof C050H) {
            C050H c050h = (C050H) interfaceC1891350zJl;
            if (c050h.LL == this.LL && Intrinsics.LJFF(c050h.LLILLJJLI, this.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C050H(boolean z, String str) {
        this.LL = z;
        this.LLILLJJLI = str;
    }
}
