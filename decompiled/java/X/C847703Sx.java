package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C847703Sx implements InterfaceC1891350zJl {
    public final C873003b6 LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C847703Sx)) {
            return false;
        }
        C847703Sx c847703Sx = (C847703Sx) obj;
        return Intrinsics.LJFF(this.LL, c847703Sx.LL) && this.LLILLJJLI == c847703Sx.LLILLJJLI && this.LLILLL == c847703Sx.LLILLL && this.LLILZ == c847703Sx.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BankElementItem(bankInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelectMode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C847703Sx c847703Sx;
        C873003b6 c873003b6 = this.LL;
        C873003b6 c873003b62 = null;
        if ((interfaceC1891350zJl instanceof C847703Sx) && (c847703Sx = (C847703Sx) interfaceC1891350zJl) != null) {
            c873003b62 = c847703Sx.LL;
        }
        if (Intrinsics.LJFF(c873003b6, c873003b62) && this.LLILLJJLI == ((C847703Sx) interfaceC1891350zJl).LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C847703Sx c847703Sx;
        C873003b6 c873003b6 = this.LL;
        C873003b6 c873003b62 = null;
        if ((interfaceC1891350zJl instanceof C847703Sx) && (c847703Sx = (C847703Sx) interfaceC1891350zJl) != null) {
            c873003b62 = c847703Sx.LL;
        }
        if (Intrinsics.LJFF(c873003b6, c873003b62) && this.LLILLJJLI == ((C847703Sx) interfaceC1891350zJl).LLILLJJLI) {
            return true;
        }
        return false;
    }

    public C847703Sx(C873003b6 c873003b6, int i, boolean z, boolean z2) {
        this.LL = c873003b6;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
