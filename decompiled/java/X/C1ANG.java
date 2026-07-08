package X;

/* JADX INFO: renamed from: X.1ANG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1ANG {
    PLAYBACK_STATE_START("start"),
    PLAYBACK_STATE_PLAYING("play"),
    PLAYBACK_STATE_PAUSED("pause"),
    PLAYBACK_STATE_STOPPED("stop"),
    PLAYBACK_STATE_ENDED("ended"),
    PLAYBACK_STATE_ERROR("error");

    public final String LL;

    public static C1ANG valueOf(String str) {
        return (C1ANG) C08FF.LIZ(C1ANG.class, str);
    }

    public final String getDesc() {
        return this.LL;
    }

    C1ANG(String str) {
        this.LL = str;
    }
}
