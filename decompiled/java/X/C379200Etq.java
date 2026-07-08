package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Etq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C379200Etq {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC378720Et4.values().length];
        try {
            iArr[EnumC378720Et4.TEXT_TO_IMAGE_CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC378720Et4.TEXT_TO_VIDEO_CREATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC379210Etr.values().length];
        try {
            iArr2[EnumC379210Etr.GENERATION_SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC379210Etr.USER_CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
    }
}
