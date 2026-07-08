package X;

/* JADX INFO: renamed from: X.1CZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232461CZg {
    OnRemoteUserJoined,
    OnFirstAudioData,
    OnFirstVideoData,
    OnFirstVideoFrameRender,
    OnRemoteUserLeft;

    public static final C2232481CZi Companion = new Object() { // from class: X.1CZi
    };

    public static EnumC2232461CZg valueOf(String str) {
        return (EnumC2232461CZg) C08FF.LIZ(EnumC2232461CZg.class, str);
    }

    public final C1CXV into() {
        int i = C2232471CZh.LIZ[ordinal()];
        if (i == 1) {
            return C1CXV.VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_JOINED;
        }
        if (i == 2) {
            return C1CXV.VAR_USER_LINK_RTC_EVENT_ON_FIRST_AUDIO_DATA;
        }
        if (i == 3) {
            return C1CXV.VAR_USER_LINK_RTC_EVENT_ON_FIRST_VIDEO_DATA;
        }
        if (i == 4) {
            return C1CXV.VAR_USER_LINK_RTC_EVENT_ON_FIRST_VIDEO_FRAME_RENDER;
        }
        if (i == 5) {
            return C1CXV.VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_LEFT;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2232471CZh.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new C1954807lC();
    }
}
