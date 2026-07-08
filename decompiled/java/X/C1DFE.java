package X;

/* JADX INFO: renamed from: X.1DFE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C1DFE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1DF9.values().length];
        try {
            iArr[C1DF9.PARKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C1DF9.BLOCKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C1DF9.CPU_ACQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C1DF9.DORMANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C1DF9.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
