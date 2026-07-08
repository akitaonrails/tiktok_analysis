package X;

import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventPreviewCardWidget;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.PaidEventPreview;

/* JADX INFO: renamed from: X.0K9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512900K9o extends C09AY implements Function1<EnumC464630IJx, Unit> {
    public final /* synthetic */ LivePaidEventPreviewCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512900K9o(LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget) {
        super(1);
        this.LL = livePaidEventPreviewCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC464630IJx enumC464630IJx) {
        LiveEventInfo liveEventInfo;
        PaidEventPreview paidEventPreview;
        if (enumC464630IJx == EnumC464630IJx.PAY_SUCCESS) {
            CountDownTimerC512880K9m countDownTimerC512880K9m = this.LL.LLILZLL;
            if (countDownTimerC512880K9m != null) {
                countDownTimerC512880K9m.cancel();
            }
            LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget = this.LL;
            EnumC512800K9e enumC512800K9e = EnumC512800K9e.OTHERS;
            livePaidEventPreviewCardWidget.D1(false);
            livePaidEventPreviewCardWidget.z1(enumC512800K9e, false);
            C1113800f5e.LJIIIIZZ = true;
            Room room = this.LL.LLILZIL;
            if (room != null && (liveEventInfo = room.liveEventInfo) != null && (paidEventPreview = liveEventInfo.paidEventPreview) != null) {
                paidEventPreview.allowPreviewTime = -1L;
            }
        }
        return Unit.LIZ;
    }
}
