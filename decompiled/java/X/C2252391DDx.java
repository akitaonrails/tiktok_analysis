package X;

/* JADX INFO: renamed from: X.1DDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C2252391DDx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2252401DDy.values().length];
        try {
            iArr[EnumC2252401DDy.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC2252401DDy.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC2252401DDy.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
