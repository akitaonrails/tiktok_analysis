package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftStickerShowLynxGuideSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0eL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1084930eL5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C1136560fgM c1136560fgM) {
        Object c098200Yq;
        Pair<Long, Long> pair;
        long jLongValue;
        if (c1136560fgM == null) {
            return false;
        }
        if (GiftStickerShowLynxGuideSettings.INSTANCE.ignoreFrequencyControl()) {
            return false;
        }
        try {
            Map<Long, Pair<Long, Long>> mapLIZ = InterfaceC1094160eZy.X1.LIZ();
            if (mapLIZ != null && (pair = mapLIZ.get(Long.valueOf(c1136560fgM.LJIIL))) != null) {
                Long first = pair.getFirst();
                if (first != null) {
                    jLongValue = first.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue >= r5.getMaxShowCount()) {
                    return true;
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("StickerEffectGuidanceHelper", "isReachMaxTime error", thM5exceptionOrNullimpl);
        }
        return false;
    }
}
