package X;

import Y.AkS479S0100000_17;
import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.game.api.GameLiveWatchApi;
import com.bytedance.android.livesdk.livesetting.game.GameBottomBarMixDisallowListSetting;
import com.bytedance.android.livesdk.livesetting.game.GameBottomBarMixFeedSetting;
import com.bytedance.android.livesdk.livesetting.game.GameliveBottombarFlowSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;
import webcast.api.game.GetRelatedEntranceRequest;

/* JADX INFO: renamed from: X.10JX, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10JX implements InterfaceC20320414fC {
    public static final C10JX LIZ = new C10JX();

    @Override // X.InterfaceC20320414fC
    public final int LIZLLL() {
        return GameBottomBarMixFeedSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC20320414fC
    public final boolean LIZIZ() {
        return GameliveBottombarFlowSetting.enableFlowPage;
    }

    @Override // X.InterfaceC20320414fC
    public final Object LJ() {
        return new C711420RvQ() { // from class: X.0Rvm
            {
                new C711630Rvl();
                new C711650Rvn();
                new C487140J8m();
            }
        };
    }

    @Override // X.InterfaceC20320414fC
    public final boolean LJII() {
        return GameliveBottombarFlowSetting.enableHeroLive;
    }

    @Override // X.InterfaceC20320414fC
    public final C11NZ<String> LIZ(JSONObject jSONObject) {
        C480460Ism.LIZ().getClass();
        GameLiveWatchApi gameLiveWatchApi = (GameLiveWatchApi) C480460Ism.LIZLLL(GameLiveWatchApi.class);
        GetRelatedEntranceRequest getRelatedEntranceRequest = new GetRelatedEntranceRequest();
        try {
            GetRelatedEntranceRequest.VideoBase[] videoBaseArr = new GetRelatedEntranceRequest.VideoBase[1];
            GetRelatedEntranceRequest.VideoBase videoBase = new GetRelatedEntranceRequest.VideoBase();
            videoBase.videoId = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, "video_id"));
            videoBase.authorId = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, "author_id"));
            String string = JSONObjectProtectorUtils.getString(jSONObject, "related_live_tag");
            if (string == null) {
                string = "";
            }
            videoBase.relatedLiveTag = string;
            videoBaseArr[0] = videoBase;
            getRelatedEntranceRequest.videos = C1697810uHb.LJIILJJIL(videoBaseArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestRelatedEntranceContent ");
            sbLIZ.append(e);
            C20441214yg.LIZIZ("GameLiveOuterService", C2188811AlT.LIZIZ(sbLIZ));
        }
        return gameLiveWatchApi.getRelatedEntrance(getRelatedEntranceRequest).LJIILIIL(new C0UO0()).LJJJJZI(new AkS479S0100000_17(jSONObject, 3));
    }

    @Override // X.InterfaceC20320414fC
    public final boolean LJFF(String str) {
        boolean zLJIILLIIL = true;
        try {
            zLJIILLIIL = true ^ C13LQ.LJIILLIIL(str, GameBottomBarMixDisallowListSetting.INSTANCE.getValue());
            return zLJIILLIIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("GameLiveOuterService", "isGameLiveMixBottomBarTypeAllow error");
            return zLJIILLIIL;
        }
    }

    @Override // X.InterfaceC20320414fC
    public final void LIZJ(LifecycleRegistry lifecycleRegistry, Context context, Map map) {
        C331220Cye c331220Cye = new C331220Cye(null, map);
        try {
            C331240Cyg.LIZ.getClass();
            C331240Cyg.LIZ(lifecycleRegistry, context, c331220Cye);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enterGameMixInnerFlowPage error: ");
            sbLIZ.append(e);
            C20441214yg.LIZIZ("GameLiveOuterService", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC20320414fC
    public final void LJI(Context context, String str, Map map) {
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if (iGameService != null) {
            iGameService.cR0(context, str, map);
        }
    }
}
