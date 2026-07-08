package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681330Qnz implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C681330Qnz)) {
            return false;
        }
        C681330Qnz c681330Qnz = (C681330Qnz) obj;
        return Intrinsics.LJFF(this.LL, c681330Qnz.LL) && this.LLILLJJLI == c681330Qnz.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMusicSuggestedItem(word=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
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
        if (interfaceC1891350zJl instanceof C681330Qnz) {
            C681330Qnz c681330Qnz = (C681330Qnz) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c681330Qnz.LL, this.LL) && c681330Qnz.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C681330Qnz(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
