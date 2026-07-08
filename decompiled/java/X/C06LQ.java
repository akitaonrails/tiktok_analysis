package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06LQ implements InterfaceC1891350zJl {
    public final String LL;
    public final Function0<Unit> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06LQ)) {
            return false;
        }
        C06LQ c06lq = (C06LQ) obj;
        return Intrinsics.LJFF(this.LL, c06lq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06lq.LLILLJJLI);
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
        sbLIZ.append("CapsuleItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onClick=");
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

    public C06LQ(String str, AwS165S1100000_16 awS165S1100000_16) {
        this.LL = str;
        this.LLILLJJLI = awS165S1100000_16;
    }
}
