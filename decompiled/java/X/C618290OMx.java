package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618290OMx implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Unit> LL;
    public final AbstractC1623806Xk<Unit> LLILLJJLI;

    public C618290OMx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618290OMx)) {
            return false;
        }
        C618290OMx c618290OMx = (C618290OMx) obj;
        return Intrinsics.LJFF(this.LL, c618290OMx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c618290OMx.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPublishState(publishItemRequest=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", withDrawRequest=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C618290OMx(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    public C618290OMx(AbstractC1623806Xk<Unit> abstractC1623806Xk, AbstractC1623806Xk<Unit> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }

    public static C618290OMx LIZ(C618290OMx c618290OMx, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c618290OMx.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c618290OMx.LLILLJJLI;
        }
        c618290OMx.getClass();
        return new C618290OMx(abstractC1623806Xk, abstractC1623806Xk2);
    }
}
