package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912570Zr5 implements InterfaceC1891350zJl {
    public final String LL;
    public final C869590Y9l LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C912570Zr5)) {
            return false;
        }
        C912570Zr5 c912570Zr5 = (C912570Zr5) obj;
        return Intrinsics.LJFF(this.LL, c912570Zr5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c912570Zr5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c912570Zr5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c912570Zr5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c912570Zr5.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeMessageItem(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sharedFeedType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C912570Zr5) {
            C912570Zr5 c912570Zr5 = (C912570Zr5) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c912570Zr5.LL, this.LL) && c912570Zr5.LLILLJJLI.getMsgId() == this.LLILLJJLI.getMsgId()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C912570Zr5(String str, C869590Y9l c869590Y9l, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
