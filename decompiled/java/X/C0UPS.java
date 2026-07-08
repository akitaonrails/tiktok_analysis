package X;

import com.bytedance.android.live.broadcast.api.LiveInviteGuestSelectedChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UPS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UPS extends C2217421BqW implements Function0<Unit> {
    public C0UPS(PreviewCloseWidget previewCloseWidget) {
        super(0, previewCloseWidget, PreviewCloseWidget.class, "internalCloseButtonClick", "internalCloseButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveWidget liveWidget = (LiveWidget) this.receiver;
        C0UJY c0ujyLIZ = C770730ULf.LIZ(liveWidget.dataChannel);
        if (c0ujyLIZ != null) {
            c0ujyLIZ.l();
        }
        C772120UQo c772120UQo = (C772120UQo) liveWidget.dataChannel.gg0(C771530UOh.class);
        if (c772120UQo != null) {
            if (Intrinsics.LJFF("outapp_push", c772120UQo.LIZ)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(liveWidget.context, "//main");
                smartRouteBuildRoute.addFlags(268468224);
                smartRouteBuildRoute.open();
            }
            liveWidget.dataChannel.SX0(C771530UOh.class, null);
        }
        Boolean bool = (Boolean) liveWidget.dataChannel.gg0(C771500UOe.class);
        if (bool != null) {
            if (bool.booleanValue()) {
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(liveWidget.context, "//main");
                smartRouteBuildRoute2.addFlags(268468224);
                smartRouteBuildRoute2.open();
            }
            liveWidget.dataChannel.SX0(C771500UOe.class, null);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C13BV c13bv = C13BV.INSTANCE;
        dataChannelGlobal.HQ2(LiveInviteGuestSelectedChannel.class, new C0J9U(c13bv, c13bv, c13bv));
        return Unit.LIZ;
    }
}
