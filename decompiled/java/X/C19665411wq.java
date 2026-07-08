package X;

import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19665411wq extends C09AY implements Function1<RoomCreateInfo, Unit> {
    public final /* synthetic */ LiveEventStickerPreviewWrapperWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19665411wq(LiveEventStickerPreviewWrapperWidget liveEventStickerPreviewWrapperWidget) {
        super(1);
        this.LL = liveEventStickerPreviewWrapperWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomCreateInfo roomCreateInfo) {
        this.LL.G1(roomCreateInfo.roomEventMessageInfo);
        return Unit.LIZ;
    }
}
