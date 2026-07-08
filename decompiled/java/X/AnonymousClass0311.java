package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0311, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0311 extends AbstractC723102s1 {
    public final AnonymousClass0376 LL;
    public final AnonymousClass0376 LLILLJJLI;
    public final String LLILLL = "shipping_address";
    public final String LLILZ = "shipping_address_pudo_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0311)) {
            return false;
        }
        AnonymousClass0311 anonymousClass0311 = (AnonymousClass0311) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0311.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0311.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USPudoAddressVO(addressVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pudoAddressVO=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLILLL;
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        return this.LLILZ;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AnonymousClass0311) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public AnonymousClass0311(AnonymousClass0376 anonymousClass0376, AnonymousClass0376 anonymousClass03762) {
        this.LL = anonymousClass0376;
        this.LLILLJJLI = anonymousClass03762;
    }
}
