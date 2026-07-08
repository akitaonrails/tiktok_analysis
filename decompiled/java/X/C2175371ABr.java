package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175371ABr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LivePreviewInteractionLayerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175371ABr(LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget) {
        super(0);
        this.LL = livePreviewInteractionLayerWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = this.LL;
        if (!livePreviewInteractionLayerWidget.isDestroyed) {
            C0C3F c0c3f = C0C3F.LIZ;
            String str = livePreviewInteractionLayerWidget.LLJI;
            c0c3f.getClass();
            boolean zLIZIZ = C0C3F.LIZIZ(str);
            C01GW c01gw = C305560ByM.LIZ;
            livePreviewInteractionLayerWidget.a2(zLIZIZ, !C305560ByM.LIZ(this.LL.LLJI));
        }
        return Unit.LIZ;
    }
}
