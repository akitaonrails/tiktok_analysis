package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618040OLy implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Integer> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;

    public C618040OLy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618040OLy)) {
            return false;
        }
        C618040OLy c618040OLy = (C618040OLy) obj;
        return Intrinsics.LJFF(this.LL, c618040OLy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c618040OLy.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinAutoPlayState(liveBlockStates=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", liveFinishStates=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C618040OLy(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    public C618040OLy(AbstractC1623806Xk<Integer> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }

    public static C618040OLy LIZ(C618040OLy c618040OLy, AbstractC1623806Xk abstractC1623806Xk, C1623606Xi c1623606Xi, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c618040OLy.LL;
        }
        AbstractC1623806Xk<Boolean> abstractC1623806Xk2 = c1623606Xi;
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c618040OLy.LLILLJJLI;
        }
        c618040OLy.getClass();
        return new C618040OLy(abstractC1623806Xk, abstractC1623806Xk2);
    }
}
