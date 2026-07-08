package X;

/* JADX INFO: renamed from: X.05YX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C05YX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C05YY.values().length];
        try {
            iArr[C05YY.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C05YY.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C05YY.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
