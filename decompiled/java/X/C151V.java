package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastFusionIdFixedTimeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameFrameFunctionSwitcherSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;

/* JADX INFO: renamed from: X.151V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151V implements InterfaceC774990Uaf, Handler.Callback {
    public final C151U LL;
    public C777400UeY LLILLJJLI;
    public AbstractC1273900jFs LLILLL;
    public boolean LLILZ;
    public final BPEAHandler LLILZIL;
    public HandlerThread LLILZLL;
    public final C151W LLIZ = new C151W(this);

    public C151V(Room room) {
        BPEAHandler bPEAHandler;
        Looper looperW2;
        this.LL = new C151U(room);
        if (this.LLILZLL == null) {
            HandlerThread handlerThread = new HandlerThread("GameBroadcastAIManagerTagV2");
            this.LLILZLL = handlerThread;
            handlerThread.start();
        }
        HandlerThread handlerThread2 = this.LLILZLL;
        if (handlerThread2 != null && (looperW2 = C786410Ut5.W2(handlerThread2)) != null) {
            bPEAHandler = new BPEAHandler(looperW2, this);
        } else {
            bPEAHandler = null;
        }
        this.LLILZIL = bPEAHandler;
        if (bPEAHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            C786410Ut5.LJLJLJ(bPEAHandler, messageObtain, GameBroadcastFusionIdFixedTimeSetting.INSTANCE.getValue());
        }
    }

    @Override // X.InterfaceC774990Uaf
    public final void LIZ(AbstractC1273900jFs abstractC1273900jFs) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C151U c151u = this.LL;
        C151F c151f = c151u.LJI;
        if (c151f != null) {
            int i = c151u.LJFF;
            int i2 = c151u.LJ;
            c151f.LJ.append(i);
            c151f.LJFF.append(i2);
        }
        C151F c151f2 = c151u.LJI;
        if (c151f2 != null) {
            c151f2.LIZLLL(null, null, "dynamic_model_modify", c151u.LJIIIIZZ.LIZJ, true);
        }
        C11JF c11jf = c151u.LJIIIIZZ.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        BPEAHandler bPEAHandler = this.LLILZIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.LLILZLL;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.LLILZLL = null;
        C777400UeY c777400UeY = this.LLILLJJLI;
        if (c777400UeY != null) {
            c777400UeY.LIZLLL(abstractC1273900jFs);
        }
        this.LLILLJJLI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151V.handleMessage(android.os.Message):boolean");
    }

    @Override // X.InterfaceC774990Uaf
    public final void LIZJ(AbstractC1273900jFs abstractC1273900jFs, boolean z) {
        this.LLILLL = abstractC1273900jFs;
        this.LLILZ = z;
        LIZLLL(abstractC1273900jFs, z);
    }

    public final void LIZLLL(AbstractC1273900jFs abstractC1273900jFs, boolean z) {
        if (GameFrameFunctionSwitcherSetting.INSTANCE.isEnable() && this.LL.LIZIZ != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            if (abstractC1273900jFs != null) {
                C777400UeY c777400UeY = this.LLILLJJLI;
                if (c777400UeY != null) {
                    c777400UeY.LIZLLL(abstractC1273900jFs);
                }
                C777400UeY c777400UeY2 = new C777400UeY(this.LLIZ);
                this.LLILLJJLI = c777400UeY2;
                c777400UeY2.LIZJ.set(false);
                Bundle bundle = new Bundle();
                bundle.putInt("mode", 2);
                bundle.putInt(Scene.SCENE_SERVICE, 2);
                bundle.putInt("width", 640);
                bundle.putInt("height", 360);
                if (!z) {
                    bundle.putFloat("rotation", 90.0f);
                    c777400UeY2.LJFF = 1;
                }
                abstractC1273900jFs.LJLIIIL(bundle, c777400UeY2.LIZLLL, c777400UeY2);
                BPEAHandler bPEAHandler = this.LLILZIL;
                if (bPEAHandler != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    C786410Ut5.LJLJLJ(bPEAHandler, messageObtain, Mp4ScreenVideoLoadTimeout.CONTROL);
                    return;
                }
                return;
            }
            return;
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC774990Uaf
    public final void LIZIZ(boolean z, AbstractC1273900jFs abstractC1273900jFs, boolean z2) {
        if (z) {
            C777400UeY c777400UeY = this.LLILLJJLI;
            if (c777400UeY != null) {
                c777400UeY.LIZJ.set(true);
                Map<String, Object> map = C1338270kvh.LIZ;
                return;
            }
            return;
        }
        LIZJ(abstractC1273900jFs, z2);
    }
}
