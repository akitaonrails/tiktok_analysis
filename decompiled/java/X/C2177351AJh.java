package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.RoomStickerWrapperWidget;
import com.bytedance.android.livesdk.model.RoomSticker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177351AJh extends C2217421BqW implements Function1<RoomSticker, Unit> {
    public C2177351AJh(Object obj) {
        super(1, obj, RoomStickerWrapperWidget.class, "updateRoomStickerDecoration", "updateRoomStickerDecoration(Lcom/bytedance/android/livesdk/model/RoomSticker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomSticker roomSticker) {
        ((RoomStickerWrapperWidget) this.receiver).QN(roomSticker);
        return Unit.LIZ;
    }
}
