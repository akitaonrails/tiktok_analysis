package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0310, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0310 extends AbstractC723102s1 {
    public final AnonymousClass0376 LL;
    public final String LLILLJJLI = "shipping_address";
    public final String LLILLL = "shipping_address_normal_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0310) && Intrinsics.LJFF(this.LL, ((AnonymousClass0310) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USAddressVO(addressVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        return this.LLILLL;
    }

    public AnonymousClass0310(AnonymousClass0376 anonymousClass0376) {
        this.LL = anonymousClass0376;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AnonymousClass0310) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }
}
