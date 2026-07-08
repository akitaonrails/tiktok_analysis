package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837060xuC implements InterfaceC0148002o {
    public final AbstractC1837070xuD LL;
    public final AbstractC1837080xuE LLILLJJLI;

    public C1837060xuC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1837060xuC)) {
            return false;
        }
        C1837060xuC c1837060xuC = (C1837060xuC) obj;
        return Intrinsics.LJFF(this.LL, c1837060xuC.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1837060xuC.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCourseDetailState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", paymentState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1837060xuC(int i) {
        this(new AbstractC1837070xuD() { // from class: X.0xuI
        }, C1837150xuL.LIZ);
    }

    public C1837060xuC(AbstractC1837070xuD abstractC1837070xuD, AbstractC1837080xuE abstractC1837080xuE) {
        this.LL = abstractC1837070xuD;
        this.LLILLJJLI = abstractC1837080xuE;
    }

    public static C1837060xuC LIZ(C1837060xuC c1837060xuC, AbstractC1837070xuD abstractC1837070xuD, AbstractC1837080xuE abstractC1837080xuE, int i) {
        if ((i & 1) != 0) {
            abstractC1837070xuD = c1837060xuC.LL;
        }
        if ((i & 2) != 0) {
            abstractC1837080xuE = c1837060xuC.LLILLJJLI;
        }
        c1837060xuC.getClass();
        return new C1837060xuC(abstractC1837070xuD, abstractC1837080xuE);
    }
}
