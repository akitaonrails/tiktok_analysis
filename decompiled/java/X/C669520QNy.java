package X;

import com.ss.android.ugc.aweme.search.source.neo.model.SearchResult;
import com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig;
import defpackage.q0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669520QNy implements InterfaceC1618170sD9<C669520QNy> {
    public static final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final q0<SearchResult> LL;
    public final long LLILLJJLI;

    public C669520QNy() {
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
        if (!(obj instanceof C669520QNy)) {
            return false;
        }
        C669520QNy c669520QNy = (C669520QNy) obj;
        return Intrinsics.LJFF(this.LL, c669520QNy.LL) && this.LLILLJJLI == c669520QNy.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchRecommendInfoState(searchResults=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", timestamp=");
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C669520QNy(int i) {
        this(new q0(((RecommendInfoConfig) C0QO2.LIZJ.getValue()).maxQueryCount), -1L);
        C0QO2.LIZ.getClass();
    }

    public C669520QNy(q0<SearchResult> q0Var, long j) {
        this.LL = q0Var;
        this.LLILLJJLI = j;
        C0P8T.LIZ();
    }
}
