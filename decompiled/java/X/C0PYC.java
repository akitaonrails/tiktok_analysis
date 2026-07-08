package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYC implements InterfaceC1618170sD9<C0PYC> {
    public final ECSearchEntranceData LL;
    public final String LLILLJJLI;

    public C0PYC() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PYC)) {
            return false;
        }
        C0PYC c0pyc = (C0PYC) obj;
        return Intrinsics.LJFF(this.LL, c0pyc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pyc.LLILLJJLI);
    }

    public final int hashCode() {
        ECSearchEntranceData eCSearchEntranceData = this.LL;
        return ((eCSearchEntranceData == null ? 0 : eCSearchEntranceData.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEcommerceEntranceState(ecSearchEntranceData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", singleTabType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C0PYC(int i) {
        this(null, "");
    }

    public C0PYC(ECSearchEntranceData eCSearchEntranceData, String str) {
        this.LL = eCSearchEntranceData;
        this.LLILLJJLI = str;
        C0P8T.LIZ();
    }
}
