package Y;

import X.C1269940j9U;
import X.C1272060jCu;
import X.C1274860jHQ;
import X.C1275590jIb;
import X.C1C7U;
import X.C786410Ut5;
import X.EnumC1274530jGt;
import X.InterfaceC1271560jC6;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxResourceModule;
import com.lynx.tasm.core.JSProxy;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS13S0500000_20 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C1275590jIb c1275590jIb = new C1275590jIb(((VideoPixelFormat) this.l0).toString(), -1, ((VideoFrame) this.l1).getTextureMatrix(), null);
            int textureID = ((VideoFrame) this.l1).getTextureID();
            int i = ((C1274860jHQ) this.l4).LJJIIJ;
            if (i <= 0) {
                i = textureID;
            }
            ((TTLHAbnormalDetectorJava) this.l2).processTexture(i, ((VideoFrame) this.l1).getWidth(), ((VideoFrame) this.l1).getHeight(), ((EnumC1274530jGt) this.l3) == EnumC1274530jGt.TEXTURE_OES, c1275590jIb);
            ((VideoFrame) this.l1).release();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((VideoFrame) this.l1).release();
            throw th;
        }
    }

    public static final void run$0(ARunnableS13S0500000_20 aRunnableS13S0500000_20) {
        boolean zLIZ;
        s sVar;
        C1C7U.LIZ("LynxResourceModule@82cc.resourcePrefetchAwaitComplete$1");
        try {
            LynxResourceModule lynxResourceModule = (LynxResourceModule) ((WeakReference) aRunnableS13S0500000_20.l0).get();
            if (lynxResourceModule != null && (sVar = lynxResourceModule.mLynxContext) != null) {
                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(aRunnableS13S0500000_20, 49);
                JSProxy jSProxy = sVar.LLJI.get();
                if (jSProxy != null) {
                    jSProxy.LJII(aRunnableS120S0100000_20);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxResourceModule@82cc.resourcePrefetchAwaitComplete$1");
    }

    public static final void run$1(ARunnableS13S0500000_20 aRunnableS13S0500000_20) {
        com.ss.ttlivestreamer.core.buffer.VideoFrame videoFrame = (com.ss.ttlivestreamer.core.buffer.VideoFrame) aRunnableS13S0500000_20.l0;
        InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) aRunnableS13S0500000_20.l1;
        Handler handler = (Handler) aRunnableS13S0500000_20.l2;
        LiveSdkSetting liveSdkSetting = (LiveSdkSetting) aRunnableS13S0500000_20.l3;
        C1269940j9U c1269940j9U = (C1269940j9U) aRunnableS13S0500000_20.l4;
        C1C7U.LIZ("VeLivePusherHelper@bd6f.fromAVFVideoFrame$1L");
        if (interfaceC1271560jC6.getFence() > 0 && handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS28S0400000_20(liveSdkSetting, interfaceC1271560jC6, c1269940j9U, videoFrame, 18));
        } else {
            if (C1272060jCu.LIZIZ(liveSdkSetting)) {
                interfaceC1271560jC6.release("PusherEncode");
            } else {
                interfaceC1271560jC6.release();
            }
            if (c1269940j9U != null) {
                c1269940j9U.LIZ(12, videoFrame.getBuffer().getCaptureMs());
            }
        }
        C1C7U.LIZIZ("VeLivePusherHelper@bd6f.fromAVFVideoFrame$1L");
    }

    public static final void run$2(ARunnableS13S0500000_20 aRunnableS13S0500000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoSinkWrapper@73b0.consumeVideoFrameInternal$1");
        try {
            aRunnableS13S0500000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoSinkWrapper@73b0.consumeVideoFrameInternal$1");
    }

    public ARunnableS13S0500000_20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
