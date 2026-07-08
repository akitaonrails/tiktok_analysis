package X;

import Y.ARunnableS112S0100000_12;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.livesdk.broadcast.trymode.guide.StickerHintShowingChannel;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0ULv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770890ULv {
    public final DataChannel LIZ;
    public final LiveWidget LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C1336240ksQ LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final ARunnableS112S0100000_12 LJIIL = new ARunnableS112S0100000_12(this, 231);

    public final void LIZ() {
        if (C500260Jjc.LJJJJIZL((View) this.LJIIIIZZ.getValue()) && C769380UGa.LIZ) {
            this.LIZ.zW(StickerHintShowingChannel.class, Boolean.FALSE);
        }
        C500260Jjc.LJIILIIL((View) this.LJIIIIZZ.getValue());
    }

    public final void LIZJ() {
        C500260Jjc.LJIILIIL((View) this.LJII.getValue());
        C500260Jjc.LJIILIIL((View) this.LJFF.getValue());
        C500260Jjc.LJIILIIL((View) this.LJI.getValue());
        C500260Jjc.LJIILIIL((View) this.LJIIJ.getValue());
        C500260Jjc.LJIILIIL((View) this.LJIIJJI.getValue());
        ((TextView) this.LJFF.getValue()).setText("");
        ((C1322090kVb) this.LJI.getValue()).setImageDrawable(null);
        C1336240ksQ c1336240ksQ = this.LJ;
        if (c1336240ksQ != null) {
            c1336240ksQ.LIZ();
        }
        this.LJ = null;
        this.LIZLLL = false;
        if (this.LIZJ) {
            LIZLLL();
        }
    }

    public final void LIZLLL() {
        if (!C500260Jjc.LJJJJIZL((View) this.LJIIIIZZ.getValue()) && C769380UGa.LIZ) {
            this.LIZ.zW(StickerHintShowingChannel.class, Boolean.TRUE);
        }
        C500260Jjc.LLFFF((View) this.LJIIIIZZ.getValue());
    }

    public final void LIZIZ() {
        C500260Jjc.LJJZ(C500260Jjc.LJIL() ? ((int) C497740JfY.LIZIZ(167.0f)) - C497740JfY.LJIJ() : (int) C497740JfY.LIZIZ(167.0f), (View) this.LJIIJ.getValue());
        DataChannel dataChannel = this.LIZ;
        dataChannel.BQ2(this.LIZIZ, BeforeStickerSelectedEvent.class, new AwS591S0100000_12(this, 678));
        dataChannel.BQ2(this.LIZIZ, StickerCancelChannel.class, new AwS591S0100000_12(this, 679));
        dataChannel.BQ2(this.LIZIZ, FaceDetectEvent.class, new AwS591S0100000_12(this, 680));
        dataChannel.BQ2(this.LIZIZ, PauseLiveChannel.class, new AwS591S0100000_12(this, 681));
        dataChannel.BQ2(this.LIZIZ, LiveDialogStatusChannel.class, new AwS591S0100000_12(this, 682));
    }

    public C770890ULv(View view, DataChannel dataChannel, LiveWidget liveWidget) {
        this.LIZ = dataChannel;
        this.LIZIZ = liveWidget;
        this.LJFF = C292401Bi.LIZ(new AwS556S0100000_12(view, 697));
        this.LJI = C292401Bi.LIZ(new AwS556S0100000_12(view, 696));
        this.LJII = C292401Bi.LIZ(new AwS556S0100000_12(view, 695));
        this.LJIIIIZZ = C292401Bi.LIZ(new AwS556S0100000_12(view, 693));
        this.LJIIIZ = C292401Bi.LIZ(new AwS556S0100000_12(view, 694));
        this.LJIIJ = C292401Bi.LIZ(new AwS556S0100000_12(view, 698));
        this.LJIIJJI = C292401Bi.LIZ(new AwS556S0100000_12(view, 692));
    }
}
