package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618190OMn implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Unit> LL;
    public final AbstractC1623806Xk<Unit> LLILLJJLI;
    public final AbstractC1623806Xk<Unit> LLILLL;

    public C618190OMn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618190OMn)) {
            return false;
        }
        C618190OMn c618190OMn = (C618190OMn) obj;
        return Intrinsics.LJFF(this.LL, c618190OMn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c618190OMn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c618190OMn.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPageState(bulletinInfoState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bulletinListState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bulletinPageLoadState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C618190OMn(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh);
    }

    public C618190OMn(AbstractC1623806Xk<Unit> abstractC1623806Xk, AbstractC1623806Xk<Unit> abstractC1623806Xk2, AbstractC1623806Xk<Unit> abstractC1623806Xk3) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
    }

    public static C618190OMn LIZ(C618190OMn c618190OMn, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c618190OMn.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c618190OMn.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c618190OMn.LLILLL;
        }
        c618190OMn.getClass();
        return new C618190OMn(abstractC1623806Xk, abstractC1623806Xk2, abstractC1623806Xk3);
    }
}
