package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;

/* JADX INFO: renamed from: X.0UH5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UH5 implements C0UCY {
    public final C0UH6 LIZ;

    @Override // X.C0UCY
    public final EffectImageInfo LIZLLL() {
        C0UH6 c0uh6 = this.LIZ;
        if (c0uh6 != null) {
            return c0uh6.LIZLLL();
        }
        return null;
    }

    public C0UH5(C0UH6 c0uh6) {
        this.LIZ = c0uh6;
    }

    @Override // X.C0UCY
    public final void LIZ(C0UHE c0uhe) {
        C0UH6 c0uh6 = this.LIZ;
        if (c0uh6 != null) {
            c0uh6.LIZ(c0uhe);
        }
    }

    @Override // X.C0UCY
    public final int LIZIZ(String str) {
        C0UH6 c0uh6 = this.LIZ;
        if (c0uh6 != null) {
            return c0uh6.LIZIZ(str);
        }
        return 0;
    }

    @Override // X.C0UCY
    public final void LIZJ(C0UHE c0uhe) {
        C0UH6 c0uh6 = this.LIZ;
        if (c0uh6 != null) {
            c0uh6.LIZJ(c0uhe);
        }
    }

    @Override // X.C0UCY
    public final void LJ(DataChannel dataChannel) {
        C0UEY liveMultiGuestStickerLogManager;
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(iEffectService.baseComposerManager().qr(C0UD4.LJ));
        if (liveEffect != null && (liveMultiGuestStickerLogManager = iEffectService.getLiveMultiGuestStickerLogManager()) != null) {
            liveMultiGuestStickerLogManager.LIZJ(liveEffect, dataChannel, 0, false, null);
        }
    }

    @Override // X.C0UCY
    public final int setEffect(String str) {
        C0UH6 c0uh6 = this.LIZ;
        if (c0uh6 != null) {
            return c0uh6.setEffect(str);
        }
        return 0;
    }

    @Override // X.C0UCY
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        C0UH6 c0uh6 = this.LIZ;
        if (c0uh6 != null) {
            c0uh6.sendEffectMsg(i, j, j2, str);
        }
    }
}
