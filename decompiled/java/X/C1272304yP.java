package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1272304yP implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;

    public C1272304yP() {
        this(false, 3);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1272304yP)) {
            return false;
        }
        C1272304yP c1272304yP = (C1272304yP) obj;
        return Intrinsics.LJFF(this.LL, c1272304yP.LL) && this.LLILLJJLI == c1272304yP.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalServiceTakePhotoItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isEnable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1272304yP(boolean z, int i) {
        String str;
        if ((i & 1) != 0) {
            str = "LocalServiceTakePhotoItem";
        } else {
            str = null;
        }
        z = (i & 2) != 0 ? false : z;
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
