package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.188P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C188P extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ BaseEcLiveFeedCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C188P(BaseEcLiveFeedCardWidget baseEcLiveFeedCardWidget) {
        super(0);
        this.LL = baseEcLiveFeedCardWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        return this.LL.P1();
    }
}
