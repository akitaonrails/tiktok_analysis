package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFixVideoGiftQueuePerfSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;

/* JADX INFO: renamed from: X.1Cwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246691Cwd {
    public final /* synthetic */ LocalPlayerControllerKotlin LIZ;

    public C2246691Cwd(LocalPlayerControllerKotlin localPlayerControllerKotlin) {
        this.LIZ = localPlayerControllerKotlin;
        C20441214yg.LIZIZ("LocalPlayerControllerKotlin_gift_video_engine", "init playerProgressListener");
    }

    public final void LIZ(int i, int i2, AbsPlayer absPlayer) {
        if (!LiveGiftFixVideoGiftQueuePerfSetting.INSTANCE.isEnabled() && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnablePreloadConfig()) {
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LIZ;
            if (localPlayerControllerKotlin.LL && (localPlayerControllerKotlin.LLJI instanceof C2246981Cx6) && !localPlayerControllerKotlin.LLJL.get()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onProgressUpdate, isPreloading=");
                sbLIZ.append(this.LIZ.LLJL);
                C1149270g0r.LIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                C2246671Cwb.LIZ.getClass();
                if (C2246671Cwb.LJIIJ(i, i2)) {
                    this.LIZ.LLJL.set(true);
                    C1141100fng c1141100fng = this.LIZ.LLJLILLLLZIIL;
                    if (c1141100fng != null) {
                        Object obj = c1141100fng.LIZLLL.get(InterfaceC1139410fkx.class);
                        if (obj == null) {
                            obj = null;
                        }
                        InterfaceC1139410fkx interfaceC1139410fkx = (InterfaceC1139410fkx) obj;
                        if (interfaceC1139410fkx != null) {
                            interfaceC1139410fkx.LIZIZ(new C2246681Cwc(this.LIZ, i, i2));
                        }
                    }
                }
            }
        }
    }
}
