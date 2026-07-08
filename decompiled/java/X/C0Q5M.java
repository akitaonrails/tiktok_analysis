package X;

import com.ss.android.ugc.aweme.search.general.SearchDetailPlayComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Q5M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q5M extends C09AY implements Function1<Map<String, ? extends Object>, Unit> {
    public final /* synthetic */ SearchDetailPlayComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Q5M(SearchDetailPlayComponent searchDetailPlayComponent) {
        super(1);
        this.LL = searchDetailPlayComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends Object> map) {
        String string;
        Map<String, ? extends Object> map2 = map;
        if (map2 != null) {
            SearchDetailPlayComponent searchDetailPlayComponent = this.LL;
            searchDetailPlayComponent.getClass();
            if (C664480Q4o.LIZ()) {
                String str = "";
                if (C652090Phv.LJ(C1389300mG0.LIZ(searchDetailPlayComponent.getPanelContext()), "")) {
                    Object obj = map2.get("aid");
                    if (obj != null && (string = obj.toString()) != null) {
                        str = string;
                    }
                    Object obj2 = map2.get("player_manager");
                    if (!(obj2 instanceof C0N0Y)) {
                        obj2 = null;
                    }
                    searchDetailPlayComponent.LLILLL = System.currentTimeMillis();
                    searchDetailPlayComponent.LLILLJJLI = str;
                    searchDetailPlayComponent.LLILZ = false;
                    searchDetailPlayComponent.LLILZIL = 0L;
                    searchDetailPlayComponent.LLILZLL = 0L;
                    searchDetailPlayComponent.LLIZ = 0;
                    C664360Q4c.LIZ.getClass();
                    int i = C664360Q4c.LJI;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            C664360Q4c.LJI = 5;
                        }
                    } else {
                        C664360Q4c.LJI = 3;
                        C664360Q4c.LIZLLL = System.currentTimeMillis();
                    }
                    searchDetailPlayComponent.LLIZLLLIL.put(str, new C664390Q4f());
                    if (obj2 != null) {
                        Map<C0N0Y, String> map3 = C0Q0N.LIZ;
                        if (!map3.isEmpty()) {
                            if (C0Q0O.LIZ < 0) {
                                C0Q0O.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_player_crosstalk_opt_v2", true);
                            }
                            if (C0Q0O.LIZ == 1) {
                                if (map3.containsKey(obj2)) {
                                    map3.remove(obj2);
                                    if (C650560PfS.LIZ) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("search detail video play, use shared playerManger. sharedPlayers size:");
                                        sbLIZ.append(map3.size());
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                } else if (C650560PfS.LIZ) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("search detail video play, use different playerManger. players:");
                                    sbLIZ2.append(map3);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                }
                                if (!map3.isEmpty()) {
                                    for (Map.Entry entry : ((LinkedHashMap) map3).entrySet()) {
                                        C0N0Y c0n0y = (C0N0Y) entry.getKey();
                                        entry.getValue();
                                        c0n0y.release();
                                    }
                                    ((LinkedHashMap) C0Q0N.LIZ).clear();
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
