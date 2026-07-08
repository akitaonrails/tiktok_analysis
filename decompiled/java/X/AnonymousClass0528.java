package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0528, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0528 implements InterfaceC1891350zJl {
    public final Integer LL;
    public final AnonymousClass0529 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0528)) {
            return false;
        }
        AnonymousClass0528 anonymousClass0528 = (AnonymousClass0528) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0528.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0528.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AnonymousClass0529 anonymousClass0529 = this.LLILLJJLI;
        return iHashCode + (anonymousClass0529 != null ? anonymousClass0529.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1SearchStreamPlaceholderItem(placeholderType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", animInfo=");
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

    public AnonymousClass0528(Integer num, AnonymousClass0529 anonymousClass0529) {
        this.LL = num;
        this.LLILLJJLI = anonymousClass0529;
    }
}
