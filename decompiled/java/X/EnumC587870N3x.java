package X;

/* JADX INFO: renamed from: X.0N3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC587870N3x {
    FEED_REQ("feed_req"),
    VIDEO_REQ("video_req"),
    LOAD_MAIN("load_main"),
    FROM_SEND_TO_FIRST("from_send_to_first"),
    FEED_FIRST_VIDEO_PRELOAD("feed_first_video_preload"),
    FEED_FIRST_REQUEST_RESPONSE("feed_first_request_response"),
    FIRST_FRAME("first_frame"),
    FOCUS_TO_FEED_START("focus_to_feed_start"),
    FOCUS_TO_FEED_END("focus_to_feed_end"),
    FEED_TO_FIRST_FRAME_START("feed_to_first_frame_start"),
    FEED_TO_FIRST_FRAME_END("feed_to_first_frame_end"),
    FIRST_VIDEO_PLAY_START("first_video_play_start"),
    FIRST_VIDEO_PLAY_END("first_video_play_end"),
    PLAYER_FIRST_VIDEO_PREPARED("player_first_video_prepared"),
    FEED_FIRST_IMAGE_PRELOAD("feed_first_image_preload"),
    TAKE_LIVE_BUBBLE("take_live_bubble"),
    FEED_CACHE_VIDEO("feed_cache_video"),
    ON_RENDER_READY("on_render_ready"),
    NEW_USER_INTERCEPTOR("new_user_interceptor"),
    FEED_READY_SKIP_NEW_USER_JOURNEY("feed_ready_skip_new_user_journey");

    public final String LL;

    public String getName() {
        return this.LL;
    }

    public static EnumC587870N3x valueOf(String str) {
        return (EnumC587870N3x) C08FF.LIZ(EnumC587870N3x.class, str);
    }

    EnumC587870N3x(String str) {
        this.LL = str;
    }
}
