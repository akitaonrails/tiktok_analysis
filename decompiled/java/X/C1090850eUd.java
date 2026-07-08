package X;

import X.C1090830eUb;
import X.C1090850eUd;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import android.widget.FrameLayout;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.live.slot.barragecontainer.effect.VideoBarragePlayer$initHandler$1;
import com.bytedance.android.livesdk.livesetting.level.LiveBarrageReleasePlayerTimeSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090850eUd {
    public final InterfaceC1090750eUT LIZ;
    public final BarrageMessage LIZIZ;
    public final FrameLayout LIZJ;
    public C1090830eUb LIZLLL;
    public final VideoBarragePlayer$initHandler$1 LJ;
    public final long LJFF;
    public final FrameLayout LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1090850eUd(final InterfaceC1090750eUT interfaceC1090750eUT, BarrageMessage barrageMessage, FrameLayout frameLayout) {
        VideoBarragePlayer$initHandler$1 videoBarragePlayer$initHandler$1;
        this.LIZ = interfaceC1090750eUT;
        this.LIZIZ = barrageMessage;
        this.LIZJ = frameLayout;
        if (this.LJ == null && this.LJFF > 0) {
            final Looper mainLooper = Looper.getMainLooper();
            videoBarragePlayer$initHandler$1 = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.live.slot.barragecontainer.effect.VideoBarragePlayer$initHandler$1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C1C7U.LIZ("VideoBarragePlayer@1740.initHandler$1");
                    super.handleMessage(message);
                    if (message.what == 1 && !((SlotBarrageWidget) interfaceC1090750eUT).z1()) {
                        C1090850eUd c1090850eUd = this;
                        C1090830eUb c1090830eUb = c1090850eUd.LIZLLL;
                        if (c1090830eUb != null) {
                            c1090830eUb.LIZJ();
                        }
                        c1090850eUd.LIZLLL = null;
                    }
                    C1C7U.LIZIZ("VideoBarragePlayer@1740.initHandler$1");
                }
            };
        } else {
            videoBarragePlayer$initHandler$1 = 0;
        }
        this.LJ = videoBarragePlayer$initHandler$1;
        this.LJFF = LiveBarrageReleasePlayerTimeSetting.INSTANCE.getValue();
        this.LJI = (FrameLayout) frameLayout.findViewById(R.id.bsu);
    }
}
