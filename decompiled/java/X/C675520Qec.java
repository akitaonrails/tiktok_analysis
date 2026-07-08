package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.model.DynamicSearchResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675520Qec implements InterfaceC0148002o {
    public final JSONObject LL;
    public final AbstractC1623806Xk<DynamicSearchResponseData> LLILLJJLI;

    public C675520Qec() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675520Qec)) {
            return false;
        }
        C675520Qec c675520Qec = (C675520Qec) obj;
        return Intrinsics.LJFF(this.LL, c675520Qec.LL) && Intrinsics.LJFF(this.LLILLJJLI, c675520Qec.LLILLJJLI);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LL;
        return ((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultOrderState(searchInitParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C675520Qec(int i) {
        this(null, C491101vh.LIZ);
    }

    public C675520Qec(JSONObject jSONObject, AbstractC1623806Xk<DynamicSearchResponseData> abstractC1623806Xk) {
        this.LL = jSONObject;
        this.LLILLJJLI = abstractC1623806Xk;
    }

    public static C675520Qec LIZ(C675520Qec c675520Qec, JSONObject jSONObject, AbstractC1623806Xk abstractC1623806Xk, int i) {
        if ((i & 1) != 0) {
            jSONObject = c675520Qec.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c675520Qec.LLILLJJLI;
        }
        c675520Qec.getClass();
        return new C675520Qec(jSONObject, abstractC1623806Xk);
    }
}
