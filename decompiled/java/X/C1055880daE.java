package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra.FeedEcCardEnhancedPreloadConfig;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0daE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055880daE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<CardTypeRequest> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055880daE(List<CardTypeRequest> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C01GW c01gw = FeedEcCardEnhancedPreloadConfig.LIZIZ;
        FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig enhancedPreloadConfig = (FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig) c01gw.getValue();
        if (enhancedPreloadConfig != null && Intrinsics.LJFF(enhancedPreloadConfig.enable, Boolean.TRUE)) {
            FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig enhancedPreloadConfig2 = (FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig) c01gw.getValue();
            if (!Intrinsics.LJFF(enhancedPreloadConfig2.ignoreCheckInsert, Boolean.FALSE) || !this.LL.isEmpty()) {
                Integer num = enhancedPreloadConfig2.maxCount;
                int iIntValue = num != null ? num.intValue() : 1;
                Long l = enhancedPreloadConfig2.delayTime;
                long jLongValue = l != null ? l.longValue() : 2000L;
                if (C1055900daG.LJ < iIntValue) {
                    try {
                        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1055870daD(jLongValue, enhancedPreloadConfig2, null), 3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1055900daG.LJ++;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
