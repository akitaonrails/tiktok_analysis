package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q0J, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0J implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q0J)) {
            return false;
        }
        C0Q0J c0q0j = (C0Q0J) obj;
        return this.LL == c0q0j.LL && Intrinsics.LJFF(this.LLILLJJLI, c0q0j.LLILLJJLI) && this.LLILLL == c0q0j.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sug=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAskMore=");
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

    public C0Q0J(int i, String str, boolean z) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }
}
