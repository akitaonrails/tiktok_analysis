package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157100gDU implements InterfaceC1891350zJl, InterfaceC515600KJy {
    public final boolean LL;
    public final boolean LLILLJJLI;

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        return false;
    }

    @Override // X.InterfaceC515600KJy
    public final String LJJJ() {
        return "item_header";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157100gDU)) {
            return false;
        }
        C1157100gDU c1157100gDU = (C1157100gDU) obj;
        return this.LL == c1157100gDU.LL && this.LLILLJJLI == c1157100gDU.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainPageHeaderItem(isLargeHeader=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isDarkMode=");
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

    public C1157100gDU(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
