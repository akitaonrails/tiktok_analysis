package X;

import com.ss.android.ugc.aweme.ab.FeedRegisterFrontierConfig;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602550rnx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;
    public final /* synthetic */ FeedRegisterFrontierConfig LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602550rnx(FeedRegisterFrontierConfig feedRegisterFrontierConfig, FeedLiveStatusManagerComponent feedLiveStatusManagerComponent, boolean z) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
        this.LLILLJJLI = feedRegisterFrontierConfig;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FeedLiveStatusManagerComponent feedLiveStatusManagerComponent = this.LL;
        boolean z = this.LLILLJJLI.replenishRegister;
        boolean z2 = this.LLILLL;
        feedLiveStatusManagerComponent.ho().LJIIIIZZ();
        if (z) {
            feedLiveStatusManagerComponent.m339do(feedLiveStatusManagerComponent.getAwemeList(), z2);
        }
        return Unit.LIZ;
    }
}
