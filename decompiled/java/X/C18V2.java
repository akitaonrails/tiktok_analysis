package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18V2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18V2 extends C0H94 {
    public final String LL;
    public final int LLILLJJLI;
    public final C909930Zmp LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18V2)) {
            return false;
        }
        C18V2 c18v2 = (C18V2) obj;
        return Intrinsics.LJFF(this.LL, c18v2.LL) && this.LLILLJJLI == c18v2.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c18v2.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        C909930Zmp c909930Zmp = this.LLILLL;
        return iHashCode + (c909930Zmp == null ? 0 : c909930Zmp.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageStatusSlotItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", msgStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C18V2) || !areItemTheSame(interfaceC1891350zJl) || this.LLILLJJLI != ((C18V2) interfaceC1891350zJl).LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C18V2) {
            return Intrinsics.LJFF(this.LL, ((C18V2) interfaceC1891350zJl).LL);
        }
        return false;
    }

    public C18V2(String str, int i, C909930Zmp c909930Zmp) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = c909930Zmp;
    }
}
