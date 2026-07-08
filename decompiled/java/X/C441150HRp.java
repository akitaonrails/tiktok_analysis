package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441150HRp implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public final C05YD<C0HOM<? extends C440440HOw>> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C441150HRp)) {
            return false;
        }
        C441150HRp c441150HRp = (C441150HRp) obj;
        return this.LL == c441150HRp.LL && Intrinsics.LJFF(this.LLILLJJLI, c441150HRp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c441150HRp.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdPowerItem(idType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", idStateFlow=");
        sbLIZ.append(this.LLILLL);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C441150HRp(int i, String str, C05YD<? extends C0HOM<? extends C440440HOw>> c05yd) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = c05yd;
    }
}
