package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03HB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HB implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03HB)) {
            return false;
        }
        C03HB c03hb = (C03HB) obj;
        return Intrinsics.LJFF(this.LL, c03hb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c03hb.LLILLJJLI);
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
        sbLIZ.append("ECSearchDebugInfoItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", value=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C03HB(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
