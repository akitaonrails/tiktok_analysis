package X;

import com.bytedance.hox.Hox;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qoo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564640qoo extends C09AY implements Function0<Hox> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564640qoo(FeedLiveStatusManagerComponent feedLiveStatusManagerComponent) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Hox invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return Hox.LLJILJIL.LIZ(c19egLIZ);
    }
}
