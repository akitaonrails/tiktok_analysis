package X;

import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QT9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QT9 implements InterfaceC0148002o {
    public final EcSearchSugResponse LL;
    public final List<? extends SearchSugEntity> LLILLJJLI;
    public final Boolean LLILLL;

    public C0QT9() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QT9)) {
            return false;
        }
        C0QT9 c0qt9 = (C0QT9) obj;
        return Intrinsics.LJFF(this.LL, c0qt9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0qt9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0qt9.LLILLL);
    }

    public final int hashCode() {
        EcSearchSugResponse ecSearchSugResponse = this.LL;
        int iHashCode = (ecSearchSugResponse == null ? 0 : ecSearchSugResponse.hashCode()) * 31;
        List<? extends SearchSugEntity> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchSugState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entityList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QT9(EcSearchSugResponse ecSearchSugResponse, List<? extends SearchSugEntity> list, Boolean bool) {
        this.LL = ecSearchSugResponse;
        this.LLILLJJLI = list;
        this.LLILLL = bool;
    }
}
