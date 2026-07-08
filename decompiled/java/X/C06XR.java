package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06XR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06XR implements InterfaceC1891350zJl {
    public final C1622006Ws<C869590Y9l> LL;
    public final C869590Y9l LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C06XR) && Intrinsics.LJFF(this.LL, ((C06XR) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        this.LL.getClass();
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeCardCenterData(messageProperty=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06XR(C1622006Ws<C869590Y9l> c1622006Ws) {
        this.LL = c1622006Ws;
        this.LLILLJJLI = c1622006Ws.LIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C06XR) && Intrinsics.LJFF(this.LLILLJJLI.getContentPB(), ((C06XR) interfaceC1891350zJl).LLILLJJLI.getContentPB())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C06XR) {
            return Intrinsics.LJFF(this.LLILLJJLI.getUuid(), ((C06XR) interfaceC1891350zJl).LLILLJJLI.getUuid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
