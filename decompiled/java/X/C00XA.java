package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00XA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XA implements InterfaceC1891350zJl {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00XA) && Intrinsics.LJFF(this.LL, ((C00XA) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightSelectDateItem(date=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00XA(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C00XA) {
            return Intrinsics.LJFF(((C00XA) interfaceC1891350zJl).LL, this.LL);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C00XA) {
            return Intrinsics.LJFF(((C00XA) interfaceC1891350zJl).LL, this.LL);
        }
        return false;
    }
}
