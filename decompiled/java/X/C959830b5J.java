package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0b5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C959830b5J {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC959580b4u.values().length];
        try {
            iArr[EnumC959580b4u.TEAM_PAIR_STOP_BUTTON_CLICKED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC959580b4u.TEAM_PAIR_SYNC_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC959580b4u.TEAM_PAIR_ONE_V_ONE_BATTLE_BUTTON_CLICKED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC959580b4u.TEAM_PAIR_TIMED_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
