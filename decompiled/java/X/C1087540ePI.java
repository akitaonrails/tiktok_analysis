package X;

import Y.ARunnableS117S0100000_17;
import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.widget.ImageView;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Objects;

/* JADX INFO: renamed from: X.0ePI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087540ePI implements InterfaceC1091290eVL {
    public final /* synthetic */ RoomNotifyMessage LIZ;
    public final /* synthetic */ LiveRoomNotifyWidget LIZIZ;

    @Override // X.InterfaceC1091290eVL
    public final void LIZ(Exception exc) {
        if ("gift_broadcast".equals(this.LIZ.source)) {
            HandlerHook.viewPost(this.LIZIZ.LL, new ARunnableS117S0100000_17(this, 3));
            return;
        }
        ImageView imageView = this.LIZIZ.LL;
        EnumC1087550ePJ enumC1087550ePJ = EnumC1087550ePJ.INSTANCE;
        Objects.requireNonNull(enumC1087550ePJ);
        HandlerHook.viewPost(imageView, new ARunnableS117S0100000_17(enumC1087550ePJ, 4));
    }

    @Override // X.InterfaceC1091290eVL
    public final void LIZIZ(Bitmap bitmap) {
        float f;
        if (!this.LIZIZ.isViewValid()) {
            return;
        }
        if (C497740JfY.LJIILJJIL() != null) {
            f = C497740JfY.LJIILJJIL().getDisplayMetrics().density / 3.0f;
        } else {
            f = 1.0f;
        }
        NinePatchDrawable ninePatchDrawableLIZJ = C1121670fIL.LIZJ(bitmap, f);
        ImageView imageView = this.LIZIZ.LL;
        if (imageView != null) {
            imageView.setBackground(ninePatchDrawableLIZJ);
        }
        HandlerHook.viewPost(this.LIZIZ.LL, new ARunnableS117S0100000_17(this, 2));
    }

    public C1087540ePI(LiveRoomNotifyWidget liveRoomNotifyWidget, RoomNotifyMessage roomNotifyMessage) {
        this.LIZIZ = liveRoomNotifyWidget;
        this.LIZ = roomNotifyMessage;
    }
}
