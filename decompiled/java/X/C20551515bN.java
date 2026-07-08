package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20551515bN extends C09AY implements Function0<FeedCardInsertConfig> {
    public C20551515bN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedCardInsertConfig invoke() {
        try {
            return (FeedCardInsertConfig) C0C64.LJIILLIIL().LJJIIJ(false, "fcp_card_config", 31744, FeedCardInsertConfig.class, null, 2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
