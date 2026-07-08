package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C439260HKi {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;

    static {
        int[] iArr = new int[EnumC439250HKh.values().length];
        try {
            iArr[EnumC439250HKh.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_IMAGE_UPLOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_IMAGE_TNS_CHECK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_IMAGE_FACE_DETECTION_CHECK.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_IMAGE_INTERNAL_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_INTERNET.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_SOCIAL_AVATAR_CREATE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_SOCIAL_AVATAR_PROGRESS.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC439250HKh.FAILURE_MODEL_DOWNLOAD.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC439270HKj.values().length];
        try {
            iArr2[EnumC439270HKj.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr2[EnumC439270HKj.FAILURE_INTERNET.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr2[EnumC439270HKj.FAILURE_IMAGE_TNS_CHECK.ordinal()] = 3;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[EnumC439270HKj.FAILURE_IMAGE_INTERNAL_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[EnumC439270HKj.FAILURE_IMAGE_FACE_DETECTION_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC439240HKg.values().length];
        try {
            iArr3[EnumC439240HKg.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr3[EnumC439240HKg.FAILURE_INTERNET.ordinal()] = 2;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr3[EnumC439240HKg.FAILURE_IMAGE_TNS_CHECK.ordinal()] = 3;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr3[EnumC439240HKg.FAILURE_IMAGE_INTERNAL_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr3[EnumC439240HKg.FAILURE_IMAGE_FACE_DETECTION_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[EnumC439280HKk.values().length];
        try {
            iArr4[EnumC439280HKk.NOT_IN_WAITING.ordinal()] = 1;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr4[EnumC439280HKk.UPLOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr4[EnumC439280HKk.WAIT_QUEUE.ordinal()] = 3;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr4[EnumC439280HKk.GENERATING.ordinal()] = 4;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        try {
            iArr4[EnumC439280HKk.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        LIZLLL = iArr4;
    }
}
