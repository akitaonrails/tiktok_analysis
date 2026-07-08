package X;

import Y.ARunnableS35S1100000_31;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Cwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246681Cwc extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ LocalPlayerControllerKotlin LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246681Cwc(LocalPlayerControllerKotlin localPlayerControllerKotlin, int i, int i2) {
        super(1);
        this.LL = localPlayerControllerKotlin;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Object obj;
        Object objValueOf;
        String str2 = str;
        if (!a0.LJJJIL(str2)) {
            C2246671Cwb c2246671Cwb = C2246671Cwb.LIZ;
            Context context = this.LL.LLIZ;
            int i = this.LLILLJJLI;
            int i2 = this.LLILLL;
            c2246671Cwb.getClass();
            LiveGiftVideoPlayerPerfOptSetting liveGiftVideoPlayerPerfOptSetting = LiveGiftVideoPlayerPerfOptSetting.INSTANCE;
            if (liveGiftVideoPlayerPerfOptSetting.isEnablePreloadConfig()) {
                C1149270g0r.LIZIZ("LiveGiftVideoCacheManager_gift_video_engine", "tryPreload");
                long j = C2246671Cwb.LJIIJ;
                if (j <= 0 || j >= 4000 || j < 1000) {
                    objValueOf = Integer.valueOf(liveGiftVideoPlayerPerfOptSetting.playerPreloadDuration());
                } else {
                    objValueOf = Float.valueOf(j * liveGiftVideoPlayerPerfOptSetting.playerPreloadThreshold());
                }
                int i3 = i2 - i;
                if (C2246671Cwb.LJIIJ(i, i2) && C176600m4.LIZIZ(Boolean.valueOf(C500260Jjc.LJJIIZI(str2)))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tryPreload, currentDuration = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", totalDuration=");
                    sbLIZ.append(i2);
                    sbLIZ.append(", leftDuration = ");
                    sbLIZ.append(i3);
                    sbLIZ.append(", lastFirstFrameDuration=");
                    sbLIZ.append(j);
                    sbLIZ.append(", preloadThreshold=");
                    sbLIZ.append(objValueOf);
                    sbLIZ.append(", preloadPath=");
                    sbLIZ.append(str2);
                    C20441214yg.LJIIIZ("LiveGiftVideoCacheManager_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.LJJZZIII((Handler) C2246671Cwb.LIZIZ.getValue(), new ARunnableS35S1100000_31(context, str2, 3));
                }
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onProgressUpdate, isPreloading=");
            sbLIZ2.append(this.LL.LLJL);
            sbLIZ2.append(", preloadPath = ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", IVideoMessageQueueOperatorProvider=");
            C1141100fng c1141100fng = this.LL.LLJLILLLLZIIL;
            Integer numValueOf = null;
            if (c1141100fng != null && (obj = c1141100fng.LIZLLL.get(InterfaceC1139410fkx.class)) != null) {
                numValueOf = Integer.valueOf(obj.hashCode());
            }
            sbLIZ2.append(numValueOf);
            C1149270g0r.LIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }
}
