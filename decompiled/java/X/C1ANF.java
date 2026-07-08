package X;

/* JADX INFO: renamed from: X.1ANF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1ANF {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    public static C1ANF valueOf(String str) {
        return (C1ANF) C08FF.LIZ(C1ANF.class, str);
    }

    public final boolean isPlayingState() {
        int i = C1ANE.LIZ[ordinal()];
        return i == 1 || i == 2;
    }
}
