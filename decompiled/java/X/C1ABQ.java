package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopMaskLayerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LivePreviewTopMaskLayerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ABQ(LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget) {
        super(0);
        this.LL = livePreviewTopMaskLayerWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
        C0C3F c0c3f = C0C3F.LIZ;
        String str = livePreviewTopMaskLayerWidget.LLJ;
        c0c3f.getClass();
        boolean zLIZIZ = C0C3F.LIZIZ(str);
        C01GW c01gw = C305560ByM.LIZ;
        livePreviewTopMaskLayerWidget.R1(zLIZIZ, !C305560ByM.LIZ(this.LL.LLJ));
        return Unit.LIZ;
    }
}
