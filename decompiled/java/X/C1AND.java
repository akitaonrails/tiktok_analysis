package X;

/* JADX INFO: renamed from: X.1AND, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AND {
    public static C1ANF LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return C1ANF.PLAYBACK_STATE_STOPPED;
                    }
                    return C1ANF.PLAYBACK_STATE_ERROR;
                }
                return C1ANF.PLAYBACK_STATE_PAUSED;
            }
            return C1ANF.PLAYBACK_STATE_PLAYING;
        }
        return C1ANF.PLAYBACK_STATE_STOPPED;
    }
}
