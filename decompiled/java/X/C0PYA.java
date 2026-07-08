package X;

import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYA implements InterfaceC1618170sD9<C0PYA> {
    public final SearchSceneInfo LL;

    public C0PYA() {
        this(null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PYA) && Intrinsics.LJFF(this.LL, ((C0PYA) obj).LL);
    }

    public final int hashCode() {
        SearchSceneInfo searchSceneInfo = this.LL;
        if (searchSceneInfo == null) {
            return 0;
        }
        return searchSceneInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultsConsumptionInfoState(info=");
        sbLIZ.append(this.LL);
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

    public C0PYA(SearchSceneInfo searchSceneInfo) {
        this.LL = searchSceneInfo;
        C0P8T.LIZ();
    }
}
