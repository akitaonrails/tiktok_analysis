package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerEventPanelComponent;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0qqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565630qqP {
    public static final LinkedHashMap<Class<? extends InterfaceC1565640qqQ>, List<String>> LIZ;

    static {
        LinkedHashMap<Class<? extends InterfaceC1565640qqQ>, List<String>> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(PlayerEventPanelComponent.class, C13LQ.LJLI(new String[]{"event_on_render_first_frame", "event_on_render_ready", "event_on_play_progress_change", "event_on_play_completed", "event_on_play_pause", "event_on_play_failed", "event_on_playing", "event_on_request_resume_play", "event_on_pre_play", "event_on_pre_pause", "event_on_buffering"}));
        linkedHashMap.put(RootPanelComponent.class, C13LQ.LJLI(new String[]{"event_legacy_internal_video_event", "event_on_page_resume", "event_on_page_pause", "event_on_private_photo_lighten_success"}));
        linkedHashMap.put(VideoDiggAssem.class, C13LQ.LJLI(new String[]{"event_digg_click"}));
        linkedHashMap.put(VideoFavoriteAssem.class, C13LQ.LJLI(new String[]{"event_favorite_click"}));
        linkedHashMap.put(FeedLiveStatusManagerComponent.class, C13LQ.LJLI(new String[]{"event_on_live_first_frame"}));
        LIZ = linkedHashMap;
    }
}
