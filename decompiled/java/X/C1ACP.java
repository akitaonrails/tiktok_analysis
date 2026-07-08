package X;

import com.bytedance.android.livesdk.livesetting.linkmic.PullSceneConfig;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ACP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LivePreviewPlayerWidget LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C259800zU<PullSceneConfig> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ACP(LivePreviewPlayerWidget livePreviewPlayerWidget, C238400w2 c238400w2, long j, C118300cf c118300cf, C118300cf c118300cf2, Object obj, C259800zU<PullSceneConfig> c259800zU) {
        super(0);
        this.LL = livePreviewPlayerWidget;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = j;
        this.LLILZ = c118300cf;
        this.LLILZIL = c118300cf2;
        this.LLILZLL = obj;
        this.LLIZ = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = this.LL.P1();
        if (feedLiveViewHolderVMP1 != null && feedLiveViewHolderVMP1.LLLFZ) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaZ1 = this.LL.z1();
            EnumC1488280ope enumC1488280ope = EnumC1488280ope.RUN_STRATEGY;
            long j = this.LLILLJJLI.element;
            long j2 = this.LLILLL;
            int i = this.LLILZ.element;
            int i2 = this.LLILZIL.element;
            String string = this.LLILZLL.toString();
            c1ac7.getClass();
            C1AC7.LJII(c1acaZ1, enumC1488280ope, j, j2, i, i2, string);
            this.LL.P1();
            this.LL.e2(this.LLIZ.element);
        }
        return Unit.LIZ;
    }
}
