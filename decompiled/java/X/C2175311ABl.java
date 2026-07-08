package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.tag.BcToggleInfoWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ABl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175311ABl extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LivePreviewInteractionLayerWidget LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175311ABl(LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget, boolean z) {
        super(1);
        this.LL = livePreviewInteractionLayerWidget;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        BcToggleInfoWidget bcToggleInfoWidget;
        if (bool.booleanValue() && C999000c6U.LIZ(this.LL.z1())) {
            LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = this.LL;
            BcToggleInfoWidget bcToggleInfoWidget2 = livePreviewInteractionLayerWidget.LLJJIJIL;
            if (bcToggleInfoWidget2 == null) {
                livePreviewInteractionLayerWidget.LLJJIJIL = (BcToggleInfoWidget) livePreviewInteractionLayerWidget.subWidgetManager.load(R.id.rp5, BcToggleInfoWidget.class, this.LLILLJJLI);
            } else if (bcToggleInfoWidget2.isInitialized() && (bcToggleInfoWidget = this.LL.LLJJIJIL) != null) {
                bcToggleInfoWidget.S1();
            }
            BcToggleInfoWidget bcToggleInfoWidget3 = this.LL.LLJJIJIL;
            if (bcToggleInfoWidget3 != null) {
                bcToggleInfoWidget3.show();
            }
        } else {
            BcToggleInfoWidget bcToggleInfoWidget4 = this.LL.LLJJIJIL;
            if (bcToggleInfoWidget4 != null) {
                bcToggleInfoWidget4.hide();
            }
        }
        return Unit.LIZ;
    }
}
