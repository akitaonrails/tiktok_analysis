package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ue4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C777100Ue4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC778100Ufg.values().length];
        try {
            iArr[EnumC778100Ufg.LIVE_TIP_GAME_GUESS_RESULT_NOTIFY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC778100Ufg.LIVE_TIP_GAME_GUESS_MODERATOR_NOTIFY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC778100Ufg.LIVE_TIP_GAME_GUESS_NOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC778100Ufg.LIVE_TIP_GAME_AUDIT_STATUS_MESSAGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC778100Ufg.LIVE_TIP_GAME_GUESS_USER_REQ_MESSAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC778100Ufg.LIVE_TIP_GAME_GUESS_TOAST_MESSAGE_SUGGEST.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
