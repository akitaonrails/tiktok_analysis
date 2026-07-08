package X;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.model.GameCategoryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Jku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501060Jku {
    public static void LIZ(Room room, DataChannel dataChannel) {
        long id;
        long id2;
        String str;
        long jCurrentTimeMillis;
        String strLIZ;
        Object obj;
        LiveMode streamType;
        IPublicScreenService iPublicScreenServiceLJIJI = C781270Ukn.LJIJI();
        long id3 = 0;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        iPublicScreenServiceLJIJI.gC(id);
        IPublicScreenService iPublicScreenServiceLJIJI2 = C781270Ukn.LJIJI();
        if (room != null) {
            id2 = room.getId();
        } else {
            id2 = 0;
        }
        long jRd2 = iPublicScreenServiceLJIJI2.Rd2(id2);
        IPublicScreenService iPublicScreenServiceLJIJI3 = C781270Ukn.LJIJI();
        if (room != null) {
            id3 = room.getId();
        }
        iPublicScreenServiceLJIJI3.Zi0(id3);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.gg0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Long l = (Long) dataChannelGlobal.gg0(BroadcastShowOrientationBeginTime.class);
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_over");
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(jRd2)), "hot_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LJJII(String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        c474500IjALIZ.LJJII(str, "take_definition");
        if (room != null && room.isScreenshot) {
            GameCategoryInfo gameCategoryInfo = room.gameCategoryInfo;
            if (gameCategoryInfo != null) {
                if (TextUtils.isEmpty(gameCategoryInfo.title)) {
                    c474500IjALIZ.LJJII("none", "selected_app_name");
                } else {
                    c474500IjALIZ.LJJII(room.gameCategoryInfo.title, "selected_app_name");
                }
                if (TextUtils.isEmpty(room.gameCategoryInfo.packageName)) {
                    c474500IjALIZ.LJJII("none", "selected_app_id");
                } else {
                    c474500IjALIZ.LJJII(room.gameCategoryInfo.packageName, "selected_app_id");
                }
            }
            String str2 = "on";
            if (InterfaceC772390URp.LLLZIIL.LIZIZ().booleanValue()) {
                obj = "on";
            } else {
                obj = "off";
            }
            c474500IjALIZ.LJJII(obj, "screen_share_comment_push_setting");
            if (!InterfaceC772390URp.LLLZIL.LIZIZ().booleanValue()) {
                str2 = "off";
            }
            c474500IjALIZ.LJJII(str2, "screen_share_gift_push_setting");
        }
        c474500IjALIZ.LIZ();
    }
}
