package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556700qc0 implements InterfaceC0148002o {
    public final boolean LL;
    public final AutofillApi.CardNumberItem LLILLJJLI;

    public C1556700qc0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556700qc0)) {
            return false;
        }
        C1556700qc0 c1556700qc0 = (C1556700qc0) obj;
        return this.LL == c1556700qc0.LL && Intrinsics.LJFF(this.LLILLJJLI, c1556700qc0.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        AutofillApi.CardNumberItem cardNumberItem = this.LLILLJJLI;
        return iZ2 + (cardNumberItem == null ? 0 : cardNumberItem.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutofillState(showLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardNumber=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556700qc0(int i) {
        this(false, null);
    }

    public C1556700qc0(boolean z, AutofillApi.CardNumberItem cardNumberItem) {
        this.LL = z;
        this.LLILLJJLI = cardNumberItem;
    }
}
