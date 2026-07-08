package X;

/* JADX INFO: renamed from: X.0II0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0II0 {
    ENTER_FAILED,
    FETCH_FAILED,
    ROOM_FETCH_FINISHED,
    ROOM_PLAY_FINISHED,
    PING_KICK_OUT,
    USER_CLOSE,
    USER_CLOSE_CLICK,
    USER_KICK_OUT,
    WATCHER_KIT_OUT,
    JUMP_TO_OTHER,
    PLAYER_ERROR,
    MIC_ROOM_END,
    LIVE_ACCESS_RECALL,
    SUB_ONLY_ERROR,
    LCC_PERCEPTION,
    USER_IN_BLOCK,
    REGION_BLOCK,
    ENTER_FAILED_KICKED,
    PAID_ROOM_EXIT,
    VIEWER_LIMIT_ROOM,
    RESTRICTED_MODE,
    EC_LIMIT;

    public static C0II0 valueOf(String str) {
        return (C0II0) C08FF.LIZ(C0II0.class, str);
    }
}
