package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06p1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1723706p1 implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1723706p1)) {
            return false;
        }
        C1723706p1 c1723706p1 = (C1723706p1) obj;
        return Intrinsics.LJFF(this.LL, c1723706p1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1723706p1.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescriptionItemV2(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1723706p1) {
            C1723706p1 c1723706p1 = (C1723706p1) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1723706p1.LL, this.LL) && Intrinsics.LJFF(c1723706p1.LLILLJJLI, this.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1723706p1) {
            C1723706p1 c1723706p1 = (C1723706p1) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1723706p1.LL, this.LL) && Intrinsics.LJFF(c1723706p1.LLILLJJLI, this.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1723706p1(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
