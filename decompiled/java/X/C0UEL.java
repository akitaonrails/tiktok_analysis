package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.EffectInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0UEL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEL {
    public static void LIZ(Room room) {
        String str;
        List<Long> list;
        List<EffectInfo> list2 = room.effectInfo;
        if (list2 != null) {
            for (EffectInfo effectInfo : list2) {
                if (effectInfo.userId != 0 && effectInfo.effectId != 0) {
                    ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Ze0();
                    RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
                    if (linkMicInfo != null && (list = linkMicInfo.audienceIdList) != null) {
                        list.isEmpty();
                    }
                    if (effectInfo.userId == room.getOwnerUserId()) {
                        str = "anchor";
                    } else {
                        str = "connection_user";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("audience_sticker_show");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII("video_anchor_guest_connect", "watch_effect_scene");
                    c474500IjALIZ.LJJII(str, "watch_user_type");
                    c474500IjALIZ.LJJII(String.valueOf(effectInfo.effectId), "sticker_id");
                    c474500IjALIZ.LIZ();
                    C0UEK.LLILLL.put(String.valueOf(effectInfo.userId + effectInfo.effectId), new C0UEM(null, effectInfo, SystemClock.uptimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "video_anchor_guest_connect", str));
                }
            }
        }
    }
}
