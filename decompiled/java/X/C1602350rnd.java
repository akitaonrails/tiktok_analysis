package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602350rnd {
    public static final C1602350rnd LIZ = new C1602350rnd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(395));

    public static void LIZIZ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("livesdk_hot_update_step", c2344009Gk.LIZ);
    }

    public static void LIZ(int i, Map map) {
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LJII(map);
            C20684815ws.LJIILLIIL("livesdk_hot_update_step", c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(List list, Map map) {
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it2.hasNext()) {
            String strLIZ = C0OHL.LIZ((Aweme) it2.next(), "slate_group_type");
            if (!C2093608Ic.LJ(strLIZ) && !Intrinsics.LJFF(strLIZ, CardStruct.IStatusCode.DEFAULT)) {
                i2++;
            } else {
                i3++;
            }
        }
        map.put("success_count", String.valueOf(i2));
        map.put("fail_count", String.valueOf(i3));
        if (i3 > 0) {
            i = 100;
        }
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("livesdk_hot_update_step", c2344009Gk.LIZ);
    }
}
