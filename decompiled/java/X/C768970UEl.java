package X;

import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;

/* JADX INFO: renamed from: X.0UEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768970UEl implements C0UCY {
    public final C0UJY LIZ;

    @Override // X.C0UCY
    public final int LIZIZ(String str) {
        return 0;
    }

    @Override // X.C0UCY
    public final EffectImageInfo LIZLLL() {
        return null;
    }

    @Override // X.C0UCY
    public final int setEffect(String str) {
        return 0;
    }

    public C768970UEl(C0UJY c0ujy) {
        this.LIZ = c0ujy;
    }

    @Override // X.C0UCY
    public final void LIZ(C0UHE c0uhe) {
        this.LIZ.LJIIIZ(c0uhe);
    }

    @Override // X.C0UCY
    public final void LIZJ(C0UHE c0uhe) {
        this.LIZ.LJIIL(c0uhe);
    }

    @Override // X.C0UCY
    public final void LJ(DataChannel dataChannel) {
        dataChannel.LC0(StickerSelectedEvent.class, new C0UCF(null, C0UD4.LIZIZ, "", false));
    }

    @Override // X.C0UCY
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        this.LIZ.sendEffectMsg(i, j, j2, str);
    }
}
