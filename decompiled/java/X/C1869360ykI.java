package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869360ykI implements InterfaceC1869460ykS {
    public final transient InterfaceC1869390ykL LL;
    public final transient InterfaceC1869450ykR LLILLJJLI;

    public final C1869360ykI copy(InterfaceC1869390ykL interfaceC1869390ykL, InterfaceC1869450ykR interfaceC1869450ykR) {
        return new C1869360ykI(interfaceC1869390ykL, interfaceC1869450ykR);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869360ykI)) {
            return false;
        }
        C1869360ykI c1869360ykI = (C1869360ykI) obj;
        return Intrinsics.LJFF(this.LL, c1869360ykI.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1869360ykI.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedMultiContainerThresholdStrategyContext(handlerFactory=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", managerContext=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1869460ykS
    public InterfaceC1869390ykL getHandlerFactory() {
        return this.LL;
    }

    @Override // X.InterfaceC1869460ykS
    public InterfaceC1869450ykR getManagerContext() {
        return this.LLILLJJLI;
    }

    public C1869360ykI(InterfaceC1869390ykL interfaceC1869390ykL, InterfaceC1869450ykR interfaceC1869450ykR) {
        this.LL = interfaceC1869390ykL;
        this.LLILLJJLI = interfaceC1869450ykR;
    }
}
