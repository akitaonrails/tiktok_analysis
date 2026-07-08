package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146530fwR implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Object> LL;
    public final C1146430fwH LLILLJJLI;
    public final Function1<AbstractC1146640fwc, Unit> LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146530fwR)) {
            return false;
        }
        C1146530fwR c1146530fwR = (C1146530fwR) obj;
        return Intrinsics.LJFF(this.LL, c1146530fwR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1146530fwR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1146530fwR.LLILLL) && this.LLILZ == c1146530fwR.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftAnchorPanelGiftPageState(fetchingInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventSink=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", anchorGiftListSourceIsCache=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1146530fwR(AbstractC1623806Xk<? extends Object> abstractC1623806Xk, C1146430fwH c1146430fwH, Function1<? super AbstractC1146640fwc, Unit> function1, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c1146430fwH;
        this.LLILLL = function1;
        this.LLILZ = z;
    }

    public static C1146530fwR LIZ(C1146530fwR c1146530fwR, AbstractC1623806Xk abstractC1623806Xk, C1146430fwH c1146430fwH, boolean z, int i) {
        Function1<AbstractC1146640fwc, Unit> function1;
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1146530fwR.LL;
        }
        if ((i & 2) != 0) {
            c1146430fwH = c1146530fwR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            function1 = c1146530fwR.LLILLL;
        } else {
            function1 = null;
        }
        if ((i & 8) != 0) {
            z = c1146530fwR.LLILZ;
        }
        c1146530fwR.getClass();
        return new C1146530fwR(abstractC1623806Xk, c1146430fwH, function1, z);
    }
}
