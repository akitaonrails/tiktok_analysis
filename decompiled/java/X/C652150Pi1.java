package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchHelpPostCardInfo;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchHelpPostCardList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pi1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652150Pi1 implements InterfaceC1618170sD9<C652150Pi1> {
    public final Map<String, SearchHelpPostCardList> LL;
    public final Map<String, EnumC664960Q6k> LLILLJJLI;

    public C652150Pi1() {
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
        if (!(obj instanceof C652150Pi1)) {
            return false;
        }
        C652150Pi1 c652150Pi1 = (C652150Pi1) obj;
        return Intrinsics.LJFF(this.LL, c652150Pi1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c652150Pi1.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHelpPostCardInfoState(cardInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishState=");
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

    public /* synthetic */ C652150Pi1(int i) {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C652150Pi1(Map<String, SearchHelpPostCardList> map, Map<String, ? extends EnumC664960Q6k> map2) {
        this.LL = map;
        this.LLILLJJLI = map2;
        UUID.randomUUID().toString();
    }

    public final String LIZIZ(Gson gson, IAccountService iAccountService) {
        SearchHelpPostCardList searchHelpPostCardList = this.LL.get(iAccountService.LJIIJ().getCurUserId());
        if (searchHelpPostCardList == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<Pair<String, SearchHelpPostCardInfo>> it2 = searchHelpPostCardList.helpPostCardList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSecond());
            }
            return gson.LJIILL(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static C652150Pi1 LIZ(C652150Pi1 c652150Pi1, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            map = c652150Pi1.LL;
        }
        if ((i & 2) != 0) {
            map2 = c652150Pi1.LLILLJJLI;
        }
        c652150Pi1.getClass();
        return new C652150Pi1(map, map2);
    }
}
