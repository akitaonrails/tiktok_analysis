package X;

/* JADX INFO: renamed from: X.19JP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C19JP {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    TWIST_EVENT("onTwist", 18),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17),
    RENDER_SUCCESS("onRenderSuccess", 22);

    public final String LL;
    public final int LLILLJJLI;

    public String getEventName() {
        return this.LL;
    }

    public int getType() {
        return this.LLILLJJLI;
    }

    public static C19JP fromEventName(String str) {
        for (C19JP c19jp : values()) {
            if (c19jp.LL.equals(str)) {
                return c19jp;
            }
        }
        return UNKNOWN_EVENT;
    }

    public static C19JP fromEventType(int i) {
        for (C19JP c19jp : values()) {
            if (c19jp.LLILLJJLI == i) {
                return c19jp;
            }
        }
        return UNKNOWN_EVENT;
    }

    public static C19JP valueOf(String str) {
        return (C19JP) C08FF.LIZ(C19JP.class, str);
    }

    C19JP(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
