package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewControlPlayLayerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LivePreviewControlPlayLayerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ABZ(LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget) {
        super(0);
        this.LL = livePreviewControlPlayLayerWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget = this.LL;
        C0C3F c0c3f = C0C3F.LIZ;
        String str = livePreviewControlPlayLayerWidget.LLJI;
        c0c3f.getClass();
        boolean zLIZIZ = C0C3F.LIZIZ(str);
        C01GW c01gw = C305560ByM.LIZ;
        livePreviewControlPlayLayerWidget.O1(zLIZIZ, !C305560ByM.LIZ(this.LL.LLJI));
        return Unit.LIZ;
    }
}
