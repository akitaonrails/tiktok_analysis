package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151410g4J implements InterfaceC1816020xMG {
    public final String LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    @Override // X.InterfaceC1816020xMG
    public final InterfaceC1816020xMG LJIIL() {
        return LIZ(this, false);
    }

    @Override // X.InterfaceC1816020xMG
    public final InterfaceC1816020xMG LJIJI() {
        return LIZ(this, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1151410g4J)) {
            return false;
        }
        C1151410g4J c1151410g4J = (C1151410g4J) obj;
        return Intrinsics.LJFF(this.LL, c1151410g4J.LL) && this.LLILLJJLI == c1151410g4J.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1151410g4J.LLILLL) && this.LLILZ == c1151410g4J.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExchangeItem(iapId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", diamondCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1816020xMG
    public final boolean isSelected() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1151410g4J) {
            C1151410g4J c1151410g4J = (C1151410g4J) interfaceC1891350zJl;
            if (c1151410g4J.LLILLJJLI == this.LLILLJJLI && Intrinsics.LJFF(c1151410g4J.LLILLL, this.LLILLL) && c1151410g4J.LLILZ == this.LLILZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1151410g4J) && Intrinsics.LJFF(((C1151410g4J) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if ((interfaceC1891350zJl instanceof C1151410g4J) && (z = ((C1151410g4J) interfaceC1891350zJl).LLILZ) != this.LLILZ) {
            return new C1151420g4K(z);
        }
        return null;
    }

    public static C1151410g4J LIZ(C1151410g4J c1151410g4J, boolean z) {
        String str = c1151410g4J.LL;
        long j = c1151410g4J.LLILLJJLI;
        String str2 = c1151410g4J.LLILLL;
        c1151410g4J.getClass();
        return new C1151410g4J(str, j, str2, z);
    }

    public C1151410g4J(String str, long j, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
        this.LLILZ = z;
    }
}
