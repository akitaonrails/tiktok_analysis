package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.001G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C001G {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C001A.values().length];
        try {
            iArr[C001A.MEMBER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C001A.REMIND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C001A.ROOM_NOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C001A.COMMON_TOAST.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C001A.GUIDE_MESSAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C001A.COMMON_GUIDE.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[C001A.GIFT_GUIDE_MESSAGE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[C001A.OPERATE_TOAST_MESSAGE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[C001A.HOST_BOARD_MESSAGE.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[C001A.S_M_B_BOARD_MESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[C001A.LIVE_POLL_MESSAGE.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[C001A.PRIVILEGE_ADVANCE_MESSAGE.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[C001A.PRIVILEGE_DYNAMIC_EFFECT_MESSAGE.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        LIZ = iArr;
    }
}
