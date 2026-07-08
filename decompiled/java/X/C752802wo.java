package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C752802wo extends AbstractC756202xM {
    public final C752702wn LLILZLL;
    public final String LLIZ = "addon_order";
    public final String LLIZLLLIL = "addon_order_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C752802wo) && Intrinsics.LJFF(this.LLILZLL, ((C752802wo) obj).LLILZLL);
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USAddonOrderVO(addonOrderVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public C752802wo(C752702wn c752702wn) {
        this.LLILZLL = c752702wn;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C752802wo) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }
}
