package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623850OdT {
    public static void LIZ(MissionStruct missionStruct, int i, String str, String str2, String str3) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "brand_partnership_page"), new Pair("tab_name", C623900OdY.LIZ(i)), new Pair("action_type", str));
        try {
            for (Map.Entry entry : ((Map) C08JS.LIZIZ().LJIIIIZZ(missionStruct.messageExtra, Map.class)).entrySet()) {
                mapLJIIJ.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("WorkBenchCardListViewModel", e.toString());
        }
        if (Intrinsics.LJFF(str, "click")) {
            if (C123100dR.LIZ(str2)) {
                mapLJIIJ.put("land_page", str2);
            }
            if (C123100dR.LIZ(str3)) {
                mapLJIIJ.put("enter_method", str3);
            }
        }
        C20684815ws.LJIILLIIL("brand_message_inner_message", mapLJIIJ);
    }
}
