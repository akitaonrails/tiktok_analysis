package X;

/* JADX INFO: renamed from: X.1ANH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C1ANH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1ANG.values().length];
        iArr[C1ANG.PLAYBACK_STATE_START.ordinal()] = 1;
        iArr[C1ANG.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        iArr[C1ANG.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        iArr[C1ANG.PLAYBACK_STATE_ERROR.ordinal()] = 4;
        iArr[C1ANG.PLAYBACK_STATE_STOPPED.ordinal()] = 5;
        iArr[C1ANG.PLAYBACK_STATE_ENDED.ordinal()] = 6;
        LIZ = iArr;
    }
}
