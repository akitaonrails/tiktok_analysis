package X;

/* JADX INFO: renamed from: X.099X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C099X {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C099V.values().length];
        try {
            iArr[C099V.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C099V.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C099V.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C099V.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
