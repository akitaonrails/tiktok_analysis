package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321340Cii extends C321330Cih implements InterfaceC1891350zJl {
    public final C321490Cix LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C321340Cii) && Intrinsics.LJFF(this.LLILZLL, ((C321340Cii) obj).LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentAnswerLoadingItem(message=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C321340Cii(C321490Cix c321490Cix) {
        super(c321490Cix);
        this.LLILZLL = c321490Cix;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof InterfaceC321350Cij) {
            if (areItemTheSame(interfaceC1891350zJl) && this.LLILZ == ((InterfaceC321350Cij) interfaceC1891350zJl).LIZ()) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C321330Cih) {
            if (!Intrinsics.LJFF(this.LLILLJJLI, ((C321330Cih) interfaceC1891350zJl).LLILLJJLI) && this.LL.LIZJ.msgType != -6000) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
