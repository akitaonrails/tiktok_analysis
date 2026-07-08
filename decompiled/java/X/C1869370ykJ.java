package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869370ykJ implements InterfaceC1869470ykT {
    public final List<Float> LL;
    public final List<Float> LLILLJJLI;
    public final transient C1869360ykI LLILLL;

    public final C1869370ykJ copy(List<Float> list, List<Float> list2, C1869360ykI c1869360ykI) {
        return new C1869370ykJ(list, list2, c1869360ykI);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869370ykJ)) {
            return false;
        }
        C1869370ykJ c1869370ykJ = (C1869370ykJ) obj;
        return Intrinsics.LJFF(this.LL, c1869370ykJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1869370ykJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1869370ykJ.LLILLL);
    }

    public int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiContainerThresholdHandlerContext(widthThreshold=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", heightThreshold=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", strategyContext=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Float> getHeightThreshold() {
        return this.LLILLJJLI;
    }

    public final List<Float> getWidthThreshold() {
        return this.LL;
    }

    @Override // X.InterfaceC1869470ykT
    public C1869360ykI getStrategyContext() {
        return this.LLILLL;
    }

    public C1869370ykJ(List<Float> list, List<Float> list2, C1869360ykI c1869360ykI) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = c1869360ykI;
    }
}
