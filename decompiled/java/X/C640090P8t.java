package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640090P8t implements InterfaceC639120P5a {
    public final Map<String, Object> LL;

    public C640090P8t() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C640090P8t) && Intrinsics.LJFF(this.LL, ((C640090P8t) obj).LL);
    }

    public final int hashCode() {
        Map<String, Object> map = this.LL;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateLogParamsForSearchMobEventAction(logParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().SL1().LIZIZ(C13LE.LIZ(C640090P8t.class), AFwS293S0000000_10.get$arr$(76));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640090P8t(Map<String, ? extends Object> map) {
        this.LL = map;
    }

    public final void LIZ(SearchResultParam searchResultParam) {
        C0P7X.LIZ(this, searchResultParam);
    }
}
