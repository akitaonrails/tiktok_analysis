package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683110Qqr implements InterfaceC1891350zJl {
    public final InterfaceC2455009jg LL;
    public final InterfaceC423930Gjn LLILLJJLI;
    public final InterfaceC683020Qqi LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C683110Qqr)) {
            return false;
        }
        C683110Qqr c683110Qqr = (C683110Qqr) obj;
        return Intrinsics.LJFF(this.LL, c683110Qqr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c683110Qqr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c683110Qqr.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        InterfaceC683020Qqi interfaceC683020Qqi = this.LLILLL;
        return iHashCode + (interfaceC683020Qqi == null ? 0 : interfaceC683020Qqi.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntryCardMetaData(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", button=");
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

    public C683110Qqr(C683120Qqs c683120Qqs, InterfaceC423930Gjn interfaceC423930Gjn, InterfaceC683020Qqi interfaceC683020Qqi) {
        this.LL = c683120Qqs;
        this.LLILLJJLI = interfaceC423930Gjn;
        this.LLILLL = interfaceC683020Qqi;
    }
}
