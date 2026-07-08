package Y;

import X.C0KBS;
import X.C1114730f79;
import X.C1C7U;
import android.content.Context;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS0S1110000_7 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S1110000_7 aRunnableS0S1110000_7) {
        long id;
        SubEmojiInputDialogFragment subEmojiInputDialogFragment = (SubEmojiInputDialogFragment) aRunnableS0S1110000_7.l1;
        String str = aRunnableS0S1110000_7.s0;
        boolean z = aRunnableS0S1110000_7.z2;
        subEmojiInputDialogFragment.getClass();
        C1C7U.LIZ("SubEmojiInputDialogFragment@7df7.initInputPanels$1L");
        Context context = subEmojiInputDialogFragment.getContext();
        DataChannel dataChannel = subEmojiInputDialogFragment.LLILLL;
        if (dataChannel != null && dataChannel.gg0(RoomChannel.class) != null) {
            id = ((Room) subEmojiInputDialogFragment.LLILLL.gg0(RoomChannel.class)).getId();
        } else {
            id = 0;
        }
        if (context != null && context.getResources() != null) {
            C0KBS c0kbs = C0KBS.LIZ;
            C0KBS.LJIIZILJ = C1114730f79.LIZ();
            subEmojiInputDialogFragment.getResources();
            C0KBS.LJIIIIZZ(str, z, UserService.getInstance().user().getCurrentUserId(), id);
        }
        C1C7U.LIZIZ("SubEmojiInputDialogFragment@7df7.initInputPanels$1L");
    }

    public static final void run$1(ARunnableS0S1110000_7 aRunnableS0S1110000_7) {
        long id;
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aRunnableS0S1110000_7.l1;
        String str = aRunnableS0S1110000_7.s0;
        boolean z = aRunnableS0S1110000_7.z2;
        liveEmojiInputDialogFragment.getClass();
        C1C7U.LIZ("LiveEmojiInputDialogFragment@b667.initInputPanels$1L");
        Context context = liveEmojiInputDialogFragment.getContext();
        DataChannel dataChannel = liveEmojiInputDialogFragment.LLILLL;
        if (dataChannel != null && dataChannel.gg0(RoomChannel.class) != null) {
            id = ((Room) liveEmojiInputDialogFragment.LLILLL.gg0(RoomChannel.class)).getId();
        } else {
            id = 0;
        }
        if (context != null && context.getResources() != null) {
            C0KBS c0kbs = C0KBS.LIZ;
            C0KBS.LJIIZILJ = C1114730f79.LIZ();
            liveEmojiInputDialogFragment.getResources();
            C0KBS.LJIIIIZZ(str, z, UserService.getInstance().user().getCurrentUserId(), id);
        }
        C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.initInputPanels$1L");
    }

    public ARunnableS0S1110000_7(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
