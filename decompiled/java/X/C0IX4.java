package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IX4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IX4 {
    public static final /* synthetic */ C0IX4 LIZ = new C0IX4();
    public static boolean LIZIZ = true;
    public static final Map<String, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("SelfLikeWidget", "like_widget_load"), new Pair("LiveRoomUserInfoWidget", "userinfo_widget_load"), new Pair("LiveAudienceToolbarWidget", "toolbar_widget_load"), new Pair("AudienceRightToolbarWidget", "toolbar_widget_load"), new Pair("OnlineAudienceRankWidget", "audience_count_widget_load"), new Pair("CloseWidget", "close_widget_load"), new Pair("RankEntranceWidget", "rank_list_widget_load"), new Pair("AudienceHashTagWidget", "topic_widget_load"), new Pair("LiveDrawerEntranceWidget", "feed_drawer_widget_load"), new Pair("CommentWidget", "comment_bar_widget_load"), new Pair("PortraitPublicScreenWidget", "comment_widget_load"), new Pair("FrameL2SlotWidget", "ec_explanation_card"), new Pair("BottomLeftSlotWidget", "bottom_left_slot"));
    public static final Map<String, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("SelfLikeWidget", "like_widget_load"), new Pair("LiveRoomUserInfoWidget", "userinfo_widget_load"), new Pair("LiveAudienceToolbarWidget", "toolbar_widget_load"), new Pair("AudienceRightToolbarWidget", "toolbar_widget_load"), new Pair("OnlineAudienceRankWidget", "userinfo_widget_load"), new Pair("CloseWidget", "userinfo_widget_load"), new Pair("RankEntranceWidget", "rank_list_widget_load"), new Pair("CommentWidget", "toolbar_widget_load"), new Pair("PortraitPublicScreenWidget", "comment_widget_load"));
    public static final Set<String> LJ = C13LQ.LJLIIL(new String[]{"like_widget_load", "userinfo_widget_load", "toolbar_widget_load", "comment_bar_widget_load"});
    public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"userinfo_widget_load", "audience_count_widget_load", "close_widget_load", "rank_list_widget_load", "topic_widget_load", "feed_drawer_widget_load"});
    public static final Set<String> LJI = C13LQ.LJLIIL(new String[]{"toolbar_widget_load", "comment_bar_widget_load", "bottom_left_slot"});

    public static void LIZ(DataChannel dataChannel, String str) {
        C0IX3 c0ix3;
        C0IX3 c0ix32;
        C0IX3 c0ix33;
        if (!C2093608Ic.LJ(str)) {
            HashMap<String, String> mapLIZ = C464360IIw.LIZ(dataChannel);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_duration");
            if (!mapLIZ.containsKey(C2188811AlT.LIZIZ(sbLIZ))) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap<String, String> mapLIZ2 = C464360IIw.LIZ(dataChannel);
                Long l = (Long) dataChannel.gg0(C1082850eHj.class);
                if (l != null) {
                    l.longValue();
                    long jLongValue = jCurrentTimeMillis - l.longValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("_duration");
                    mapLIZ2.put(C2188811AlT.LIZIZ(sbLIZ2), String.valueOf(jLongValue));
                    if (LJ.contains(str) && (c0ix33 = (C0IX3) dataChannel.gg0(C1082830eHh.class)) != null) {
                        c0ix33.LIZ = jLongValue;
                        c0ix33.LIZLLL.remove(str);
                    }
                    if (LJFF.contains(str) && (c0ix32 = (C0IX3) dataChannel.gg0(C1082830eHh.class)) != null) {
                        c0ix32.LIZIZ = jLongValue;
                    }
                    if (LJI.contains(str) && (c0ix3 = (C0IX3) dataChannel.gg0(C1082830eHh.class)) != null) {
                        c0ix3.LIZJ = jLongValue;
                    }
                }
            }
        }
    }
}
