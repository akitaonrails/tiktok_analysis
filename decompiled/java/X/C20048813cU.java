package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13cU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20048813cU implements InterfaceC20029513Yn {
    public final InterfaceC1690350u5Z LL;
    public final AbstractC20048613cS LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20048813cU)) {
            return false;
        }
        C20048813cU c20048813cU = (C20048813cU) obj;
        return Intrinsics.LJFF(this.LL, c20048813cU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20048813cU.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceableResult(result=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", placeable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20029513Yn
    public final boolean LJJLIIIJILLIZJL() {
        return this.LLILLJJLI.LJJZZIII().LIZLLL();
    }

    public C20048813cU(InterfaceC1690350u5Z interfaceC1690350u5Z, AbstractC20048613cS abstractC20048613cS) {
        this.LL = interfaceC1690350u5Z;
        this.LLILLJJLI = abstractC20048613cS;
    }
}
