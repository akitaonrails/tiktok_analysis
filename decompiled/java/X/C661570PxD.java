package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0PxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661570PxD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AbstractC1386140mAu abstractC1386140mAu, Map map, Aweme aweme) {
        String aid;
        if (map == null) {
            return;
        }
        if (C0BQ1.LIZ()) {
            abstractC1386140mAu.LIZIZ(map);
            return;
        }
        LIZIZ(abstractC1386140mAu, map, "search_result_id", false);
        LIZIZ(abstractC1386140mAu, map, "token_type", false);
        LIZIZ(abstractC1386140mAu, map, "list_item_rank", true);
        LIZIZ(abstractC1386140mAu, map, "list_item_title", false);
        LIZIZ(abstractC1386140mAu, map, "is_top_item", true);
        LIZIZ(abstractC1386140mAu, map, "is_page", true);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        abstractC1386140mAu.LJ("search_third_item_id", aid);
    }

    public static void LIZIZ(AbstractC1386140mAu abstractC1386140mAu, Map map, String str, boolean z) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            if (z) {
                try {
                    abstractC1386140mAu.LIZLLL((int) CastFloatProtector.parseFloat(str2), str);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            abstractC1386140mAu.LJ(str, str2);
        }
    }
}
