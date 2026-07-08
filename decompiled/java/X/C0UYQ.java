package X;

import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSAvPlayerLazyLoadSwitch;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYQ implements InterfaceC761180TtU {
    public static final C0UYQ LIZ = new C0UYQ();
    public static InterfaceC774130UYh LIZIZ;
    public static InterfaceC769940UIe LIZJ;

    @Override // X.InterfaceC761180TtU
    public final void LIZJ() {
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setVolume(0.6f);
        }
    }

    @Override // X.InterfaceC761180TtU
    public final void init() {
        DataChannelGlobal.LLILZ.DQ2(LiveStreamGlobalChannel.class, this, AFwS245S0000000_12.get$arr$(5));
    }

    @Override // X.InterfaceC761180TtU
    public final boolean isPlaying() {
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            return interfaceC774130UYh.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC761180TtU
    public final void stop() {
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.stop();
        }
    }

    @Override // X.InterfaceC761180TtU
    public final void LIZ(C0UZL c0uzl) {
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setEventListener(c0uzl);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = LIZIZ;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.setErrorListener(c0uzl);
        }
    }

    @Override // X.InterfaceC761180TtU
    public final void LIZIZ(String str) {
        InterfaceC769940UIe interfaceC769940UIe;
        InterfaceC774130UYh interfaceC774130UYhLJLJI;
        if (TTLSAvPlayerLazyLoadSwitch.INSTANCE.isAvPlayerLazyLoad() && (interfaceC769940UIe = LIZJ) != null && LIZIZ == null) {
            AbstractC1273900jFs liveCore = interfaceC769940UIe.getLiveCore();
            if (liveCore != null) {
                interfaceC774130UYhLJLJI = liveCore.LJLJI();
            } else {
                interfaceC774130UYhLJLJI = null;
            }
            LIZIZ = interfaceC774130UYhLJLJI;
            if (interfaceC774130UYhLJLJI != null) {
                interfaceC774130UYhLJLJI.setVolume(0.6f);
            }
        }
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setDataSource(C497740JfY.LJII(), str);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = LIZIZ;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.prepare();
        }
        InterfaceC774130UYh interfaceC774130UYh3 = LIZIZ;
        if (interfaceC774130UYh3 != null) {
            interfaceC774130UYh3.setMixerEnable(false);
        }
        InterfaceC774130UYh interfaceC774130UYh4 = LIZIZ;
        if (interfaceC774130UYh4 != null) {
            interfaceC774130UYh4.start();
        }
    }

    @Override // X.InterfaceC761180TtU
    public final void start(String str) {
        InterfaceC769940UIe interfaceC769940UIe;
        InterfaceC774130UYh interfaceC774130UYhLJLJI;
        if (TTLSAvPlayerLazyLoadSwitch.INSTANCE.isAvPlayerLazyLoad() && (interfaceC769940UIe = LIZJ) != null && LIZIZ == null) {
            AbstractC1273900jFs liveCore = interfaceC769940UIe.getLiveCore();
            if (liveCore != null) {
                interfaceC774130UYhLJLJI = liveCore.LJLJI();
            } else {
                interfaceC774130UYhLJLJI = null;
            }
            LIZIZ = interfaceC774130UYhLJLJI;
            if (interfaceC774130UYhLJLJI != null) {
                interfaceC774130UYhLJLJI.setVolume(0.6f);
            }
        }
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setDataSource(C497740JfY.LJII(), str);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = LIZIZ;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.prepare();
        }
        InterfaceC774130UYh interfaceC774130UYh3 = LIZIZ;
        if (interfaceC774130UYh3 != null) {
            interfaceC774130UYh3.setMixerEnable(true);
        }
        InterfaceC774130UYh interfaceC774130UYh4 = LIZIZ;
        if (interfaceC774130UYh4 != null) {
            interfaceC774130UYh4.start();
        }
    }
}
