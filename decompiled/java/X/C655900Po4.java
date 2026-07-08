package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0Po4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655900Po4 {
    public static final C655900Po4 LIZ = new C655900Po4();

    public static void LIZ(Map map, InterfaceC655080Pmk interfaceC655080Pmk) {
        boolean z = interfaceC655080Pmk instanceof C655100Pmm;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            C655100Pmm c655100Pmm = (C655100Pmm) interfaceC655080Pmk;
            boolean z2 = c655100Pmm.LIZ.showDropsTag;
            String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(z2));
            if (strLIZLLL != null) {
                str = strLIZLLL;
            }
            map.put("is_gamecp_drops_tag", str);
            if (z2) {
                map.put("drops_game_id", c655100Pmm.LIZ.promotingDropsGameId);
                map.put("drops_game_name", c655100Pmm.LIZ.promotingDropsGameNameForReport);
                map.put("drops_id", c655100Pmm.LIZ.promotingDropsId);
                C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
                map.put("entity_sub", c0prc.LLLLIILL);
                map.put("tag_rank", String.valueOf(c0prc.LLLLIIL));
                return;
            }
            return;
        }
        map.put("is_gamecp_drops_tag", CardStruct.IStatusCode.DEFAULT);
    }
}
