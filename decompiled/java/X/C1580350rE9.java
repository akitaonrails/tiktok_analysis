package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580350rE9 implements InterfaceC0148002o {
    public final AbstractC1580360rEA LL;

    public C1580350rE9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1580350rE9) && Intrinsics.LJFF(this.LL, ((C1580350rE9) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarRootState(sideBarData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1580350rE9(int i) {
        this(C1580430rEH.LIZ);
    }

    public C1580350rE9(AbstractC1580360rEA abstractC1580360rEA) {
        this.LL = abstractC1580360rEA;
    }
}
