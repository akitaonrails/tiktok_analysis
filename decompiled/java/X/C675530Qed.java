package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.model.DynamicSearchResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675530Qed implements InterfaceC0148002o {
    public final JSONObject LL;
    public final AbstractC1623806Xk<DynamicSearchResponseData> LLILLJJLI;
    public final AbstractC1623806Xk<String> LLILLL;

    public C675530Qed() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675530Qed)) {
            return false;
        }
        C675530Qed c675530Qed = (C675530Qed) obj;
        return Intrinsics.LJFF(this.LL, c675530Qed.LL) && Intrinsics.LJFF(this.LLILLJJLI, c675530Qed.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c675530Qed.LLILLL);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LL;
        return ((((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultLiveState(searchInitParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resultString=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C675530Qed(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(null, c491101vh, c491101vh);
    }

    public C675530Qed(JSONObject jSONObject, AbstractC1623806Xk<DynamicSearchResponseData> abstractC1623806Xk, AbstractC1623806Xk<String> abstractC1623806Xk2) {
        this.LL = jSONObject;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
    }

    public static C675530Qed LIZ(C675530Qed c675530Qed, AbstractC1623806Xk abstractC1623806Xk, C1623606Xi c1623606Xi, int i) {
        JSONObject jSONObject;
        if ((i & 1) != 0) {
            jSONObject = c675530Qed.LL;
        } else {
            jSONObject = null;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c675530Qed.LLILLJJLI;
        }
        AbstractC1623806Xk<String> abstractC1623806Xk2 = c1623606Xi;
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c675530Qed.LLILLL;
        }
        c675530Qed.getClass();
        return new C675530Qed(jSONObject, abstractC1623806Xk, abstractC1623806Xk2);
    }
}
