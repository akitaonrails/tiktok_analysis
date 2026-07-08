package X;

import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AJ9 extends C2217421BqW implements Function1<C956380azk, Unit> {
    public C1AJ9(Object obj) {
        super(1, obj, StickerEditFragment.class, "onLinkStateChanged", "onLinkStateChanged(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C956380azk c956380azk) {
        StickerEditFragment stickerEditFragment = (StickerEditFragment) this.receiver;
        stickerEditFragment.getClass();
        if (c956380azk.LIZ == 0) {
            Function1<? super Boolean, Unit> function1 = stickerEditFragment.LLJILJIL;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            stickerEditFragment.MR();
        }
        return Unit.LIZ;
    }
}
