package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C439670HLx {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC439680HLy.values().length];
        try {
            iArr[EnumC439680HLy.RETURN_TO_STORY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC439680HLy.RETURN_TO_POST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC439680HLy.RETURN_TO_CHAT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC439680HLy.RETURN_TO_PROFILE_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC439680HLy.RETURN_TO_PROFILE_EDIT_PAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC439680HLy.RETURN_TO_UNIFIED_INPUT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC439680HLy.SHOW.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC439680HLy.GO_TO_NOTIFICATION.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC439280HKk.values().length];
        try {
            iArr2[EnumC439280HKk.GENERATING.ordinal()] = 1;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[EnumC439280HKk.WAIT_QUEUE.ordinal()] = 2;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr2[EnumC439280HKk.UPLOADING.ordinal()] = 3;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        LIZIZ = iArr2;
    }
}
