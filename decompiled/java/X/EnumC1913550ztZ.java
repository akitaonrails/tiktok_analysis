package X;

/* JADX INFO: renamed from: X.0ztZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC1913550ztZ {
    UNKNOWN,
    PLAYER_PREPARED,
    COMPLETE_PLAY,
    MEDIA_ERROR,
    DISPLAYED_PLAY,
    STOP_WHEN_PLAYING_OTHER,
    STOP_WHEN_JOIN_INTERACT,
    BUFFERING_START,
    BUFFERING_END,
    INTERACT_SEI,
    VIDEO_SIZE_CHANGED,
    START_SWITCH_RESOLUTION,
    PLAYER_DETACHED,
    RESOLUTION_DEGRADE,
    ABR_NEW_RESOLUTION,
    TEXTURE_RENDER_DRAW_FRAME,
    NETWORK_STATE_CHANGED;

    public static EnumC1913550ztZ valueOf(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        return UNKNOWN;
    }

    public static EnumC1913550ztZ valueOf(String str) {
        return (EnumC1913550ztZ) C08FF.LIZ(EnumC1913550ztZ.class, str);
    }
}
