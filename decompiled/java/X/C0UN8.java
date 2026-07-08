package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UN8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UN8 extends C2217421BqW implements Function1<C956380azk, Unit> {
    public C0UN8(Object obj) {
        super(1, obj, LiveStickerPropsDialog.class, "updateHostLinkedState", "updateHostLinkedState(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C956380azk c956380azk) {
        boolean z;
        LiveStickerPropsDialog liveStickerPropsDialog = (LiveStickerPropsDialog) this.receiver;
        liveStickerPropsDialog.getClass();
        if (c956380azk.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        liveStickerPropsDialog.LLILZLL = z;
        return Unit.LIZ;
    }
}
