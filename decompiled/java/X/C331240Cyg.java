package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.live.mix.game.model.GameCommonMixViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Cyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331240Cyg {
    public static final C331240Cyg LIZ = new C331240Cyg();

    public static void LIZ(Lifecycle lifecycle, Context context, C331220Cye c331220Cye) {
        String str;
        String str2;
        String str3;
        int iIntValue;
        int iIntValue2;
        String str4;
        Integer numLJIIJJI;
        String str5;
        Integer numLJIIJJI2;
        String str6;
        Bundle bundle = new Bundle();
        Map<String, String> map = c331220Cye.LIZIZ;
        String str7 = "";
        if (map == null || (str = map.get("target_aweme_id")) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, String> map2 = c331220Cye.LIZIZ;
            if (map2 != null && (str6 = map2.get("target_aweme_id")) != null) {
                str7 = str6;
            }
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str7, bundle);
        }
        Map<String, String> map3 = c331220Cye.LIZIZ;
        if (map3 == null || (str2 = map3.get("enter_from_merge")) == null) {
            str2 = "homepage_hot";
        }
        C786410Ut5.LJJJI("refer", str2, bundle);
        Map<String, String> map4 = c331220Cye.LIZIZ;
        if (map4 == null || (str3 = map4.get("enter_method")) == null) {
            str3 = "live_bottom_bar";
        }
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        C786410Ut5.LJJJI("video_from", "GAME_COMMON_MIX_FEED_LIST_ENTRANCE", bundle);
        Map<String, String> map5 = c331220Cye.LIZIZ;
        if (map5 != null && (str5 = map5.get("mix_video_type")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str5)) != null) {
            iIntValue = numLJIIJJI2.intValue();
        } else {
            iIntValue = 1;
        }
        bundle.putInt("video_type", iIntValue);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withParam("extra_live_card_type", 2);
        Map<String, String> map6 = c331220Cye.LIZIZ;
        if (map6 != null) {
            smartRouteBuildRoute.withParam("feed_param_extra", new HashMap(map6));
        }
        if (lifecycle != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("game_mix_feed_view_model");
            Map<String, String> map7 = c331220Cye.LIZIZ;
            if (map7 != null && (str4 = map7.get("mix_video_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                iIntValue2 = numLJIIJJI.intValue();
            } else {
                iIntValue2 = 1;
            }
            sbLIZ.append(iIntValue2);
            GameCommonMixViewModel gameCommonMixViewModel = (GameCommonMixViewModel) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycle, C2188811AlT.LIZIZ(sbLIZ), GameCommonMixViewModel.class);
            if ((gameCommonMixViewModel instanceof InterfaceC331170CyZ) && gameCommonMixViewModel != null) {
                gameCommonMixViewModel.EQ2(c331220Cye.LIZ);
            }
        }
        smartRouteBuildRoute.open();
    }
}
