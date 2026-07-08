package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137020fh6 {
    public static final C1137020fh6 LIZ = new C1137020fh6();

    public static int LIZIZ() {
        if (!C1128450fTH.LJIL()) {
            return (C924810aAp.LJ().LJJII > 0 || C1128450fTH.LIZ.vH0()) ? 1 : 0;
        }
        List<Long> listB70 = C1128450fTH.LIZ.b70();
        return (listB70 == null || listB70.size() <= 2) ? 2 : 3;
    }

    public static final ConcurrentHashMap<String, String> LIZ(GiftMessage giftMessage) {
        Map<? extends String, ? extends String> mapLJIIIIZZ = C1135800ff8.LJIIIIZZ(giftMessage, C158B.LIZ(), System.currentTimeMillis());
        C1135800ff8.LJIJJLI(mapLJIIIIZZ);
        mapLJIIIIZZ.putAll(C1136080ffa.LIZIZ());
        String str = "1";
        if (giftMessage.LLJ) {
            mapLJIIIIZZ.put("is_perf_test", "1");
        }
        LIZ.getClass();
        mapLJIIIIZZ.put(Scene.SCENE_SERVICE, String.valueOf(LIZIZ()));
        if (!giftMessage.disableGiftTracking) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIIIIZZ.put("disable_gift_tracking", str);
        mapLJIIIIZZ.put("revenue_unified_overload_score", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL());
        mapLJIIIIZZ.put("is_interactive_gift", String.valueOf(C1135800ff8.LJJIIJ(giftMessage.mGift)));
        mapLJIIIIZZ.put("is_background", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(64);
        concurrentHashMap.putAll(mapLJIIIIZZ);
        return concurrentHashMap;
    }

    public static JSONObject LIZJ(User user) {
        Object c098200Yq;
        JSONObject jSONObject = new JSONObject();
        if (user == null) {
            return jSONObject;
        }
        try {
            jSONObject.putOpt("nickname", user.getNickName());
            jSONObject.putOpt(FollowStatusChangeMethod.PARAM_UID, Long.valueOf(user.getId()));
            jSONObject.putOpt("id_str", user.getIdStr());
            jSONObject.putOpt("sec_uid", user.getSecUid());
            jSONObject.putOpt("user_attr", user.getUserAttr());
            jSONObject.putOpt("anchor_info", user.getAnchorInfo());
            jSONObject.putOpt("user_role", Integer.valueOf(user.getUserRole()));
            jSONObject.putOpt("avatar_thumb", user.getAvatarThumb());
            jSONObject.putOpt("avatar_medium", user.getAvatarMedium());
            jSONObject.putOpt("avatar_large", user.getAvatarLarge());
            jSONObject.putOpt("display_id", user.getUsername());
            jSONObject.putOpt("avatar_border", user.getAvatarBorder());
            jSONObject.putOpt("medal", user.getMedal());
            jSONObject.putOpt("link_mic_stats", Integer.valueOf(user.getLinkMicStats()));
            jSONObject.putOpt("bg_img_url", user.getBackgroundImgUrl());
            jSONObject.putOpt("avatar_jpg", user.avatarJpg);
            jSONObject.putOpt("block_status", Integer.valueOf(user.blockStatus));
            jSONObject.putOpt("follow_status", user.followStatus);
            jSONObject.putOpt("is_follower", Boolean.valueOf(user.isFollower));
            jSONObject.putOpt("is_following", Boolean.valueOf(user.isFollowing));
            jSONObject.putOpt("is_block", Boolean.valueOf(user.isBlock));
            jSONObject.putOpt("is_subscribe", Boolean.valueOf(user.isSubscribe));
            c098200Yq = jSONObject.putOpt("enigma_info", user.enigmaInfo);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("multi_layout", "userToJson fail", thM5exceptionOrNullimpl);
        }
        return jSONObject;
    }
}
