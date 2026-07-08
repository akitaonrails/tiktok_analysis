package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.data.ConsumeData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594670rbF {
    public static final Keva LIZ = Keva.getRepo("feed_live_card_cache");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1594690rbH());
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static C603820NmG LIZIZ() {
        return (C603820NmG) LIZIZ.getValue();
    }

    public static void LIZ() {
        Object c098200Yq;
        if (LIZIZ().LJI() > 0) {
            LIZJ = true;
            return;
        }
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        String string = LIZ.getString("consumed_live_card_data", null);
        if (C703302op.LIZ(string)) {
            try {
                c098200Yq = (LinkedHashMap) C19748512Ol.LIZIZ.LJIIIIZZ(string, new TypeToken<LinkedHashMap<String, ConsumeData>>() { // from class: X.0rbI
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            if (linkedHashMap != null) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    LIZIZ().LIZLLL(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static final void LIZJ(EnumC1594650rbD enumC1594650rbD, Aweme aweme, long j) {
        String aid;
        if (C1594710rbJ.LIZ() && aweme != null && AwemeSaaSExtKt.isLive(aweme) && j > 0 && (aid = aweme.getAid()) != null && !a0.LJJJIL(aid)) {
            LIZ();
            ConsumeData consumeData = (ConsumeData) LIZIZ().LIZJ(aweme.getAid());
            if (consumeData == null) {
                consumeData = new ConsumeData(0L, 0L, 0L, 0L);
            }
            int i = C1594660rbE.LIZ[enumC1594650rbD.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            consumeData.liveCardLeaveTime = j;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        consumeData.liveCardShowTime = j;
                    }
                } else {
                    consumeData.clientAcceptanceTime = j;
                }
            } else {
                consumeData.filterDuplicateTime = j;
            }
            LIZIZ().LIZLLL(aweme.getAid(), consumeData);
            LIZLLL = true;
        }
    }
}
