package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Huq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456260Huq implements InterfaceC111300bX {
    public final String LL;
    public final C456970Hvz LLILLJJLI;
    public final InterfaceC457250HwR LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C456260Huq)) {
            return false;
        }
        C456260Huq c456260Huq = (C456260Huq) obj;
        return Intrinsics.LJFF(this.LL, c456260Huq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c456260Huq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c456260Huq.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C456970Hvz c456970Hvz = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c456970Hvz == null ? 0 : c456970Hvz.hashCode())) * 31;
        InterfaceC457250HwR interfaceC457250HwR = this.LLILLL;
        return iHashCode2 + (interfaceC457250HwR != null ? interfaceC457250HwR.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMQuickMessageHierarchyData(stickerVMKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", quickMessageInputProps=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", inputViewFragmentDelegate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C456260Huq(String str, C456970Hvz c456970Hvz, InterfaceC457250HwR interfaceC457250HwR) {
        this.LL = str;
        this.LLILLJJLI = c456970Hvz;
        this.LLILLL = interfaceC457250HwR;
    }
}
