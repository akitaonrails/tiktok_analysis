package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875907Wj implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875907Wj)) {
            return false;
        }
        C1875907Wj c1875907Wj = (C1875907Wj) obj;
        return Intrinsics.LJFF(this.LL, c1875907Wj.LL) && this.LLILLJJLI == c1875907Wj.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoChatDemoItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelf=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1875907Wj) && Intrinsics.LJFF(this.LL, ((C1875907Wj) interfaceC1891350zJl).LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1875907Wj) && this.LLILLJJLI == ((C1875907Wj) interfaceC1891350zJl).LLILLJJLI) {
            return true;
        }
        return false;
    }

    public C1875907Wj(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
