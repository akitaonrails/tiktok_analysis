package X;

/* JADX INFO: renamed from: X.0uLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public enum EnumC1700470uLt {
    PREPARED,
    PREPARE_FAILED,
    VIDEO_SIZE_CHANGED,
    PLAY_COMPLETED,
    MEDIA_ERROR,
    RENDERING_START,
    BUFFERING_START,
    BUFFERING_END,
    SEI_UPDATE,
    RESOLUTION_DEGRADE,
    ABR_NEW_RESOLUTION,
    TEXTURE_RENDER_DRAW_FRAME,
    NETWORK_STATE_CHANGED;

    public static EnumC1700470uLt valueOf(String str) {
        return (EnumC1700470uLt) C08FF.LIZ(EnumC1700470uLt.class, str);
    }
}
