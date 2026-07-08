package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q30, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q30 implements C0PWT {
    public final ECSearchEntranceData LL;
    public final String LLILLJJLI;

    public C0Q30() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q30)) {
            return false;
        }
        C0Q30 c0q30 = (C0Q30) obj;
        return Intrinsics.LJFF(this.LL, c0q30.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q30.LLILLJJLI);
    }

    public final int hashCode() {
        ECSearchEntranceData eCSearchEntranceData = this.LL;
        return ((eCSearchEntranceData == null ? 0 : eCSearchEntranceData.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEcommerceAction(entranceData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", singleTabType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().zJ2().LIZIZ(C13LE.LIZ(C0Q30.class), new C664070Q2z());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0Q30(int i) {
        this(null, "");
    }

    public C0Q30(ECSearchEntranceData eCSearchEntranceData, String str) {
        this.LL = eCSearchEntranceData;
        this.LLILLJJLI = str;
    }
}
