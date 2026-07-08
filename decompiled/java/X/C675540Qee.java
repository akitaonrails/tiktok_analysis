package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.ui.DynamicSearchShopData;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675540Qee implements InterfaceC0148002o {
    public final JSONObject LL;
    public final AbstractC1623806Xk<DynamicSearchShopData> LLILLJJLI;

    public C675540Qee() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675540Qee)) {
            return false;
        }
        C675540Qee c675540Qee = (C675540Qee) obj;
        return Intrinsics.LJFF(this.LL, c675540Qee.LL) && Intrinsics.LJFF(this.LLILLJJLI, c675540Qee.LLILLJJLI);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LL;
        return ((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultRoomProductsState(searchInitParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C675540Qee(int i) {
        this(null, C491101vh.LIZ);
    }

    public C675540Qee(JSONObject jSONObject, AbstractC1623806Xk<DynamicSearchShopData> abstractC1623806Xk) {
        this.LL = jSONObject;
        this.LLILLJJLI = abstractC1623806Xk;
    }
}
