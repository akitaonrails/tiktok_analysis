package X;

import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768740UDo extends C768770UDr implements C0UAL {
    public final DataChannel LIZJ;
    public final View LIZLLL;
    public final InterfaceC768780UDs LJ;
    public final C0U78 LJFF;
    public boolean LJI;
    public String LJII;

    public final void LIZIZ() {
        DataChannelGlobal.LLILZ.zQ2(this);
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void LIZJ() {
        C0U78 c0u78 = this.LJFF;
        String str = C0UD4.LIZIZ;
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(c0u78.qr(str));
        if (liveEffect == null || !liveEffect.LLJZ()) {
            return;
        }
        C766270U4b.LIZLLL(2131841649);
        this.LJFF.LJIIJ(liveEffect, str);
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.LC0(StickerCancelChannel.class, liveEffect);
        }
    }

    public final void LIZLLL() {
        C0U78 c0u78 = this.LJFF;
        String strLIZ = LIZ(167.0f, 167.0f, 302.0f);
        if (strLIZ == null) {
            return;
        }
        c0u78.setRenderCacheString("default_safe_area", strLIZ);
    }

    public C768740UDo(DataChannel dataChannel, View view, InterfaceC768780UDs interfaceC768780UDs) {
        super(view, interfaceC768780UDs);
        this.LIZJ = dataChannel;
        this.LIZLLL = view;
        this.LJ = interfaceC768780UDs;
        this.LJFF = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).composerManagerB();
        this.LJI = true;
        this.LJII = "";
        DataChannelGlobal.LLILZ.CQ2(BroadcastSceneGlobalChannel.class, this, new AwS591S0100000_12(this, 694));
        if (dataChannel != null) {
            dataChannel.CQ2(StickerSelectedEvent.class, this, new AwS591S0100000_12(this, 695));
            dataChannel.CQ2(MultiLiveRTCLayoutChannel.class, this, new AwS591S0100000_12(this, 696));
            dataChannel.CQ2(StickerCancelChannel.class, this, new AwS591S0100000_12(this, 697));
            dataChannel.CQ2(PauseLiveChannel.class, this, new AwS591S0100000_12(this, 698));
        }
    }
}
