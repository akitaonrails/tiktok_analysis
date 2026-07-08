package Y;

import X.C09JN;
import X.C1C7U;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;

/* JADX INFO: loaded from: classes18.dex */
public class AfS17S0310000_17 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS17S0310000_17 afS17S0310000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) afS17S0310000_17.l0;
        FrameLayout frameLayout = (FrameLayout) afS17S0310000_17.l1;
        GiftGalleryMessage giftGalleryMessage = (GiftGalleryMessage) afS17S0310000_17.l2;
        boolean z = afS17S0310000_17.z3;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$1L");
        liveRoomUserInfoWidget.N = (Bitmap) obj;
        liveRoomUserInfoWidget.n2(frameLayout, giftGalleryMessage, z);
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$1L");
    }

    public static final void accept$1(AfS17S0310000_17 afS17S0310000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) afS17S0310000_17.l0;
        FrameLayout frameLayout = (FrameLayout) afS17S0310000_17.l1;
        GiftGalleryMessage giftGalleryMessage = (GiftGalleryMessage) afS17S0310000_17.l2;
        boolean z = afS17S0310000_17.z3;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$3L");
        liveRoomUserInfoWidget.f326O = (Bitmap) obj;
        liveRoomUserInfoWidget.n2(frameLayout, giftGalleryMessage, z);
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$3L");
    }

    public AfS17S0310000_17(FrameLayout frameLayout, GiftGalleryMessage giftGalleryMessage, LiveRoomUserInfoWidget liveRoomUserInfoWidget, boolean z, int i) {
        this.$t = i;
        this.l0 = liveRoomUserInfoWidget;
        this.l1 = frameLayout;
        this.l2 = giftGalleryMessage;
        this.z3 = z;
    }
}
