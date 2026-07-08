package X;

/* JADX INFO: renamed from: X.0jLL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277290jLL {
    PK("pk"),
    NORMAL("normal"),
    FM("fm"),
    VIDEO_TALK("video_talk"),
    VIDEO_TALK_CAMERA("video_talk_camera"),
    MULTI_ANCHOR("multi_anchor"),
    SHARE_VIDEO("share_video"),
    SHARE_VIDEO_PRI("share_video_pri"),
    KTV("ktv"),
    KTV_CAMERA("ktv_camera"),
    KTV_PRI("ktv_pri"),
    EQUAL_TALK_ROOM("equal_talk_room"),
    MVP("mvp"),
    GAME_AUDIO("game_audio"),
    PK_CROSS("pk_cross");

    public final String LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1277290jLL valueOf(String str) {
        return (EnumC1277290jLL) C08FF.LIZ(EnumC1277290jLL.class, str);
    }

    EnumC1277290jLL(String str) {
        this.LL = str;
    }
}
