package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0502, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0502 implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0502)) {
            return false;
        }
        AnonymousClass0502 anonymousClass0502 = (AnonymousClass0502) obj;
        return this.LL == anonymousClass0502.LL && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0502.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReachLimitItem(limitCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hintText=");
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

    public AnonymousClass0502(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
